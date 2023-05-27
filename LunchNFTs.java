import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LunchNFTs {

    private JFrame frame;
    private JLabel label;
    private JTextField txt1, txt2, txt3, txt4, txt5;
    private JButton  submit_Button;
    private String Name, Blockchain, HashNo;
    private int private_key, public_key;

    LunchNFTs() {
        // Initializing Frame
        frame = new JFrame("Welcome to Cryptos and NFTs World");
        frame.setBounds(500, 50, 500, 600);


        // Creating Label
        label = new JLabel("Enter the Required Details for NFTs");
        label.setBounds(70, 70, 400, 30);
        label.setFont(new Font("Edmond-sans", Font.PLAIN, 20));
        Color fgColor = new Color(237, 231, 240);
        label.setForeground(fgColor);

        // creating text fields

        txt1 = new JTextField("Name");
        txt1.setAlignmentX(Component.CENTER_ALIGNMENT);
        txt1.setHorizontalAlignment(SwingConstants.CENTER);

        txt2 = new JTextField("BlockChain");
        txt2.setAlignmentX(Component.CENTER_ALIGNMENT);
        txt2.setHorizontalAlignment(SwingConstants.CENTER);

        txt3 = new JTextField("Hashing Number");
        txt3.setAlignmentX(Component.CENTER_ALIGNMENT);
        txt3.setHorizontalAlignment(SwingConstants.CENTER);

        txt4 = new JTextField("Private Key");
        txt4.setAlignmentX(Component.CENTER_ALIGNMENT);
        txt4.setHorizontalAlignment(SwingConstants.CENTER);

        txt5 = new JTextField("Public Key");
        txt5.setAlignmentX(Component.CENTER_ALIGNMENT);
        txt5.setHorizontalAlignment(SwingConstants.CENTER);


        txt1.setBounds(80, 150, 300, 30);
        Color txt1_bgColor = new Color(218, 201, 226);
        txt1.setBackground(txt1_bgColor);

        txt2.setBounds(80, 200, 300, 30);
        Color txt2_bgColor = new Color(218, 201, 226);
        txt2.setBackground(txt2_bgColor);

        txt3.setBounds(80, 250, 300, 30);
        Color txt3_bgColor = new Color(218, 201, 226);
        txt3.setBackground(txt3_bgColor);

        txt4.setBounds(80, 300, 300, 30);
        Color txt4_bgColor = new Color(218, 201, 226);
        txt4.setBackground(txt4_bgColor);

        txt5.setBounds(80, 350, 300, 30);
        Color txt5_bgColor = new Color(218, 201, 226);
        txt5.setBackground(txt5_bgColor);

//

//       Submit Button
        submit_Button = new JButton("Submit");
        submit_Button.setBounds(135, 420, 200, 35);
        submit_Button.setBorderPainted(false);
        submit_Button.setFocusPainted(false);
        submit_Button.setContentAreaFilled(false);
        submit_Button.setOpaque(true);
        submit_Button.setBackground(new Color(107, 41, 140));
        submit_Button.setFont(new Font("Edmond-sans", Font.PLAIN, 20));
        submit_Button.setForeground(Color.WHITE);


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

                if (txt1.getText().equals("Name")) {
                    txt1.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt1.getText().isEmpty()) {
                    txt1.setText("Name");
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

                if (txt2.getText().equals("BlockChain")) {
                    txt2.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt2.getText().isEmpty()) {
                    txt2.setText("BlockChain");
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
                if (txt3.getText().equals("Hashing Number")) {
                    txt3.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt3.getText().isEmpty()) {
                    txt3.setText("Hashing Number");
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
                if (txt4.getText().equals("Private Key")) {
                    txt4.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt4.getText().isEmpty()) {
                    txt4.setText("Private Key");
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
                if (txt5.getText().equals("Public Key")) {
                    txt5.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt5.getText().isEmpty()) {
                    txt5.setText("Public Key");
                }
            }
        });

        submit_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt1.getText().isEmpty() || txt1.getText().equals("Name")) {
                    JOptionPane.showMessageDialog(frame, "Enter Name of Crypto");
                } else if (txt2.getText().isEmpty() || txt2.getText().equals("BlockChain")) {
                    JOptionPane.showMessageDialog(frame, "Enter Blockchain Name");
                } else if (txt3.getText().isEmpty() || txt3.getText().equals("Hashing Number")) {
                    JOptionPane.showMessageDialog(frame, "Enter Hashing Number");
                } else {
                    Name = txt1.getText();
                    Blockchain = txt2.getText();
                    HashNo = txt3.getText();
                    try {
                        private_key = Integer.parseInt(txt4.getText());
                        public_key = Integer.parseInt(txt5.getText());
                        LunchedNFTDetails lunchedNFTDetails = new LunchedNFTDetails(Name, Blockchain, HashNo, private_key, public_key);
                        frame.setVisible(false);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Please Enter Integer");
                    }
                }
            }
        });

        // Adding components to frame

        frame.add(label);
        frame.add(txt1);
        frame.add(txt2);
        frame.add(txt3);
        frame.add(txt4);
        frame.add(txt5);
        frame.add(submit_Button);


        Color bgColor = new Color(32, 42, 68);
        frame.getContentPane().setBackground(bgColor);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}