import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu_de_opciones_form extends JFrame{
    private JPanel panel_menu_opc;

    private JLabel solicitud_lab;

    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;

    String producto;

    public menu_de_opciones_form(){
        setTitle("Menu de opciones");
        setContentPane(panel_menu_opc);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,150);
        setVisible(true);

        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new registro_form();
            }
        });
        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //producto = String.format("Codigo: %s \nNombre: %s \nDetalle: %s \nPrecio Unitario: %.2f \nStock: %d",codigo,nombre,detalle,precio_u,stock);
                JOptionPane.showMessageDialog(null,"Aqui deberia haber un producto");
            }
        });
        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ventas_form();
            }
        });
    }
}
