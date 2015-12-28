/*------------------------------------------------------------------------------
 Nombre: frmClientes.java
 Descripción: Clase que contiene la funcionalidad de la ventana de clientes.

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
 04/04/2009        N.D.00001     El sistema permite introducir valores nulos en
                                 todo el registro excepto el id del cliente
                                 porque lo genera. (MAJU)
                                 Se modificó: btnGuardarActionPerformed
------------------------------------------------------------------------------*/
package facyu;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmClientes extends javax.swing.JPanel {
    clsForma Content;
    Datos dts = new Datos();
        
    public frmClientes(clsForma Parent) {
        initComponents();
        movtosSistema.eliminatempcliente();
        movtosSistema.statuspantallacliente = 1;
        Content = Parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAPaterno = new javax.swing.JTextField();
        txtAMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDir1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDir2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();

        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel1.setText("Id de Cliente:");
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtIdCliente.setEditable(false);
        txtIdCliente.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        btnBusca.setText("...");
        btnBusca.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 10));
        btnAceptar.setText("Aceptar");
        btnAceptar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnAceptar.setEnabled(false);
        btnAceptar.setSelected(true);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jSeparator1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 10));
        btnCancelar.setText("Cancelar");
        btnCancelar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnCancelar.setEnabled(false);
        btnCancelar.setSelected(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 10));
        btnGuardar.setText("Guardar");
        btnGuardar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnGuardar.setEnabled(false);
        btnGuardar.setSelected(true);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 10));
        btnEliminar.setText("Eliminar");
        btnEliminar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnEliminar.setEnabled(false);
        btnEliminar.setSelected(true);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 10));
        btnSalir.setText("Salir");
        btnSalir.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnSalir.setSelected(true);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Datos de Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pnlDatos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnlDatos.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel2.setText("Nombre");
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtNombre.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtNombre.setEnabled(false);
        txtNombre.setInheritsPopupMenu(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel3.setText("Apellido Paterno");
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel4.setText("Apellido Materno");
        jLabel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtAPaterno.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtAPaterno.setEnabled(false);
        txtAPaterno.setInheritsPopupMenu(true);

        txtAMaterno.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtAMaterno.setEnabled(false);
        txtAMaterno.setInheritsPopupMenu(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel5.setText("Direccion 1");
        jLabel5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtDir1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtDir1.setEnabled(false);
        txtDir1.setInheritsPopupMenu(true);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel6.setText("Direccion 2");
        jLabel6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtDir2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtDir2.setEnabled(false);
        txtDir2.setInheritsPopupMenu(true);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel11.setText("Colonia");
        jLabel11.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtColonia.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtColonia.setEnabled(false);
        txtColonia.setInheritsPopupMenu(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel7.setText("Ciudad");
        jLabel7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtCiudad.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtCiudad.setEnabled(false);
        txtCiudad.setInheritsPopupMenu(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel8.setText("Estado");
        jLabel8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtEstado.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtEstado.setEnabled(false);
        txtEstado.setInheritsPopupMenu(true);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel9.setText("Telefono");
        jLabel9.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtTel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtTel.setEnabled(false);
        txtTel.setInheritsPopupMenu(true);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel10.setText("RFC");
        jLabel10.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtRFC.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtRFC.setEnabled(false);
        txtRFC.setInheritsPopupMenu(true);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(txtAPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDir2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(txtDir1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(txtAMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(53, 53, 53)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTel)
                                    .addComponent(txtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 10));
        btnNuevo.setText("Nuevo");
        btnNuevo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnNuevo.setSelected(true);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        lblEstado.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblEstado.setForeground(java.awt.Color.red);
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca)
                    .addComponent(lblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    movtosSistema.eliminatempcliente();
    movtosSistema.agregocliente = 0;
    movtosSistema.statuspantallacliente = 0;
    Content.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    String qry;
    
    qry = "Select * From tbl_Clientes Where idCliente = " + txtIdCliente.getText();
    ResultSet rs = dts.rs(qry);
    try
    {
        if (rs.next())
        {
            txtNombre.setText(rs.getString(2));
            txtAPaterno.setText(rs.getString(3));
            txtAMaterno.setText(rs.getString(4));
            txtDir1.setText(rs.getString(5));
            txtDir2.setText(rs.getString(6));
            txtColonia.setText(rs.getString(7));
            txtCiudad.setText(rs.getString(8));
            txtEstado.setText(rs.getString(9));
            txtTel.setText(rs.getString(10));
            txtRFC.setText(rs.getString(11));
        }    
        else
            return;
    }
    catch(Exception e)
    {return;}
    habilitaControls(true);
    txtNombre.transferFocus();
    lblEstado.setText("Modificacion");
    btnBusca.setEnabled(false);
    btnAceptar.setEnabled(false);
    btnCancelar.setEnabled(true);
    btnNuevo.setEnabled(false);
    btnGuardar.setEnabled(true);
    btnEliminar.setEnabled(true);
    btnSalir.setEnabled(false);
}//GEN-LAST:event_btnAceptarActionPerformed

    @SuppressWarnings("static-access")
private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
// TODO add your handling code here:
    String qry;
    ResultSet rs;
    try
    {
        qry = "Select MAX(idCliente) + 1 From tbl_clientes";
        rs = dts.rs(qry);

        if (rs.next())
        {
            txtIdCliente.setText(rs.getString(1));
        
            qry = "Insert Into tbl_clientes(idCliente) Value(" + rs.getString(1) + ")";
            dts.ejecuta(qry); 
            
            lblEstado.setText("Nuevo");
            movtosSistema.agregocliente = 1;
            movtosSistema.idclientetmp = txtIdCliente.getText();
        }
        else
            return;
    }
    catch (Exception e)
    {
       return;
    }
    
    txtNombre.transferFocus();
    habilitaControls(true);
    btnAceptar.setEnabled(false);
    btnBusca.setEnabled(false);
    btnCancelar.setEnabled(true);
    btnNuevo.setEnabled(false);
    btnGuardar.setEnabled(true);
    btnEliminar.setEnabled(false);
    btnSalir.setEnabled(false);
}//GEN-LAST:event_btnNuevoActionPerformed

private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    String qry;
    movtosSistema.eliminatempcliente();
    movtosSistema.agregocliente = 0;
    
    txtIdCliente.setText("");
    lblEstado.setText("");
    LimpiaControls();
    habilitaControls(false);
    btnAceptar.setEnabled(false);
    btnBusca.setEnabled(true);
    btnCancelar.setEnabled(false);
    btnNuevo.setEnabled(true);
    btnGuardar.setEnabled(false);
    btnEliminar.setEnabled(false);
    btnSalir.setEnabled(true);
}//GEN-LAST:event_btnCancelarActionPerformed

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    if (JOptionPane.showConfirmDialog(Content, "Se guardaran los cambios para el cliente con id: " + txtIdCliente.getText(),
            "FACYU",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.CANCEL_OPTION)
    {
        txtNombre.transferFocus();
        return;        
    }
    
    dts.TablaUpdate("tbl_clientes", 10);
    dts.GeneraUpdate("nombre", txtNombre.getText(), 0,true);
    dts.GeneraUpdate("apaterno", txtAPaterno.getText(), 0,true);
    dts.GeneraUpdate("amaterno", txtAMaterno.getText(), 0,true);
    dts.GeneraUpdate("direccion1", txtDir1.getText(), 0,true);
    dts.GeneraUpdate("direccion2", txtDir2.getText(), 0,false);
    dts.GeneraUpdate("colonia", txtColonia.getText(), 0,true);
    dts.GeneraUpdate("ciudad", txtCiudad.getText(), 0,true);
    dts.GeneraUpdate("estado", txtEstado.getText(), 0,true);
    dts.GeneraUpdate("telefono", txtTel.getText(), 0,false);
    dts.GeneraUpdate("rfc", txtRFC.getText(), 0,true);
    dts.AgregaWhere(1);
    dts.GeneraCondicion("idCliente", txtIdCliente.getText(), 1);
    int ret = 0;
    //inicio N.D.00001 (MAJU)
    // Si no faltan campos, entonces prosigue con el Query
    if (dts.faltancampos == 0)
        ret = dts.ejecutaUpdate();

    dts.faltancampos = 0;
    //Fin N.D.00001
    
    if (ret == 0)
    {
        JOptionPane.showMessageDialog(Content, "El registro se ha Actualizado con exito.", "FACYU", JOptionPane.INFORMATION_MESSAGE);
        movtosSistema.agregocliente = 0;
        movtosSistema.idclientetmp = "";

        txtIdCliente.setText("");
        lblEstado.setText("");
        LimpiaControls();
        habilitaControls(false);
        btnAceptar.setEnabled(false);
        btnBusca.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(true);
    }
}//GEN-LAST:event_btnGuardarActionPerformed

private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
// TODO add your handling code here:
    if (JOptionPane.showConfirmDialog(Content, "Esta seguro de querer borrar del catalogo\n el cliente con id: " + txtIdCliente.getText() + "?",
            "FACYU",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE) == JOptionPane.CANCEL_OPTION)
    {
        txtNombre.transferFocus();
        return;        
    }
    
    String qry;
    qry = "Delete From tbl_clientes Where idCliente = " + txtIdCliente.getText();
    int ret = dts.ejecuta(qry);
    if (ret == 0)
    {
        JOptionPane.showMessageDialog(Content, "El registro se ha borrado con exito.", "FACYU", JOptionPane.INFORMATION_MESSAGE);
        btnCancelarActionPerformed(evt);
    }
}//GEN-LAST:event_btnEliminarActionPerformed

private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
    // TODO add your handling code here:
    String qry = "Select * From tbl_Clientes";
    dlgBusca dlg = new dlgBusca(null, true, qry);  //null, true, TOOL_TIP_TEXT_KEY, );
    dlg.setVisible(true);
    txtIdCliente.setText(String.valueOf(dlg.getValorRetorno(0)));
    if (txtIdCliente.getText().compareTo("") != 0)
        btnAceptar.setEnabled(true);
    else
        btnAceptar.setEnabled(false);
}//GEN-LAST:event_btnBuscaActionPerformed

private void habilitaControls(boolean flag)
{
    txtNombre.setEnabled(flag);
    txtAPaterno.setEnabled(flag);
    txtAMaterno.setEnabled(flag);
    txtDir1.setEnabled(flag);
    txtDir2.setEnabled(flag);
    txtColonia.setEnabled(flag);
    txtCiudad.setEnabled(flag);
    txtEstado.setEnabled(flag);
    txtTel.setEnabled(flag);
    txtRFC.setEnabled(flag);
}

private void LimpiaControls()
{
    txtNombre.setText("");
    txtAPaterno.setText("");
    txtAMaterno.setText("");
    txtDir1.setText("");
    txtDir2.setText("");
    txtColonia.setText("");
    txtCiudad.setText("");
    txtEstado.setText("");
    txtTel.setText("");
    txtRFC.setText("");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtAMaterno;
    private javax.swing.JTextField txtAPaterno;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtDir1;
    private javax.swing.JTextField txtDir2;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

}
