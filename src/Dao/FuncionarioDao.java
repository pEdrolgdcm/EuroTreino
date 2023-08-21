/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.FuncionarioDTO;
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
public class FuncionarioDao {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> Funcionario = new ArrayList<>();

    public void cadastar(FuncionarioDTO objfuncionariodto) {
        String sql = "insert into funcionario (Nome,Codigo,Cpf,Contato,Endereco,Senha) values(?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getCodigo());

            pstm.setString(3, objfuncionariodto.getCpf());
            pstm.setString(4, objfuncionariodto.getContato());
            pstm.setString(5, objfuncionariodto.getEndereco());
            pstm.setString(6, objfuncionariodto.getSenha());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !!");
        }
    }

    public ArrayList<FuncionarioDTO> PesquisarFuncionario() {
        String sql = "select * from funcionario";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
                objfuncionariodto.setNome(rs.getString("Nome"));
                objfuncionariodto.setCodigo(rs.getString("Codigo"));
                objfuncionariodto.setCpf(rs.getString("Cpf"));
                objfuncionariodto.setContato(rs.getString("Contato"));
                objfuncionariodto.setEndereco(rs.getString("Endereco"));
                objfuncionariodto.setSenha(rs.getString("Senha"));
                Funcionario.add(objfuncionariodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListaDAO Pesquisar: " + erro);
        }
        return Funcionario;

    }
public void excluir(FuncionarioDTO objrevisãodto){
       String sql= "DELETE FROM funcionario where Nome = ?";
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
