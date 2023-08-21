/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.CcDTO;
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
public class CcDao {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CcDTO> Cc = new ArrayList<>();

    public void cadastar(CcDTO objccdto) {
        String sql = "insert into cc (  Nome,Data,Ex1,Serie,Ex2,Serie2,Ex3,Serie3,Ex4,Serie4,Ex5,Serie5) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objccdto.getNome());
            pstm.setString(2, objccdto.getData());
            pstm.setString(3, objccdto.getEx1());
            pstm.setString(4, objccdto.getSerie());
            pstm.setString(5, objccdto.getEx2());
            pstm.setString(6, objccdto.getSerie2());
            pstm.setString(7, objccdto.getEx3());
            pstm.setString(8, objccdto.getSerie3());
            pstm.setString(9, objccdto.getEx4());
            pstm.setString(10, objccdto.getSerie4());
            pstm.setString(11, objccdto.getEx5());
            pstm.setString(12, objccdto.getSerie5());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !! ");
        }
    }

    public ArrayList<CcDTO> PesquisarCc() {
        String sql = "select * from cc";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CcDTO objccdto = new CcDTO();
                objccdto.setNome(rs.getString("Nome"));
                objccdto.setData(rs.getString("Data"));
                objccdto.setEx1(rs.getString("Ex1"));
                objccdto.setSerie(rs.getString("Serie"));
                objccdto.setEx2(rs.getString("Ex2"));
                objccdto.setSerie2(rs.getString("Serie2"));
                objccdto.setEx3(rs.getString("Ex3"));
                objccdto.setSerie3(rs.getString("Serie3"));
                objccdto.setEx4(rs.getString("Ex4"));
                objccdto.setSerie4(rs.getString("Serie4"));
                objccdto.setEx5(rs.getString("Ex5"));
                objccdto.setSerie5(rs.getString("Serie5"));

                Cc.add(objccdto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CcDAO Pesquisar: " + erro);
        }
        return Cc;

    }
public void excluir(CcDTO objrevisãodto){
       String sql= "DELETE FROM cc where Nome = ?";
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
