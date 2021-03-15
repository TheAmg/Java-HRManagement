/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrmanagement;

/**
 *
 * @author theam
 */
public class empmenu extends javax.swing.JFrame {

    /**
     * Creates new form empmenu
     */
    private static String cusername="";
    private static String cuserid="";
    
    public void OnStart(String ui, String un)
    {
        cusername=un;
        cuserid=ui;
    }
    
    public empmenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simwrk = new javax.swing.JLabel();
        simwrk1 = new javax.swing.JLabel();
        simwrk2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logoutb = new javax.swing.JLabel();
        empbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setUndecorated(true);
        setSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        simwrk.setBackground(new java.awt.Color(0, 102, 255));
        simwrk.setForeground(new java.awt.Color(255, 255, 255));
        simwrk.setText("        UPDATE DETAILS");
        simwrk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simwrk.setOpaque(true);
        simwrk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simwrkMouseClicked(evt);
            }
        });
        getContentPane().add(simwrk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, 40));

        simwrk1.setBackground(new java.awt.Color(0, 102, 255));
        simwrk1.setForeground(new java.awt.Color(255, 255, 255));
        simwrk1.setText("        SIMULATE WORK");
        simwrk1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simwrk1.setOpaque(true);
        simwrk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simwrk1MouseClicked(evt);
            }
        });
        getContentPane().add(simwrk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 40));

        simwrk2.setBackground(new java.awt.Color(0, 102, 255));
        simwrk2.setForeground(new java.awt.Color(255, 255, 255));
        simwrk2.setText("        CHECK STATUS");
        simwrk2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simwrk2.setOpaque(true);
        simwrk2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simwrk2MouseClicked(evt);
            }
        });
        getContentPane().add(simwrk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 40));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        logoutb.setBackground(new java.awt.Color(0, 102, 255));
        logoutb.setForeground(new java.awt.Color(255, 255, 255));
        logoutb.setText("        LOGOUT");
        logoutb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutb.setOpaque(true);
        logoutb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 412, Short.MAX_VALUE)
                .addComponent(logoutb, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutb, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        empbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrmanagement/empback.jpg"))); // NOI18N
        getContentPane().add(empbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbMouseClicked
        // TODO add your handling code here:
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbMouseClicked

    private void simwrk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simwrk1MouseClicked
        // TODO add your handling code here:
        SimWork sw=new SimWork();
        sw.OnStart(cuserid, cusername);
        sw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_simwrk1MouseClicked

    private void simwrk2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simwrk2MouseClicked
        // TODO add your handling code here:
        Empcheckwork ec = new Empcheckwork();
        ec.OnStart(cuserid,cusername);
        ec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_simwrk2MouseClicked

    private void simwrkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simwrkMouseClicked
        // TODO add your handling code here:
        empupdate eu=new empupdate();
        eu.OnStart(cuserid,cusername);
        eu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_simwrkMouseClicked

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
            java.util.logging.Logger.getLogger(empmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empbackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutb;
    private javax.swing.JLabel simwrk;
    private javax.swing.JLabel simwrk1;
    private javax.swing.JLabel simwrk2;
    // End of variables declaration//GEN-END:variables
}