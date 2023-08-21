/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Funcionario;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Dao.PagamentoDAO;
import DTO.PagamentoDTO;
import java.util.ArrayList;

/**
 *
 * @author breno
 */
public class Pagamento extends javax.swing.JFrame {
// variáveis
    private String Cpf, Nome, Data;

    /**
     * Creates new form Pagamento
     */
    public Pagamento() {
        initComponents();
                setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jCpf = new javax.swing.JFormattedTextField();
        jData = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(209, 79, 245));
        jLabel2.setText("CPF");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(209, 79, 245));
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jButton1.setBackground(new java.awt.Color(209, 79, 245));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pix");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 40));

        jButton2.setBackground(new java.awt.Color(209, 79, 245));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Dinheiro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jButton3.setBackground(new java.awt.Color(209, 79, 245));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cartão");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(209, 79, 245));
        jLabel4.setText("Data");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jNome.setBackground(new java.awt.Color(209, 79, 245));
        jNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 140, -1));

        jCpf.setBackground(new java.awt.Color(209, 79, 245));
        jCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 180, -1));

        jData.setBackground(new java.awt.Color(209, 79, 245));
        jData.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jData, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(209, 79, 245));
        jLabel5.setText("Escolha a forma de pagamento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jButton6.setBackground(new java.awt.Color(209, 79, 245));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        jButton7.setBackground(new java.awt.Color(209, 79, 245));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Sair");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//cadastrar pagamento
        Cpf = jCpf.getText();
        Nome = jNome.getText();
        Data = jData.getText();
        PagamentoDTO objpagamentodto = new PagamentoDTO();
        objpagamentodto.setCpf(Cpf);
        objpagamentodto.setNome(Nome);
        objpagamentodto.setData(Data);
                //mensagem pra campos vazios

        if(jNome.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jCpf.getText().equals("   .   .   -  ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jData.getText().equals("    -  -  ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}


        PagamentoDAO objpagamentodao = new PagamentoDAO();
        objpagamentodao.cadastar(objpagamentodto);

       
      

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //cadastrar pagamento
        Cpf = jCpf.getText();
        Nome = jNome.getText();
        Data = jData.getText();
        PagamentoDTO objpagamentodto = new PagamentoDTO();
        objpagamentodto.setCpf(Cpf);
        objpagamentodto.setNome(Nome);
        objpagamentodto.setData(Data);
        //mensagem pra campo vazio
       if(jNome.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jCpf.getText().equals("   .   .   -  ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jData.getText().equals("    -  -  ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
        PagamentoDAO objpagamentodao = new PagamentoDAO();
        objpagamentodao.cadastar(objpagamentodto);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//cadastrar pagamento
        Cpf = jCpf.getText();
        Nome = jNome.getText();
        Data = jData.getText();
        PagamentoDTO objpagamentodto = new PagamentoDTO();
        objpagamentodto.setCpf(Cpf);
        objpagamentodto.setNome(Nome);
        objpagamentodto.setData(Data);
        //mensagem pra campo vazio
       if(jNome.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jCpf.getText().equals("   .   .   -  ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jData.getText().equals("    -  -  ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
        PagamentoDAO objpagamentodao = new PagamentoDAO();
        objpagamentodao.cadastar(objpagamentodto);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      //voltar pra tela principal
        new Tela_funcionario() .setVisible(true);

        this.dispose();// TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      //sair do sistema
        System.exit(0);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jCpf;
    private javax.swing.JFormattedTextField jData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNome;
    // End of variables declaration//GEN-END:variables

}
