package facyu;

import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dlgBusca extends javax.swing.JDialog {
    private Datos dts = new Datos();
    private DefaultTableModel modelo = null;
        private int iBuscaRow = -1;        
    /** Creates new form dlgBusca */
    public dlgBusca(java.awt.Frame parent, boolean modal, String QryBusca) {
        super(parent, modal);
        initComponents();
        
        ResultSet rs;
        rs = dts.rs(QryBusca);
        
        try
        {
            int numColumns = rs.getMetaData().getColumnCount();
            Object columns[] = new Object[numColumns];
            Object rows[] = new Object[numColumns];
            for (int i=0; i<numColumns;i++)
            {
                columns[i] = rs.getMetaData().getColumnName(i+1);
                cmbBuscaEn.addItem(columns[i]);
            }
            
            modelo = new DefaultTableModel(columns,0);
            
            while (rs.next())
            {
                for (int j=0;j<numColumns;j++ )
                {
                    rows[j] = rs.getString(j+1);
                }
                modelo.addRow(rows);
            }
            tblResult.setModel(modelo);
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        cmbBuscaEn = new javax.swing.JComboBox();
        btnBusca = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Buscar Valor:");

        jLabel2.setText("En:");

        tblResult.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblResultKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblResult);

        btnBusca.setText("...");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBuscaEn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbBuscaEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    iBuscaRow = -1;
    dispose();
}//GEN-LAST:event_btnCancelarActionPerformed

private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    iBuscaRow = tblResult.getSelectedRow();
    dispose();
}//GEN-LAST:event_btnAceptarActionPerformed

private void tblResultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblResultKeyPressed
    switch (evt.getKeyCode())
    {
        case 10:
            btnAceptarActionPerformed(null);
            break;
    }
}//GEN-LAST:event_tblResultKeyPressed

private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
    Vector clm = new Vector(modelo.getColumnCount());
    Object rws[] = new Object[modelo.getColumnCount()];
    for (int j=0;j<modelo.getColumnCount();j++)
        clm.add(modelo.getColumnName(j));
    
    DefaultTableModel mdl = new DefaultTableModel(clm,0);
    
    if ( txtBusca.getText().compareTo("") != 0 && cmbBuscaEn.getSelectedIndex() >= 0 )
    {
        for (int i = 0; i < modelo.getRowCount(); i++)
        {
            if (modelo.getValueAt(i, cmbBuscaEn.getSelectedIndex()).equals(txtBusca.getText()))
            {
                for(int j=0;j< modelo.getColumnCount(); j++)
                    rws[j] = modelo.getValueAt(i, j);
                
                mdl.addRow(rws);
            }
        }        
        tblResult.setModel(mdl);
    }
}//GEN-LAST:event_btnBuscaActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbBuscaEn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables

    
    public Object getValorRetorno(int iColBusca)
    {
        Object retorno = "";
        if (iBuscaRow >= 0)
            retorno = tblResult.getValueAt(iBuscaRow, iColBusca);
        
        return retorno;
    }
}
