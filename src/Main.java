import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

class MainWindow{


    private HashMap<String, String> mapa;
    private JPanel contentPane;
    private JLabel user, pass;
    private JTextField username;
    private JPasswordField password;
    private JButton logIn, reset;

    public static void main(String[] args) {
        MainWindow main = new MainWindow();
    }

    public MainWindow(){
        mapa = new HashMap<>();
        mapa.put("user1","password1");
        mapa.put("info","rmatyka");
        mapa.put("jasio123","lubiepieski");

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(200, 200, 200));

        user = new JLabel("Username:");
        user.setBounds(20, 20, 200, 20);
        contentPane.add(user);
        username = new JTextField();
        username.setBounds(20, 40, 200, 20);
        contentPane.add(username);

        pass = new JLabel("Password:");
        pass.setBounds(20, 70, 200, 20);
        contentPane.add(pass);
        password = new JPasswordField();
        password.setBounds(20, 90, 200, 20);
        contentPane.add(password);

        logIn = new JButton("log in");
        logIn.setBounds(20, 130, 80, 20);
        logIn.addActionListener(new ReactionForLogIn());
        contentPane.add(logIn);

        reset = new JButton("reset");
        reset.setBounds(110, 130, 80, 20);
        reset.addActionListener(new ReactionForReset());
        contentPane.add(reset);

        JFrame frame = new JFrame("Log In");
        frame.getContentPane().add(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 250);
        frame.setVisible(true);
    }
    class ReactionForLogIn implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String typedUsername = username.getText();
            String typedPassword = String.valueOf(password.getPassword());
            if (mapa.containsKey(typedUsername) && typedPassword.equals(mapa.get(typedUsername)))
                contentPane.setBackground(new Color(0, 100, 0));
            else contentPane.setBackground(new Color(100, 0, 0));
        }
    }
    class ReactionForReset implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            username.setText("");
            password.setText("");
            contentPane.setBackground(new Color(200, 200, 200));
        }
    }
}

