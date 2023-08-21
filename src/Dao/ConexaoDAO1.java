/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
public class ConexaoDAO1 {
    
public Connection conectaBD(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost/academia?user=root&password=";
            conn= DriverManager.getConnection(url);
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"ConexaoDAO"+erro.getMessage());
        }
        return conn;
    }
    
}
