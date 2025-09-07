import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleLoginScreen extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;

    public SimpleLoginScreen() {
        setTitle("Login Screen");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        
        JLabel userLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        statusLabel = new JLabel("", SwingConstants.CENTER);

       
        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); 
        panel.add(loginButton);
        panel.add(statusLabel);

        add(panel);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        String user = usernameField.getText();
        String pass = new String(passwordField.getPassword());

        // Basic mock check
        if (user.equals("admin") && pass.equals("1234")) {
            statusLabel.setText("Login Successful!");
        } else {
            statusLabel.setText("Invalid credentials.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleLoginScreen::new);
    }
}
