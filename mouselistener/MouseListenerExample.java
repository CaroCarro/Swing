package interfazgrafica.mouselistener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author CARO
 */
public class MouseListenerExample extends JFrame implements MouseListener {

    JLabel etiqueta1, etiqueta2;
    JButton boton1;

    public static void main(String[] args) {
        MouseListenerExample ventana;
        ventana = new MouseListenerExample();
        ventana.setVisible(true);

    }

    public MouseListenerExample() {
        setLayout(null);//Con el null trabajamos con Absolut, le decimos d[onde ubicarse en el panel
        etiqueta1 = new JLabel();
        etiqueta1.setBounds(10, 160, 190, 20);
        etiqueta2 = new JLabel();
        etiqueta2.setBounds(10, 180, 190, 20);
        boton1 = new JButton();
        boton1.setBounds(110, 75, 150, 75);
        boton1.setText("Presióname");
        boton1.addMouseListener(this);
        add(etiqueta1);
        add(etiqueta2);
        add(boton1);
        setTitle("Eventos del mouse");
        setSize(400, 240);

    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == boton1) {
            etiqueta1.setText("Hizo clic en mi botón");
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getSource() == boton1) {
            etiqueta2.setText("Presionó el botón");
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
                if (me.getSource() == boton1){
            etiqueta1.setText("Liberó el botón");
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
         if (me.getSource() == boton1){
            etiqueta1.setText("Entro a mi boton");
        }
        etiqueta2.setText("");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource() == boton1) {
            etiqueta1.setText("Salio boton");
        }
        etiqueta2.setText("");
    }
}
