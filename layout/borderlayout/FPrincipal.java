package interfazgrafica.layout.borderlayout;

import java.awt.BorderLayout;
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
        BorderLayout thisLayout = new BorderLayout();
        getContentPane().setLayout(thisLayout);
        {
            {
                boton1 = new JButton();
                getContentPane().add(boton1, BorderLayout.CENTER);
                boton1.setText("Botón 1");
            }
            {
                boton2 = new JButton();
                getContentPane().add(boton2, BorderLayout.NORTH);
                boton2.setText("Botón 2");
            }
            {
                boton3 = new JButton();
                getContentPane().add(boton3, BorderLayout.WEST);
                boton3.setText("Botón 3");
            }
            {
                boton4 = new JButton();
                getContentPane().add(boton4, BorderLayout.EAST);
                boton4.setText("Botón 4");
            }
            {
                boton5 = new JButton();
                getContentPane().add(boton5, BorderLayout.SOUTH);
                boton5.setText("Botón 5");
            }
            pack();
            setSize(400, 300);
        }
    }

}
