package interfazgrafica.keylistener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author CARO
 */
public class KeyListener {//Para capturar las contrasenas de la gente

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent event) {
                System.out.println("keyTyped '" + event.getKeyChar() + "'");
            }
        });
        frame.setVisible(true);
        
    }
}
