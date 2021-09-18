package interfazgrafica.jbutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.crypto.AEADBadTagException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author CARO
 */
public class FPrincipal extends JFrame implements  ActionListener{
    private JButton button;
    private JLabel label;
    private JTextField textField;
    public static void main(String[] args) {
        FPrincipal frame = new FPrincipal();
        frame.setVisible(true);
    }
    public FPrincipal(){
        initGUI();
        
    }
    private void initGUI(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mi JFrame");
        this.setLayout(null);
        setSize(400, 300);
        label = new JLabel ("Mi nombre: ");
        label.setBounds(30, 30, 100, 30);
        add(label);
        textField = new JTextField();
        textField.setBounds(60, 60, 100, 30);
        add(textField);
        button = new JButton ("Boton 1");
        button.setBounds(100, 150, 100, 30);
        button.addActionListener(this);
        add(button);        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button){//Esto permite que cambie el nombre de la ventana con lo que ingresamos por teclado
            setTitle(textField.getText());
        }
    }
}
