/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.UsuarioDTO1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
public class UsuarioDAO1 {
    
   Connection conn ;
    public ResultSet autenticacaoUsuario1(UsuarioDTO1 objusuariodto1){
        conn = new ConexaoDAO().conectaBD();
        try{
            String sql = "select * from funcionario where Nome = ? and Senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,objusuariodto1.getNome());
             pstm.setString(2,objusuariodto1.getSenha());
             ResultSet rs= pstm.executeQuery();
             return rs;

            
            
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"UsuarioDAO1: "+erro);
            return null;
        }
    }
}