/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.CbDTO;
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
public class CbDao {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CbDTO> Cb = new ArrayList<>();

    public void cadastar(CbDTO objcbdto) {
        String sql = "insert into cb (  Nome,Data,Ex1,Serie,Ex2,Serie2,Ex3,Serie3,Ex4,Serie4,Ex5,Serie5) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcbdto.getNome());
            pstm.setString(2, objcbdto.getData());
            pstm.setString(3, objcbdto.getEx1());
            pstm.setString(4, objcbdto.getSerie());
            pstm.setString(5, objcbdto.getEx2());
            pstm.setString(6, objcbdto.getSerie2());
            pstm.setString(7, objcbdto.getEx3());
            pstm.setString(8, objcbdto.getSerie3());
            pstm.setString(9, objcbdto.getEx4());
            pstm.setString(10, objcbdto.getSerie4());
            pstm.setString(11, objcbdto.getEx5());
            pstm.setString(12, objcbdto.getSerie5());

            pstm.execute();
            pstm.close();

         JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !! ");
        }
    }

    public ArrayList<CbDTO> PesquisarCb() {
        String sql = "select * from cb";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CbDTO objcbdto = new CbDTO();
                objcbdto.setNome(rs.getString("Nome"));
                objcbdto.setData(rs.getString("Data"));
                objcbdto.setEx1(rs.getString("Ex1"));
                objcbdto.setSerie(rs.getString("Serie"));
                objcbdto.setEx2(rs.getString("Ex2"));
                objcbdto.setSerie2(rs.getString("Serie2"));
                objcbdto.setEx3(rs.getString("Ex3"));
                objcbdto.setSerie3(rs.getString("Serie3"));
                objcbdto.setEx4(rs.getString("Ex4"));
                objcbdto.setSerie4(rs.getString("Serie4"));
                objcbdto.setEx5(rs.getString("Ex5"));
                objcbdto.setSerie5(rs.getString("Serie5"));

                Cb.add(objcbdto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CaDAO Pesquisar: " + erro);
        }
        return Cb;

    }
  public void excluir(CbDTO objrevisãodto){
       String sql= "DELETE FROM cb where Nome = ?";
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
