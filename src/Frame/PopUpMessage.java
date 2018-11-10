package Frame;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PopUpMessage extends javax.swing.JFrame implements Runnable {

    private int time;
    
    public PopUpMessage(int time, String label) {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        this.time = time;
        this.label.setText(label);
        startMessage();
    }
    
    private void startMessage(){
        Thread t = new Thread(this);t.start();
    }

    @Override
    public void run() {
        try {
            this.setVisible(true);
            Thread.sleep(time);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(PopUpMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables

}
