/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.AlunoDTO;
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
public class AlunoDao {
        Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<AlunoDTO> Aluno = new ArrayList<>();

    public void cadastar(AlunoDTO objalunodto) {
        String sql = "insert into aluno (  Nome,Codigo,Cpf,Contato,Endereco,Mensalidade,Data,Senha) values(?,?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objalunodto.getNome());
                        pstm.setString(2, objalunodto.getCodigo());

            pstm.setString(3, objalunodto.getCpf());
            pstm.setString(4, objalunodto.getContato());
            pstm.setString(5, objalunodto.getEndereco());
            pstm.setString(6, objalunodto.getMensalidade());
            pstm.setString(7, objalunodto.getData());
            pstm.setString(8, objalunodto.getSenha());
            

            pstm.execute();
            pstm.close();
                       JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!" );


        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !!" );
        }
    }

    public ArrayList<AlunoDTO> PesquisarAluno() {
        String sql = "select * from aluno";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                AlunoDTO objalunodto = new AlunoDTO();
                objalunodto.setNome(rs.getString("Nome"));
                objalunodto.setCodigo(rs.getString("Codigo"));
                objalunodto.setCpf(rs.getString("Cpf"));
                objalunodto.setContato(rs.getString("Contato"));
                objalunodto.setEndereco(rs.getString("Endereco"));
                objalunodto.setMensalidade(rs.getString("Mensalidade"));
                objalunodto.setData(rs.getString("Data"));
                objalunodto.setSenha(rs.getString("Senha"));
                Aluno.add(objalunodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO Pesquisar: " + erro);
        }
        return Aluno;

    }
  public void excluir(AlunoDTO objrevisãodto){
       String sql= "DELETE FROM aluno where Nome = ?";
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
