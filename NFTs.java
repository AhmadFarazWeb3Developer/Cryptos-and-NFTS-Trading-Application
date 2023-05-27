import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class NFTs {
    public JFrame frame;
    DepositAmount depositAmount;
    private JLabel[] price_label, name_label, image;
    private JPanel[] panel;
    private JButton buybtn;
    private JLabel selected_nfts;
    private JPanel pnl;

    NFTs() {
        // Initializing Frame

        depositAmount = new DepositAmount();
        depositAmount.frame.setVisible(false);

        frame = new JFrame("Welcome to Cryptos and NFTs World");

        panel = new JPanel[50];
        image = new JLabel[50];
        name_label = new JLabel[50];
        price_label = new JLabel[50];


        //-----------------------------------------bitcoin----------------------------------
        image[0] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\1.jpg"));
        name_label[0] = new JLabel("Tom-B");
        price_label[0] = new JLabel("$ 200.01");

//------------------------------------Ethereum-------------------------------------
        image[1] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\2.jpg"));
        name_label[1] = new JLabel("Loqus");
        price_label[1] = new JLabel("$ 122.134");


//----------------------------------------Theter---------------------------------------------------

        image[2] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\3.jpg"));
        name_label[2] = new JLabel("ChilBoy");
        price_label[2] = new JLabel("$ 121");


//----------------------------------------Cardano---------------------------------------------------------

        image[3] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\4.jpg"));
        name_label[3] = new JLabel("Skltn");
        price_label[3] = new JLabel("$ 118.0123");


        //----------------------------------------XRP---------------------------------------------------------

        image[4] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\5.jpg"));
        name_label[4] = new JLabel("Altas");
        price_label[4] = new JLabel("$ 117.1313");


        //----------------------------------------DogeCoin---------------------------------------------------------


        image[5] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\6.jpg"));
        name_label[5] = new JLabel("Baga");
        price_label[5] = new JLabel("$ 115.2004");

        //----------------------------------------Solana---------------------------------------------------------

        image[6] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\7.jpg"));
        name_label[6] = new JLabel("Happy-Ape");
        price_label[6] = new JLabel("$ 115.0099");


        //----------------------------------------Polygon---------------------------------------------------------

        image[7] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\8.jpg"));
        name_label[7] = new JLabel("Zappyil");
        price_label[7] = new JLabel("$ 115.0008");


        //----------------------------------------LiteCoin---------------------------------------------------------

        image[8] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\9.jpg"));
        name_label[8] = new JLabel("Pirate");
        price_label[8] = new JLabel("$ 114.33");


        //----------------------------------------Tron---------------------------------------------------------

        image[9] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\10.jpg"));
        name_label[9] = new JLabel("D-Ape");
        price_label[9] = new JLabel("$ 114.0768");


        //----------------------------------------Polkadot--------------------------------------------------------

        image[10] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\11.jpg"));
        name_label[10] = new JLabel("S-catty");
        price_label[10] = new JLabel("$ 114.067");

        //----------------------------------------Bianance--------------------------------------------------------

        image[11] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\12.jpg"));
        name_label[11] = new JLabel("Lapyy");
        price_label[11] = new JLabel("$ 113.340");


        //----------------------------------------Shiba-Inu--------------------------------------------------------

        image[12] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\13.jpg"));
        name_label[12] = new JLabel("Shiba");
        price_label[12] = new JLabel("$ 113.0023");


        //----------------------------------------Avalanche--------------------------------------------------------

        image[13] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\14.jpg"));
        name_label[13] = new JLabel("Mikcy-Bird");
        price_label[13] = new JLabel("$ 113.002");

        //----------------------------------------Dai--------------------------------------------------------

        image[14] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\15.jpg"));
        name_label[14] = new JLabel("Pink-Lion");
        price_label[14] = new JLabel("$ 113.0012");


        //----------------------------------------Chainlink-------------------------------------------------------

        image[15] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\16.jpg"));
        name_label[15] = new JLabel("Blue-Lion");
        price_label[15] = new JLabel("$ 113.001");


        //----------------------------------------Cosmos--------------------------------------------------------

        image[16] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\17.jpg"));
        name_label[16] = new JLabel("Lost-Ship");
        price_label[16] = new JLabel("$ 112.98");

        //----------------------------------------Uniswap--------------------------------------------------------

        image[17] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\18.jpg"));
        name_label[17] = new JLabel("G-Lion");
        price_label[17] = new JLabel("$ 112.96");

        //----------------------------------------Monero--------------------------------------------------------

        image[18] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\19.jpg"));
        name_label[18] = new JLabel("M-Sklton");
        price_label[18] = new JLabel("$ 112.87");

        //----------------------------------------Toncoin--------------------------------------------------------

        image[19] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\20.jpg"));
        name_label[19] = new JLabel("Fat-Toni");
        price_label[19] = new JLabel("$ 112.7667");

        //----------------------------------------Stellar-------------------------------------------------------

        image[20] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\21.jpg"));
        name_label[20] = new JLabel("Rich-Lion");
        price_label[20] = new JLabel("$ 112.567");

        //----------------------------------------Internet-Computer--------------------------------------------------------

        image[21] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\22.jpg"));
        name_label[21] = new JLabel("King-Ape");
        price_label[21] = new JLabel("$ 112.550");

        //----------------------------------------Lido-Dao-------------------------------------------------------

        image[22] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\23.jpg"));
        name_label[22] = new JLabel("A-Smoker");
        price_label[22] = new JLabel("$ 112.4002");


        //----------------------------------------Filecoin--------------------------------------------------------

        image[23] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\24.jpg"));
        name_label[23] = new JLabel("Champ");
        price_label[23] = new JLabel("$ 112.3098");


//      ------------------------------------Aptos-----------------------------------------------------

        image[24] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\25.jpg"));
        name_label[24] = new JLabel("Poor-Ape");
        price_label[24] = new JLabel("$ 112.2399");

        //----------------------------------------Hedera--------------------------------------------------------

        image[25] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\26.jpg"));
        name_label[25] = new JLabel("Snoop");
        price_label[25] = new JLabel("$ 112.0011");


        //---------------------------------------- Arbitruum --------------------------------------------------------

        image[26] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\27.jpg"));
        name_label[26] = new JLabel("Rich-Dog");
        price_label[26] = new JLabel("$ 111.987");


        //---------------------------------------- Near - Protocol  --------------------------------------------------------

        image[27] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\28.jpg"));
        name_label[27] = new JLabel("Miller");
        price_label[27] = new JLabel("$ 111.89701");

        //---------------------------------------- Fanatom  --------------------------------------------------------

        image[28] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\29.jpg"));
        name_label[28] = new JLabel("Fant");
        price_label[28] = new JLabel("$ 111.7");

        //---------------------------------------- paxdollar  --------------------------------------------------------

        image[29] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\30.jpg"));
        name_label[29] = new JLabel("Paxal");
        price_label[29] = new JLabel("$ 111.231");

        //----------------------------------------   Sand Box--------------------------------------------------------

        image[30] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\31.jpg"));
        name_label[30] = new JLabel("Eagerl");
        price_label[30] = new JLabel("$ 111");
        //----------------------------------------  Decentraland --------------------------------------------------------

        image[31] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\32.jpg"));
        name_label[31] = new JLabel("Anny");
        price_label[31] = new JLabel("$ 87");

        //----------------------------------------  Aave --------------------------------------------------------

        image[32] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\33.jpg"));
        name_label[32] = new JLabel("AX-allf");
        price_label[32] = new JLabel("$ 71.12");
        //---------------------------------------- Bitdao  --------------------------------------------------------

        image[33] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\34.jpg"));
        name_label[33] = new JLabel("Haplos");
        price_label[33] = new JLabel("$ 67.09");

        //---------------------------------------- Stacks  --------------------------------------------------------

        image[34] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\35.jpg"));
        name_label[34] = new JLabel("Tezal");
        price_label[34] = new JLabel("$ 50.987");

        //---------------------------------------- Tezos  --------------------------------------------------------

        image[35] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\36.jpg"));
        name_label[35] = new JLabel("Cooper");
        price_label[35] = new JLabel("$ 34");

        //----------------------------------------Axie-infinity   --------------------------------------------------------

        image[36] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\37.jpg"));
        name_label[36] = new JLabel("Slt-Guy");
        price_label[36] = new JLabel("$ 29");

        //----------------------------------------  Osmosis --------------------------------------------------------

        image[37] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\38.jpg"));
        name_label[37] = new JLabel("Osam");
        price_label[37] = new JLabel("$ 22.54");

        //---------------------------------------- Cartesi  --------------------------------------------------------

        image[38] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\39.jpg"));
        name_label[38] = new JLabel("Kriss");
        price_label[38] = new JLabel("$ 20");

        //----------------------------------------  Civic --------------------------------------------------------

        image[39] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\40.jpg"));
        name_label[39] = new JLabel("Denta");
        price_label[39] = new JLabel("$ 13.12");

        //----------------------------------------  Dent --------------------------------------------------------

        image[40] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\41.jpg"));
        name_label[40] = new JLabel("Alpha");
        price_label[40] = new JLabel("$ 12.001");

        //---------------------------------------- Enzyme  --------------------------------------------------------

        image[41] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\42.jpg"));
        name_label[41] = new JLabel("Snopal");
        price_label[41] = new JLabel("$ 11");

        //----------------------------------------  Quark Chain --------------------------------------------------------

        image[42] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\43.jpg"));
        name_label[42] = new JLabel("Hapel");
        price_label[42] = new JLabel("$ 9.99");

        //---------------------------------------- Kadena  --------------------------------------------------------

        image[43] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\44.jpg"));
        name_label[43] = new JLabel("Hyal");
        price_label[43] = new JLabel("$ 2.23");

        //---------------------------------------- Irisnet  --------------------------------------------------------

        image[44] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\45.jpg"));
        name_label[44] = new JLabel("Eral-Cat");
        price_label[44] = new JLabel("$ 0.92");

        //----------------------------------------  Gitcoin --------------------------------------------------------

        image[45] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\46.jpg"));
        name_label[45] = new JLabel("Kayal");
        price_label[45] = new JLabel("$ 0.912");

        //----------------------------------------  Uquid --------------------------------------------------------

        image[46] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\47.jpg"));
        name_label[46] = new JLabel("Habibi");
        price_label[46] = new JLabel("$ 0.7841");

        //---------------------------------------- Ecash  --------------------------------------------------------

        image[47] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\48.jpg"));
        name_label[47] = new JLabel("Lazy-Ape");
        price_label[47] = new JLabel("$ 0.33");

        //----------------------------------------  Stratis --------------------------------------------------------

        image[48] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\49.jpg"));
        name_label[48] = new JLabel("W-Ape");
        price_label[48] = new JLabel("$ 0.112");

        //---------------------------------------- Energy --------------------------------------------------------

        image[49] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\NFTsImages\\50.jpg"));
        name_label[49] = new JLabel("Katos");
        price_label[49] = new JLabel("$ 0.0111");

        for (int i = 0; i < 50; i++) {
            panel[i] = new JPanel(new FlowLayout());
            panel[i].add(image[i]);
            panel[i].add(name_label[i]);
            name_label[i].setForeground(new Color(108, 117, 125));

            price_label[i].setForeground(new Color(155, 38, 65));

            panel[i].add(price_label[i]);

            panel[i].setBackground(new Color(231, 205, 131));
        }

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 11)); // Set the layout manager for the frame
        for (int i = 0; i < 50; i++) {
            frame.add(panel[i]);
        }

        Color bgColor = new Color(32, 42, 68);
        pnl = new JPanel();
        pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
        pnl.setPreferredSize(new Dimension(1000, 200));

        pnl.setBackground(bgColor);

        selected_nfts = new JLabel("You have selected no NFT");
        selected_nfts.setAlignmentX(Component.CENTER_ALIGNMENT);
        selected_nfts.setFont(new Font("Arial", Font.BOLD, 15));
        selected_nfts.setForeground(new Color(252, 163, 17));
        selected_nfts.setBackground(bgColor);


        buybtn = new JButton("Buy");
        buybtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        buybtn.setPreferredSize(new Dimension(200, 40));
        buybtn.setFocusPainted(false);
        buybtn.setFont(new Font("Arial", Font.BOLD, 20));
        buybtn.setBackground(new Color(107, 41, 140));
        buybtn.setForeground(Color.WHITE);

        pnl.add(selected_nfts);
        pnl.add(buybtn);
        panel[0].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[0].getText() + " is selected for " + price_label[0].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 200.01) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 200.01);
                            tradeNFT tradenft = new tradeNFT(panel[0], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[1].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[1].getText() + " is selected for " + price_label[1].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 122.134) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 122.134);
                            tradeNFT tradenft = new tradeNFT(panel[1], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        panel[2].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[2].getText() + " is selected for " + price_label[2].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 121) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 121);
                            tradeNFT tradenft = new tradeNFT(panel[2], amount);
                        }
                    }
                });
            }


            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[3].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[3].getText() + " is selected for " + price_label[3].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 118.0123) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 118.0123);
                            tradeNFT tradenft = new tradeNFT(panel[3], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[4].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[4].getText() + " is selected for " + price_label[4].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 117.1313) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 117.1313);
                            tradeNFT tradenft = new tradeNFT(panel[4], amount);
                        }
                    }
                });
            }


            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[5].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[5].getText() + " is selected for " + price_label[5].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 115.2004) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 115.2004);
                            tradeNFT tradenft = new tradeNFT(panel[5], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[6].addMouseListener(new MouseListener() {
            @Override

            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[6].getText() + " is selected for " + price_label[6].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 115.0099) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 115.0099);
                            tradeNFT tradenft = new tradeNFT(panel[6], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[7].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[7].getText() + " is selected for " + price_label[7].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 115) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 115);
                            tradeNFT tradenft = new tradeNFT(panel[7], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[8].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[8].getText() + " is selected for " + price_label[8].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 114.33) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 114.33);
                            tradeNFT tradenft = new tradeNFT(panel[8], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[9].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[9].getText() + " is selected for " + price_label[9].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 114.0768) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 114.0768);
                            tradeNFT tradenft = new tradeNFT(panel[9], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[10].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[10].getText() + " is selected for " + price_label[10].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 114.067) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 114.067);
                            tradeNFT tradenft = new tradeNFT(panel[10], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[11].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[11].getText() + " is selected for " + price_label[11].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 113.340) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 113.340);
                            tradeNFT tradenft = new tradeNFT(panel[11], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[12].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[12].getText() + " is selected for " + price_label[12].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 113.0023) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 113.0023);
                            tradeNFT tradenft = new tradeNFT(panel[12], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[13].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[13].getText() + " is selected for " + price_label[13].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 113.002) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 113.002);
                            tradeNFT tradenft = new tradeNFT(panel[13], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[14].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[14].getText() + " is selected for " + price_label[14].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 113.0012) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 113.0012);
                            tradeNFT tradenft = new tradeNFT(panel[14], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[15].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[15].getText() + " is selected for " + price_label[15].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 113.001) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 113.001);
                            tradeNFT tradenft = new tradeNFT(panel[15], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[16].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[16].getText() + " is selected for " + price_label[16].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.98) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.98);
                            tradeNFT tradenft = new tradeNFT(panel[16], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[17].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[17].getText() + " is selected for " + price_label[17].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.96) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.96);
                            tradeNFT tradenft = new tradeNFT(panel[17], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[18].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[18].getText() + " is selected for " + price_label[18].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.87) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.87);
                            tradeNFT tradenft = new tradeNFT(panel[18], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[19].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[19].getText() + " is selected for " + price_label[19].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.7667) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.7667);
                            tradeNFT tradenft = new tradeNFT(panel[19], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[20].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[20].getText() + " is selected for " + price_label[20].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.567) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.567);
                            tradeNFT tradenft = new tradeNFT(panel[20], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[21].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[21].getText() + " is selected for " + price_label[21].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.550) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.550);
                            tradeNFT tradenft = new tradeNFT(panel[21], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[22].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[22].getText() + " is selected for " + price_label[22].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.4002) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.4002);
                            tradeNFT tradenft = new tradeNFT(panel[22], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[23].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[23].getText() + " is selected for " + price_label[23].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.3098) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.3098);
                            tradeNFT tradenft = new tradeNFT(panel[23], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[24].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[24].getText() + " is selected for " + price_label[24].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.2399) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.2399);
                            tradeNFT tradenft = new tradeNFT(panel[24], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[25].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[25].getText() + " is selected for " + price_label[25].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 112.0011) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 112.0011);
                            tradeNFT tradenft = new tradeNFT(panel[25], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[26].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[26].getText() + " is selected for " + price_label[26].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 111.987) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 111.987);
                            tradeNFT tradenft = new tradeNFT(panel[26], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[27].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[27].getText() + " is selected for " + price_label[27].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 111.89701) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 111.89701);
                            tradeNFT tradenft = new tradeNFT(panel[27], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[28].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[28].getText() + " is selected for " + price_label[28].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 111.7) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 111.7);
                            tradeNFT tradenft = new tradeNFT(panel[28], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[29].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[29].getText() + " is selected for " + price_label[29].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 111.231) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 111.231);
                            tradeNFT tradenft = new tradeNFT(panel[29], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[30].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[30].getText() + " is selected for " + price_label[30].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 111) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 111);
                            tradeNFT tradenft = new tradeNFT(panel[30], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[31].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[31].getText() + " is selected for " + price_label[31].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 87) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 87);
                            tradeNFT tradenft = new tradeNFT(panel[31], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[32].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[32].getText() + " is selected for " + price_label[32].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 71.12) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 71.12);
                            tradeNFT tradenft = new tradeNFT(panel[32], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[33].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[33].getText() + " is selected for " + price_label[33].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 67.09) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 67.09);
                            tradeNFT tradenft = new tradeNFT(panel[33], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[34].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[34].getText() + " is selected for " + price_label[34].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 50.987) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 50.987);
                            tradeNFT tradenft = new tradeNFT(panel[34], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[35].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[35].getText() + " is selected for " + price_label[35].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 34) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 34);
                            tradeNFT tradenft = new tradeNFT(panel[35], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[36].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[36].getText() + " is selected for " + price_label[36].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 29) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = ((depositAmount.Amount - 29));
                            tradeNFT tradenft = new tradeNFT(panel[36], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[37].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[37].getText() + " is selected for " + price_label[37].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 22.54) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 22.54);
                            tradeNFT tradenft = new tradeNFT(panel[37], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[38].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[38].getText() + " is selected for " + price_label[38].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 20) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 20);
                            tradeNFT tradenft = new tradeNFT(panel[38], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[39].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[39].getText() + " is selected for " + price_label[39].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 13.12) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 13.12);
                            tradeNFT tradenft = new tradeNFT(panel[39], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[40].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[40].getText() + " is selected for " + price_label[40].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 12.001) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 12.001);
                            tradeNFT tradenft = new tradeNFT(panel[40], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[41].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[41].getText() + " is selected for " + price_label[41].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 11) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 11);
                            tradeNFT tradenft = new tradeNFT(panel[41], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[42].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[42].getText() + " is selected for " + price_label[42].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 9.99) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 9.99);
                            tradeNFT tradenft = new tradeNFT(panel[42], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[43].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[43].getText() + " is selected for " + price_label[43].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 2.32) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 2.32);
                            tradeNFT tradenft = new tradeNFT(panel[43], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[44].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[44].getText() + " is selected for " + price_label[44].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.92) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.92);
                            tradeNFT tradenft = new tradeNFT(panel[44], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[45].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[45].getText() + " is selected for " + price_label[45].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.912) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.912);
                            tradeNFT tradenft = new tradeNFT(panel[45], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[46].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[46].getText() + " is selected for " + price_label[46].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.7841) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.7841);
                            tradeNFT tradenft = new tradeNFT(panel[46], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[47].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[47].getText() + " is selected for " + price_label[47].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.33) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.33);
                            tradeNFT tradenft = new tradeNFT(panel[47], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


        panel[48].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[48].getText() + " is selected for " + price_label[48].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.112) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.112);
                            tradeNFT tradenft = new tradeNFT(panel[48], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel[49].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_nfts.setText(name_label[49].getText() + " is selected for " + price_label[49].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.0111) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.0111);
                            tradeNFT tradenft = new tradeNFT(panel[49], amount);
                        }
                    }
                });
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


//        frame.add(scrollPane);
        frame.add(pnl);
        frame.setBounds(0, 0, 1500, 900);
        frame.getContentPane().setBackground(bgColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}