package interfazgrafica.table;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author CARO
 */
public class FPrincipal extends JFrame {

    private JTable tabla;
    private JScrollPane scrollPane;

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
        getContentPane().setLayout(null);
        scrollPane = new JScrollPane();
        getContentPane().add(scrollPane);
        scrollPane.setBounds(40, 20, 320, 120);
        {
            String[][] datos = {{"10", "Hector", "Florez", "123"},
            {"20", "Arturo", "Fernandez", "456"},
            {"30", "Juan", "Valdez", "789"},
            {"40", "Pepito", "Perez", "987"},
            {"50", "Pedro", "Picapiedra", "123"},
            {"60", "Pablo", "Marmol", "456"},
            {"70", "Homero", "Simpson", "789"},
            {"80", "Bart", "Simpson", "987"}};
            String[] titulos = new String[]{"Identificacion", "Nombre", "Apellido", "Telefono"};
            TableModel modeloTabla = new DefaultTableModel(datos, titulos);
            tabla = new JTable();
            tabla.setModel(modeloTabla);
            tabla.setPreferredSize(new Dimension(350, datos.length * 16));
            scrollPane.setViewportView(tabla);
            TableRowSorter ordenador = new TableRowSorter(modeloTabla);
            tabla.setRowSorter(ordenador);
        }
        setSize(400, 300);
    }
}
