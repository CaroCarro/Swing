package interfazgrafica.list;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.WindowConstants;

/**
 *
 * @author CARO
 */
public class FPrincipal extends JFrame{
        private JList lista1;
        private JList lista2;
        private JList lista3;
        
        public static void main(String[] args) {
        FPrincipal frame = new FPrincipal();
        frame.setVisible(true);
        
    }
        public FPrincipal(){
            initGUI();
        }
        
        private void initGUI(){
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("Frame principal");
            getContentPane().setLayout(null);
            String[] textos = {"Lista 1", "Texto 1", "Texto 2", "Texto 3", "...", "Texto n"};
            lista1 = new JList(textos);
            getContentPane().add(lista1);
            lista1.setBounds(40, 30, 80, 150);
            {
                lista2 = new JList();
                DefaultListModel modeloLista = new DefaultListModel();
                modeloLista.addElement("Lista 2");
                modeloLista.addElement("Texto 1");
                modeloLista.addElement("Texto 2");
                modeloLista.addElement("Texto 3");
                modeloLista.addElement("...");
                modeloLista.addElement("Texto n");
                lista2.setModel(modeloLista);
                getContentPane().add(lista2);
                lista2.setBounds(160, 30, 80, 150);
            }
            ListModel modeloLista = new DefaultComboBoxModel(new String [] {"Lista 1", "Texto 1", "Texto 2", "Texto 3", "...", "Texto n"});
            lista3 = new JList();
            lista3.setModel(modeloLista);
            getContentPane().add(lista3);
            lista3.setBounds(280, 30, 80, 150);
            setSize(400, 300);
        }
        
        


    
}
