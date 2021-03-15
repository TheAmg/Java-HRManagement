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
public class hrce extends javax.swing.JFrame {

    /** Creates new form hrce */
    public hrce() {
        initComponents();
    }
    private static String cusername="";
    private static String cuserid="";

    public void OnStart(String ui, String un)
    {
        cusername=un;
        cuserid=ui;
        //JOptionPane.showMessageDialog(null,"before calling load ");
        Loadids();
    }
    
    void Loadids()
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
                String sql="select * from user where role='"+"E"+"' or role='"+"DL"+"'";
                String c="select count(*) from user where role='"+"E"+"' or role='"+"DL"+"'";
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
                empidbox.setModel(new DefaultComboBoxModel<>(s));
                }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error "+e);
            }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        empidbox = new javax.swing.JComboBox<>();
        nml = new javax.swing.JLabel();
        dpl = new javax.swing.JLabel();
        roll = new javax.swing.JLabel();
        totwork = new javax.swing.JLabel();
        checkb = new javax.swing.JLabel();
        sall = new javax.swing.JLabel();
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
                .addGap(0, 320, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backb, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setText("Select Employee by ID");

        empidbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nml.setText("Name");

        dpl.setText("Department");

        roll.setText("Role");

        totwork.setText("Total Work hours");

        checkb.setBackground(new java.awt.Color(0, 102, 255));
        checkb.setForeground(new java.awt.Color(255, 255, 255));
        checkb.setText("      CHECK");
        checkb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkb.setOpaque(true);
        checkb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkbMouseClicked(evt);
            }
        });

        sall.setText("Salary");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(empidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totwork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dpl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkb)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nml)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dpl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totwork)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sall)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 180));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrmanagement/hrback2.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbMouseClicked
        // TODO add your handling code here:
        hrmenu hr = new hrmenu();
        hr.OnStart(cuserid, cusername);
        hr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbMouseClicked

    private void checkbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbMouseClicked
        // TODO add your handling code here:
        //code to check details of each employee
        String eid=(String) empidbox.getSelectedItem();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/hrmgmt","root",""); 
                
                Statement stmt=con.createStatement();
                String sql="select u.username,u.role,u.deptid,u.salary,w.totalwork from user u,worktbl w where u.userid='"+eid+"'";
                
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next())
                {
                    nml.setText("Name "+rs.getString(1));
                    String ro=rs.getString(2);
                    String fr="";
                    if(ro.equals("E"))
                    {
                        fr="Employee";
                    }
                    else if(ro.equals("DL"))
                    {
                        fr="Department leader";
                    }
                    roll.setText("Role: "+fr);
                        
                    String deptid=rs.getString(3);
                    dpl.setText("Department id: "+deptid);
                    String salary=rs.getString(4);
                    sall.setText("Salary :"+salary);
                    String wh=rs.getString(5);
                    totwork.setText("Total workhours : "+wh);
                }
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
            java.util.logging.Logger.getLogger(hrce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hrce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backb;
    private javax.swing.JLabel background;
    private javax.swing.JLabel checkb;
    private javax.swing.JLabel dpl;
    private javax.swing.JComboBox<String> empidbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nml;
    private javax.swing.JLabel roll;
    private javax.swing.JLabel sall;
    private javax.swing.JLabel totwork;
    // End of variables declaration//GEN-END:variables

}
