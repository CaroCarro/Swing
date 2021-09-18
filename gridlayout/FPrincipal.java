package interfazgrafica.gridlayout;

import java.awt.GridLayout;
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
        setTitle("Frame principal");
        GridLayout thisLayout = new GridLayout(3, 6, 10, 10);
        getContentPane().setLayout(thisLayout);
        {
            boton1 = new JButton();
            getContentPane().add(boton1);
            boton1.setText("Botón 1");
        }
        {
            boton2 = new JButton();
            getContentPane().add(boton2);
            boton2.setText("Botón 2");
        }
        {
            boton3 = new JButton();
            getContentPane().add(boton3);
            boton3.setText("Botón 3");
        }
        {
            boton4 = new JButton();
            getContentPane().add(boton4);
            boton4.setText("Botón 4");
        }
        {
            boton5 = new JButton();
            getContentPane().add(boton5);
            boton5.setText("Botón 5");
        }
        {
            boton6 = new JButton();
            getContentPane().add(boton6);
            boton6.setText("Botón 6");
        }
        setSize(400, 300);
    }
}
