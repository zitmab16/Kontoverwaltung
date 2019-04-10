
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vizug
 */
public class KontoGUI extends javax.swing.JFrame {

    private DefaultListModel model = new DefaultListModel();
    private Account a;

    /**
     * Creates new form KontoGUI
     */
    public KontoGUI() {
        initComponents();
        liUsers.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmUser = new javax.swing.JPopupMenu();
        miAddUser = new javax.swing.JMenuItem();
        miPerformAccTest = new javax.swing.JMenuItem();
        pmKonto = new javax.swing.JPopupMenu();
        miAddAcc = new javax.swing.JMenuItem();
        lbUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liUsers = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        taLogOutput = new javax.swing.JTextArea();
        lbLogOutput = new javax.swing.JLabel();
        lbAccount = new javax.swing.JLabel();
        lbBalance = new javax.swing.JLabel();

        miAddUser.setText("add user");
        miAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddUserActionPerformed(evt);
            }
        });
        pmUser.add(miAddUser);

        miPerformAccTest.setText("perform account test");
        miPerformAccTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPerformAccTestActionPerformed(evt);
            }
        });
        pmUser.add(miPerformAccTest);

        miAddAcc.setText("add account");
        miAddAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddAccActionPerformed(evt);
            }
        });
        pmKonto.add(miAddAcc);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbUser.setText("User");

        liUsers.setComponentPopupMenu(pmUser);
        jScrollPane1.setViewportView(liUsers);

        taLogOutput.setColumns(20);
        taLogOutput.setRows(5);
        taLogOutput.setComponentPopupMenu(pmKonto);
        jScrollPane2.setViewportView(taLogOutput);

        lbLogOutput.setText("Log-Output");

        lbAccount.setText("Account");

        lbBalance.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbLogOutput)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUser)
                    .addComponent(lbLogOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAccount)
                    .addComponent(lbBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAddAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddAccActionPerformed
        a = new Account(50);
        lbBalance.setText("" + a.getBalance() + " Euro");
    }//GEN-LAST:event_miAddAccActionPerformed

    private void miAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddUserActionPerformed
        String username = JOptionPane.showInputDialog("Bitte Username eingeben:");
        AccountUser user = new AccountUser(a, username, this);
        model.addElement(user);
    }//GEN-LAST:event_miAddUserActionPerformed

    private void miPerformAccTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerformAccTestActionPerformed
        int[] idx =liUsers.getSelectedIndices();
        AccountUser user =null;
        for (int i : idx) {
            user=(AccountUser) model.get(i);
            user.start();
        }
        
        for(int i =1;i<idx.length-1;i++){
            
        }
//           AccountUser user =(AccountUser) model.get(liUsers.getSelectedIndex());
//           user.start();
            
    }//GEN-LAST:event_miPerformAccTestActionPerformed

    public void updateTextArea(String text) {
        taLogOutput.append(text);
    }

    public void updateBalance(int balance) {
        lbBalance.setText("" + balance + " Euro");
    }

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
            java.util.logging.Logger.getLogger(KontoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KontoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KontoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KontoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KontoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbBalance;
    private javax.swing.JLabel lbLogOutput;
    private javax.swing.JLabel lbUser;
    private javax.swing.JList<String> liUsers;
    private javax.swing.JMenuItem miAddAcc;
    private javax.swing.JMenuItem miAddUser;
    private javax.swing.JMenuItem miPerformAccTest;
    private javax.swing.JPopupMenu pmKonto;
    private javax.swing.JPopupMenu pmUser;
    private javax.swing.JTextArea taLogOutput;
    // End of variables declaration//GEN-END:variables
}
