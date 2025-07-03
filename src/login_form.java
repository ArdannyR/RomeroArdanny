import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login_form extends JFrame{
    private JPanel panel_login;

    private JLabel usuario_fld;
    private JLabel password_fld;

    private JTextField usuario_txtfld;
    private JPasswordField password_passfld;

    private JButton ingresarButton;

    public login_form(){
        setTitle("Login");
        setContentPane(panel_login);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,200);
        setVisible(true);


        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuario_txtfld.getText();
                String password = new String(password_passfld.getPassword());

                try {
                    if (usuario.trim().isEmpty() || password.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null,"Por favor llenar todos los campos.");
                    } else if (usuario.equals("romero") && password.equals("esfot123")) {
                        dispose();
                        // setVisible(false);
                        new menu_de_opciones_form();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Datos incorrectos, intente de nuevo.");
                    }
                } catch (Exception p) {
                    JOptionPane.showMessageDialog(null,"Los datos han presentado unn error");
                }
            }
        });
    }
}
