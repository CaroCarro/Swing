package interfazgrafica.combobox;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FPrincipal extends JFrame{
    private JComboBox combo;
    public static void main(String[] args) {
        FPrincipal frame = new FPrincipal();
        frame.setVisible(true);
    }

    public FPrincipal() {
        initGUI();
    }
    private void initGUI(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Frame principal");
        getContentPane().setLayout(null);
        {
            ComboBoxModel comboModel = new DefaultComboBoxModel(new String[] { "Lista 1", "Texto 1", "Texto 2", "Texto 3", "...", "Texto n"});
            combo = new JComboBox();
            getContentPane().add(combo);
            combo.setModel(comboModel);
            combo.setBounds(120, 50, 110, 20);
        }
        setSize(400, 300);
        }
    }

