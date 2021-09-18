package interfazgrafica.tabbedpane;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

/**
 *
 * @author CARO
 */
public class FPrincipal extends JFrame{
    private  JPanel panel1;
    private JPanel panel2;
    private JTabbedPane panelPestanas;
    public static void main(String[] args) {
        FPrincipal frame = new FPrincipal();
        frame.setVisible(true);
    }
    public FPrincipal(){
        initGUI();
    }
    
    private void initGUI(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Frame principal");
        panelPestanas = new JTabbedPane ();
        getContentPane().add(panelPestanas);
        panel1 = new JPanel();
        panelPestanas.addTab("Pestaña 1", panel1);
        panel2 = new JPanel();
        panelPestanas.addTab("Pestaña 2", new ImageIcon("img/java.png") , panel2);
        setSize(400, 300);
        
    }
    
}
