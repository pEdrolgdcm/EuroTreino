/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.ListaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
public class ListaDao {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ListaDTO> Lista = new ArrayList<>();

    public void cadastar(ListaDTO objlistadto) {
        String sql = "insert into equipamento (Equipamento,Codigo,Fornecedor) values(?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlistadto.getEquipamento());
            pstm.setString(2, objlistadto.getCodigo());

            pstm.setString(3, objlistadto.getFornecedor());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !!");
        }
    }

    public ArrayList<ListaDTO> PesquisarLista() {
        String sql = "select * from equipamento";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ListaDTO objlistadto = new ListaDTO();
                objlistadto.setEquipamento(rs.getString("Equipamento"));
                objlistadto.setCodigo(rs.getString("Codigo"));

                objlistadto.setFornecedor(rs.getString("Fornecedor"));

                Lista.add(objlistadto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListaDAO Pesquisar: " + erro);
        }
        return Lista;

    }
public void excluir(ListaDTO objrevisãodto){
       String sql= "DELETE FROM equipamento where Equipamento = ?";
           conn= new ConexaoDAO().conectaBD();
           try{
       pstm= conn.prepareStatement(sql);
       pstm.setString(1,objrevisãodto.getEquipamento());
                            pstm.execute();
                            pstm.close();



     JOptionPane.showMessageDialog(null, "Deletado");

        } catch (Exception erro) {
        }     
}    
}
