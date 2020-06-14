
package GUI;

import Controlador.C_HOME_ADMIN;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class V_ADMIN extends javax.swing.JFrame {
    
    ResultSet rs = null;
    Color verde = new Color(0,153,51);
    Color negro = new Color(51,51,51);
    Color blanco = new Color(255,255,255);
    String TotalPendientesUsuarios = "";
    String TotalUsuarios = "";
    C_HOME_ADMIN ADM =  new C_HOME_ADMIN();
    
    
    DefaultTableModel modelo = new DefaultTableModel(){
        
    public boolean isCellEditable(int row, int column) {
        return false;
    }};

    public V_ADMIN() {
        initComponents();
        initColor();
        Grafico_Barra_Mes(blanco);
        Grafico_Barra_Producto();
        Grafico_3D_Producto();
        Usuarios();
    }
    public void Usuarios(){
       
       modelo.setRowCount(0);
       TotalPendientesUsuarios = ADM.CountUser();
       TotalUsuarios = ADM.CountUserTotal();
       
       
       
       rs = ADM.Usuarios(); 
               
       Txt_Usu_Pend_1.setText(TotalPendientesUsuarios);
       Txt_Usu_Pend_2.setText(TotalUsuarios);
       
       modelo.setColumnIdentifiers(new Object[]{"ID","RUT","NOMBRE","APELLIDO","TIPO"});

        try {

           while(rs.next()) {
      
            modelo.addRow(new Object[] {rs.getString("ID"),rs.getString("RUT"),rs.getString("NOMBRE"),rs.getString("APELLIDO"),rs.getString("TIPO")} );
            TABLA_USUARIOS.setModel(modelo);
           
   
          }
            rs.close();
            
        } catch (Exception e) {
              System.out.println(e);  
        }
       
   
    }
    public void Grafico_Barra_Mes(Color color){
       
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        barra.setValue(300, "Enero","");
        barra.setValue(500, "Febrero","");
        barra.setValue(700, "Marzo","");;
        barra.setValue(400, "Abril","");
        barra.setValue(400, "mayo","");
        barra.setValue(600, "Junio","");
        barra.setValue(800, "Julio","");
        barra.setValue(900, "Agosto","");
        barra.setValue(100, "Septiembre","");;
        barra.setValue(200, "Osctubre","");
        barra.setValue(800, "Noviembre","");
        barra.setValue(500, "Diciembre","");
 
        JFreeChart grafico = ChartFactory.createBarChart3D("Ventas Mensuales", "Mes", "Ventas", barra,PlotOrientation.VERTICAL ,true,true,false);
        grafico.setBackgroundPaint(color);
        grafico.getPlot().setBackgroundPaint(color);
        grafico.getPlot().setOutlineVisible(false);
        ChartPanel panel = new ChartPanel(grafico);
        PANEL_GRAFICO_BARRA_MES.setLayout(new java.awt.BorderLayout());
        PANEL_GRAFICO_BARRA_MES.remove(panel);
        PANEL_GRAFICO_BARRA_MES.add(panel,BorderLayout.CENTER);
        
        PANEL_GRAFICO_BARRA_MES.validate();
        
    }
    public void Grafico_Barra_Producto(){
        
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        
        barra.setValue(300, "Tarjetas de videos","");
        barra.setValue(500, "Procesadores","");
        barra.setValue(700, "Mouse","");;
        barra.setValue(400, "Teclado","");
        barra.setValue(400, "Ps4","");
    
        JFreeChart grafico = ChartFactory.createBarChart3D("Categorias mas vendidas", "Mes", "Ventas", barra,PlotOrientation.VERTICAL ,true,true,false);
        grafico.setBackgroundPaint(Color.WHITE);
        grafico.getPlot().setBackgroundPaint(Color.WHITE);
        grafico.getPlot().setOutlineVisible(false);
        ChartPanel panel = new ChartPanel(grafico);
        PANEL_GRAFICO_CATEGORIA.setLayout(new java.awt.BorderLayout());
        PANEL_GRAFICO_CATEGORIA.add(panel,BorderLayout.CENTER);
        PANEL_GRAFICO_CATEGORIA.validate();
        
    }
    
    public void Grafico_3D_Producto(){
        
        DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue( "PS4" , new Integer( 20 ) );  
        dataset.setValue( "XBOX ONE" , new Double( 20 ) );   
        dataset.setValue( "HAWEI P30" , new Double( 40 ) );    
        dataset.setValue( "SAMSUMS A40" , new Double( 40 ) );  
 
        JFreeChart grafico = ChartFactory.createPieChart("Mas vendidos", dataset);
        grafico.setBackgroundPaint(Color.WHITE);
        grafico.getPlot().setBackgroundPaint(Color.WHITE);
        grafico.getPlot().setOutlineVisible(false);
        ChartPanel panel = new ChartPanel(grafico);
        PANEL_GRAFICO_3D.setLayout(new java.awt.BorderLayout());
        PANEL_GRAFICO_3D.add(panel,BorderLayout.CENTER);
        PANEL_GRAFICO_3D.validate();
        
    }
    
    public void initColor(){
       PANEL_FRAME.setBackground(blanco);
       PANEL_INFO.setBackground(verde);
       CB_BLANCO_.setBackground(verde);
       CB_BLANCO_.setForeground(Color.BLACK);
       CB_BLANCO_.setBackground(verde);
       CB_BLANCO_.setForeground(Color.BLACK);
       PANEL_HOME.setVisible(true);
       PANEL_GRAFICOS.setVisible(false);
       PANEL_USUARIOS.setVisible(false);
       PANEL_EDITAR.setBackground(blanco);
       PANEL_HOME.setBackground(blanco);
       PANEL_GRAFICOS.setBackground(blanco);
       PANEL_USUARIOS.setBackground(blanco);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_COLOR = new javax.swing.ButtonGroup();
        PANEL_FRAME = new javax.swing.JPanel();
        PANEL_INFO = new javax.swing.JPanel();
        CB_OSCURO_ = new javax.swing.JCheckBox();
        CB_BLANCO_ = new javax.swing.JCheckBox();
        PANEL_CONTENEDOR = new javax.swing.JPanel();
        PANEL_GRAFICOS = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PANEL_GRAFICO_BARRA_MES = new javax.swing.JPanel();
        PANEL_GRAFICO_CATEGORIA = new javax.swing.JPanel();
        PANEL_GRAFICO_3D = new javax.swing.JPanel();
        PANEL_USUARIOS = new javax.swing.JPanel();
        PANEL_EDITAR = new javax.swing.JPanel();
        BTN_ROL_ = new javax.swing.JButton();
        COB_ROL_ = new javax.swing.JComboBox<>();
        IMPUT_RUT_ = new javax.swing.JTextField();
        Txt_titulos = new javax.swing.JLabel();
        BTN_Eliminar_ = new javax.swing.JButton();
        Txt_titulos2 = new javax.swing.JLabel();
        Txt_Usu_Pend_1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA_USUARIOS = new javax.swing.JTable();
        Txt_titulos3 = new javax.swing.JLabel();
        Txt_Usu_Pend_2 = new javax.swing.JLabel();
        BTN_Reflescar_ = new javax.swing.JButton();
        PANEL_HOME = new javax.swing.JPanel();
        BTN_Home_ = new javax.swing.JButton();
        BTN_Graficos_ = new javax.swing.JButton();
        BTN_Usuarios_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PANEL_FRAME.setBackground(new java.awt.Color(255, 255, 255));

        PANEL_INFO.setBackground(new java.awt.Color(204, 204, 204));

        BG_COLOR.add(CB_OSCURO_);
        CB_OSCURO_.setFont(new java.awt.Font("Unispace", 1, 11)); // NOI18N
        CB_OSCURO_.setText("Oscuro");
        CB_OSCURO_.setFocusable(false);
        CB_OSCURO_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_OSCURO_ActionPerformed(evt);
            }
        });

        BG_COLOR.add(CB_BLANCO_);
        CB_BLANCO_.setFont(new java.awt.Font("Unispace", 1, 11)); // NOI18N
        CB_BLANCO_.setSelected(true);
        CB_BLANCO_.setText("Blanco");
        CB_BLANCO_.setFocusable(false);
        CB_BLANCO_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_BLANCO_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_INFOLayout = new javax.swing.GroupLayout(PANEL_INFO);
        PANEL_INFO.setLayout(PANEL_INFOLayout);
        PANEL_INFOLayout.setHorizontalGroup(
            PANEL_INFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_INFOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CB_BLANCO_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CB_OSCURO_)
                .addContainerGap())
        );
        PANEL_INFOLayout.setVerticalGroup(
            PANEL_INFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_INFOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PANEL_INFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_OSCURO_)
                    .addComponent(CB_BLANCO_))
                .addContainerGap())
        );

        PANEL_CONTENEDOR.setLayout(new java.awt.CardLayout());

        PANEL_GRAFICOS.setBackground(new java.awt.Color(51, 0, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PANEL_GRAFICO_BARRA_MES.setLayout(new javax.swing.OverlayLayout(PANEL_GRAFICO_BARRA_MES));

        PANEL_GRAFICO_CATEGORIA.setLayout(new javax.swing.OverlayLayout(PANEL_GRAFICO_CATEGORIA));

        PANEL_GRAFICO_3D.setPreferredSize(new java.awt.Dimension(250, 250));
        PANEL_GRAFICO_3D.setLayout(new javax.swing.OverlayLayout(PANEL_GRAFICO_3D));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(PANEL_GRAFICO_BARRA_MES, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PANEL_GRAFICO_CATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PANEL_GRAFICO_3D, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PANEL_GRAFICO_3D, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PANEL_GRAFICO_CATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PANEL_GRAFICO_BARRA_MES, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PANEL_GRAFICOSLayout = new javax.swing.GroupLayout(PANEL_GRAFICOS);
        PANEL_GRAFICOS.setLayout(PANEL_GRAFICOSLayout);
        PANEL_GRAFICOSLayout.setHorizontalGroup(
            PANEL_GRAFICOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_GRAFICOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PANEL_GRAFICOSLayout.setVerticalGroup(
            PANEL_GRAFICOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_GRAFICOSLayout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PANEL_CONTENEDOR.add(PANEL_GRAFICOS, "card3");

        PANEL_USUARIOS.setBackground(new java.awt.Color(102, 255, 102));

        PANEL_EDITAR.setBackground(new java.awt.Color(255, 255, 255));

        BTN_ROL_.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        BTN_ROL_.setText("Asignar Rol");
        BTN_ROL_.setBorderPainted(false);
        BTN_ROL_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ROL_ActionPerformed(evt);
            }
        });

        COB_ROL_.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        COB_ROL_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione rol", "ADMIN", "VENDEDOR", "DESACTIVADA", "CAJERO", " " }));

        IMPUT_RUT_.setEditable(false);
        IMPUT_RUT_.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N

        Txt_titulos.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Txt_titulos.setText("Usuario:");

        BTN_Eliminar_.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        BTN_Eliminar_.setForeground(new java.awt.Color(255, 0, 0));
        BTN_Eliminar_.setText("Eliminar");
        BTN_Eliminar_.setBorderPainted(false);
        BTN_Eliminar_.setContentAreaFilled(false);
        BTN_Eliminar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Eliminar_ActionPerformed(evt);
            }
        });

        Txt_titulos2.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Txt_titulos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_titulos2.setText("Total Cuentas:");

        Txt_Usu_Pend_1.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Usu_Pend_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Txt_Usu_Pend_1.setForeground(new java.awt.Color(204, 0, 0));
        Txt_Usu_Pend_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        TABLA_USUARIOS.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        TABLA_USUARIOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA_USUARIOS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TABLA_USUARIOS.setFocusable(false);
        TABLA_USUARIOS.setGridColor(new java.awt.Color(0, 0, 0));
        TABLA_USUARIOS.setOpaque(false);
        TABLA_USUARIOS.setRequestFocusEnabled(false);
        TABLA_USUARIOS.setSelectionBackground(new java.awt.Color(0, 153, 51));
        TABLA_USUARIOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLA_USUARIOSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TABLA_USUARIOS);

        Txt_titulos3.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Txt_titulos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_titulos3.setText("Cuentas pendientes:");

        Txt_Usu_Pend_2.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Usu_Pend_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Txt_Usu_Pend_2.setForeground(new java.awt.Color(204, 0, 0));
        Txt_Usu_Pend_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BTN_Reflescar_.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        BTN_Reflescar_.setText("Refrescar");
        BTN_Reflescar_.setBorderPainted(false);
        BTN_Reflescar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Reflescar_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_EDITARLayout = new javax.swing.GroupLayout(PANEL_EDITAR);
        PANEL_EDITAR.setLayout(PANEL_EDITARLayout);
        PANEL_EDITARLayout.setHorizontalGroup(
            PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_EDITARLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(PANEL_EDITARLayout.createSequentialGroup()
                        .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BTN_ROL_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(COB_ROL_, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PANEL_EDITARLayout.createSequentialGroup()
                                .addComponent(Txt_titulos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IMPUT_RUT_, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PANEL_EDITARLayout.createSequentialGroup()
                                .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PANEL_EDITARLayout.createSequentialGroup()
                                        .addComponent(BTN_Eliminar_)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                                        .addComponent(Txt_titulos2))
                                    .addGroup(PANEL_EDITARLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Txt_titulos3)))
                                .addGap(21, 21, 21)
                                .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_Usu_Pend_1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(Txt_Usu_Pend_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_EDITARLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BTN_Reflescar_)))))
                .addContainerGap())
        );
        PANEL_EDITARLayout.setVerticalGroup(
            PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_EDITARLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IMPUT_RUT_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_Eliminar_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_titulos2)
                        .addComponent(Txt_Usu_Pend_2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PANEL_EDITARLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Txt_titulos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(COB_ROL_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Txt_Usu_Pend_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txt_titulos3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANEL_EDITARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_EDITARLayout.createSequentialGroup()
                        .addComponent(BTN_ROL_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_EDITARLayout.createSequentialGroup()
                        .addComponent(BTN_Reflescar_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PANEL_USUARIOSLayout = new javax.swing.GroupLayout(PANEL_USUARIOS);
        PANEL_USUARIOS.setLayout(PANEL_USUARIOSLayout);
        PANEL_USUARIOSLayout.setHorizontalGroup(
            PANEL_USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
            .addGroup(PANEL_USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_USUARIOSLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL_EDITAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PANEL_USUARIOSLayout.setVerticalGroup(
            PANEL_USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(PANEL_USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_USUARIOSLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL_EDITAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        PANEL_CONTENEDOR.add(PANEL_USUARIOS, "card4");

        PANEL_HOME.setBackground(new java.awt.Color(255, 102, 51));
        PANEL_HOME.setDoubleBuffered(false);
        PANEL_HOME.setFocusable(false);

        javax.swing.GroupLayout PANEL_HOMELayout = new javax.swing.GroupLayout(PANEL_HOME);
        PANEL_HOME.setLayout(PANEL_HOMELayout);
        PANEL_HOMELayout.setHorizontalGroup(
            PANEL_HOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        PANEL_HOMELayout.setVerticalGroup(
            PANEL_HOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        PANEL_CONTENEDOR.add(PANEL_HOME, "card2");

        BTN_Home_.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        BTN_Home_.setForeground(new java.awt.Color(0, 153, 51));
        BTN_Home_.setText("Usuarios");
        BTN_Home_.setBorderPainted(false);
        BTN_Home_.setContentAreaFilled(false);
        BTN_Home_.setDefaultCapable(false);
        BTN_Home_.setFocusPainted(false);
        BTN_Home_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Home_ActionPerformed(evt);
            }
        });

        BTN_Graficos_.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        BTN_Graficos_.setForeground(new java.awt.Color(0, 153, 51));
        BTN_Graficos_.setText("Graficos");
        BTN_Graficos_.setBorderPainted(false);
        BTN_Graficos_.setContentAreaFilled(false);
        BTN_Graficos_.setDefaultCapable(false);
        BTN_Graficos_.setFocusPainted(false);
        BTN_Graficos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Graficos_ActionPerformed(evt);
            }
        });

        BTN_Usuarios_.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        BTN_Usuarios_.setForeground(new java.awt.Color(0, 153, 51));
        BTN_Usuarios_.setText("Home");
        BTN_Usuarios_.setBorderPainted(false);
        BTN_Usuarios_.setContentAreaFilled(false);
        BTN_Usuarios_.setDefaultCapable(false);
        BTN_Usuarios_.setFocusPainted(false);
        BTN_Usuarios_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Usuarios_ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout PANEL_FRAMELayout = new javax.swing.GroupLayout(PANEL_FRAME);
        PANEL_FRAME.setLayout(PANEL_FRAMELayout);
        PANEL_FRAMELayout.setHorizontalGroup(
            PANEL_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_FRAMELayout.createSequentialGroup()
                .addComponent(PANEL_INFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANEL_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PANEL_CONTENEDOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PANEL_FRAMELayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Usuarios_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Graficos_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Home_)))
                .addContainerGap())
        );
        PANEL_FRAMELayout.setVerticalGroup(
            PANEL_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL_INFO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_FRAMELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Home_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_Graficos_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_Usuarios_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PANEL_CONTENEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL_FRAME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL_FRAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_Usuarios_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Usuarios_ActionPerformed
        PANEL_HOME.setVisible(true);
        PANEL_GRAFICOS.setVisible(false);
        PANEL_USUARIOS.setVisible(false);
    }//GEN-LAST:event_BTN_Usuarios_ActionPerformed

    private void BTN_Graficos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Graficos_ActionPerformed
        PANEL_HOME.setVisible(false);
        PANEL_GRAFICOS.setVisible(true);
        PANEL_USUARIOS.setVisible(false);
    }//GEN-LAST:event_BTN_Graficos_ActionPerformed

    private void BTN_Home_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Home_ActionPerformed
        PANEL_HOME.setVisible(false);
        PANEL_GRAFICOS.setVisible(false);
        PANEL_USUARIOS.setVisible(true);
    }//GEN-LAST:event_BTN_Home_ActionPerformed

    private void BTN_Reflescar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Reflescar_ActionPerformed
        Usuarios();
    }//GEN-LAST:event_BTN_Reflescar_ActionPerformed

    private void TABLA_USUARIOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_USUARIOSMouseClicked
       
        int col_seleccionada = TABLA_USUARIOS.getSelectedRow(); // selececionar la row 
        
        IMPUT_RUT_.setText(modelo.getValueAt(col_seleccionada,1).toString());
        
    }//GEN-LAST:event_TABLA_USUARIOSMouseClicked

    private void BTN_Eliminar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Eliminar_ActionPerformed
     
        String rut = IMPUT_RUT_.getText();
        
        if (rut.equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario de la tabla");
        } else {
            
            ADM.Eliminar_Usuario(rut);
            Usuarios();
            
        }
        
    }//GEN-LAST:event_BTN_Eliminar_ActionPerformed

    private void BTN_ROL_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ROL_ActionPerformed
      
        String rut = IMPUT_RUT_.getText();
        int select = COB_ROL_.getSelectedIndex();
        
        if (rut.equals("") || select == 0 ) {
            JOptionPane.showMessageDialog(null, "Seleccione  usuario y rol");
        } else {
            
            ADM.Modificar_Usuario(rut,select);
            Usuarios();
        }
    }//GEN-LAST:event_BTN_ROL_ActionPerformed

    private void CB_BLANCO_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_BLANCO_ActionPerformed

        PANEL_FRAME.setBackground(blanco);
        PANEL_INFO.setBackground(verde);
        CB_OSCURO_.setBackground(verde);
        CB_OSCURO_.setForeground(Color.WHITE);
        CB_BLANCO_.setBackground(verde);
        CB_BLANCO_.setForeground(Color.WHITE);
        PANEL_HOME.setBackground(blanco);
        PANEL_GRAFICOS.setBackground(blanco);
        PANEL_USUARIOS.setBackground(blanco);
        PANEL_EDITAR.setBackground(blanco);
        Txt_titulos.setForeground(Color.BLACK);
        Txt_titulos2.setForeground(Color.BLACK);
        Txt_titulos3.setForeground(Color.BLACK);

    }//GEN-LAST:event_CB_BLANCO_ActionPerformed

    private void CB_OSCURO_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_OSCURO_ActionPerformed

        PANEL_FRAME.setBackground(new Color(51,51,51));
        PANEL_INFO.setBackground(Color.BLACK);
        CB_OSCURO_.setBackground(Color.BLACK);
        CB_OSCURO_.setForeground(Color.WHITE);
        CB_BLANCO_.setBackground(Color.BLACK);
        CB_BLANCO_.setForeground(Color.WHITE);
        PANEL_HOME.setBackground(negro);
        PANEL_GRAFICOS.setBackground(negro);
        PANEL_USUARIOS.setBackground(negro);
        PANEL_EDITAR.setBackground(negro);
        Txt_titulos.setForeground(Color.WHITE);
        Txt_titulos2.setForeground(Color.WHITE);
        Txt_titulos3.setForeground(Color.WHITE);
    }//GEN-LAST:event_CB_OSCURO_ActionPerformed

    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_COLOR;
    private javax.swing.JButton BTN_Eliminar_;
    private javax.swing.JButton BTN_Graficos_;
    private javax.swing.JButton BTN_Home_;
    private javax.swing.JButton BTN_ROL_;
    private javax.swing.JButton BTN_Reflescar_;
    private javax.swing.JButton BTN_Usuarios_;
    private javax.swing.JCheckBox CB_BLANCO_;
    private javax.swing.JCheckBox CB_OSCURO_;
    private javax.swing.JComboBox<String> COB_ROL_;
    private javax.swing.JTextField IMPUT_RUT_;
    private javax.swing.JPanel PANEL_CONTENEDOR;
    private javax.swing.JPanel PANEL_EDITAR;
    private javax.swing.JPanel PANEL_FRAME;
    private javax.swing.JPanel PANEL_GRAFICOS;
    private javax.swing.JPanel PANEL_GRAFICO_3D;
    private javax.swing.JPanel PANEL_GRAFICO_BARRA_MES;
    private javax.swing.JPanel PANEL_GRAFICO_CATEGORIA;
    private javax.swing.JPanel PANEL_HOME;
    private javax.swing.JPanel PANEL_INFO;
    private javax.swing.JPanel PANEL_USUARIOS;
    private javax.swing.JTable TABLA_USUARIOS;
    private javax.swing.JLabel Txt_Usu_Pend_1;
    private javax.swing.JLabel Txt_Usu_Pend_2;
    private javax.swing.JLabel Txt_titulos;
    private javax.swing.JLabel Txt_titulos2;
    private javax.swing.JLabel Txt_titulos3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
