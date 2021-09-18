/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.internalframe;

import javax.swing.JInternalFrame;

/**
 *
 * @author CARO
 */
public class FInterno2 extends JInternalFrame{
    public FInterno2(){
        initGUI();
    }
    private void initGUI(){
        setSize(200, 100);
        setVisible(true);
        setTitle("Frame interno 2");
    }
}
