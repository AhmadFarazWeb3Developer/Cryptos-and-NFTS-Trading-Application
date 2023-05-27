import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AccountCreation {


    private JFrame frame;
    private JLabel label1, label2;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6;
    private JButton submit_button;
    JPanel panel;

    String fName, lName, Gender, Country, Email;
    int Password;

    AccountCreation() {
        // Initializing Frame
        frame = new JFrame("Welcome to CRYPTOS and NFTs World");
        frame.setBounds(250, 10, 970, 700);
        frame.setLayout(new BorderLayout());
        // Creating Label
        // Initializing Frame
        panel = new JPanel();
        panel.setBounds(0, 0, 350, 700);
        panel.setBackground(new Color(3, 7, 30));

        // Creating Label
        label1 = new JLabel("<html><div style='text-align: center;'>Welcome to<br>CRYPTOS and<br>NFTs World</div></html>");
        label1.setBounds(20, 0, 300, 600);
        label1.setForeground(Color.WHITE);
        Font spaceGroteskFont = new Font("Space Grotesk", Font.PLAIN, 55);
        label1.setFont(spaceGroteskFont);


        label2 = new JLabel("Enter Details For Account Creation");
        label2.setBounds(495, 20, 400, 40);
        label2.setFont(new Font("Edmond-sans", Font.PLAIN, 20));
        label2.setForeground(new Color(254, 250, 224));

        // creating text fields

        txt1 = new JTextField("First Name");
        txt2 = new JTextField("Last Name");
        txt3 = new JTextField("Gender");
        txt4 = new JTextField("Country");
        txt5 = new JTextField("Email");
        txt6 = new JTextField("Password");
        txt1.setBounds(500, 120, 300, 40);

        txt1.setHorizontalAlignment(SwingConstants.HORIZONTAL);

        txt2.setBounds(500, 190, 300, 40);
        txt2.setHorizontalAlignment(SwingConstants.HORIZONTAL);

        txt3.setBounds(500, 260, 300, 40);
        txt3.setHorizontalAlignment(SwingConstants.HORIZONTAL);


        txt4.setBounds(500, 330, 300, 40);
        txt4.setHorizontalAlignment(SwingConstants.HORIZONTAL);


        txt5.setBounds(500, 400, 300, 40);
        txt5.setHorizontalAlignment(SwingConstants.HORIZONTAL);


        txt6.setBounds(500, 470, 300, 40);
        txt6.setHorizontalAlignment(SwingConstants.HORIZONTAL);

        // Creating Button
        submit_button = new JButton("Submit");
        submit_button.setBounds(550, 560, 200, 40);
        submit_button.setBorderPainted(false);
        submit_button.setFocusPainted(false);
        submit_button.setContentAreaFilled(false);
        submit_button.setOpaque(true);
        submit_button.setBackground(new Color(107, 41, 140));
        submit_button.setFont(new Font("Edmond-sans", Font.PLAIN, 20));
        submit_button.setForeground(Color.WHITE);


//Action Listener for txt1


        txt1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                if (txt1.getText().equals("First Name")) {
                    txt1.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt1.getText().isEmpty()) {
                    txt1.setText("First Name");
                }
            }
        });

        txt2.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                if (txt2.getText().equals("Last Name")) {
                    txt2.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt2.getText().isEmpty()) {
                    txt2.setText("Last Name");
                }
            }
        });
        txt3.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (txt3.getText().equals("Gender")) {
                    txt3.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt3.getText().isEmpty()) {
                    txt3.setText("Gender");
                }
            }
        });
        txt4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (txt4.getText().equals("Country")) {
                    txt4.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt4.getText().isEmpty()) {
                    txt4.setText("Country");
                }
            }
        });

        txt5.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (txt5.getText().equals("Email")) {
                    txt5.setText("");
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                if (txt5.getText().isEmpty()) {
                    txt5.setText("Email");
                }
            }
        });
        txt6.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (txt6.getText().equals("Password")) {
                    txt6.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt6.getText().isEmpty()) {
                    txt6.setText("Password");
                }
            }
        });


        submit_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fName = txt1.getText();
                lName = txt2.getText();
                Gender = txt3.getText();
                Country = txt4.getText();
                Email = txt5.getText();
                // Convert password text to integer
                try {
                    Password = Integer.parseInt(txt6.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Password must be Integers!");
                    return; // Exit the actionPerformed method
                }
                if (txt1.getText().isEmpty() || txt1.getText().equals("First Name")) {
                    JOptionPane.showMessageDialog(frame, "Enter First Name");
                }
                if (txt2.getText().isEmpty() || txt2.getText().equals("Last Name")) {
                    JOptionPane.showMessageDialog(frame, "Enter Last Name");
                }
                if (txt3.getText().isEmpty() || txt3.getText().equals("Gender")) {
                    JOptionPane.showMessageDialog(frame, "Enter Your Gender");
                }
                if (txt4.getText().isEmpty() || txt4.getText().equals("Country")) {
                    JOptionPane.showMessageDialog(frame, "Enter Country Name");
                }
                if (txt5.getText().isEmpty() || txt5.getText().equals("Email")) {
                    JOptionPane.showMessageDialog(frame, "Enter Your Email");
                }
                if (txt1.getText().isEmpty() || txt1.getText().equals("Password")) {
                    JOptionPane.showMessageDialog(frame, "Enter Your Password");
                }
                if (txt1.getText() != "First Name" && txt2.getText() != "Last Name" && txt3.getText() != "Gender" && txt4.getText() != "Country" && txt5.getText() != ("Email") && txt6.getText() != "Password") {
                    frame.setVisible(false);
                    SelectInterest selectInterest = new SelectInterest();
                }
            }
        });

        frame.add(label1);
        frame.add(label2);
        frame.add(panel);
        frame.add(txt1);
        frame.add(txt2);
        frame.add(txt3);
        frame.add(txt4);
        frame.add(txt5);
        frame.add(txt6);
        frame.add(submit_button);
        Color bgColor = new Color(32, 42, 68);
        frame.getContentPane().setBackground(bgColor);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}