package facyu;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmProductos extends javax.swing.JPanel {
    clsForma Content;
    Datos dts = new Datos();
    
    /** Creates new form frmProductos */
    public frmProductos(clsForma Parent) {
        initComponents();
        movtosSistema.eliminatmpproducto();
        movtosSistema.statuspantallaproductos = 1;
        Content = Parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
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
        txtPrecio = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();

        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel1.setText("Id de Producto:");
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtIdProducto.setEditable(false);
        txtIdProducto.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

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

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        jLabel2.setText("Descripcion");
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtNombre.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtNombre.setEnabled(false);
        txtNombre.setInheritsPopupMenu(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel3.setText("Precio");
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtPrecio.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtPrecio.setEnabled(false);
        txtPrecio.setInheritsPopupMenu(true);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
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
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
            .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca)
                    .addComponent(lblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
// TODO add your handling code here:
    movtosSistema.eliminatmpproducto();
    movtosSistema.agregoproducto = 0;
    movtosSistema.statuspantallaproductos = 0;
    Content.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
// TODO add your handling code here:
    String qry;
    
    qry = "Select * From tbl_productos Where idProducto = " + txtIdProducto.getText();
    ResultSet rs = dts.rs(qry);
    try
    {
        if (rs.next())
        {
            txtNombre.setText(rs.getString(2));
            txtPrecio.setText(rs.getString(3));            
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

private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
// TODO add your handling code here:
    String qry;
    ResultSet rs;
    try
    {
        qry = "Select MAX(idProducto) + 1 From tbl_Productos";
        rs = dts.rs(qry);

        if (rs.next())
        {
            txtIdProducto.setText(rs.getString(1));
        
            qry = "Insert Into tbl_Productos(idProducto) Value(" + rs.getString(1) + ")";
            dts.ejecuta(qry); 
            
            lblEstado.setText("Nuevo");
            movtosSistema.agregoproducto = 1;
            movtosSistema.idproductotmp = txtIdProducto.getText();
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
// TODO add your handling code here:
    String qry;
    movtosSistema.eliminatmpproducto();
    movtosSistema.agregoproducto = 0;
    
    txtIdProducto.setText("");
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
// TODO add your handling code here:
    if (JOptionPane.showConfirmDialog(Content, "Se guardaran los cambios para el Producto con id: " + txtIdProducto.getText(),
            "FACYU",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.CANCEL_OPTION)
    {
        txtNombre.transferFocus();
        return;        
    }
    
    dts.TablaUpdate("tbl_Productos", 2);
    dts.GeneraUpdate("nombre", txtNombre.getText(), 0,true);
    dts.GeneraUpdate("precio", txtPrecio.getText(), 1,true);
    dts.AgregaWhere(1);
    dts.GeneraCondicion("idProducto", txtIdProducto.getText(), 1);
    int ret = 0;
    if (dts.faltancampos == 0)
        ret = dts.ejecutaUpdate();

    dts.faltancampos = 0;

    if (ret == 0)
    {
        JOptionPane.showMessageDialog(Content, "El registro se ha Actualizado con exito.", "FACYU", JOptionPane.INFORMATION_MESSAGE);
        movtosSistema.agregoproducto = 0;
        movtosSistema.idproductotmp = "";

        txtIdProducto.setText("");
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
    if (JOptionPane.showConfirmDialog(Content, "Esta seguro de querer borrar del catalogo\n el Producto con id: " + txtIdProducto.getText() + "?",
            "FACYU",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE) == JOptionPane.CANCEL_OPTION)
    {
        txtNombre.transferFocus();
        return;        
    }
    
    String qry;
    qry = "Delete From tbl_Productos Where idProducto = " + txtIdProducto.getText();
    int ret = dts.ejecuta(qry);
    if (ret == 0)
    {
        JOptionPane.showMessageDialog(Content, "El registro se ha borrado con exito.", "FACYU", JOptionPane.INFORMATION_MESSAGE);
        btnCancelarActionPerformed(evt);
    }
}//GEN-LAST:event_btnEliminarActionPerformed

private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
// TODO add your handling code here:
    int k=(int)evt.getKeyChar();
    if ((k >= 97 && k <= 122) || (k>=65 && k<=90) || k==241 || k==209)
        evt.setKeyChar((char)java.awt.event.KeyEvent.VK_CLEAR);
    if(k==10)
        txtPrecio.transferFocus();
}//GEN-LAST:event_txtPrecioKeyTyped

private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
    // TODO add your handling code here:
    String qry = "Select * From tbl_productos";
    dlgBusca dlg = new dlgBusca(null, true, qry);  //null, true, TOOL_TIP_TEXT_KEY, );
    dlg.setVisible(true);
    txtIdProducto.setText(String.valueOf(dlg.getValorRetorno(0)));
    if (txtIdProducto.getText().compareTo("") != 0)
        btnAceptar.setEnabled(true);
    else
        btnAceptar.setEnabled(false);
}//GEN-LAST:event_btnBuscaActionPerformed

private void habilitaControls(boolean flag)
{
    txtNombre.setEnabled(flag);
    txtPrecio.setEnabled(flag);    
}

private void LimpiaControls()
{
    txtNombre.setText("");
    txtPrecio.setText("");    
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
