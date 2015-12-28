package facyu;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class clsForma extends JInternalFrame {
    public JDesktopPane dskMain;

    public clsForma(JDesktopPane dskPnl)
    {    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        dskMain = dskPnl;
        dskPnl.add(this);
    }
    
    public void addForm(JPanel frm, String titulo)
    {        
        this.add(frm);
        this.setResizable(true);
        this.setClosable(true);
        this.setMaximizable(true);
        this.setTitle(titulo);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.pack();        
        this.setVisible(true);
    }
}
