import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LunchedCryptoDetails {

    private JFrame frame;
    private JLabel label, lbl1, lbl2, lbl3, lbl4, lbl5, sold_lbl;
    private JButton Sell_btn, exitBtn;
    JTextField txt;

    LunchedCryptoDetails() {
    }

    LunchedCryptoDetails(String name, String blockchain, String hashNo, int privateKey, int publicKey) {
        // Initializing Frame
        frame = new JFrame("Welcome to Cryptos and NFTs World");
        frame.setBounds(500, 50, 500, 600);
        frame.setLayout(new BorderLayout());
        // Creating Label
        label = new JLabel("Your Crypto Details Are Here");
        label.setBounds(100, 20, 400, 30);
        label.setFont(new Font("Edmond-sans", Font.BOLD, 20));
        label.setForeground(new Color(46, 196, 182));


        sold_lbl = new JLabel("SOLD");
        sold_lbl.setBounds(170, 120, 200, 100);
        sold_lbl.setFont(new Font("Arial", Font.BOLD, 50));
        sold_lbl.setForeground(Color.WHITE);
        sold_lbl.setVisible(false);
        // creating text fields
        frame.add(sold_lbl);

        lbl1 = new JLabel("Crypto Name   : " + name);
        lbl2 = new JLabel("Blockchain     : " + blockchain);
        lbl3 = new JLabel("Hashing No    : " + hashNo);
        lbl4 = new JLabel("Private Key    : " + privateKey);
        lbl5 = new JLabel("Public Key     : " + publicKey);

        lbl1.setBounds(130, 100, 300, 30);
        lbl1.setForeground(new Color(241, 250, 238));
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));

        lbl2.setBounds(130, 140, 300, 30);
        lbl2.setForeground(new Color(241, 250, 238));
        lbl2.setFont(new Font("Arial", Font.BOLD, 20));


        lbl3.setBounds(130, 180, 300, 30);
        lbl3.setForeground(new Color(241, 250, 238));
        lbl3.setFont(new Font("Arial", Font.BOLD, 20));

        lbl4.setBounds(130, 220, 300, 30);
        lbl4.setForeground(new Color(241, 250, 238));
        lbl4.setFont(new Font("Arial", Font.BOLD, 20));

        lbl5.setBounds(130, 260, 300, 30);
        lbl5.setForeground(new Color(241, 250, 238));
        lbl5.setFont(new Font("Arial", Font.BOLD, 20));


        txt = new JTextField("Set price for the Trading");
        txt.setBounds(130, 330, 200, 30);
        txt.setHorizontalAlignment(SwingConstants.CENTER);

        // Creating Button
        Sell_btn = new JButton("Sell your CRYPTO");
        Sell_btn.setBounds(130, 400, 200, 40);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(130, 480, 200, 40);
        exitBtn.setBackground(new Color(214, 40, 40));
        exitBtn.setForeground(Color.WHITE);

        Sell_btn.setBorderPainted(false);
        Sell_btn.setFocusPainted(false);
        Sell_btn.setContentAreaFilled(false);
        Sell_btn.setOpaque(true);
        Sell_btn.setBackground(new Color(107, 41, 140));
        Sell_btn.setFont(new Font("Edmond-sans", Font.PLAIN, 20));
        Sell_btn.setForeground(Color.WHITE);

        txt.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txt.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

                if (txt.getText().isEmpty()) {
                    txt.setText("Set price for the Trading");
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (txt.getText().equals("Set price for the Trading")) {
                    txt.setText("");
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {

                if (txt.getText().isEmpty()) {
                    txt.setText("Set price for the Trading");
                }


            }
        });
        Sell_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt.getText().isEmpty() || txt.getText().equals("Set price for the Trading")) {
                    JOptionPane.showMessageDialog(frame, "Set Amount");
                } else {

                    try {
                        int var = Integer.parseInt(txt.getText());
                        JOptionPane.showMessageDialog(frame, "Sold for " + var);
                        sold_lbl.setVisible(true);
                        lbl1.setVisible(false);
                        lbl2.setVisible(false);
                        lbl3.setVisible(false);
                        lbl4.setVisible(false);
                        lbl5.setVisible(false);
                        txt.setFocusable(false);
                        txt.setText("You have sold your assets");

                    } catch (Exception exception) {


                        JOptionPane.showMessageDialog(frame, "Enter Integer Value");
                    }
                }
            }
        });


        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });

        frame.add(label);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(lbl4);
        frame.add(lbl5);
        frame.add(txt);
        frame.add(Sell_btn);
        frame.add(exitBtn);
        Color bgColor = new Color(32, 42, 68);
        frame.getContentPane().setBackground(bgColor);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}