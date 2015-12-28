/*------------------------------------------------------------------------------
 Nombre: Datos.java
 Descripción: Clase que contiene la funcionalidad la ejecución de los queries.

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
------------------------------------------------------------------------------*/
package facyu;

import javax.swing.JInternalFrame;


public class Principal extends javax.swing.JFrame {
    Datos dts = new Datos();
    public Principal() {
        initComponents();
        dts.conectaBasedeDatos();
        this.setTitle("FACYU - Factura y Utiliza - Modulo de Facturacion.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        catalogosMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuFacturar = new javax.swing.JMenu();
        frmFacturas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        desktopPane.setBackground(new java.awt.Color(134, 133, 157));
        desktopPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuBar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        fileMenu.setText("Menu");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setText("|");
        jMenu1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenu1.setFocusable(false);
        menuBar.add(jMenu1);

        catalogosMenu.setText("Catalogos");

        jMenuItem2.setText("Clientes");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseReleased(evt);
            }
        });
        catalogosMenu.add(jMenuItem2);

        jMenuItem1.setText("Productos");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        catalogosMenu.add(jMenuItem1);

        menuBar.add(catalogosMenu);

        mnuFacturar.setText("Ventas");

        frmFacturas.setText("Facturar");
        frmFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                frmFacturasMouseReleased(evt);
            }
        });
        mnuFacturar.add(frmFacturas);

        menuBar.add(mnuFacturar);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
    clsForma frm = new clsForma(desktopPane);
    frmProductos frmProd = new frmProductos(frm);
    frm.addForm(frmProd,"Catalogo de Productos");    
}//GEN-LAST:event_jMenuItem1MouseReleased

private void jMenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseReleased
    clsForma frm = new clsForma(desktopPane);
    frmClientes frmClient = new frmClientes(frm);            
    frm.addForm(frmClient, "Catalogo de Clientes");
}//GEN-LAST:event_jMenuItem2MouseReleased

private void frmFacturasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmFacturasMouseReleased
    clsForma frm = new clsForma(desktopPane);
    frmFactura frmFact = new frmFactura(frm);            
    frm.addForm(frmFact, "Captura de Facturas"); 
}//GEN-LAST:event_frmFacturasMouseReleased

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    movtosSistema.eliminatempcliente();
    movtosSistema.eliminatmpproducto();
    dts.cierraConexiones();    
}//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                  
                Principal frm = new Principal();                
                frm.setExtendedState(frm.getExtendedState()|frm.MAXIMIZED_BOTH);
                frm.setVisible(true);               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu catalogosMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem frmFacturas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuFacturar;
    // End of variables declaration//GEN-END:variables

}
