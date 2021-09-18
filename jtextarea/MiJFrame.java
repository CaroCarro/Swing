package interfazgrafica.jtextarea;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author CARO
 */
public class MiJFrame extends JFrame{
    
    public static void main(String[] args) {
        MiJFrame frame = new MiJFrame();
        frame.setVisible(true);
    }
    public MiJFrame(){
        initGUI();
    }
    public void initGUI(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mi JFrame");
        setSize(400, 300);
        JTextArea area = new JTextArea ("JTextArea");
        area.setBounds(10, 30, 200, 200);
        add(area);
        setLayout(null);
    }
}
