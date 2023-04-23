/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.PagamentoDTO;
import DTO.RevisãoDTO;
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
public class RevisãoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<RevisãoDTO> revisão = new ArrayList<>();
    
    public void cadastar(RevisãoDTO objrevisãodto){
   String sql="insert into manutencao (Equipamento,Data) values(?,?)";
   conn= new ConexaoDAO().conectaBD();
   try{
       pstm= conn.prepareStatement(sql);
       pstm.setString(1,objrevisãodto.getEquipamento());
              pstm.setString(2,objrevisãodto.getData());
                            pstm.execute();
                            pstm.close();



     JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !! ");
        }
    }
    public ArrayList<RevisãoDTO> PesquisarRevisão(){
        String sql= "select * from manutencao";
           conn= new ConexaoDAO().conectaBD();

        try{
            pstm = conn.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next()){
              RevisãoDTO objrevisãodto= new RevisãoDTO();
              objrevisãodto.setEquipamento(rs.getString("Equipamento"));
                            objrevisãodto.setData(rs.getString("Data"));
revisão.add(objrevisãodto);

            }
            
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "RevisãoDAO Pesquisar: "+erro);
}
                    return revisão;

    }
   
      
       
   public void excluir(RevisãoDTO objrevisãodto){
       String sql= "DELETE FROM manutencao where Equipamento = ?";
           conn= new ConexaoDAO().conectaBD();
           try{
       pstm= conn.prepareStatement(sql);
       pstm.setString(1,objrevisãodto.getEquipamento());
                            pstm.execute();
                            pstm.close();



     JOptionPane.showMessageDialog(null, "Deletado");

        } catch (Exception erro) {
            
        }}
}
