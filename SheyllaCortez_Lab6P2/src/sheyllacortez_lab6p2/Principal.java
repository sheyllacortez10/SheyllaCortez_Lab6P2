/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sheyllacortez_lab6p2;
//Agregando un commit nuevo
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author DELL
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_crearequipos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_creae_pais = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_crea_equipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_creaeq_ciudad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_creaequi_estadio = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jDialog_creajuga = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_jdcreaj_nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton_jdcrearjuga_agregarjuga = new javax.swing.JButton();
        jComboBox_pos = new javax.swing.JComboBox<>();
        jSpinner_edad = new javax.swing.JSpinner();
        jDialog_trans = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_trans = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPopupMenu_trans_opciones = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton_principal_crearE = new javax.swing.JButton();
        jButton_principal_crejuga = new javax.swing.JButton();
        jButton_principal_trans = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_principal_crearE = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem_principal_crearJ = new javax.swing.JMenuItem();
        jMenuItem_principal_trans = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Crear Equipos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("País del Equipo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 20));
        jPanel2.add(jTextField_creae_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 180, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Nombre del Equipo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, -1));
        jPanel2.add(jTextField_crea_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Ciudad");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel2.add(jTextField_creaeq_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Estadio");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        jPanel2.add(jTextField_creaequi_estadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 180, -1));

        jButton4.setText("Agregar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 120, 40));

        javax.swing.GroupLayout jDialog_crearequiposLayout = new javax.swing.GroupLayout(jDialog_crearequipos.getContentPane());
        jDialog_crearequipos.getContentPane().setLayout(jDialog_crearequiposLayout);
        jDialog_crearequiposLayout.setHorizontalGroup(
            jDialog_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jDialog_crearequiposLayout.setVerticalGroup(
            jDialog_crearequiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Crear Jugadores");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 200, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Nombre");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 50));
        jPanel3.add(jTextField_jdcreaj_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Edad");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Posición");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, -1));

        jButton_jdcrearjuga_agregarjuga.setText("Agregar");
        jButton_jdcrearjuga_agregarjuga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_jdcrearjuga_agregarjugaMouseClicked(evt);
            }
        });
        jPanel3.add(jButton_jdcrearjuga_agregarjuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 140, 40));

        jComboBox_pos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista", "Delantero" }));
        jPanel3.add(jComboBox_pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, -1));

        jSpinner_edad.setModel(new javax.swing.SpinnerNumberModel(15, 15, 45, 1));
        jPanel3.add(jSpinner_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 190, -1));

        javax.swing.GroupLayout jDialog_creajugaLayout = new javax.swing.GroupLayout(jDialog_creajuga.getContentPane());
        jDialog_creajuga.getContentPane().setLayout(jDialog_creajugaLayout);
        jDialog_creajugaLayout.setHorizontalGroup(
            jDialog_creajugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_creajugaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog_creajugaLayout.setVerticalGroup(
            jDialog_creajugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_creajugaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setForeground(new java.awt.Color(255, 255, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Transferencias");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Jugadores");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Equipos");

        jButton2.setText("Transferir ->");

        jList_trans.setModel(new DefaultListModel());
        jList_trans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_transMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_trans);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Equipos");
        jTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTree);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jButton2)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout jDialog_transLayout = new javax.swing.GroupLayout(jDialog_trans.getContentPane());
        jDialog_trans.getContentPane().setLayout(jDialog_transLayout);
        jDialog_transLayout.setHorizontalGroup(
            jDialog_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_transLayout.setVerticalGroup(
            jDialog_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu_trans_opciones.add(jMenuItem2);

        jMenuItem3.setText("Eliminar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu_trans_opciones.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(0, 153, 153));
        jToolBar1.setForeground(new java.awt.Color(0, 0, 0));
        jToolBar1.setRollover(true);

        jButton_principal_crearE.setBackground(new java.awt.Color(0, 153, 153));
        jButton_principal_crearE.setForeground(new java.awt.Color(0, 0, 0));
        jButton_principal_crearE.setText("Crear Equipos");
        jButton_principal_crearE.setFocusable(false);
        jButton_principal_crearE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_principal_crearE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_principal_crearE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_principal_crearEMouseClicked(evt);
            }
        });
        jToolBar1.add(jButton_principal_crearE);

        jButton_principal_crejuga.setBackground(new java.awt.Color(0, 153, 153));
        jButton_principal_crejuga.setForeground(new java.awt.Color(0, 0, 0));
        jButton_principal_crejuga.setText("Crear Jugadores");
        jButton_principal_crejuga.setFocusable(false);
        jButton_principal_crejuga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_principal_crejuga.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_principal_crejuga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_principal_crejugaMouseClicked(evt);
            }
        });
        jToolBar1.add(jButton_principal_crejuga);

        jButton_principal_trans.setBackground(new java.awt.Color(0, 153, 153));
        jButton_principal_trans.setForeground(new java.awt.Color(0, 0, 0));
        jButton_principal_trans.setText("Transferencias");
        jButton_principal_trans.setFocusable(false);
        jButton_principal_trans.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_principal_trans.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_principal_trans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_principal_transMouseClicked(evt);
            }
        });
        jToolBar1.add(jButton_principal_trans);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sheyllacortez_lab6p2/portada.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, 330));

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu_principal_crearE.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Crear Equipos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_principal_crearE.add(jMenuItem1);

        jMenuItem_principal_crearJ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_principal_crearJ.setText("Crear Jugadores");
        jMenuItem_principal_crearJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_principal_crearJActionPerformed(evt);
            }
        });
        jMenu_principal_crearE.add(jMenuItem_principal_crearJ);

        jMenuItem_principal_trans.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_principal_trans.setText("Transferencias");
        jMenuItem_principal_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_principal_transActionPerformed(evt);
            }
        });
        jMenu_principal_crearE.add(jMenuItem_principal_trans);

        jMenuBar1.add(jMenu_principal_crearE);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        jDialog_crearequipos.pack();
        jDialog_crearequipos.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton_principal_crearEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_principal_crearEMouseClicked

        jDialog_crearequipos.pack();
        jDialog_crearequipos.setVisible(true);
    }//GEN-LAST:event_jButton_principal_crearEMouseClicked

    private void jMenuItem_principal_crearJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_principal_crearJActionPerformed

        jDialog_creajuga.pack();
        jDialog_creajuga.setVisible(true);
    }//GEN-LAST:event_jMenuItem_principal_crearJActionPerformed

    private void jButton_principal_crejugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_principal_crejugaMouseClicked

        jDialog_creajuga.pack();
        jDialog_creajuga.setVisible(true);
    }//GEN-LAST:event_jButton_principal_crejugaMouseClicked

    private void jMenuItem_principal_transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_principal_transActionPerformed

        jDialog_trans.pack();
        jDialog_trans.setVisible(true);
    }//GEN-LAST:event_jMenuItem_principal_transActionPerformed

    private void jButton_principal_transMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_principal_transMouseClicked

        
        jDialog_trans.pack();
        jDialog_trans.setVisible(true);
    }//GEN-LAST:event_jButton_principal_transMouseClicked

    private void jButton_jdcrearjuga_agregarjugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_jdcrearjuga_agregarjugaMouseClicked
        DefaultListModel modelo1 = (DefaultListModel) jList_trans.getModel();
        modelo1.addElement(new Jugadores(jTextField_jdcreaj_nombre.getText(), (Integer) jSpinner_edad.getValue(), (String) jComboBox_pos.getSelectedItem()));
        jList_trans.setModel(modelo1);
        jTextField_jdcreaj_nombre.setText("");
        jSpinner_edad.setValue(15);
        jComboBox_pos.setSelectedItem(0);
    }//GEN-LAST:event_jButton_jdcrearjuga_agregarjugaMouseClicked

    private void jList_transMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_transMouseClicked
        if (jList_trans.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                jPopupMenu_trans_opciones.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jList_transMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        String nombreNuevo = JOptionPane.showInputDialog(jDialog_trans, "Ingrese nombre: ");
        int nuevaEdad = Integer.parseInt(JOptionPane.showInputDialog(jDialog_trans, "Imgrese edad: "));
        if (jList_trans.getSelectedIndex() >= 0) {
            DefaultListModel modelo2 = (DefaultListModel) jList_trans.getModel();
            ((Jugadores) modelo2.get(jList_trans.getSelectedIndex())).setNombre(nombreNuevo);
            ((Jugadores) modelo2.get(jList_trans.getSelectedIndex())).setEdad(nuevaEdad);
            jList_trans.setModel(modelo2);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (jList_trans.getSelectedIndex() >= 0) {
            DefaultListModel modelo3 = (DefaultListModel) jList_trans.getModel();
            modelo3.remove(jList_trans.getSelectedIndex());
            jList_trans.setModel(modelo3);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        DefaultTreeModel modelo4 = (DefaultTreeModel) jTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) modelo4.getRoot();
        DefaultMutableTreeNode nodoEquipo;
        nodoEquipo = new DefaultMutableTreeNode(new Equipos(jTextField_creae_pais.getText(), jTextField_jdcreaj_nombre.getText(), jTextField_creaeq_ciudad.getText(), jTextField_creaequi_estadio.getText()));
        String pais = "";
        pais = jTextField_creae_pais.getText();

        int existe = 1;
        for (int i = 0; i < root.getChildCount(); i++) {
            if (root.getChildAt(i).toString().equals(pais)) {
                
            }
        }
        
        root.add(nodoEquipo);
        modelo4.reload();
      
    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_jdcrearjuga_agregarjuga;
    private javax.swing.JButton jButton_principal_crearE;
    private javax.swing.JButton jButton_principal_crejuga;
    private javax.swing.JButton jButton_principal_trans;
    private javax.swing.JComboBox<String> jComboBox_pos;
    private javax.swing.JDialog jDialog_creajuga;
    private javax.swing.JDialog jDialog_crearequipos;
    private javax.swing.JDialog jDialog_trans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList_trans;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem_principal_crearJ;
    private javax.swing.JMenuItem jMenuItem_principal_trans;
    private javax.swing.JMenu jMenu_principal_crearE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu_trans_opciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_edad;
    private javax.swing.JTextField jTextField_crea_equipo;
    private javax.swing.JTextField jTextField_creae_pais;
    private javax.swing.JTextField jTextField_creaeq_ciudad;
    private javax.swing.JTextField jTextField_creaequi_estadio;
    private javax.swing.JTextField jTextField_jdcreaj_nombre;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jTree;
    // End of variables declaration//GEN-END:variables
    ArrayList<Jugadores> jugador = new ArrayList<>();
    DefaultMutableTreeNode nodoSelected;
    Equipos equipoSelected;
}
