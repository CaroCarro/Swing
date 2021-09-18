package interfazgrafica.jcheckbox;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
public class FPrincipal extends JFrame{
    private JPanel panel;private
    public static void main(String[] args) {
        FPrincipal frame = new FPrincipal();//Construimos un objeto nuevo de nuestra clase
        frame.setVisible(true);//Para que sea visible la ventana
    }
    
    public FPrincipal(){//Constructor
        initGUI();
    }
    
    private void initGUI(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//Se cierre la aplicaci[on cunado le de clic en cerrar
        this.setTitle("Frame principal");//Le ponemos título a la ventana
        panel = new JPanel();//Creamos un panel
        panel.setBorder(new TitledBorder("Título del panel"));//Título al panel y un border
        getContentPane().add(panel);//Lo agregamos al frame
        setLayout(null);//Hacemos el Layout
        JCheckBox jcb1 = new JCheckBox("Opcion A");//Creamos nuestro primer JCheckBox
        jcb1.setBounds(50, 50, 100, 30);//Le damos posición (50, 50) y tamaño (100, 30)
        JCheckBox jcb2 = new JCheckBox("Opcion B");//Creamos nuestro segundo JCheckBox
        jcb2.setBounds(50, 80, 100, 30);
        add(jcb1);//A este lo agregamos al frame
        add(jcb2);//A este lo agregamos al frame
        setSize(400, 300);//Le damos un tamaño a nuestro frame o contenedor
    }
}
