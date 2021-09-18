package interfazgrafica.layout.absolutlayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author CARO
 */
public class FPrincipal extends JFrame {

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;

    public static void main(String[] args) {
        FPrincipal frame = new FPrincipal();
        frame.setVisible(true);
    }

    public FPrincipal() {
        initGUI();
    }

    private void initGUI() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Frame principal");
        getContentPane().setLayout(null);
        {
            boton1 = new JButton();
            getContentPane().add(boton1);
            boton1.setText("Botón 1");
            boton1.setBounds(30, 5, 101, 21);
        }
        {
            boton2 = new JButton();
            getContentPane().add(boton2);
            boton2.setText("Botón 2");
            boton2.setBounds(35, 90, 97, 21);
        }
        {
            boton3 = new JButton();
            getContentPane().add(boton3);
            boton3.setText("Botón 3");
            boton3.setBounds(142, 52, 110, 38);
        }
        {
            boton4 = new JButton();
            getContentPane().add(boton4);
            boton4.setText("Botón 4");
            boton4.setBounds(65, 167, 123, 62);
        }
        {
            boton5 = new JButton();
            getContentPane().add(boton5);
            boton5.setText("Botón 5");
            boton5.setBounds(218, 119, 117, 46);
        }
        {
            boton6 = new JButton();
            getContentPane().add(boton6);
            boton6.setText("Botón 6");
            boton6.setBounds(278, 72, 93, 35);
        }
        setSize(400, 300);
    }
}
