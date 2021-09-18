package interfazgrafica.radiojbutton;

import java.awt.TextField;
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
public class FPrincipal extends JFrame implements ActionListener{
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
    private void initGUI(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Frame pricipal");
        panel = new JPanel();
        panel.setBorder(new TitledBorder("Panel1"));
        getContentPane().add(panel);
        jrb1 = new JRadioButton("Opción 1");
        jrb2 = new JRadioButton("Opción 2");
        jrb3 = new JRadioButton("Opción 3");
        bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);
        jrb1.addActionListener(this);//Estos hacen que el texto de cada opci[on pase a ser el t[itulo del cuadro
        jrb2.addActionListener(this);
        jrb3.addActionListener(this);
        
        panel.add(jrb1);
        panel.add(jrb2);
        panel.add(jrb3);
        
        setSize(400, 300);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == jrb1){
            setTitle(jrb1.getText());
            panel.setBorder(new TitledBorder("Seleccionó " + jrb1.getText()));//Con esto hacemos que cambie el nombre del panel cuando haga clic en la opcion 1        
        }
        if(ae.getSource() == jrb2){
            setTitle(jrb2.getText());
        }
        if(ae.getSource() == jrb3){
            setTitle(jrb3.getText());
        }
    }
}
