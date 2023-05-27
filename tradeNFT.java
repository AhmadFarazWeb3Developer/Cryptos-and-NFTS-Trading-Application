import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class tradeNFT {
    JFrame frame;
    private JLabel lbl, sold_lbl;
    private JTextField txt;
    private JPanel panel1;
    private JButton sell_nft, Exit_btn, Amount_btn;


    tradeNFT() {
    }

    tradeNFT(JPanel panel, int amount) {
        // Initializing Frame
        frame = new JFrame("Welcome to Cryptos and NFTs World");
        lbl = new JLabel("Your NFT is ready For Trading");
        lbl.setBounds(7, 10, 400, 50);
        lbl.setForeground(Color.WHITE);
        lbl.setFont(new Font("Arial", Font.PLAIN, 25));

        sold_lbl = new JLabel("SOLD");
        sold_lbl.setBounds(120, 70, 200, 100);
        sold_lbl.setFont(new Font("Arial", Font.BOLD, 50));
        sold_lbl.setForeground(Color.WHITE);
        sold_lbl.setVisible(false);
        frame.add(sold_lbl);

        panel1 = new JPanel();
        panel1.setBounds(90, 90, 200, 70);
        panel1.add(panel);
        panel1.setBackground(new Color(32, 42, 68));
        txt = new JTextField("Set price for trading");
        txt.setBounds(90, 200, 200, 30);
        txt.setHorizontalAlignment(JTextField.CENTER); // Align text to center
        txt.isRequestFocusEnabled();


        sell_nft = new JButton("Sell your Crypto");
        sell_nft.setBackground(new Color(107, 41, 140));
        sell_nft.setBounds(90, 260, 200, 30);
        sell_nft.setFocusPainted(false);
        sell_nft.setForeground(Color.WHITE);

//        panel2.setBackground( new Color(32, 42,
        Exit_btn = new JButton("Exit from Crypto page");
        Exit_btn.setBounds(90, 300, 200, 30);
        Exit_btn.setBackground(new Color(214, 40, 40));
        Exit_btn.setForeground(Color.WHITE);

        Amount_btn = new JButton("Check Remaining Amount");
        Amount_btn.setBounds(90, 340, 200, 30);
        Amount_btn.setForeground(Color.black);
        Amount_btn.setBackground(new Color(42, 157, 143));
        Amount_btn.setForeground(Color.WHITE);
//        Amount_btn.setVisible(false);
        frame.add(sold_lbl);
        txt.addMouseListener(new MouseListener() {

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

                if (txt.getText().equals("Set price for trading")) {
                    txt.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (txt.getText().isEmpty()) {
                    txt.setText("Set price for trading");
                }
            }
        });
        sell_nft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt.getText().equals("Set price for trading")) {
                    JOptionPane.showMessageDialog(frame, "Set Amount");
                } else {
                    JOptionPane.showMessageDialog(frame, "You Sold NFT for  $ " + txt.getText());
                    txt.setText("You dont have any assets");
                    txt.setFocusable(false);
                    panel.setVisible(false);
                    sold_lbl.setVisible(true);

                }
            }
        });

        Exit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                NFTs nfTs = new NFTs();
                nfTs.frame.setVisible(false);
            }
        });
        Amount_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Your Remaining Amount is " + amount);
            }
        });

        frame.add(lbl);
        frame.add(panel1);
        frame.add(txt);
        frame.add(sell_nft);
        frame.add(Exit_btn);
        frame.add(Amount_btn);
        frame.setBounds(500, 100, 400, 450);
        Color bgColor = new Color(32, 42, 68);
        frame.getContentPane().setBackground(bgColor);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}