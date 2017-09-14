/*

package VIEWE;

import DAO.Conexao;
import DAO.FuncionarioDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.JOptionPane;
import MODEL.FuncionarioM;


public class LoginView extends javax.swing.JFrame {

    FuncionarioM funcionarioM;
    FuncionarioDAO funcionariodao;
    
    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        usuarioM = new UsuarioM();
        
        this.tfdUsuario.requestFocus();
        usuarioDAO = new UsuarioDAO();
       
        
        URL url = this.getClass().getResource("/view/icones/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
         tfdUsuario.setDocument(new LimiteDigitos(20));
        tfdSenha.setDocument(new LimiteDigitos(20));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        tfdSenha = new javax.swing.JPasswordField();
        tfdUsuario = new javax.swing.JTextField();
        btnconvidado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Usuário");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Senha");

        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });

        tfdSenha.setPreferredSize(new java.awt.Dimension(210, 23));
        tfdSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdSenhaKeyPressed(evt);
            }
        });

        tfdUsuario.setPreferredSize(new java.awt.Dimension(59, 23));
        tfdUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdUsuarioKeyPressed(evt);
            }
        });

        btnconvidado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnconvidado.setText("Entrar como convidado");
        btnconvidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconvidadoActionPerformed(evt);
            }
        });
        btnconvidado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnconvidadoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnconvidado)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconvidado)
                    .addComponent(btnEntrar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
      
        usuarioM = null;
        try {
            if (tfdUsuario.getText().isEmpty()) {
                //erro.setText("O nome do usuario deve ser preechido");
                JOptionPane.showMessageDialog(null, "O usuário deve ser preenchido", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                tfdUsuario.requestFocus();

            } else if (tfdSenha.getText().isEmpty()) {
                //erro.setText("A senha deve ser preechido");
                //erro.setVisible(true);
                JOptionPane.showMessageDialog(null, "A senha deve ser preenchida", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                tfdSenha.requestFocus();
            } else {
                usuarioM = UsuarioDAO.valida(tfdUsuario.getText(), tfdSenha.getText());
                if(usuarioM == null){
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                    tfdUsuario.setText("");
                    tfdSenha.setText("");
                    tfdUsuario.requestFocus();
                }else{
       
                    PrincipalView principal = new PrincipalView(usuarioM);
                    this.dispose();
                    
                }
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
            tfdUsuario.setText("");
            tfdSenha.setText("");
            tfdUsuario.requestFocus();
            ex.printStackTrace();
            
        }
        this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void tfdUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfdSenha.requestFocusInWindow();
        }        
    }//GEN-LAST:event_tfdUsuarioKeyPressed

    private void btnconvidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconvidadoActionPerformed
    UsuarioM usuarioM = new UsuarioM();
    usuarioM = null;
    String convidado = "convidado";
    try{
        usuarioM = UsuarioDAO.valida(convidado, convidado);
    }
    catch(Exception ex){
        ex.printStackTrace();
    }
    PrincipalView principal = new PrincipalView(usuarioM);
    this.dispose();
    }//GEN-LAST:event_btnconvidadoActionPerformed

    private void tfdSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdSenhaKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuarioM = null;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (tfdUsuario.getText().isEmpty()) {
                   // erro.setText("O nome do usuario deve ser preechido");
                   // erro.setVisible(true);
                   JOptionPane.showMessageDialog(null, "O usuário deve ser preenchido", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    tfdUsuario.requestFocus();
                } else if (tfdSenha.getText().isEmpty()) {
                   // erro.setText("A senha deve ser preechida");
                   // erro.setVisible(true);
                   JOptionPane.showMessageDialog(null, "A senha deve ser preenchida", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    tfdSenha.requestFocus();
                } else {
                    usuarioM = usuarioDAO.valida(tfdUsuario.getText(), tfdSenha.getText());
                    if(usuarioM == null){
                        JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                        tfdUsuario.setText("");
                        tfdSenha.setText("");
                        tfdUsuario.requestFocus();
                    }else{
                        PrincipalView pv = new PrincipalView(usuarioM);
                        this.dispose();
                    }
                    
                    
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto", "Erro", JOptionPane.ERROR_MESSAGE);
                tfdUsuario.setText("");
                tfdSenha.setText("");
                tfdUsuario.requestFocus();

            }
        }
        }
    }//GEN-LAST:event_tfdSenhaKeyPressed

    private void btnconvidadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnconvidadoKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    PrincipalView principal = new PrincipalView(usuarioM);
        }
    }//GEN-LAST:event_btnconvidadoKeyPressed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
     
    }//GEN-LAST:event_btnEntrarKeyPressed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnconvidado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField tfdSenha;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
*/
