import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectInterest {

    private JFrame frame;
    private JLabel label1, label2;
    private JRadioButton radioButton1, radioButton2;
    private JButton Next_Button;

    SelectInterest() {
        // Initializing Frame
        frame = new JFrame("Welcome to Cryptos and NFTs World");
        frame.setBounds(500, 50, 470, 600);
        frame.setLayout(new BorderLayout());

        // Creating Label1
        label1 = new JLabel("<html><div style=\"text-align: center;\">Congratulations for creation of <br> Account</div></html>");
        label1.setBounds(120, 1, 400, 50);
        label1.setFont(new Font("Edmond-sans", Font.PLAIN, 16));
        Color fgColor_l1 = new Color(211, 211, 211);
        label1.setForeground(fgColor_l1);

//        Creating Label2

        label2 = new JLabel("Select Your Interest");
        label2.setBounds(130, 120, 400, 50);
        label2.setFont(new Font("Edmond-sans", Font.PLAIN, 20));
        Color fgColor_l2 = new Color(237, 231, 240);
        label2.setForeground(fgColor_l2);

// creating radio button 1


        radioButton1 = new JRadioButton("  I am a trader");
        radioButton1.setBounds(120, 190, 200, 30);
        radioButton1.setFocusPainted(false);

//         creating radio button 2

        radioButton2 = new JRadioButton("  I am a creator/Launcher");
        radioButton2.setBounds(120, 270, 200, 30);


//       Submit Button
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
                if (radioButton1.isSelected() && radioButton2.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Select only one option");
                } else {
                    if (radioButton1.isSelected()) {
                        frame.setVisible(false);
                        DepositAmount depositAmount = new DepositAmount();
                    } else if (radioButton2.isSelected()) {
                        frame.setVisible(false);
                        WhatToLaunch whatToLaunch = new WhatToLaunch();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Select your Desired Option");
                    }
                }
            }
        });
        frame.add(label1);
        frame.add(label2);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(Next_Button);

        Color bgColor = new Color(32, 42, 68);
        frame.getContentPane().setBackground(bgColor);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}