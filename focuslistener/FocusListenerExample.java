package interfazgrafica.focuslistener;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Taskbar;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CARO
 */
public class FocusListenerExample extends JFrame implements FocusListener{
    JPanel panel = new JPanel();
    FlowLayout flujo = new FlowLayout();
    JLabel nombre = new JLabel("Nombre:", JLabel.LEFT);
    JTextField campo = new JTextField(20);
    JLabel mensaje = new JLabel("                                                      ");
    JPanel panel2 = new JPanel();
    JLabel apellido = new JLabel("Apellido:", JLabel.LEFT);
    JTextField campo2 = new JTextField(20);
    JLabel mensaje2 = new JLabel("                                                      ");
    
    public FocusListenerExample(){
        super("Ejemplo de FocusListener");
        setSize(470, 140);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(flujo);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
        panel.add(nombre);
        panel.addFocusListener(this);
        panel.add(campo);
        panel.add(mensaje);
        panel2.setLayout(flujo);
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        panel.add(campo2);
        panel.add(mensaje2);
        GridLayout grilla = new GridLayout(2, 1);
        setLayout(grilla);
        add(panel);
        add(panel2);
        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent fe) {
        if (fe.getSource() == campo){
            mensaje.setText("<-- Escribe tu nombre");
        }
        if (fe.getSource() == campo2){
            mensaje.setText("<-- Escribe tu apellido");
        }
    }
    @Override
    public void focusLost(FocusEvent fe) {
        if (fe.getSource() == campo){
            mensaje.setText("                                      ");
        }
        if (fe.getSource() == campo2){
            mensaje.setText("                                       ");
        }  
    }
    public static void main(String[] args) {
        new FocusListenerExample();
    }

}
