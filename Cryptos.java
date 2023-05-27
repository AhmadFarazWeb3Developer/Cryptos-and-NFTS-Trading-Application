import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Cryptos {
    protected JFrame frame;
    private JLabel[] price_label, name_label, image;
    private JPanel[] panel;
    private JButton buybtn;
    private JLabel selected_crytpo;
    private JPanel pnl;

    DepositAmount depositAmount = new DepositAmount();

    Cryptos() {
        // Initializing Frame
        depositAmount.frame.setVisible(false);
        frame = new JFrame("Welcome to Cryptos and NFTs World");

        panel = new JPanel[50];
        image = new JLabel[50];
        name_label = new JLabel[50];
        price_label = new JLabel[50];


        //-----------------------------------------bitcoin----------------------------------
        image[0] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\1bitcoin.jpg"));
        name_label[0] = new JLabel("Bitcoin");
        price_label[0] = new JLabel("$ 6222.923");

//------------------------------------Ethereum-------------------------------------
        image[1] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\2ethereum.png"));
        name_label[1] = new JLabel("Ethereum");
        price_label[1] = new JLabel("$ 1784.71");


//----------------------------------------Theter---------------------------------------------------

        image[2] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\3theter.png"));
        name_label[2] = new JLabel("Theter");
        price_label[2] = new JLabel("$ 0.99999");


//----------------------------------------Cardano---------------------------------------------------------

        image[3] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\4cardano.png"));
        name_label[3] = new JLabel("Cardano");
        price_label[3] = new JLabel("$ 0.3576");


        //----------------------------------------XRP---------------------------------------------------------

        image[4] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\5xrp.png"));
        name_label[4] = new JLabel("XRP");
        price_label[4] = new JLabel("$ 0.4491");


        //----------------------------------------DogeCoin---------------------------------------------------------


        image[5] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\6dogecoin.png"));
        name_label[5] = new JLabel("DogeCoin");
        price_label[5] = new JLabel("$ 0.0704");


        //----------------------------------------Solana---------------------------------------------------------

        image[6] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\7solana.png"));
        name_label[6] = new JLabel("Solana");
        price_label[6] = new JLabel("$ 19.32");


        //----------------------------------------Polygon---------------------------------------------------------

        image[7] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\8polygon.png"));
        name_label[7] = new JLabel("Polygon");
        price_label[7] = new JLabel("$ 0.8801");


        //----------------------------------------LiteCoin---------------------------------------------------------

        image[8] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\9litecoin.png"));
        name_label[8] = new JLabel("Litecoin");
        price_label[8] = new JLabel("$ 84.46");


        //----------------------------------------Tron---------------------------------------------------------

        image[9] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\10tron.png"));
        name_label[9] = new JLabel("Tron");
        price_label[9] = new JLabel("$ 0.07746");


        //----------------------------------------Polkadot--------------------------------------------------------

        image[10] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\11polkadot.png"));
        name_label[10] = new JLabel("Polakadot");
        price_label[10] = new JLabel("$ 5.26");

        //----------------------------------------Bianance--------------------------------------------------------

        image[11] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\12bianance.png"));
        name_label[11] = new JLabel("Bianance");
        price_label[11] = new JLabel("$ 0.9998");


        //----------------------------------------Shiba-Inu--------------------------------------------------------

        image[12] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\13shiba-inu.png"));
        name_label[12] = new JLabel("Shiba Inu");
        price_label[12] = new JLabel("$ 0.00008461");


        //----------------------------------------Avalanche--------------------------------------------------------

        image[13] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\14avalanche.png"));
        name_label[13] = new JLabel("Avalanche");
        price_label[13] = new JLabel("$ 14.17");

        //----------------------------------------Dai--------------------------------------------------------

        image[14] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\15dai.png"));
        name_label[14] = new JLabel("Dai");
        price_label[14] = new JLabel("$ 0.9998");


        //----------------------------------------Chainlink-------------------------------------------------------

        image[15] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\16chainlink.png"));
        name_label[15] = new JLabel("Chainlink");
        price_label[15] = new JLabel("$ 6.31");


        //----------------------------------------Cosmos--------------------------------------------------------

        image[16] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\17Cosmos.png"));
        name_label[16] = new JLabel("Cosmos");
        price_label[16] = new JLabel("$ 10.47");

        //----------------------------------------Uniswap--------------------------------------------------------

        image[17] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\18uniswap.png"));
        name_label[17] = new JLabel("UniSwap");
        price_label[17] = new JLabel("$ 4.96");
        panel[17] = new JPanel(new FlowLayout());

        //----------------------------------------Monero--------------------------------------------------------

        image[18] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\19monero.png"));
        name_label[18] = new JLabel("Monero");
        price_label[18] = new JLabel("$ 151.19");

        //----------------------------------------Toncoin--------------------------------------------------------

        image[19] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\20toncoin.png"));
        name_label[19] = new JLabel("Toncoin");
        price_label[19] = new JLabel("$ 1.96");

        //----------------------------------------Stellar-------------------------------------------------------

        image[20] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\21stellar.png"));
        name_label[20] = new JLabel("Stellar");
        price_label[20] = new JLabel("$ 0.08649");

        //----------------------------------------Internet-Computer--------------------------------------------------------

        image[21] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\22internet-computer.png"));
        name_label[21] = new JLabel("Internet Computer");
        price_label[21] = new JLabel("$ 4.85");

        //----------------------------------------Lido-Dao-------------------------------------------------------

        image[22] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\23lido-dao.png"));
        name_label[22] = new JLabel("Lido-Dao");
        price_label[22] = new JLabel("$ 2.02");


        //----------------------------------------Filecoin--------------------------------------------------------

        image[23] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\24filecoin.png"));
        name_label[23] = new JLabel("Filecoin");
        price_label[23] = new JLabel("$ 4.42");


//      ------------------------------------Aptos-----------------------------------------------------

        image[24] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\25aptos.png"));
        name_label[24] = new JLabel("Aptos");
        price_label[24] = new JLabel("$ 7.96");

        //----------------------------------------Hedera--------------------------------------------------------

        image[25] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\26hedera.png"));
        name_label[25] = new JLabel("Hedera");
        price_label[25] = new JLabel("$ 0.05066");


        //---------------------------------------- Arbitruum --------------------------------------------------------

        image[26] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\27arbitrum.png"));
        name_label[26] = new JLabel("Arbitrum");
        price_label[26] = new JLabel("$ 1.10");


        //---------------------------------------- Near - Protocol  --------------------------------------------------------

        image[27] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\28near-protocol.png"));
        name_label[27] = new JLabel("Near-Protocol");
        price_label[27] = new JLabel("$ 1.57");

        //---------------------------------------- Fanatom  --------------------------------------------------------

        image[28] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\29fantom.png"));
        name_label[28] = new JLabel("Fantom");
        price_label[28] = new JLabel("$ 0.3317");

        //---------------------------------------- paxdollar  --------------------------------------------------------

        image[29] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\30paxdollar.png"));
        name_label[29] = new JLabel("Pax Dollar");
        price_label[29] = new JLabel("$ 0.9918");

        //----------------------------------------   Sand Box--------------------------------------------------------

        image[30] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\31sandbox.png"));
        name_label[30] = new JLabel("Sandbox");
        price_label[30] = new JLabel("$ 0.503");
        //----------------------------------------  Decentraland --------------------------------------------------------

        image[31] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\32decentraland.png"));
        name_label[31] = new JLabel("Decentraland");
        price_label[31] = new JLabel("$ 0.4592");

        //----------------------------------------  Aave --------------------------------------------------------

        image[32] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\33aave.png"));
        name_label[32] = new JLabel("Aave");
        price_label[32] = new JLabel("$ 63.75");
        //---------------------------------------- Bitdao  --------------------------------------------------------

        image[33] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\34bitdao.png"));
        name_label[33] = new JLabel("BitDAO");
        price_label[33] = new JLabel("$ 0.5105");

        //---------------------------------------- Stacks  --------------------------------------------------------

        image[34] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\35stacks.png"));
        name_label[34] = new JLabel("Stacks");
        price_label[34] = new JLabel("$ 0.5832");

        //---------------------------------------- Tezos  --------------------------------------------------------

        image[35] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\36tezos.png"));
        name_label[35] = new JLabel("Tezos");
        price_label[35] = new JLabel("$ 0.8645");

        //----------------------------------------Axie-infinity   --------------------------------------------------------

        image[36] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\37axie-infinity.png"));
        name_label[36] = new JLabel("Axie-Infinity");
        price_label[36] = new JLabel("$ 6.93");

        //----------------------------------------  Osmosis --------------------------------------------------------

        image[37] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\38osmosis.png"));
        name_label[37] = new JLabel("Osmosis");
        price_label[37] = new JLabel("$ 0.6005");

        //---------------------------------------- Cartesi  --------------------------------------------------------

        image[38] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\39cartesi.png"));
        name_label[38] = new JLabel("Cartesi");
        price_label[38] = new JLabel("$ 0.895");

        //----------------------------------------  Civic --------------------------------------------------------

        image[39] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\40civic.png"));
        name_label[39] = new JLabel("Civic");
        price_label[39] = new JLabel("$ 1.96");

        //----------------------------------------  Dent --------------------------------------------------------

        image[40] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\41dent.png"));
        name_label[40] = new JLabel("Dent");
        price_label[40] = new JLabel("$ 2.45007");

        //---------------------------------------- Enzyme  --------------------------------------------------------

        image[41] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\42enzyme.png"));
        name_label[41] = new JLabel("Enzyme");
        price_label[41] = new JLabel("$ 0.056");

        //----------------------------------------  Quark Chain --------------------------------------------------------

        image[42] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\43quarkchain.png"));
        name_label[42] = new JLabel("Quark Chain");
        price_label[42] = new JLabel("$ 0.445");

        //---------------------------------------- Kadena  --------------------------------------------------------

        image[43] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\44kadena.png"));
        name_label[43] = new JLabel("Kadena");
        price_label[43] = new JLabel("$ 0.37889");

        //---------------------------------------- Irisnet  --------------------------------------------------------

        image[44] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\45irisnet.png"));
        name_label[44] = new JLabel("Irisnet");
        price_label[44] = new JLabel("$ 3.3");

        //----------------------------------------  Gitcoin --------------------------------------------------------

        image[45] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\46gitcoin.png"));
        name_label[45] = new JLabel("Gitcoin");
        price_label[45] = new JLabel("$ 1.9906");

        //----------------------------------------  Uquid --------------------------------------------------------

        image[46] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\47uquid.png"));
        name_label[46] = new JLabel("Uquid");
        price_label[46] = new JLabel("$ 0.897");

        //---------------------------------------- Ecash  --------------------------------------------------------

        image[47] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\48ecash.png"));
        name_label[47] = new JLabel("Ecash");
        price_label[47] = new JLabel("$ 0.000023");

        //----------------------------------------  Stratis --------------------------------------------------------

        image[48] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\49stratis.png"));
        name_label[48] = new JLabel("Straits");
        price_label[48] = new JLabel("$ 0.1996");

        //---------------------------------------- Energy --------------------------------------------------------

        image[49] = new JLabel(new ImageIcon("E:\\Java\\Cryptos and NFTs Project\\src\\CryptoImages\\50energy.png"));
        name_label[49] = new JLabel("Energy");
        price_label[49] = new JLabel("$ 0.976");

        for (int i = 0; i < 50; i++) {
            panel[i] = new JPanel(new FlowLayout());
            panel[i].add(image[i]);
            panel[i].add(name_label[i]);
            panel[i].add(price_label[i]);
        }

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 25)); // Set the layout manager for the frame
        for (int i = 0; i < 50; i++) {
            frame.add(panel[i]);
        }

        Color bgColor = new Color(32, 42, 68);

        pnl = new JPanel();
        pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
        pnl.setPreferredSize(new Dimension(1000, 400));
        pnl.setBackground(bgColor);


        selected_crytpo = new JLabel("You have selected no crypto");
        selected_crytpo.setAlignmentX(Component.CENTER_ALIGNMENT);
        selected_crytpo.setFont(new Font("Arial", Font.PLAIN, 15));
        selected_crytpo.setForeground(new Color(252, 163, 17));


        buybtn = new JButton("Buy");
        buybtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        buybtn.setPreferredSize(new Dimension(200, 40));
        buybtn.setFocusPainted(false);
        buybtn.setFont(new Font("Arial", Font.PLAIN, 20));
        buybtn.setMaximumSize(new Dimension(200, 40));

        pnl.add(selected_crytpo);
        pnl.add(buybtn);
        frame.add(pnl);

        panel[0].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected_crytpo.setText(name_label[0].getText() + " is selected for " + price_label[0].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 6229.23) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 6229.23);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[0], amount);
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
                selected_crytpo.setText(name_label[1].getText() + " is selected for " + price_label[1].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 17484.71) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 17484.71);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[1], amount);
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
                selected_crytpo.setText(name_label[2].getText() + " is selected for " + price_label[2].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.9999) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.9999);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[2], amount);
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
                selected_crytpo.setText(name_label[3].getText() + " is selected for " + price_label[3].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.3576) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.3576);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[3], amount);
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
                selected_crytpo.setText(name_label[4].getText() + " is selected for " + price_label[4].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.4491) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.4491);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[4], amount);
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
                selected_crytpo.setText(name_label[5].getText() + " is selected for " + price_label[5].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.0704) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.0704);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[5], amount);
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
                selected_crytpo.setText(name_label[6].getText() + " is selected for " + price_label[6].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 19.32) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 19.32);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[6], amount);
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
                selected_crytpo.setText(name_label[7].getText() + " is selected for " + price_label[7].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.8801) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.8801);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[7], amount);
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
                selected_crytpo.setText(name_label[8].getText() + " is selected for " + price_label[8].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 84.46) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 84.46);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[8], amount);
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
                selected_crytpo.setText(name_label[9].getText() + " is selected for " + price_label[9].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.07746) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.07746);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[9], amount);
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
                selected_crytpo.setText(name_label[10].getText() + " is selected for " + price_label[10].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 5.26) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 5.26);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[10], amount);
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
                selected_crytpo.setText(name_label[11].getText() + " is selected for " + price_label[11].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 5.26) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 5.26);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[11], amount);
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
                selected_crytpo.setText(name_label[12].getText() + " is selected for " + price_label[12].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.9998) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.9998);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[12], amount);
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
                selected_crytpo.setText(name_label[13].getText() + " is selected for " + price_label[13].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.0000008461) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.0000008461);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[13], amount);
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
                selected_crytpo.setText(name_label[14].getText() + " is selected for " + price_label[14].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 14.17) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 14.173);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[14], amount);
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
                selected_crytpo.setText(name_label[15].getText() + " is selected for " + price_label[15].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.9998) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.9998);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[15], amount);
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
                selected_crytpo.setText(name_label[16].getText() + " is selected for " + price_label[16].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 6.31) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 6.31);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[16], amount);
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
                selected_crytpo.setText(name_label[17].getText() + " is selected for " + price_label[17].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 10.47) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 10.47);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[17], amount);
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
                selected_crytpo.setText(name_label[18].getText() + " is selected for " + price_label[18].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 4.96) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 4.96);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[18], amount);
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
                selected_crytpo.setText(name_label[19].getText() + " is selected for " + price_label[19].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 151.19) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 151.19);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[19], amount);
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
                selected_crytpo.setText(name_label[20].getText() + " is selected for " + price_label[20].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 1.96) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 1.96);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[20], amount);
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
                selected_crytpo.setText(name_label[21].getText() + " is selected for " + price_label[21].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.08649) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.08649);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[21], amount);
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
                selected_crytpo.setText(name_label[22].getText() + " is selected for " + price_label[22].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 4.85) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 4.85);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[22], amount);
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
                selected_crytpo.setText(name_label[23].getText() + " is selected for " + price_label[23].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 2.02) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 2.02);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[23], amount);
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
                selected_crytpo.setText(name_label[24].getText() + " is selected for " + price_label[24].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 4.42) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 4.42);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[24], amount);
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
                selected_crytpo.setText(name_label[25].getText() + " is selected for " + price_label[25].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 7.96) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 7.96);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[25], amount);
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
                selected_crytpo.setText(name_label[26].getText() + " is selected for " + price_label[26].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.05066) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.05066);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[26], amount);
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
                selected_crytpo.setText(name_label[27].getText() + " is selected for " + price_label[27].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 1.10) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 1.10);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[27], amount);
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
                selected_crytpo.setText(name_label[28].getText() + " is selected for " + price_label[28].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 1.57) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 1.57);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[28], amount);
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
                selected_crytpo.setText(name_label[29].getText() + " is selected for " + price_label[29].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.3317) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.3317);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[29], amount);
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
                selected_crytpo.setText(name_label[30].getText() + " is selected for " + price_label[30].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.9918) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.9918);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[30], amount);
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
                selected_crytpo.setText(name_label[31].getText() + " is selected for " + price_label[31].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.4592) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.4592);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[31], amount);
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
                selected_crytpo.setText(name_label[32].getText() + " is selected for " + price_label[32].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 63.75) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 63.75);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[32], amount);
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
                selected_crytpo.setText(name_label[33].getText() + " is selected for " + price_label[33].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.5105) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.5105);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[33], amount);
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
                selected_crytpo.setText(name_label[34].getText() + " is selected for " + price_label[34].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.5832) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.5832);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[34], amount);
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
                selected_crytpo.setText(name_label[35].getText() + " is selected for " + price_label[35].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.8645) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.8645);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[35], amount);
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
                selected_crytpo.setText(name_label[36].getText() + " is selected for " + price_label[36].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 6.93) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 6.93);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[36], amount);
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
                selected_crytpo.setText(name_label[37].getText() + " is selected for " + price_label[37].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.6005) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.6005);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[37], amount);
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
                selected_crytpo.setText(name_label[38].getText() + " is selected for " + price_label[38].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.895) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.895);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[38], amount);
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
                selected_crytpo.setText(name_label[39].getText() + " is selected for " + price_label[39].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 1.96) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 1.96);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[39], amount);
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
                selected_crytpo.setText(name_label[40].getText() + " is selected for " + price_label[40].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 2.45007) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 2.45007);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[40], amount);
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
                selected_crytpo.setText(name_label[41].getText() + " is selected for " + price_label[41].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.056) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.056);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[41], amount);
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
                selected_crytpo.setText(name_label[42].getText() + " is selected for " + price_label[42].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.445) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.445);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[42], amount);
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
                selected_crytpo.setText(name_label[43].getText() + " is selected for " + price_label[43].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.37889) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.37889);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[43], amount);
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
                selected_crytpo.setText(name_label[44].getText() + " is selected for " + price_label[44].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 3.3) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 3.3);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[44], amount);
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
                selected_crytpo.setText(name_label[45].getText() + " is selected for " + price_label[45].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 1.9906) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 1.9906);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[45], amount);
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
                selected_crytpo.setText(name_label[46].getText() + " is selected for " + price_label[46].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.897) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.897);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[46], amount);
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
                selected_crytpo.setText(name_label[47].getText() + " is selected for " + price_label[47].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.00023) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.00023);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[47], amount);
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
                selected_crytpo.setText(name_label[48].getText() + " is selected for " + price_label[48].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.1996) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.1996);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[48], amount);
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
                selected_crytpo.setText(name_label[49].getText() + " is selected for " + price_label[49].getText());
                buybtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        if (DepositAmount.Amount < 0.976) {
                            JOptionPane.showMessageDialog(frame, "Your Amount is less the price of this crypto");
                            DepositAmount depositAmount1 = new DepositAmount();
                        } else {
                            int amount = (int) (depositAmount.Amount - 0.976);
                            tradeCrytpo tradeCrytpo = new tradeCrytpo(panel[49], amount);
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

        frame.setBounds(0, 0, 1500, 900);
        frame.getContentPane().setBackground(bgColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}