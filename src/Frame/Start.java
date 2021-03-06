package Frame;

import Logic.*;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    public Start() {
        setIconImage(Static.getIconImage());
        initComponents();
        setLocationRelativeTo(null);
        setTitle(Static.title);
        versionLabel.setText(Static.version);
        HoursTxt.setText("0");
        MinutesTxt.setText("0");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HoursTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ExecuteBot = new javax.swing.JButton();
        cancelShutdownBot = new javax.swing.JButton();
        versionLabel = new javax.swing.JLabel();
        upHours = new javax.swing.JButton();
        downHours = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MinutesTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        upMinutes = new javax.swing.JButton();
        downMinutes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        Github = new javax.swing.JLabel();
        allliks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("<html>Timer<br>   Shutdown</html>");

        HoursTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HoursTxtKeyTyped(evt);
            }
        });

        ExecuteBot.setText("Execute");
        ExecuteBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteBotActionPerformed(evt);
            }
        });

        cancelShutdownBot.setText("Cancel shudown");
        cancelShutdownBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelShutdownBotActionPerformed(evt);
            }
        });

        versionLabel.setText("version");

        upHours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/up.jpg"))); // NOI18N
        upHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upHoursActionPerformed(evt);
            }
        });

        downHours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/down.jpg"))); // NOI18N
        downHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downHoursActionPerformed(evt);
            }
        });

        jLabel2.setText("Hours");

        MinutesTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MinutesTxtKeyTyped(evt);
            }
        });

        jLabel3.setText("Minutes");

        upMinutes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/up.jpg"))); // NOI18N
        upMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upMinutesActionPerformed(evt);
            }
        });

        downMinutes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/down.jpg"))); // NOI18N
        downMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMinutesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(versionLabel))
                        .addComponent(cancelShutdownBot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExecuteBot, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MinutesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upHours, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downHours, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(versionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upHours, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downHours))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MinutesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(upMinutes))
                    .addComponent(downMinutes))
                .addGap(18, 18, 18)
                .addComponent(ExecuteBot)
                .addGap(18, 18, 18)
                .addComponent(cancelShutdownBot)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/splitvice_low.png"))); // NOI18N

        jLabel5.setText("Made by:");

        twitter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        twitter.setText("<html><a href=\"http://www.google.com\">Twitter</a></html>");
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });

        Github.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Github.setText("<html><a href=\"http://www.google.com\">Github</a></html>");
        Github.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GithubMouseClicked(evt);
            }
        });

        allliks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        allliks.setText("<html><a href=\"http://www.google.com\">Website</a></html>");
        allliks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allliksMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allliks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allliks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HoursTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HoursTxtKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || HoursTxt.getText().length() == 4) {
            evt.consume();
        } else {
            if (!HoursTxt.getText().equals("")) {
                if (HoursTxt.getText().charAt(0) == '0') {
                    evt.consume();
                    HoursTxt.setText("" + c);
                }
            }
        }
    }//GEN-LAST:event_HoursTxtKeyTyped

    private void cancelShutdownBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelShutdownBotActionPerformed
        try {
            Static.cancelShutdown();
            HoursTxt.setText("0");
            MinutesTxt.setText("0");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Uknown error when trying to cancel shutdown.", "ERROR", 0);
        }
    }//GEN-LAST:event_cancelShutdownBotActionPerformed

    private void upHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upHoursActionPerformed
        try {
            if (HoursTxt.getText().equals("")) {
                HoursTxt.setText("1");
            } else {
                int n = Integer.parseInt(HoursTxt.getText());
                n = n + 1;
                HoursTxt.setText("" + n);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_upHoursActionPerformed

    private void downHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downHoursActionPerformed
        try {
            if (HoursTxt.getText().equals("")) {
                HoursTxt.setText("1");
            } else if (Integer.parseInt(HoursTxt.getText()) != 0) {
                int n = Integer.parseInt(HoursTxt.getText());
                n = n - 1;
                HoursTxt.setText("" + n);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_downHoursActionPerformed

    private void upMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upMinutesActionPerformed
        try {
            if (MinutesTxt.getText().equals("")) {
                MinutesTxt.setText("1");
            } else {
                int n = Integer.parseInt(MinutesTxt.getText());
                n = n + 1;
                MinutesTxt.setText("" + n);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_upMinutesActionPerformed

    private void downMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMinutesActionPerformed
        try {
            if (MinutesTxt.getText().equals("")) {
                MinutesTxt.setText("1");
            } else if (Integer.parseInt(MinutesTxt.getText()) != 0) {
                int n = Integer.parseInt(MinutesTxt.getText());
                n = n - 1;
                MinutesTxt.setText("" + n);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_downMinutesActionPerformed

    private void MinutesTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MinutesTxtKeyTyped
        char r = evt.getKeyChar();
        if (!(Character.isDigit(r)) || r == KeyEvent.VK_BACK_SPACE || r == KeyEvent.VK_DELETE || MinutesTxt.getText().length() == 2) {
            evt.consume();
        } else {
            if (!MinutesTxt.getText().equals("")) {
                if (MinutesTxt.getText().charAt(0) == '0') {
                    evt.consume();
                    MinutesTxt.setText("" + r);
                }
            }
        }
    }//GEN-LAST:event_MinutesTxtKeyTyped

    private void ExecuteBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteBotActionPerformed
        nullTextFieldsChecker();
        if (HoursTxt.getText().charAt(0) != '0' || MinutesTxt.getText().charAt(0) != '0') {
            int time = secondsConverter(Integer.parseInt(MinutesTxt.getText()), Integer.parseInt(HoursTxt.getText()));
            HoursTxt.setText("0");
            MinutesTxt.setText("0");
            Static.cancelShutdown();
            Wait wait = new Wait(Static.defaultTimeToExecuteWait);
            wait.start();
            try {
                wait.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }
            Static.Shutdown(time);

        } else {
            System.out.println("TWO ZERO");
            HoursTxt.setText("0");
            MinutesTxt.setText("0");
        }
    }//GEN-LAST:event_ExecuteBotActionPerformed

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("http://split-vice.com/s/twitter/"));
            } catch (IOException | URISyntaxException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_twitterMouseClicked

    private void GithubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GithubMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("http://split-vice.com/s/github-repos"));
            } catch (IOException | URISyntaxException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_GithubMouseClicked

    private void allliksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allliksMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://split-vice.com/technology/java/timer-shutdown/"));
            } catch (IOException | URISyntaxException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_allliksMouseClicked

    private int secondsConverter(int minutes, int hours) {
        String minutesS = "" + minutes;
        String hoursS = "" + hours;
        System.out.println("minutes= " + minutesS);
        System.out.println("hours= " + hoursS);
        PopUpMessage p = new PopUpMessage(Static.timeForPopUpMessages, "Time: hours=" + hoursS + " minutes=" + minutesS);
        int time = 0;
        if (minutes != 0 && minutesS.charAt(0) != '0') {
            time += (60 * minutes);
        }
        if (hours != 0 && hoursS.charAt(0) != '0') {
            time += (60 * 60 * hours);
        }
        if (time == 0) {
            System.out.println("TIME IS ZERO!! REVALUED AS 60");
            time = 60;
        }
        System.out.println("Seconds: ... " + time);
        return time;
    }

    private void nullTextFieldsChecker() {
        if (MinutesTxt.getText().equals("")) {
            MinutesTxt.setText("0");
        }
        if (HoursTxt.getText().equals("")) {
            HoursTxt.setText("0");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExecuteBot;
    private javax.swing.JLabel Github;
    private javax.swing.JTextField HoursTxt;
    private javax.swing.JTextField MinutesTxt;
    private javax.swing.JLabel allliks;
    private javax.swing.JButton cancelShutdownBot;
    private javax.swing.JButton downHours;
    private javax.swing.JButton downMinutes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel twitter;
    private javax.swing.JButton upHours;
    private javax.swing.JButton upMinutes;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables

}
