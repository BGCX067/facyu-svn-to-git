package facyu;

import java.awt.event.FocusEvent;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class frmFactura extends javax.swing.JPanel {
    private clsForma Content;
    private Datos dts = new Datos();
    private String cliente = "";
    private String fact = "";
    private double txTotal = 0.00;
    private DefaultTableModel modelo = new DefaultTableModel(new Object[] {
                "Codigo", "Nombre", "Cantidad", "Precio", "Total"}, 0);
    public frmFactura(clsForma Parent) {
        initComponents();
        Content = Parent;
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();        
        txtFecha.setText(df.format(now));
        tblCompra.setModel(modelo);

    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFactNo = new javax.swing.JTextField();
        btnBuscaF = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnBuscaC = new javax.swing.JButton();
        txtClienteN = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnBuscaP = new javax.swing.JButton();
        txtProductoN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        btnAceptar.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnAceptar.setEnabled(false);
        btnAceptar.setSelected(true);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnCancelar.setText("Nuevo");
        btnCancelar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnCancelar.setEnabled(false);
        btnCancelar.setSelected(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnGuardar.setText("Imprimir");
        btnGuardar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnGuardar.setEnabled(false);
        btnGuardar.setSelected(true);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnEliminar.setText("Cancelar");
        btnEliminar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnEliminar.setEnabled(false);
        btnEliminar.setSelected(true);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jSeparator1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel1.setLabelFor(txtFecha);
        jLabel1.setText("Fecha:");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Verdana", 0, 11));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel2.setLabelFor(txtCantidad);
        jLabel2.setText("Fact. No.");

        txtFactNo.setFont(new java.awt.Font("Verdana", 0, 11));
        txtFactNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFactNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFactNoFocusLost(evt);
            }
        });

        btnBuscaF.setText("...");
        btnBuscaF.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnBuscaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel3.setLabelFor(txtCliente);
        jLabel3.setText("Cliente:");

        txtCliente.setFont(new java.awt.Font("Verdana", 0, 11));
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClienteFocusLost(evt);
            }
        });

        btnBuscaC.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnBuscaC.setText("...");
        btnBuscaC.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnBuscaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCActionPerformed(evt);
            }
        });

        txtClienteN.setEditable(false);
        txtClienteN.setFont(new java.awt.Font("Verdana", 0, 11));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N
        jLayeredPane1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel4.setLabelFor(txtPrecio);
        jLabel4.setText("Precio:");
        jLabel4.setBounds(180, 50, 40, 15);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtCantidad.setFont(new java.awt.Font("Verdana", 0, 11));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCantidad.setEnabled(false);
        txtCantidad.setBounds(70, 50, 70, 21);
        jLayeredPane1.add(txtCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnBuscaP.setText("...");
        btnBuscaP.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnBuscaP.setEnabled(false);
        btnBuscaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPActionPerformed(evt);
            }
        });
        btnBuscaP.setBounds(160, 20, 24, 23);
        jLayeredPane1.add(btnBuscaP, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtProductoN.setEditable(false);
        txtProductoN.setFont(new java.awt.Font("Verdana", 0, 11));
        txtProductoN.setBounds(200, 20, 500, 21);
        jLayeredPane1.add(txtProductoN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel5.setLabelFor(txtProducto);
        jLabel5.setText("Producto:");
        jLabel5.setBounds(10, 20, 60, 15);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtProducto.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtProducto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtProducto.setEnabled(false);
        txtProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductoFocusLost(evt);
            }
        });
        txtProducto.setBounds(70, 20, 90, 21);
        jLayeredPane1.add(txtProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel6.setLabelFor(txtCantidad);
        jLabel6.setText("Cantidad:");
        jLabel6.setBounds(10, 50, 60, 15);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Verdana", 0, 11));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio.setBounds(220, 50, 110, 21);
        jLayeredPane1.add(txtPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnAgregar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnAgregar.setEnabled(false);
        btnAgregar.setSelected(true);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.setBounds(340, 50, 80, 23);
        jLayeredPane1.add(btnAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCompra.setEnabled(false);
        tblCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblCompraKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCompra);

        jScrollPane1.setBounds(10, 80, 690, 260);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel7.setLabelFor(txtTotal);
        jLabel7.setText("Total:");
        jLabel7.setBounds(540, 50, 40, 15);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Verdana", 0, 11));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setBounds(580, 50, 120, 21);
        jLayeredPane1.add(txtTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnSalir.setFont(new java.awt.Font("Arial ", 0, 10));
        btnSalir.setText("Salir");
        btnSalir.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnSalir.setSelected(true);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtClienteN, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btnBuscaF)
                        .addComponent(jLabel1)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClienteN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
// TODO add your handling code here:
    String qry;
    ResultSet rs;
    Object ob[]=new Object[5];
    

    if (txtCliente.getText().compareTo(cliente) == 0 && fact.compareTo("") != 0)
    {
        qry = "Select a.idProducto, a.nombre, b.cantidad, a.precio, b.cantidad * a.precio as Total from tbl_fact_dtl b, tbl_productos a " +
                "where a.idProducto = b.idProducto and idFactura = " + fact;
        rs = dts.rs(qry);
        try
        {
            while (rs.next())
            {
                ob[0] = rs.getString(1);
                ob[1] = rs.getString(2);
                ob[2] = rs.getString(3);
                ob[3] = rs.getString(4);
                ob[4] = rs.getString(5);
                
                txTotal += rs.getInt(3) * rs.getDouble(4);

                modelo.addRow(ob);
            }
            tblCompra.setModel(modelo);

            txtTotal.setText(String.valueOf(txTotal));
        }
        catch(Exception e)
        {
//            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    habilitaControls(true);
    

    if (fact.compareTo("") == 0 )
        btnEliminar.setEnabled(false);
}//GEN-LAST:event_btnAceptarActionPerformed

private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
// TODO add your handling code here:
    cliente = "";
    fact = "";
    txTotal = 0.00;
    btnBuscaC.setEnabled(true);
    btnBuscaF.setEnabled(true);

    
    while ( tblCompra.getRowCount() > 0 )
        modelo.removeRow(0);
      
    tblCompra.setModel(modelo);
    
    txtCantidad.setText("");
    txtCliente.setText("");
    txtClienteN.setText("");
    txtFactNo.setText("");
    txtPrecio.setText("");
    txtProducto.setText("");
    txtProductoN.setText("");
    txtTotal.setText("");

    habilitaControls(false);
    btnAceptar.setEnabled(false);
}//GEN-LAST:event_btnCancelarActionPerformed

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
// TODO add your handling code here:
    String qry;
    if (tblCompra.getRowCount() == 0)
    {
        JOptionPane.showMessageDialog(Content, "No se han agregado productos a la factura, por lo tanto no se puede mandar a impresión.","FACYU",JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    if (fact.compareTo("")!=0)
    {
        qry = "Update tbl_fact_hdr set FactNo = '" + txtFactNo.getText() + "', " +
                "idCliente = " + txtCliente.getText() + ", FechaUltimoMovto = CURRENT_DATE(), " +
                "TotalGral = " + txtTotal.getText() + ", estatus = 1 where idFactura = " + fact;
        dts.ejecuta(qry);
        qry = "Delete From tbl_fact_dtl where idFactura = " + fact;
        dts.ejecuta(qry);
    }
    else
    {
        qry = "Insert Into tbl_fact_hdr (FactNo, idCliente, FechaFact, FechaUltimoMovto, TotalGral, Estatus) " +
                "Values ('" + txtFactNo.getText() + "'," + txtCliente.getText() + ",CURRENT_DATE()," +
                "CURRENT_DATE()," + txtTotal.getText() + ",0)";
        dts.ejecuta(qry);

        qry = "Select idFactura from tbl_fact_hdr where FactNo = '" + txtFactNo.getText() + "'";
        ResultSet rs = dts.rs(qry);
        try
        {
            if (rs.next())
            {
                fact = rs.getString(1);
            }
        }
        catch(Exception e){}
    }
    for (int i = 0; i<tblCompra.getRowCount();i++)
    {
        qry = "Insert into tbl_fact_dtl Select " + fact + ", " + tblCompra.getValueAt(i, 0) + ", " +
                tblCompra.getValueAt(i, 3) + ", " + tblCompra.getValueAt(i, 2) ;
        dts.ejecuta(qry);
    }

    int mesg = JOptionPane.showConfirmDialog(Content, "La factura se ha guardado con exito.\n¿Desea mandarla a impresión?","FACYU",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
    if ( mesg == 0 );
    {
        JOptionPane.showMessageDialog(Content, "No se ha encontrado el formato de Factura.","FACYU",JOptionPane.INFORMATION_MESSAGE);
    }

    btnCancelarActionPerformed(evt);
}//GEN-LAST:event_btnGuardarActionPerformed

private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
// TODO add your handling code here:
    if (JOptionPane.showConfirmDialog(Content, "Esta seguro de cancelar esta factura?","FACYU",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION)
    {
        return;
    }

    String qry = "Update tbl_fact_hdr set estatus = 2 where idFactura = " + fact;
    dts.ejecuta(qry);

    cliente = "";
    fact = "";
    txTotal = 0.00;
    while ( tblCompra.getRowCount() > 0 )
            modelo.removeRow(0);
    
    tblCompra.setModel(modelo);
    txtCantidad.setText("");
    txtCliente.setText("");
    txtClienteN.setText("");
    txtFactNo.setText("");
    txtPrecio.setText("");
    txtProducto.setText("");
    txtProductoN.setText("");
    txtTotal.setText("");

    habilitaControls(false);
    btnAceptar.setEnabled(false);
}//GEN-LAST:event_btnEliminarActionPerformed

private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
// TODO add your handling code here:
    if (txtCantidad.getText().compareTo("")==0 && txtProducto.getText().compareTo("")==0)
        return;

    Object ob[]=new Object[5];
    

    ob[0] = txtProducto.getText();
    ob[1] = txtProductoN.getText();
    ob[2] = txtCantidad.getText();
    ob[3] = txtPrecio.getText();
    ob[4] = Double.parseDouble(txtPrecio.getText()) * Double.parseDouble(txtCantidad.getText());
        
    modelo.addRow(ob);

    tblCompra.setModel(modelo);

    txTotal += Integer.parseInt(txtCantidad.getText()) * Double.parseDouble(txtPrecio.getText());

    txtTotal.setText(String.valueOf(txTotal));

    txtProducto.setText("");
    txtProductoN.setText("");
    txtCantidad.setText("");
    txtPrecio.setText("");
}//GEN-LAST:event_btnAgregarActionPerformed

private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
// TODO add your handling code here:    
    Content.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

private void txtFactNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFactNoFocusLost
// TODO add your handling code here:
    if (txtFactNo.getText().compareTo("") != 0)
    {
        String qry = "Select * from tbl_fact_hdr where FactNo = '" + txtFactNo.getText() + "'";
                    
        ResultSet rs = dts.rs(qry);
        try{
            if (rs.next())
            {
                if (rs.getInt("estatus") == 2)
                {
                    JOptionPane.showMessageDialog(Content, "La factura seleccionada se encuentra actualmente cancelada.","FACYU",JOptionPane.ERROR_MESSAGE);
                    txtFactNo.setText("");
                    return;
                }
                qry = "Select idCliente, nombre, apaterno, amaterno from tbl_clientes " +
                        "where idCliente = " + rs.getInt(3);
                cliente = rs.getString(3);
                fact = rs.getString(1);

                rs = dts.rs(qry);
                if (rs.next())
                {
                    txtCliente.setText(rs.getString(1));
                    txtClienteN.setText(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                }
            }
        }
        catch (Exception ex){
            fact = "";
            cliente = "";
        }
        
        if (txtCliente.getText().compareTo("") != 0)
            btnAceptar.setEnabled(true);
    }
    else
    {
        fact = "";
        cliente = "";
    }
}//GEN-LAST:event_txtFactNoFocusLost

private void txtClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClienteFocusLost
// TODO add your handling code here:
    if (txtCliente.getText().compareTo("") == 0)
        return;
    String qry = "Select * From tbl_Clientes Where idCliente = " + txtCliente.getText();
    ResultSet rs = dts.rs(qry);
    try
    {
        if (rs.next())
        {
            String nombre = rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4);
            txtClienteN.setText(nombre);
        }
        else
        {
            txtCliente.setText("");
            txtClienteN.setText("");
            if ( JOptionPane.showConfirmDialog(null, "El Cliente que introdujo no existe\nDesea agregarlo en este momento?","FACYU",
                    JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE) == JOptionPane.OK_OPTION )
            {
                clsForma frm = new clsForma(Content.dskMain);
                frmClientes frmClient = new frmClientes(frm);            
                frm.addForm(frmClient, "Catalogo de Clientes");                
            }
        }
    }
    catch(Exception e) {
        //JOptionPane.showMessageDialog(null, e.getMessage());
    }
    
    if (txtFactNo.getText().compareTo("") != 0)
        btnAceptar.setEnabled(true);
}//GEN-LAST:event_txtClienteFocusLost

private void btnBuscaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPActionPerformed
// TODO add your handling code here:
    String qry;
    
    qry = "Select * From tbl_productos " ;
    dlgBusca dlg = new dlgBusca(null, true, qry);  //null, true, TOOL_TIP_TEXT_KEY, );
    dlg.setVisible(true);

    txtProducto.setText(String.valueOf(dlg.getValorRetorno(0)));
    txtProductoN.setText(String.valueOf(dlg.getValorRetorno(1)));
    txtPrecio.setText(String.valueOf(dlg.getValorRetorno(2)));
}//GEN-LAST:event_btnBuscaPActionPerformed

private void btnBuscaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaFActionPerformed
    // TODO add your handling code here:
    String qry = "Select a.FactNo as 'Numero de factura', b.idCliente, a.fechafact as Fecha, "+
            "concat(b.nombre , ' ' , b.apaterno , ' ' , b.amaterno) as 'Nombre Cliente' From tbl_fact_hdr a, tbl_clientes b " +
            "where a.idCliente = b.idCliente and estatus != 2";
    if (txtCliente.getText().compareTo("") != 0)
        qry += " And a.idCliente = " + txtCliente.getText();

    dlgBusca dlg = new dlgBusca(null, true, qry);  //null, true, TOOL_TIP_TEXT_KEY, );
    dlg.setVisible(true);
    txtFactNo.setText(String.valueOf(dlg.getValorRetorno(0)));
    if (txtFactNo.getText().compareTo("") != 0)
    {
        txtFecha.setText(String.valueOf(dlg.getValorRetorno(2)));
        txtCliente.setText(String.valueOf(dlg.getValorRetorno(1)));
        txtClienteN.setText(String.valueOf(dlg.getValorRetorno(3)));
        btnAceptar.setEnabled(true);
        FocusEvent fe = new FocusEvent(txtFactNo, 0);
        txtFactNoFocusLost(fe);
    }
    else
        btnAceptar.setEnabled(false);
}//GEN-LAST:event_btnBuscaFActionPerformed

private void btnBuscaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCActionPerformed
    // TODO add your handling code here:
    String qry = "Select * From tbl_Clientes";
    String nombre;
    dlgBusca dlg = new dlgBusca(null, true, qry);
    dlg.setVisible(true);
    txtCliente.setText(String.valueOf(dlg.getValorRetorno(0)));
    if (txtCliente.getText().compareTo("") != 0)
    {
        nombre = String.valueOf(dlg.getValorRetorno(1)) + " " + String.valueOf(dlg.getValorRetorno(2)) + " " + String.valueOf(dlg.getValorRetorno(3));
        txtClienteN.setText(nombre);
        if (txtFactNo.getText().compareTo("") != 0)
            btnAceptar.setEnabled(true);
    }
    else
        btnAceptar.setEnabled(false);
}//GEN-LAST:event_btnBuscaCActionPerformed

private void txtProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductoFocusLost
    // TODO add your handling code here:
    String qry = "Select nombre, precio from tbl_productos where idProducto = " + txtProducto.getText();
    ResultSet rs = dts.rs(qry);
    try{
        if (rs.next())
        {
            txtProductoN.setText(rs.getString(1));
            txtPrecio.setText(rs.getString(2));
        }
        else
        {
            txtProducto.setText("");
            txtProductoN.setText("");
            txtPrecio.setText("");
            if ( JOptionPane.showConfirmDialog(null, "El Producto que introdujo no existe\nDesea agregarlo en este momento?","FACYU",
                    JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE) == JOptionPane.OK_OPTION )
            {
                clsForma frm = new clsForma(Content.dskMain);
                frmProductos frmProd = new frmProductos(frm);
                frm.addForm(frmProd, "Catalogo de Productos");
            }
        }
    }
    catch(Exception e){}
}//GEN-LAST:event_txtProductoFocusLost

private void tblCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCompraKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode() == evt.VK_DELETE )
    {
        double dbl = Double.parseDouble(String.valueOf(tblCompra.getValueAt(tblCompra.getSelectedRow(), 3))) * Double.parseDouble(String.valueOf(tblCompra.getValueAt(tblCompra.getSelectedRow(), 2)));
        txTotal += (dbl *(-1));
        txtTotal.setText(String.valueOf(txTotal));
        modelo.removeRow(tblCompra.getSelectedRow());
        tblCompra.setModel(modelo);
        
    }
}//GEN-LAST:event_tblCompraKeyPressed

private void habilitaControls(boolean flag){
  txtProducto.setEnabled(flag);
  txtProductoN.setEnabled(flag);
  txtCantidad.setEnabled(flag);  
  txtPrecio.setEnabled(flag);
  btnBuscaP.setEnabled(flag);
  btnAgregar.setEnabled(flag);
  tblCompra.setEnabled(flag);
  btnCancelar.setEnabled(flag);
  btnEliminar.setEnabled(flag);
  btnGuardar.setEnabled(flag);
  btnAceptar.setEnabled(!flag);
  btnBuscaC.setEnabled(!flag);
  btnBuscaF.setEnabled(!flag);
  txtFactNo.setEnabled(!flag);
  txtCliente.setEnabled(!flag);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscaC;
    private javax.swing.JButton btnBuscaF;
    private javax.swing.JButton btnBuscaP;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCompra;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtClienteN;
    private javax.swing.JTextField txtFactNo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProductoN;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}


