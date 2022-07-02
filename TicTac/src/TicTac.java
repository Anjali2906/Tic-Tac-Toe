
import java.awt.Color;
import static java.awt.Color.GRAY;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TicTac extends javax.swing.JFrame {

    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    boolean checker;
    
    public TicTac() {
        initComponents();
    }
    
    private void gameScore(){
        jblplayer1.setText(String.valueOf(xCount));
        jLabel3.setText(String.valueOf(oCount));
        
    }
    private void choose_a_player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame="0";
        }else{
            startGame="X";
        }
    }
    private void winningGame(){
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        String b4=jButton4.getText();
        String b5=jButton5.getText();
        String b6=jButton6.getText();
        String b7=jButton7.getText();
        String b8=jButton8.getText();
        String b9=jButton9.getText();
        if(b2==("X")&&b3==("X")&&b4==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton2.setBackground(Color.ORANGE);
             jButton3.setBackground(Color.ORANGE);
             jButton4.setBackground(Color.ORANGE);
             xCount++;
             gameScore();
        }
        
        if(b5==("X")&&b6==("X")&&b7==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton5.setBackground(Color.CYAN);
             jButton6.setBackground(Color.CYAN);
             jButton7.setBackground(Color.CYAN);
             xCount++;
             gameScore();
        }
        if(b8==("X")&&b9==("X")&&b1==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton8.setBackground(Color.GREEN);
             jButton9.setBackground(Color.GREEN);
             jButton1.setBackground(Color.GREEN);
             xCount++;
             gameScore();
        }
        if(b2==("X")&&b5==("X")&&b8==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton2.setBackground(Color.PINK);
             jButton5.setBackground(Color.PINK);
             jButton8.setBackground(Color.PINK);
             xCount++;
             gameScore();
        }
        if(b4==("X")&&b7==("X")&&b1==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton4.setBackground(Color.YELLOW);
             jButton7.setBackground(Color.YELLOW);
             jButton1.setBackground(Color.YELLOW);
             xCount++;
             gameScore();
        }
        
        if(b3==("X")&&b6==("X")&&b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton3.setBackground(Color.BLUE);
             jButton6.setBackground(Color.BLUE);
             jButton9.setBackground(Color.BLUE);
             xCount++;
             gameScore();
        }
        
        
        
        if(b2==("X")&&b6==("X")&&b1==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton2.setBackground(Color.MAGENTA);
             jButton6.setBackground(Color.MAGENTA);
             jButton1.setBackground(Color.MAGENTA);
             xCount++;
             gameScore();
        }
        if(b4==("X")&&b6==("X")&&b8==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton4.setBackground(Color.RED);
             jButton6.setBackground(Color.RED);
             jButton8.setBackground(Color.RED);
             xCount++;
             gameScore();
        }
        
        
        
        if(b2==("0")&&b3==("0")&&b4==("0")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton2.setBackground(Color.ORANGE);
             jButton3.setBackground(Color.ORANGE);
             jButton4.setBackground(Color.ORANGE);
             oCount++;
             gameScore();
        }
        
        if(b5==("0")&&b6==("0")&&b7==("0")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton5.setBackground(Color.CYAN);
             jButton6.setBackground(Color.CYAN);
             jButton7.setBackground(Color.CYAN);
             oCount++;
             gameScore();
        }
        if(b8==("0")&&b9==("0")&&b1==("0")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton8.setBackground(Color.GREEN);
             jButton9.setBackground(Color.GREEN);
             jButton1.setBackground(Color.GREEN);
             oCount++;
             gameScore();
        }
         if(b2==("0")&&b5==("0")&&b8==("0")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton2.setBackground(Color.PINK);
             jButton5.setBackground(Color.PINK);
             jButton8.setBackground(Color.PINK);
             oCount++;
             gameScore();
        }
        if(b4==("0")&&b7==("0")&&b1==("0")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton4.setBackground(Color.YELLOW);
             jButton7.setBackground(Color.YELLOW);
             jButton1.setBackground(Color.YELLOW);
             oCount++;
             gameScore();
        }
        
        if(b3==("0")&&b6==("0")&&b9==("0")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton3.setBackground(Color.BLUE);
             jButton6.setBackground(Color.BLUE);
             jButton9.setBackground(Color.BLUE);
             oCount++;
             gameScore();
        }
        if(b2==("0")&&b6==("0")&&b1==("0")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton2.setBackground(Color.MAGENTA);
             jButton6.setBackground(Color.MAGENTA);
             jButton1.setBackground(Color.MAGENTA);
             oCount++;
             gameScore();
        }
        if(b4==("0")&&b6==("0")&&b8==("0")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jButton4.setBackground(Color.RED);
             jButton6.setBackground(Color.RED);
             jButton8.setBackground(Color.RED);
             oCount++;
             gameScore();
        }
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jblplayer1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 180, 120));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 140));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton3.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 170, 140));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton4.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 180, 140));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton5.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton5.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 120));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton6.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 170, 120));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton7.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton7.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 180, 120));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton8.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton8.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton8.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 180, 120));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton9.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton9.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton9.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 170, 120));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 610, 480));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(95, 158, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 580, 480));

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 580, 480));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Player 0");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");
        jLabel3.setOpaque(true);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 270, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("Player X");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, 270, 80));

        jblplayer1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jblplayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblplayer1.setText("0");
        jblplayer1.setToolTipText("");
        jblplayer1.setOpaque(true);
        jPanel4.add(jblplayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 270, 80));

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 560, 220));

        jPanel9.setBackground(new java.awt.Color(95, 158, 160));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(95, 158, 160));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 580, 480));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton10.setText("jButton1");
        jButton10.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton10.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton10.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 180, 120));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton11.setText("jButton1");
        jButton11.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton11.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 180, 120));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton12.setText("jButton1");
        jButton12.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton12.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton12.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 180, 120));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton13.setText("New Game");
        jButton13.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton13.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 90));

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton14.setText("Reset");
        jButton14.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton14.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton14.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 280, 90));

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton15.setText("Exit");
        jButton15.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton15.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton15.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 240, 90));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 560, 220));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 580, 480));

        jPanel11.setBackground(new java.awt.Color(95, 158, 160));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(95, 158, 160));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 580, 480));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("                           Tic Tac Toe Game");
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, -24, 1150, 120));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1170, 90));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker=false;
        }else{
            checker=true;
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jLabel3.setText("0");
        jblplayer1.setText("0");
        
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker=false;
        }else{
            checker=true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker=false;
        }else{
            checker=true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker=false;
        }else{
            checker=true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker=false;
        }else{
            checker=true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker=false;
        }else{
            checker=true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker=false;
        }else{
            checker=true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker=false;
        }else{
            checker=true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker=false;
        }else{
            checker=true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jblplayer1;
    // End of variables declaration//GEN-END:variables
}
