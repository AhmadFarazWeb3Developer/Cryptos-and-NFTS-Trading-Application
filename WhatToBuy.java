import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WhatToBuy {


    private JFrame frame;
    private JLabel label1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    public JCheckBox checkBox3;
    private JButton  Next_Button;
    WhatToBuy(int amount) {
        // Initializing Frame
        frame = new JFrame("Welcome to Cryptos and NFTs World");
        frame.setBounds(500, 50, 500, 600);

        // Creating Label1
        label1 = new JLabel("<html><div style=\"text-align: center;\">What Do You Want to <br> Buy </div></html>");
        label1.setBounds(100, 40, 400, 100);
        label1.setFont(new Font("Edmond-sans", Font.PLAIN, 30));
        Color fgColor_l1 = new Color(211, 211, 211);
        label1.setForeground(fgColor_l1);

//      creating check box 1

        checkBox1 = new JCheckBox(" Crypto");
        checkBox1.setBounds(120, 190, 200, 30);

//       creating check box 2

        checkBox2 = new JCheckBox(" NFT");
        checkBox2.setBounds(120, 250, 200, 30);

//       creating check box 3

        checkBox3 = new JCheckBox(" Both");
        checkBox3.setBounds(120, 310, 200, 30);



//       Next Button
        Next_Button = new JButton("Next");
        Next_Button.setBounds(140, 370, 150, 37);
        Next_Button.setBorderPainted(false);
        Next_Button.setFocusPainted(false);
        Next_Button.setContentAreaFilled(false);
        Next_Button.setOpaque(true);
        Next_Button.setBackground(new Color(107, 41, 140));
        Next_Button.setFont(new Font("Edmond-sans", Font.PLAIN, 20));
        Next_Button.setForeground(Color.WHITE);


//        Action Listener
        Next_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1.isSelected()) {
                    frame.setVisible(false);
                    Cryptos cryptos = new Cryptos();
                } else if (checkBox2.isSelected()) {
                    frame.setVisible(false);
                    NFTs nfTs = new NFTs();
                } else if (checkBox1.isSelected() && checkBox2.isSelected()) {
                    frame.setVisible(false);
                    Cryptos cryptos = new Cryptos();
                    NFTs nfTs = new NFTs();
                } else if (checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected()) {
                    Cryptos cryptos = new Cryptos();
                    NFTs nfTs = new NFTs();
                } else if (checkBox3.isSelected()) {
                    Cryptos cryptos = new Cryptos();
                    frame.setVisible(false);
                    NFTs nfTs = new NFTs();
                    frame.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(frame, "Select Your Interest");
                }
            }
        });
        // Adding components to frame

        frame.add(label1);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(Next_Button);

        Color bgColor = new Color(32, 42, 68);
        frame.getContentPane().

                setBackground(bgColor);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}