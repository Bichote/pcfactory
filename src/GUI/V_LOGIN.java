
package GUI;

import Controlador.C_HASH;
import Controlador.C_LOGIN;
import javax.swing.JOptionPane;

public class V_LOGIN extends javax.swing.JFrame {

    C_LOGIN Login = new C_LOGIN();
    int Resultado = 0; 
    C_HASH Hash = new C_HASH();
    
    public V_LOGIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Principal_ = new javax.swing.JPanel();
        Label_login_ = new javax.swing.JLabel();
        Txt_rut_ = new javax.swing.JTextField();
        Btn_Pass_ = new javax.swing.JButton();
        Panel_design_ = new javax.swing.JPanel();
        Logo_ = new javax.swing.JLabel();
        Txt_Pass_ = new javax.swing.JPasswordField();
        Btn_Registrar_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Principal_.setBackground(new java.awt.Color(255, 255, 255));

        Label_login_.setFont(new java.awt.Font("Unispace", 1, 36)); // NOI18N
        Label_login_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_login_.setText("LOGIN");

        Txt_rut_.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        Txt_rut_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Rut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Unispace", 1, 18))); // NOI18N
        Txt_rut_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_rut_ActionPerformed(evt);
            }
        });
        Txt_rut_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_rut_KeyTyped(evt);
            }
        });

        Btn_Pass_.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Btn_Pass_.setText("INGRESAR");
        Btn_Pass_.setBorderPainted(false);
        Btn_Pass_.setPreferredSize(new java.awt.Dimension(131, 31));
        Btn_Pass_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Pass_ActionPerformed(evt);
            }
        });

        Panel_design_.setBackground(new java.awt.Color(102, 204, 0));
        Panel_design_.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout Panel_design_Layout = new javax.swing.GroupLayout(Panel_design_);
        Panel_design_.setLayout(Panel_design_Layout);
        Panel_design_Layout.setHorizontalGroup(
            Panel_design_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Panel_design_Layout.setVerticalGroup(
            Panel_design_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        Logo_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LOGO.png"))); // NOI18N

        Txt_Pass_.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        Txt_Pass_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Unispace", 1, 18))); // NOI18N
        Txt_Pass_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Pass_KeyTyped(evt);
            }
        });

        Btn_Registrar_.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        Btn_Registrar_.setForeground(new java.awt.Color(102, 204, 0));
        Btn_Registrar_.setText("Registrarme");
        Btn_Registrar_.setBorderPainted(false);
        Btn_Registrar_.setContentAreaFilled(false);
        Btn_Registrar_.setFocusable(false);
        Btn_Registrar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Registrar_ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Unispace", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("No estas registrado ? ");

        javax.swing.GroupLayout Panel_Principal_Layout = new javax.swing.GroupLayout(Panel_Principal_);
        Panel_Principal_.setLayout(Panel_Principal_Layout);
        Panel_Principal_Layout.setHorizontalGroup(
            Panel_Principal_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_design_, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Principal_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_Principal_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Pass_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(Txt_Pass_)
                    .addComponent(Txt_rut_, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Principal_Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Registrar_, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Label_login_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Logo_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_Principal_Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Principal_Layout.setVerticalGroup(
            Panel_Principal_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Principal_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Label_login_)
                .addGap(65, 65, 65)
                .addComponent(Txt_rut_, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Txt_Pass_, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Btn_Pass_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(Panel_Principal_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Registrar_, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_design_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Pass_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Pass_ActionPerformed
       
       
        String rut = Txt_rut_.getText();
        String Pass = new String(Txt_Pass_.getPassword());
        
        String NuevaPass =  Hash.sha1(Pass); // ENVIAR LA PASS PARA INCRIPTARLA (PASS) // NUEVAPASS = CONTRASEÑA IMCRIPTADA
        
        if (Pass.equals("") || rut.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Complete los campos") ;
            
        } else {

            //Rutificador

            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");

            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            
            for (; rutAux != 0; rutAux /= 10) {
                
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11; }
            
                if (dv == (char) (s != 0 ? s + 47 : 75))  {  // Si el rut es correcto

                    Resultado = Login.login(rut,NuevaPass);  // ------------ llamar a la funcion -subclase del login // Recibir la respuesta  // Enviar el rut y pass por parametro

                    if (Resultado == 1) {     

                        JOptionPane.showMessageDialog(null, "Bienvenido") ;

                    } 
                    
                    if(Resultado == 0){
                         JOptionPane.showMessageDialog(null, "Credenciales incorrecta") ;
                    }
                    
                    if(Resultado == 3){
                         JOptionPane.showMessageDialog(null, "Cuenta desactivada") ;
                    }
                
                } // Si el rut es incorrecto//
                else {  JOptionPane.showMessageDialog(null, "Rut invalido") ; }
            
        }

    }//GEN-LAST:event_Btn_Pass_ActionPerformed

    private void Txt_rut_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_rut_ActionPerformed

    }//GEN-LAST:event_Txt_rut_ActionPerformed

    private void Txt_Pass_KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Pass_KeyTyped
  
        String Pass = new String(Txt_Pass_.getPassword());
        if (Pass.length()== 20) 
        evt.consume(); 

    }//GEN-LAST:event_Txt_Pass_KeyTyped

    private void Txt_rut_KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_rut_KeyTyped
        
        String rut = Txt_rut_.getText();
        if (rut.length() == 9) 
        evt.consume(); 
        
    }//GEN-LAST:event_Txt_rut_KeyTyped

    private void Btn_Registrar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Registrar_ActionPerformed
       
        V_SIGN_UP V_R = new V_SIGN_UP(); //
        V_R.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_Registrar_ActionPerformed

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Pass_;
    private javax.swing.JButton Btn_Registrar_;
    private javax.swing.JLabel Label_login_;
    private javax.swing.JLabel Logo_;
    private javax.swing.JPanel Panel_Principal_;
    private javax.swing.JPanel Panel_design_;
    private javax.swing.JPasswordField Txt_Pass_;
    private javax.swing.JTextField Txt_rut_;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
