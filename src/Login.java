import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textUserLOgin;
    private JTextField textUserPassword;
    private JButton btnSubmit;
    private JButton btnClear;
    private JPasswordField pwdUserPassword;
    private JPanel main;

    public Login() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUserLOgin.getText() +
                        " " + new String (pwdUserPassword.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUserLOgin.setText("");
                pwdUserPassword.setText("");
            }
        });
    }
    public JPanel getMainPanel(){
        return main;
    }
}
