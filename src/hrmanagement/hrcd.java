/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author theam
 */
public class hrcd extends javax.swing.JFrame {

    /**
     * Creates new form hrcd
     */
    private static String cusername="";
    private static String cuserid="";

    public void OnStart(String ui, String un)
    {
        cusername=un;
        cuserid=ui;
        LoadDeps();
    }
    public hrcd() {
        initComponents();
    }
    void LoadDeps()
    {
        String[] s=null;
        int i=0;
        int ct=0;
        try
            {
                Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/hrmgmt","root",""); 
                
                Statement stmt=con.createStatement();
                String sql="select * from department";
                String c="select count(*) from department";
                ResultSet rsp=stmt.executeQuery(c);
                
                if(rsp.next())
                {
                    ct=Integer.parseInt(rsp.getString(1));
                    s=new String[ct];
                    ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    String id=rs.getString(1);
                    String name=rs.getString(2);
                    String ns=id;
                    s[i]=ns;
                    i++;
                }
                deptbox.setModel(new DefaultComboBoxModel<>(s));
                }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error "+e);
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

        jPanel1 = new javax.swing.JPanel();
        backb = new javax.swing.JLabel();
        midpan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deptbox = new javax.swing.JComboBox<>();
        checkb = new javax.swing.JLabel();
        deptl = new javax.swing.JLabel();
        deptlead = new javax.swing.JLabel();
        deptec = new javax.swing.JLabel();
        avgsal = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        backb.setBackground(new java.awt.Color(0, 102, 255));
        backb.setForeground(new java.awt.Color(255, 255, 255));
        backb.setText("     < BACK");
        backb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backb.setOpaque(true);
        backb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 410, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backb, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        midpan.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setText("Select department by id");

        deptbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        checkb.setBackground(new java.awt.Color(0, 102, 255));
        checkb.setForeground(new java.awt.Color(255, 255, 255));
        checkb.setText("       CHECK");
        checkb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkb.setOpaque(true);
        checkb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkbMouseClicked(evt);
            }
        });

        deptl.setText("Dept name");

        deptlead.setText("Department leader");

        deptec.setText("Employee count");

        avgsal.setText("Average Salary");

        javax.swing.GroupLayout midpanLayout = new javax.swing.GroupLayout(midpan);
        midpan.setLayout(midpanLayout);
        midpanLayout.setHorizontalGroup(
            midpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midpanLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(midpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deptl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(midpanLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deptbox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(deptlead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deptec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avgsal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        midpanLayout.setVerticalGroup(
            midpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midpanLayout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(midpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deptl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deptlead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deptec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avgsal)
                .addContainerGap())
        );

        getContentPane().add(midpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 440, 150));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrmanagement/hrback2.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 490, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbMouseClicked
        // TODO add your handling code here:
        hrmenu hr=new hrmenu();
        hr.OnStart(cuserid, cusername);
        hr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbMouseClicked

    private void checkbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbMouseClicked
        // TODO add your handling code here:
        String did=(String) deptbox.getSelectedItem();
        deptlead.setText("Department Leader : None");
        int salsum=0;
        int cnt=0;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/hrmgmt","root",""); 
                
                Statement stmt=con.createStatement();
                String sql="select u.username,u.role,u.deptid,u.salary,d.deptname from user u,department d where d.deptid='"+did+"'";
                
                        
                ResultSet rs=stmt.executeQuery(sql);
 
                while(rs.next())
                {
                    String role=rs.getString(2);
                    deptl.setText("Department name "+rs.getString(5));
                    if(role.equals("DL") && did.equals(rs.getString(3)))
                    {
                        deptlead.setText("Department Leader : "+rs.getString(1));
                        int csal=Integer.parseInt(rs.getString(4));
                        salsum+=csal;
                        cnt++;
                    }
                    else if(role.equals("E") && did.equals(rs.getString(3)))
                    {
                        int csal=Integer.parseInt(rs.getString(4));
                        salsum+=csal;
                        cnt++;
                    }
                    else if(role.equals("HR") && did.equals(rs.getString(3)))
                    {
                        int csal=Integer.parseInt(rs.getString(4));
                        salsum+=csal;
                        cnt++;
                    }
                    
                }
                deptec.setText("Employee count : "+cnt);
                int avg=0;
                if(salsum==0)
                {
                    avg=0;
                }
                else
                {
                    avg=salsum/cnt;
                }
                avgsal.setText("Average Salary : "+avg);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error(1) "+e);
        }
    }//GEN-LAST:event_checkbMouseClicked

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
            java.util.logging.Logger.getLogger(hrcd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrcd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrcd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrcd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hrcd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgsal;
    private javax.swing.JLabel backb;
    private javax.swing.JLabel background;
    private javax.swing.JLabel checkb;
    private javax.swing.JComboBox<String> deptbox;
    private javax.swing.JLabel deptec;
    private javax.swing.JLabel deptl;
    private javax.swing.JLabel deptlead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel midpan;
    // End of variables declaration//GEN-END:variables
}
