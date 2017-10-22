
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Update_Info_Form extends javax.swing.JFrame {
    public Update_Info_Form() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public String r;
    public Update_Info_Form(String s,String k)
    {
        initComponents();
        this.setLocationRelativeTo(null);
        txt9.setText(s);
        this.r=k;
        display();
    }

public void display(){
    ArrayList<Admin> list =universal.getList2();
    for(int i=0;i<list.size();i++)
    {
        if(list.get(i).getemail().equals(r)==true)
        {
            txt4.setText(list.get(i).getname());
            txt5.setText(list.get(i).getcontact());
            txt6.setText(list.get(i).getemail());
            txt7.setText(list.get(i).getsubject());
            txt6.setEnabled(false);
            break;
        }
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roll3 = new javax.swing.JLabel();
        roll1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JPasswordField();
        roll4 = new javax.swing.JLabel();
        txt2 = new javax.swing.JPasswordField();
        roll5 = new javax.swing.JLabel();
        txt3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        roll2 = new javax.swing.JLabel();
        roll6 = new javax.swing.JLabel();
        roll7 = new javax.swing.JLabel();
        roll8 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 50, 67));

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));

        roll3.setBackground(new java.awt.Color(1, 50, 67));
        roll3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll3.setForeground(new java.awt.Color(255, 255, 255));
        roll3.setText("Change Password:");

        roll1.setBackground(new java.awt.Color(1, 50, 67));
        roll1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll1.setForeground(new java.awt.Color(255, 255, 255));
        roll1.setText("Enter Current Password:");

        txt1.setBackground(new java.awt.Color(108, 122, 137));
        txt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(228, 241, 254));
        txt1.setToolTipText("");

        roll4.setBackground(new java.awt.Color(1, 50, 67));
        roll4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll4.setForeground(new java.awt.Color(255, 255, 255));
        roll4.setText("Enter New Password:");

        txt2.setBackground(new java.awt.Color(108, 122, 137));
        txt2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt2.setForeground(new java.awt.Color(228, 241, 254));
        txt2.setToolTipText("");
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        roll5.setBackground(new java.awt.Color(1, 50, 67));
        roll5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll5.setForeground(new java.awt.Color(255, 255, 255));
        roll5.setText("Confirm Password:");

        txt3.setBackground(new java.awt.Color(108, 122, 137));
        txt3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt3.setForeground(new java.awt.Color(228, 241, 254));
        txt3.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(242, 38, 19));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        roll2.setBackground(new java.awt.Color(1, 50, 67));
        roll2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll2.setForeground(new java.awt.Color(255, 255, 255));
        roll2.setText("Name:");

        roll6.setBackground(new java.awt.Color(1, 50, 67));
        roll6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll6.setForeground(new java.awt.Color(255, 255, 255));
        roll6.setText("Contact:");

        roll7.setBackground(new java.awt.Color(1, 50, 67));
        roll7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll7.setForeground(new java.awt.Color(255, 255, 255));
        roll7.setText("Email:");

        roll8.setBackground(new java.awt.Color(1, 50, 67));
        roll8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll8.setForeground(new java.awt.Color(255, 255, 255));
        roll8.setText("Subject:");

        txt4.setBackground(new java.awt.Color(108, 122, 137));
        txt4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt4.setForeground(new java.awt.Color(228, 241, 254));

        txt5.setBackground(new java.awt.Color(108, 122, 137));
        txt5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt5.setForeground(new java.awt.Color(228, 241, 254));

        txt6.setBackground(new java.awt.Color(108, 122, 137));
        txt6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt6.setForeground(new java.awt.Color(228, 241, 254));

        txt7.setBackground(new java.awt.Color(108, 122, 137));
        txt7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt7.setForeground(new java.awt.Color(228, 241, 254));

        jButton2.setBackground(new java.awt.Color(242, 38, 19));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(44, 62, 80));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Hello");

        txt9.setBackground(new java.awt.Color(44, 62, 80));
        txt9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt9.setForeground(new java.awt.Color(153, 0, 51));
        txt9.setText("Hello");

        jButton3.setBackground(new java.awt.Color(242, 38, 19));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Go to Admin Tasks");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roll8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roll3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(roll1)
                                    .addComponent(roll5)
                                    .addComponent(roll2)
                                    .addComponent(roll6)
                                    .addComponent(roll7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(roll4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt1)
                                        .addComponent(txt2)
                                        .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                                    .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                    .addComponent(txt5, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                    .addComponent(txt6, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roll3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roll1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roll4)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roll5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roll2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roll6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roll8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(roll7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One or more filed empty.");
        }
        else{
            String a=txt1.getText();
            String b=txt2.getText();
            String c=txt3.getText();
            String d = null;
            
            ArrayList<Admin> list =universal.getList2();
            AdminForm ad = new AdminForm();          
   
            System.out.println(r);
            for(int i=0;i<list.size();i++)
            {
                

                if(list.get(i).getemail().equals(r))
                {
                    d=list.get(i).getpassword();

                }
            }
            if(a.equals(d)==false){
                JOptionPane.showMessageDialog(null, "Current password wrong.");
            }
            else if(b.equals(c)==false){
                JOptionPane.showMessageDialog(null, "The two entered password do not match.");
            }
            else if(a.equals(d)&&b.equals(c))
            {

                String UpdateQuery = null;
                PreparedStatement ps=null;
                Connection con=universal.getConnection2();
                try {
                    UpdateQuery = "Update admin_data SET password=? WHERE email=?";
                    ps=con.prepareStatement(UpdateQuery);
                    ps.setString(1,txt2.getText());
                    ps.setString(2,r);

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Password successfully updated.");

                } catch (SQLException ex) {
                    Logger.getLogger(ManageTests.class.getName()).log(Level.SEVERE, null, ex);
                }
            }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String UpdateQuery = null;
            PreparedStatement ps=null;
            Connection con=universal.getConnection2();
            try {
                    UpdateQuery = "Update admin_data SET name = ?,contact=?,subject=? WHERE email=?";
                    ps=con.prepareStatement(UpdateQuery);
                    ps.setString(1,txt4.getText());
                    ps.setString(2, txt5.getText());
                    ps.setString(3,txt7.getText());
                 
                    ps.setString(4,r);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Info Updated Successfully!");
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_Make_Test.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String email = AdminForm.email;
        String name  = AdminForm.name;
        Admin_Tasks rgf=new Admin_Tasks(name,email);   //create new object of the window you want to open
        rgf.setVisible(true);   //makes it visible
        rgf.pack();
        rgf.setLocationRelativeTo(null);   //sets the location relative to current  component
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Info_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Info_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Info_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Info_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Info_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel roll1;
    public static javax.swing.JLabel roll2;
    public static javax.swing.JLabel roll3;
    public static javax.swing.JLabel roll4;
    public static javax.swing.JLabel roll5;
    public static javax.swing.JLabel roll6;
    public static javax.swing.JLabel roll7;
    public static javax.swing.JLabel roll8;
    private javax.swing.JPasswordField txt1;
    private javax.swing.JPasswordField txt2;
    private javax.swing.JPasswordField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JLabel txt9;
    // End of variables declaration//GEN-END:variables
}
