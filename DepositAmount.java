import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DepositAmount {


    public JFrame frame;
    private JLabel label;
    private JTextField txt;
    private JButton BackButton, deposit_Button;
    public static int Amount;

    DepositAmount() {
        // Initializing Frame
        frame = new JFrame("Welcome to Cryptos and NFTs World");
        frame.setBounds(500, 50, 500, 500);

        // Creating Label1
        label = new JLabel("<html><div style=\"text-align: center;\">For Trading you have to <br> deposit MONEY in Your Account</div></html>");
        label.setBounds(60, 40, 400, 100);
        label.setFont(new Font("Edmond-sans", Font.PLAIN, 25));
        label.setForeground(new Color(254, 250, 224));

//   text field
        txt = new JTextField("Enter Amount");
        txt.setBounds(140, 200, 200, 40);
        txt.setHorizontalAlignment(JTextField.CENTER);

//      Details Button
        BackButton = new JButton("Back");
        BackButton.setBounds(10, 5, 100, 25);
        BackButton.setFont(new Font("", Font.BOLD, 10));
        BackButton.setBackground(new Color(95, 15, 64));
        BackButton.setForeground(new Color(254, 250, 224));
        BackButton.setBorderPainted(false);
        BackButton.setFocusPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.setOpaque(true);

//       Next Button
        deposit_Button = new JButton("Deposit");
        deposit_Button.setBounds(165, 320, 150, 37);
        deposit_Button.setBorderPainted(false);
        deposit_Button.setFocusPainted(false);
        deposit_Button.setContentAreaFilled(false);
        deposit_Button.setOpaque(true);
        deposit_Button.setBackground(new Color(107, 41, 140));
        deposit_Button.setFont(new Font("Edmond-sans", Font.PLAIN, 20));
        deposit_Button.setForeground(Color.WHITE);


// mouse listener to erase text on hover and restore default text on exit
        txt.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // do nothing
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // do nothing
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // do nothing
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (txt.getText().equals("Enter Amount")) {
                    txt.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt.getText().isEmpty()) {
                    txt.setText("Enter Amount");
                }
            }
        });

        deposit_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Enter Amount");
                } else if (!txt.getText().matches("\\d+")) {
                    JOptionPane.showMessageDialog(frame, "Character input is not allowed");
                } else {
                    frame.setVisible(false);

                    Amount=Integer.parseInt(txt.getText());
                    WhatToBuy whatToBuy = new WhatToBuy(Amount);
                }
            }
        });

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false);
                SelectInterest selectInterest = new SelectInterest();


            }
        });
        // Adding components to frame
        frame.add(BackButton);
        frame.add(label);
        frame.add(txt);
        frame.add(deposit_Button);
        Color bgColor = new Color(32, 42, 68);
        frame.getContentPane().setBackground(bgColor);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}