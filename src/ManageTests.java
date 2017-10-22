
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ManageTests extends javax.swing.JPanel {
    public ManageTests() {
        initComponents();
    }
    public ManageTests(String s){
        initComponents();
        roll.setText(s);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roll1 = new javax.swing.JLabel();
        roll = new javax.swing.JLabel();
        roll2 = new javax.swing.JLabel();
        roll3 = new javax.swing.JLabel();
        roll4 = new javax.swing.JLabel();
        roll5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt2 = new javax.swing.JPasswordField();
        txt1 = new javax.swing.JPasswordField();
        txt3 = new javax.swing.JPasswordField();
        roll6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(1, 50, 67));
        setPreferredSize(new java.awt.Dimension(637, 532));

        roll1.setBackground(new java.awt.Color(1, 50, 67));
        roll1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll1.setForeground(new java.awt.Color(255, 255, 255));
        roll1.setText("Enter Current Password:");

        roll.setBackground(new java.awt.Color(1, 50, 67));
        roll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll.setForeground(new java.awt.Color(255, 255, 255));
        roll.setText("roll");

        roll2.setBackground(new java.awt.Color(1, 50, 67));
        roll2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll2.setForeground(new java.awt.Color(255, 255, 255));
        roll2.setText("Hello");

        roll3.setBackground(new java.awt.Color(1, 50, 67));
        roll3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll3.setForeground(new java.awt.Color(255, 255, 255));
        roll3.setText("Change Password:");

        roll4.setBackground(new java.awt.Color(1, 50, 67));
        roll4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll4.setForeground(new java.awt.Color(255, 255, 255));
        roll4.setText("Enter New Password:");

        roll5.setBackground(new java.awt.Color(1, 50, 67));
        roll5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll5.setForeground(new java.awt.Color(255, 255, 255));
        roll5.setText("Confirm Password:");

        jButton1.setBackground(new java.awt.Color(242, 38, 19));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt2.setBackground(new java.awt.Color(108, 122, 137));
        txt2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt2.setForeground(new java.awt.Color(228, 241, 254));
        txt2.setToolTipText("");
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt1.setBackground(new java.awt.Color(108, 122, 137));
        txt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(228, 241, 254));
        txt1.setToolTipText("");

        txt3.setBackground(new java.awt.Color(108, 122, 137));
        txt3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt3.setForeground(new java.awt.Color(228, 241, 254));
        txt3.setToolTipText("");

        roll6.setBackground(new java.awt.Color(1, 50, 67));
        roll6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll6.setForeground(new java.awt.Color(255, 255, 255));
        roll6.setText("Roll No:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roll3)
                            .addComponent(roll1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roll2)
                                .addGap(3, 3, 3)
                                .addComponent(roll6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(roll5)
                            .addComponent(roll4))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addComponent(txt2)
                        .addComponent(txt1)))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roll2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roll6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(roll3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roll1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roll4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roll5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
            //System.out.println(a);
            ArrayList<Student> list =universal.getList1();
            for(int i=0;i<list.size();i++)
            {
               
                if(list.get(i).getroll().equals(roll.getText()))
                {
                    d=list.get(i).getpassword();
                    //System.out.println("D is "+d);
                   
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
            Connection con=universal.getConnection1();
            try {
                    UpdateQuery = "Update student_data SET password=? WHERE roll=?";
                    ps=con.prepareStatement(UpdateQuery);
                    ps.setString(1,txt2.getText());
                    ps.setString(2,roll.getText());                    
                    ps.executeUpdate();                    
                    JOptionPane.showMessageDialog(null, "Password successfully updated.");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(ManageTests.class.getName()).log(Level.SEVERE, null, ex);
                }
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel roll;
    public static javax.swing.JLabel roll1;
    public static javax.swing.JLabel roll2;
    public static javax.swing.JLabel roll3;
    public static javax.swing.JLabel roll4;
    public static javax.swing.JLabel roll5;
    public static javax.swing.JLabel roll6;
    private javax.swing.JPasswordField txt1;
    private javax.swing.JPasswordField txt2;
    private javax.swing.JPasswordField txt3;
    // End of variables declaration//GEN-END:variables
}
