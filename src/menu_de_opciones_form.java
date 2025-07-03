import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu_de_opciones_form extends JFrame{
    private JPanel panel_menu_opc;

    private JLabel solicitud_lab;

    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;

    public menu_de_opciones_form(){
        setTitle("Menu de opciones");
        setContentPane(panel_menu_opc);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    }
}
