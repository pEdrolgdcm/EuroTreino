/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
/**
 *
 * @author breno
 */
public class UsuarioDAO {
    Connection conn ;
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
        conn = new ConexaoDAO().conectaBD();
        try{
            String sql = "select * from dadosaf where Nome = ? and Senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,objusuariodto.getNome());
             pstm.setString(2,objusuariodto.getSenha());
             ResultSet rs= pstm.executeQuery();
             return rs;

            
            
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"UsuarioDAO: "+erro);
            return null;
        }
    }
}
