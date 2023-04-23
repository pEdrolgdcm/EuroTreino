/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.CaDTO;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Funcionario.Ca;

/**
 *
 * @author breno
 */
public class CaDao {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CaDTO> Ca = new ArrayList<>();

    public void cadastar(CaDTO objcadto) {
        String sql = "insert into ca (  Nome,Data,Ex1,Serie,Ex2,Serie2,Ex3,Serie3,Ex4,Serie4,Ex5,Serie5) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadto.getNome());
            pstm.setString(2, objcadto.getData());
            pstm.setString(3, objcadto.getEx1());
            pstm.setString(4, objcadto.getSerie());
            pstm.setString(5, objcadto.getEx2());
            pstm.setString(6, objcadto.getSerie2());
            pstm.setString(7, objcadto.getEx3());
            pstm.setString(8, objcadto.getSerie3());
            pstm.setString(9, objcadto.getEx4());
            pstm.setString(10, objcadto.getSerie4());
            pstm.setString(11, objcadto.getEx5());
            pstm.setString(12, objcadto.getSerie5());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !! ");
        }
    }

    public ArrayList<CaDTO> PesquisarCa() {
        String sql = "select * from ca";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CaDTO objcadto = new CaDTO();
                objcadto.setNome(rs.getString("Nome"));
                objcadto.setData(rs.getString("Data"));
                                objcadto.setEx1(rs.getString("Ex1"));
                objcadto.setSerie(rs.getString("Serie"));
                                objcadto.setEx2(rs.getString("Ex2"));
                objcadto.setSerie2(rs.getString("Serie2"));
                                objcadto.setEx3(rs.getString("Ex3"));
                objcadto.setSerie3(rs.getString("Serie3"));
                                objcadto.setEx4(rs.getString("Ex4"));
                objcadto.setSerie4(rs.getString("Serie4"));
                                objcadto.setEx5(rs.getString("Ex5"));
                objcadto.setSerie5(rs.getString("Serie5"));





                Ca.add(objcadto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CaDAO Pesquisar: " + erro);
        }
        return Ca;

    }
public void excluir(CaDTO objrevisãodto){
       String sql= "DELETE FROM ca where Nome = ?";
           conn= new ConexaoDAO().conectaBD();
           try{
       pstm= conn.prepareStatement(sql);
       pstm.setString(1,objrevisãodto.getNome());
                            pstm.execute();
                            pstm.close();



     JOptionPane.showMessageDialog(null, "Deletado");

        } catch (Exception erro) {
        }     
}  
}
