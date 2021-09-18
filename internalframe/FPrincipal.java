package interfazgrafica.internalframe;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author CARO
 */
public class FPrincipal extends JFrame{
    private  JDesktopPane desktopPane;
    public static void main(String[] args) {
        FPrincipal frame = new FPrincipal();
        frame.setVisible(true);
        
    }
    public FPrincipal(){
        initGui();
        FInterno1 frame1 = new FInterno1();
        this.desktopPane.add(frame1);
        FInterno2 frame2 = new FInterno2();
        this.desktopPane.add(frame2);
    }
        private void initGui(){
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("Principal");
            {
                this.desktopPane = new JDesktopPane();
                getContentPane().add(desktopPane);
            }
            setSize(400, 300);
        }
    }
