import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventas_form extends JFrame {
    private JPanel panel_ventas;

    private JLabel cod_lab;
    private JLabel pord_lab;
    private JLabel precio_lab;
    private JLabel cantidad_lab;
    private JLabel sub_t_lab;
    private JLabel iva_lab;
    private JLabel total_a_pagar_lab;

    private JTextField codigo_txtfld;
    private JTextField producto_txtfld;
    private JTextField precio_txtfld;
    private JTextField cantidad_txtfld;

    private JButton calcularButton;

    private JLabel sub_total_lab;
    private JLabel total_lab;

    public ventas_form() {
        setTitle("Ventas");
        setContentPane(panel_ventas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,300);
        setVisible(true);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigo = codigo_txtfld.getText();
                    String producto = producto_txtfld.getText();
                    String precio_str = precio_txtfld.getText();
                    Double precio = Double.valueOf(precio_str);
                    String cantidad_str = cantidad_txtfld.getText();
                    Integer cantidad = Integer.valueOf(cantidad_str);

                    if (precio_str.trim().isEmpty() || cantidad_str.trim().isEmpty() || codigo.trim().isEmpty() || producto.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Hay valores vacios");
                    } else if (precio < 0 || cantidad < 0) {
                        JOptionPane.showMessageDialog(null,"Valores numericos fuera de rango");
                    } else {
                        Double sub_total = precio * cantidad;
                        String sub_total_str = String.valueOf(sub_total);
                        sub_total_lab.setText(sub_total_str);

                        Double total = sub_total * 1.10;
                        String total_str = String.valueOf(total);
                        total_lab.setText(total_str);

                    }
                } catch (Exception p) {
                    JOptionPane.showMessageDialog(null, "Existe un error en los datos");
                }
            }
        });
    }
}
