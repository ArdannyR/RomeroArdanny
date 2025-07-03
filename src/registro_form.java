import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registro_form extends JFrame{
    private JPanel panel_registro;

    private JLabel cod_lab;
    private JLabel nombre_lab;
    private JLabel detalle_lab;
    private JLabel precio_u_lab;
    private JLabel stock_lab;

    private JTextField cod_txtfld;
    private JTextField nombre_txtfld;
    private JTextField detalle_txtfld;
    private JTextField percio_u_txtfld;
    private JTextField stock_txtfld;

    private JButton limpiarButton;
    private JButton volverButton;
    private JButton guardarButton;

    public String procucto;

    public registro_form() {
        setTitle("Registro");
        setContentPane(panel_registro);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,300);
        setVisible(true);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigo = cod_txtfld.getText();
                    String nombre = nombre_txtfld.getText();
                    String detalle = detalle_txtfld.getText();
                    String precio_u_str = percio_u_txtfld.getText();
                    Double precio_u = Double.valueOf(precio_u_str);
                    String stock_str = stock_txtfld.getText();
                    Integer stock = Integer.valueOf(stock_str);

                    if (codigo.trim().isEmpty() || nombre.trim().isEmpty() || detalle.trim().isEmpty() || precio_u_str.trim().isEmpty() || stock_str.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Hay valores vacios");
                    } else if (precio_u > 9999.99 || stock > 999) {
                        JOptionPane.showMessageDialog(null,"Valores numericos fuera de rango");
                    } else {
                        procucto = String.format("Codigo: %s \nNombre: %s Detalle: %s \nPrecio Unitario: %.2f \nStock: %d",codigo,nombre,detalle,precio_u,stock);
                        JOptionPane.showMessageDialog(null, "Tu producto ha sido guardado con exito!");
                        dispose();
                        new menu_de_opciones_form();
                    }
                } catch (Exception p) {
                    JOptionPane.showMessageDialog(null, "Existe un error en los datos");
                }
            }
        });
    }
}
