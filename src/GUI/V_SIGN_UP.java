
package GUI;

import Controlador.C_AGREGAR_USUARIO;
import Controlador.C_HASH;
import javax.swing.JOptionPane;

public class V_SIGN_UP extends javax.swing.JFrame {

    C_HASH Hash = new C_HASH();
    C_AGREGAR_USUARIO ADD = new C_AGREGAR_USUARIO();
    
    public V_SIGN_UP() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo_ = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Txt_Rut_ = new javax.swing.JTextField();
        Txt_Nombre_ = new javax.swing.JTextField();
        Txt_Apellido_ = new javax.swing.JTextField();
        Txt_Pass_ = new javax.swing.JPasswordField();
        Btn_Pass_Convert = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Logo_1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Btn_Login_ = new javax.swing.JButton();
        Panel_design_ = new javax.swing.JPanel();

        Logo_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Txt_Rut_.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        Txt_Rut_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Rut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Unispace", 1, 18))); // NOI18N
        Txt_Rut_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Rut_KeyTyped(evt);
            }
        });

        Txt_Nombre_.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        Txt_Nombre_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Unispace", 1, 18))); // NOI18N
        Txt_Nombre_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Nombre_KeyTyped(evt);
            }
        });

        Txt_Apellido_.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        Txt_Apellido_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Unispace", 1, 18))); // NOI18N
        Txt_Apellido_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Apellido_KeyTyped(evt);
            }
        });

        Txt_Pass_.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        Txt_Pass_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Unispace", 1, 18))); // NOI18N
        Txt_Pass_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Pass_KeyTyped(evt);
            }
        });

        Btn_Pass_Convert.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Btn_Pass_Convert.setText("Registrar");
        Btn_Pass_Convert.setBorderPainted(false);
        Btn_Pass_Convert.setFocusPainted(false);
        Btn_Pass_Convert.setFocusable(false);
        Btn_Pass_Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Pass_ConvertActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Unispace", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ya estas registrado ? ");

        Logo_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LOGO.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Unispace", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrarme");

        Btn_Login_.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        Btn_Login_.setForeground(new java.awt.Color(102, 204, 0));
        Btn_Login_.setText("Iniciar Sesión");
        Btn_Login_.setBorderPainted(false);
        Btn_Login_.setContentAreaFilled(false);
        Btn_Login_.setFocusable(false);
        Btn_Login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Login_ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_design_, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Pass_)
                    .addComponent(Txt_Rut_, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_Pass_Convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Nombre_)
                    .addComponent(Txt_Apellido_)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Login_)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(Logo_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(Txt_Rut_, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Txt_Nombre_, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Txt_Apellido_, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Txt_Pass_, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Btn_Pass_Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Btn_Login_, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_design_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Pass_ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Pass_ConvertActionPerformed
       
       String rut = Txt_Rut_.getText();
       String nombre = Txt_Nombre_.getText();
       String apellido = Txt_Apellido_.getText();
       String Pass = new String(Txt_Pass_.getPassword());
       String NuevaPass =  Hash.sha1(Pass);
       
        if (rut.equals("") || nombre.equals("") || apellido.equals("") || Pass.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            
        } else {
            
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");

            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            
            for (; rutAux != 0; rutAux /= 10) {
                
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11; }
            
                if (dv == (char) (s != 0 ? s + 47 : 75))  {  // Si el rut es correcto

                  int validacion = ADD.validarexiste(rut);
                  
                    if (validacion == 0) {
                        
                        try {
                            
                        ADD.AgregarUsario(rut, nombre, apellido, NuevaPass); // agrega
                        
                        V_LOGIN V_L = new V_LOGIN();
                        V_L.setVisible(true);
                        this.dispose();
            
                    } catch (Exception e) { }    
                        
                    } else{
                        
                        JOptionPane.showMessageDialog(null, "Ya esta registrado");
                        
                    }
  
                
                } // Si el rut es incorrecto//
                else {  JOptionPane.showMessageDialog(null, "Rut invalido") ; }
  
        }
 

    }//GEN-LAST:event_Btn_Pass_ConvertActionPerformed

    private void Btn_Login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Login_ActionPerformed
      
        V_LOGIN V_L = new V_LOGIN(); //
        V_L.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_Login_ActionPerformed

    private void Txt_Rut_KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Rut_KeyTyped
        
        String rut= new String(Txt_Rut_.getText());
        if (rut.length()== 9) 
        evt.consume(); 
        
    }//GEN-LAST:event_Txt_Rut_KeyTyped

    private void Txt_Nombre_KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Nombre_KeyTyped
       
        String nombre = new String(Txt_Nombre_.getText());
        if (nombre.length()== 25) 
        evt.consume(); 
        
        char validar = evt.getKeyChar();
        
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo letras");
        }
        
    }//GEN-LAST:event_Txt_Nombre_KeyTyped

    private void Txt_Apellido_KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Apellido_KeyTyped
      
        String Apellido = new String(Txt_Apellido_.getText());
        if (Apellido.length()== 25) 
        evt.consume(); 
        
        char validar = evt.getKeyChar();
        
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo letras");
        }
        
    }//GEN-LAST:event_Txt_Apellido_KeyTyped

    private void Txt_Pass_KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Pass_KeyTyped
      
        String pass = new String(Txt_Pass_.getPassword());
        if (pass.length()== 25) 
        evt.consume(); 
        
    }//GEN-LAST:event_Txt_Pass_KeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_SIGN_UP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Login_;
    private javax.swing.JButton Btn_Pass_Convert;
    private javax.swing.JLabel Logo_;
    private javax.swing.JLabel Logo_1;
    private javax.swing.JPanel Panel_design_;
    private javax.swing.JTextField Txt_Apellido_;
    private javax.swing.JTextField Txt_Nombre_;
    private javax.swing.JPasswordField Txt_Pass_;
    private javax.swing.JTextField Txt_Rut_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
