package interfazgrafica.internalframe;

import javax.swing.JInternalFrame;

/**
 *
 * @author CARO
 */
public class FInterno1 extends JInternalFrame{
    
    public FInterno1(){
        initGUI();
    }
    private void initGUI(){
        setSize(200, 100);
        setVisible(true);
        setTitle("Frame interno 1");
    }
}
