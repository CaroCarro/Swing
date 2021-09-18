package interfazgrafica.jradiobutton.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author CARO
 */
public class FPrincipal extends JFrame implements  ActionListener{
    private JPanel panel;
    private JRadioButton jrb1;
    private JRadioButton jrb2;
    private JRadioButton jrb3;
    private ButtonGroup bg;
    public static void main(String[] args) {
        FPrincipal frame = new FPrincipal();
        frame.setVisible(true);
    }
    public FPrincipal(){
        initGUI();
    }
    private void  initGUI(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Frame principal");
        panel = new JPanel();
        panel.setBorder(new TitledBorder ("Panel"));
        getContentPane().add(panel);
        jrb1 = new JRadioButton("Opcion 1");
        jrb2 = new JRadioButton("Opcion 2");
        jrb3 = new JRadioButton("Opcion 3");
        bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);
        jrb1.addActionListener(this);
        jrb2.addActionListener(this);
        jrb3.addActionListener(this);
        panel.add(jrb1);//Hace que aparezcan lo c[irculos con las 3 opciones
        panel.add(jrb2);
        panel.add(jrb3);
        setSize(400, 300);      
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == jrb1){
            this.setTitle(jrb1.getText());
            panel.setBorder(new TitledBorder("Selecciono " + jrb1.getText()));
        }
        if (ae.getSource() == jrb2){
            this.setTitle(jrb2.getText());
            panel.setBorder(new TitledBorder("Selecciono " + jrb2.getText()));
        }
        if (ae.getSource() == jrb3){
            this.setTitle(jrb3.getText());
            panel.setBorder(new TitledBorder("Selecciono " + jrb3.getText()));
        }
    }
}
