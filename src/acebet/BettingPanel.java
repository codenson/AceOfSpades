package acebet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author guero: Marouane Guerouji.
 */
public class BettingPanel extends javax.swing.JPanel {

    /**
     * Creates new form BettingPanel
     */
    AceBet myBet;
    Card deck;
    ImageIcon casino;
    int start;

    public BettingPanel() {
        ///deck = new Card("deck");
    }

    public BettingPanel(AceBet bet)  {
        this.myBet = bet;
        deck = myBet.getDeckCard();
        initComponents();
        newRoundGuiReset();

        String s = System.getProperty("user.dir") + File.separator + "src/Images/" + "casino.jpg";
        casino = new ImageIcon(s);

        jLabel11.setIcon(casino);

        jLabel11.setVisible(true);
        start = 0; //to indicate the first round. 
    }


    private void newRoundGuiReset() {

        jLabel4.setIcon(myBet.getDeckCard().imageGetter());
        jLabel2.setIcon(myBet.getDeckCard().imageGetter());
        jLabel3.setIcon(myBet.getDeckCard().imageGetter());
        jLabel6.setText(myBet.getCurrTotal() + "");

        System.err.println("bet amount ffom Gui" + myBet.getBetAmount());

        this.jLabel10.setText(Integer.toString(myBet.getBetAmount()));

    }

    private void revealPlay() {
        System.err.println("here at reveal: ");
        ArrayList<Card> list = myBet.listgetter();
    
        if (myBet.getRoundResult()) {
            jLabel11.setText("You Win");

        } else {
            jLabel11.setText("You Lose");

        }
        jLabel4.setIcon(list.get(0).imageGetter());
        jLabel2.setIcon(list.get(1).imageGetter());
        jLabel3.setIcon(list.get(2).imageGetter());
        jLabel10.setText(myBet.getBetAmount() + "");
        if (myBet.getCurrTotal() == 0) {
            JOptionPane.showMessageDialog(null, "GAME OVER");
            System.exit(0);
          
        }
//          
    }

    private void comparePick(String choice) {

        this.jLabel6.setText(myBet.roundResults(choice) + "");
        revealPlay();

    }

    private void updateBet(int bet) {
        if (!myBet.roundInProgress()) {
            if (myBet.updateBetAmount(bet)) {

                this.jLabel10.setText(Integer.toString(myBet.getBetAmount()));
                this.jLabel6.setText(myBet.getCurrTotal() + "");
                jLabel11.setText("Ready?");
            } else {
                if (myBet.getCurrTotal() < 1) {
                    JOptionPane.showMessageDialog(null, "No more money");
                } else {
                    JOptionPane.showMessageDialog(null, "OPERATION NOT ALLOWED!");

                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "You Cannot Update Bet Now| Round in Progress");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(847, 548));
        setPreferredSize(new java.awt.Dimension(847, 548));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SimSun", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACE OF SPADES");
        add(jLabel1);
        jLabel1.setBounds(184, 15, 507, 46);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deck.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2);
        jLabel2.setBounds(340, 310, 160, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deck.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3);
        jLabel3.setBounds(570, 310, 160, 190);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deck.png"))); // NOI18N
        jLabel4.setText("jLabel2");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4);
        jLabel4.setBounds(90, 310, 160, 190);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Score: ");
        add(jLabel5);
        jLabel5.setBounds(38, 83, 49, 28);

        jLabel6.setText("0");
        add(jLabel6);
        jLabel6.setBounds(105, 79, 57, 37);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Play ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(322, 170, 183, 23);

        jLabel7.setText("Increase Betting Amount: ");
        add(jLabel7);
        jLabel7.setBounds(52, 126, 137, 16);

        jButton2.setText("$1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(34, 170, 55, 23);

        jButton3.setText("$5");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(107, 170, 55, 23);

        jButton4.setText("$10");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(180, 170, 55, 23);

        jLabel8.setText("Decrease Betting Amount: ");
        add(jLabel8);
        jLabel8.setBounds(585, 126, 141, 16);

        jButton5.setText("$1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(580, 170, 55, 23);

        jButton6.setText("$5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(652, 170, 55, 23);

        jButton7.setText("$10");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7);
        jButton7.setBounds(719, 170, 55, 23);

        jLabel9.setText("Current Bet:");
        add(jLabel9);
        jLabel9.setBounds(342, 122, 63, 25);

        jLabel10.setText("jLabel10");
        add(jLabel10);
        jLabel10.setBounds(436, 122, 61, 25);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Choose a Card");
        add(jLabel11);
        jLabel11.setBounds(180, 220, 468, 76);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        //intilizeSomeThings();
        if (myBet.roundInProgress())
            comparePick(myBet.listgetter().get(0).name);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if (myBet.roundInProgress())
            comparePick(myBet.listgetter().get(1).name);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (myBet.roundInProgress())
            comparePick(myBet.listgetter().get(2).name);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (!myBet.roundInProgress()) {
            if (start == 0) {
                JOptionPane.showMessageDialog(null, "Increase Bet to Begin");
                start = 10;
                return;

            } else if (myBet.getBetAmount() < 1) {
                JOptionPane.showMessageDialog(null, "Bet Amount Cannot be 0");
                return;
            }

            newRoundGuiReset();

            myBet.startRound();
            jLabel11.setIcon(null);
            jLabel11.setText("Choose a Card");
            jLabel11.setVisible(true);
           

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updateBet(1);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        updateBet(5);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        updateBet(10);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        updateBet(-1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        updateBet(-5);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        updateBet(-10);
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
