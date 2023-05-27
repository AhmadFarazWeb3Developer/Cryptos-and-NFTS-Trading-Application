import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WhatToLaunch {

    private JFrame frame;
    private JLabel label1;
    private JCheckBox checkBox1, checkBox2, checkBox3;
    private JButton  Next_Button;

    WhatToLaunch() {
        // Initializing Frame
        frame = new JFrame("Welcome to Cryptos and NFTs World");
        frame.setBounds(500, 50, 500, 500);


        // Creating Label1
        label1 = new JLabel("<html><div style=\"text-align: center;\">What Do You Want to <br> Launch </div></html>");
        label1.setBounds(60, 40, 400, 100);
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


        Next_Button = new JButton("Next");
        Next_Button.setBounds(140, 370, 150, 37);
        Next_Button.setBorderPainted(false);
        Next_Button.setFocusPainted(false);
        Next_Button.setContentAreaFilled(false);
        Next_Button.setOpaque(true);
        Next_Button.setBackground(new Color(107, 41, 140));
        Next_Button.setFont(new Font("Edmond-sans", Font.PLAIN, 20));
        Next_Button.setForeground(Color.WHITE);


        Next_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1.isSelected()) {
                    frame.setVisible(false);
                    LunchCrypto lunchCrypto = new LunchCrypto();
                } else if (checkBox2.isSelected()) {
                    frame.setVisible(false);
                    LunchNFTs lunchNFTs = new LunchNFTs();
                } else if (checkBox3.isSelected()) {
                    LunchCrypto lunchCrypto = new LunchCrypto();
                    frame.setVisible(false);
                    LunchNFTs lunchNFTs = new LunchNFTs();
                }


            }
        });



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