d

package ui;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Michel Thomas
 */
public class Main extends javax.swing.JFrame {
 private String actualKeyStrokes;
 private String obfuscatedKeyStrokes;
 private String validationSegmentKey;
 private String invalidKeyStrokes;
 private Robot bot;
 private boolean botInAction;
 private int botTypesRemaining;
    /**
     * Creates new form Main
     */
    public Main() throws AWTException {
        initComponents();
        actualKeyStrokes="";
        obfuscatedKeyStrokes="";
        validationSegmentKey="(";
        invalidKeyStrokes="";
        bot=new Robot();
        botInAction=false;
        botTypesRemaining=0;
         Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
       int w=this.getSize().width;
       int h=this.getSize().height;
       
        int x=(dim.width-w)/2;
        int y=(dim.height-h)/2;
       
       this.setLocation(x,y);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        actualKey = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        obfuscatedKey = new javax.swing.JTextArea();
        protection = new javax.swing.JRadioButton();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        validationSegment = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        invalidKey = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Obfuscator");

        actualKey.setEditable(false);
        actualKey.setColumns(20);
        actualKey.setRows(5);
        actualKey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                actualKeyKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(actualKey);

        obfuscatedKey.setEditable(false);
        obfuscatedKey.setColumns(20);
        obfuscatedKey.setRows(5);
        jScrollPane2.setViewportView(obfuscatedKey);

        protection.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        protection.setText("Obfuscation Protection");
        protection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                protectionActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel1.setText("Validation segment:");

        validationSegment.setEditable(false);
        validationSegment.setColumns(20);
        validationSegment.setRows(5);
        jScrollPane3.setViewportView(validationSegment);

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel2.setText("Obfuscated Keystrokes:");

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel3.setText("Actual Keystrokes:");

        invalidKey.setEditable(false);
        invalidKey.setColumns(20);
        invalidKey.setRows(5);
        jScrollPane4.setViewportView(invalidKey);

        jLabel4.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel4.setText("Invalid keystrokes(ROBOT):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(protection))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(protection))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void clearBoxes(){
        
       actualKey.setText("");
       actualKeyStrokes="";
       obfuscatedKey.setText("");
       obfuscatedKeyStrokes="";
       validationSegment.setText("");
       validationSegmentKey="";
       invalidKey.setText("");
       invalidKeyStrokes="";
       
                             }
    
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       clearBoxes();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void protectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_protectionActionPerformed
        clearBoxes();
        
    }//GEN-LAST:event_protectionActionPerformed

    private void actualKeyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actualKeyKeyTyped
      
    if(protection.isSelected()){ 
      if(!botInAction){
      actualKeyStrokes=actualKeyStrokes+evt.getKeyChar();
      actualKey.setText(actualKeyStrokes);
      obfuscatedKeyStrokes=obfuscatedKeyStrokes+evt.getKeyChar();  
        botInAction=true;  
        int charSetSize=((int)(Math.random()*4))+1;
        validationSegmentKey=validationSegmentKey+"("+obfuscatedKeyStrokes.length()+","; //starting point of bot typed character
        validationSegmentKey=validationSegmentKey+(obfuscatedKeyStrokes.length()+charSetSize-1)+")";
        validationSegment.setText(validationSegmentKey);
        
        botTypesRemaining=charSetSize;
        for(int count=0;count<charSetSize;count++){
            bot.keyPress(65);  //65 represents 'a' soon to be replaced with random alphanumeric and special symbol characters
            bot.keyRelease(65); // KeyStroke Dynamics
                                                 }
        
          
                       }
      else{
          obfuscatedKeyStrokes=obfuscatedKeyStrokes+evt.getKeyChar();
          invalidKeyStrokes=invalidKeyStrokes+evt.getKeyChar();
          obfuscatedKey.setText(obfuscatedKeyStrokes);
          invalidKey.setText(invalidKeyStrokes);
          if(--botTypesRemaining==0){
              botInAction=false;
              invalidKeyStrokes=invalidKeyStrokes+"-";
                                     }
          }
                                }
    else{
      actualKeyStrokes=actualKeyStrokes+evt.getKeyChar();
      actualKey.setText(actualKeyStrokes);
        }
    }//GEN-LAST:event_actualKeyKeyTyped

    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (AWTException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea actualKey;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea invalidKey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea obfuscatedKey;
    private javax.swing.JRadioButton protection;
    private javax.swing.JTextArea validationSegment;
    // End of variables declaration//GEN-END:variables
}
