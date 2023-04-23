/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.PagamentoDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Funcionario.Pagamento;
import java.util.ArrayList;

/**
 *
 * @author breno
 */
public class PagamentoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PagamentoDTO> pagamento = new ArrayList<>();
    
    public void cadastar(PagamentoDTO objpagamentodto){
   String sql="insert into pagamento(Cpf,Nome,Data) values(?,?,?)";
   conn= new ConexaoDAO().conectaBD();
   try{
       pstm= conn.prepareStatement(sql);
       pstm.setString(1,objpagamentodto.getCpf());
              pstm.setString(2,objpagamentodto.getNome());
                            pstm.setString(3,objpagamentodto.getData());
                            pstm.execute();
                            pstm.close();
                            

  JOptionPane.showMessageDialog(null, "Pago com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Pagamento inválido !! ");
        }
    }
    public ArrayList<PagamentoDTO> PesquisarPagamento(){
        String sql= "select * from pagamento";
           conn= new ConexaoDAO().conectaBD();

        try{
            pstm = conn.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next()){
              PagamentoDTO objpagamentodto= new PagamentoDTO();
              objpagamentodto.setCpf(rs.getString("Cpf"));
                            objpagamentodto.setNome(rs.getString("Nome"));
                                          objpagamentodto.setData(rs.getString("Data"));
pagamento.add(objpagamentodto);

            }
            
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "PagamentoDao Pesquisar: "+erro);
}
                    return pagamento;

    
    }
    
}
