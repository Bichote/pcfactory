
package GUI;

import Controlador.C_HASH;
import Controlador.C_LOGIN;
import Controlador.C_RUTIFICADOR;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
public class V_LOGIN extends javax.swing.JFrame {

    C_LOGIN Login = new C_LOGIN();
    C_RUTIFICADOR VALIDACION_RUT = new C_RUTIFICADOR();
    C_HASH Hash = new C_HASH();
    V_ADMIN V_A = new V_ADMIN();
    V_VENDEDOR V_V = new V_VENDEDOR();
    V_CAJERO V_C = new V_CAJERO();
    
    int rs_rol = 0; 
    boolean rs_rutificador = false;
    int rs_login = 0;
    
    String Pass_imcriptada = "";
    
    
    public V_LOGIN() {
        initComponents();
        // RS LOGIN 1  == SI EXISTE EL USUARIO HAY QUE PREGUNTAR EL ROL 
        // RS LOGIN 0  == NO EXISTE EL USUARIO O CREDENCIALES INCORRECTAS
        // RS LOGIN 3  == LA  CUENTA ESTA DESACTIVADA
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

    private void vista_rol(String rut){
  
        if(rs_login == 0){
            
            JOptionPane.showMessageDialog(null, "Credenciales incorrecta") ;
        }
        
        if (rs_login == 1) {     
            
            int rs_rol  = Login.Filtro_Rol(rut);
            
            if (rs_rol == 1 ) { // RS_ROL 1 = ADMINISTRADOR
                V_A.setVisible(true);
                V_A.User.setText("donwea");
                this.dispose();
            } else
            
            if (rs_rol == 2 ) { // RS_ROL 2 = VENDEDOR
                V_V.setVisible(true);
                this.dispose();
            } else
            
            if (rs_rol == 3 ) { // RS_ROL 3 = CUENTA DESACTIVADA
                JOptionPane.showMessageDialog(null, "CUENTA DESACTIVADA , COMUNIQUESE CON EL ADMIN");
            } else
            
            if (rs_rol == 4 ) { // RS_ROL 4 = CUENTA CAJERO
                V_C.setVisible(true);
                this.dispose();
            }          
        } 

        if(rs_login == 3){
            JOptionPane.showMessageDialog(null, "Cuenta desactivada") ;
        }
        
    }
    
    private void Btn_Pass_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Pass_ActionPerformed

        String rut = Txt_rut_.getText(); // pasar rut a variable rut
        String Pass = new String(Txt_Pass_.getPassword()); // pasar password a variable pass

        if (Pass.equals("") || rut.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Complete los campos") ;
            
        } else {
            
            Pass_imcriptada =  Hash.sha1(Pass); // ENVIAR LA PASS PARA INCRIPTARLA (PASS) // NUEVAPASS = CONTRASEÑA IMCRIPTADA
            rs_rutificador = VALIDACION_RUT.rutificador(rut); //Rutificador
 
            if (rs_rutificador == true) {
                
                rs_login = Login.login(rut,Pass_imcriptada);  // ------------ llamar a la funcion -subclase del login // Recibir la respuesta  // Enviar el rut y pass por parametro
                vista_rol(rut);
                
            } else {
                JOptionPane.showMessageDialog(null, "Rut invalido") ;
            }
  
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
