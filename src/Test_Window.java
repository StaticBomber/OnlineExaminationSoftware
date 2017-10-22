
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Test_Window extends javax.swing.JFrame {

    /**
     * Creates new form Test_Window
     */
    public Test_Window() {
        initComponents();
        this.setTitle("Test Window");
        
        this.setLocationRelativeTo(null);
       
        
        
        
    }
    public int p,count=0;
    public ArrayList<Test_Question> list;
    public Test_Window(String s,String s2)
    {
        initComponents();
        list = universal.getList3("a"+s);
        p=list.size();
        hr=Integer.parseInt(list.get(0).gethr());
        min=Integer.parseInt(list.get(0).getmin());
        p1.setText(""+hr);
        p2.setText(""+min);
        p3.setText("0");
        t();
        this.setTitle("Test Window");
        this.setLocationRelativeTo(null);
        test_no.setText(s);
        roll_no.setText(s2);
        createansarray();
        createsubmit();
        DisplayCombo();
        showItem(0);
        
        
        
    }
    public int forward;
    
    public int backward;
    
    public int g=0;
    public int[] vec;
    public int[] submit;
    public int hr;
    public int min;
    
    public int[] final_ans;
    public int t1,t2,t3;
    public int f=0;
    
   public void t(){
        Timer timer;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
  @Override
  public void run() {
      t1=Integer.parseInt(p1.getText());
      t2=Integer.parseInt(p2.getText());
      t3=Integer.parseInt(p3.getText());
      if(t1==0&&t2==0&&t3==0)
      {
          f=9;
           jButton9.doClick();
           cancel();
      }
                
      else if(t3==0&&t2!=0)
                {
                   p2.setText(""+(t2-1));
                   p3.setText(""+59);
                }
      else  if(t2==0&&t3==0)
          {
              p1.setText(""+(t1-1));
              p2.setText(""+59);
              p3.setText(""+59);
          }
          
       
  else {
              p3.setText(""+(t3-1));
         }
  }
  
},1*1000, 1*1000);
        
    }
    public void createansarray(){
        vec = new int[p];
        
        for(int i=0;i<p;i++)
        {
            vec[i]=0;
        }
    }
    public void createsubmit(){
        submit = new int[p];
        
        for(int i=0;i<p;i++)
        {
            submit[i]=0;
        }
    }
    
    
    public void showItem(int i)
    {
        String a = "a"+test_no.getText();
        Box.setSelectedIndex(i);
        ArrayList<Test_Question> list =universal.getList3(a);
        txt1.setText(list.get(i).getquestionno()+"");
        txt2.setText(list.get(i).getquestion());
        txt3.setText(list.get(i).getoptiona());
        txt4.setText(list.get(i).getoptionb());
        txt5.setText(list.get(i).getoptionc());
        txt6.setText(list.get(i).getoptiond());
        w1.setText(""+list.get(i).getmaxmarks());
        txt2.setEditable(false);       
        
        if(submit[i]!=0||submit[i]==8){
            if(submit[i]==1)
            {
                txt3.setSelected(true);
            }
            else if(submit[i]==2)
            {
                txt4.setSelected(true);
            }
            else if(submit[i]==3)
            {
                txt5.setSelected(true);
            }
            else if(submit[i]==4)
            {
                txt6.setSelected(true);
            }
            txt3.setEnabled(false);
            txt4.setEnabled(false);
            txt5.setEnabled(false);
            txt6.setEnabled(false);
            
        }
        else if(vec[i]!=0){
            if(vec[i]==1)
            {
                txt3.setSelected(true);
            }
            else if(vec[i]==2)
            {
                txt4.setSelected(true);
            }
            else if(vec[i]==3)
            {
                txt5.setSelected(true);
            }
            else if(vec[i]==4)
            {
                txt6.setSelected(true);
            }
        }
    }
    public void DisplayCombo(){
      for(int i=1;i<=p;i++)
      {
          Box.addItem(i+"");
      }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Box = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        test_no = new javax.swing.JLabel();
        roll_no = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextArea();
        txt3 = new javax.swing.JRadioButton();
        txt4 = new javax.swing.JRadioButton();
        txt5 = new javax.swing.JRadioButton();
        txt6 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        w1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(637, 532));

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Timer");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Navigation");

        Box.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Test No");

        jButton7.setBackground(new java.awt.Color(128, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Go");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Roll No");

        jLabel6.setBackground(new java.awt.Color(248, 148, 6));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hr");

        jLabel7.setBackground(new java.awt.Color(248, 148, 6));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Min");

        jLabel8.setBackground(new java.awt.Color(248, 148, 6));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sec");

        p1.setBackground(new java.awt.Color(248, 148, 6));
        p1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText("Hr");

        p2.setBackground(new java.awt.Color(248, 148, 6));
        p2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setText("Hr");

        p3.setBackground(new java.awt.Color(248, 148, 6));
        p3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3.setText("Hr");

        test_no.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        test_no.setText("jLabel9");

        roll_no.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        roll_no.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Box, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(test_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roll_no, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(test_no, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roll_no, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));

        txt2.setBackground(new java.awt.Color(108, 122, 137));
        txt2.setColumns(20);
        txt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(228, 241, 254));
        txt2.setRows(5);
        jScrollPane1.setViewportView(txt2);

        buttonGroup1.add(txt3);
        txt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(236, 240, 241));
        txt3.setText("jRadioButton1");

        buttonGroup1.add(txt4);
        txt4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(236, 240, 241));
        txt4.setText("jRadioButton1");

        buttonGroup1.add(txt5);
        txt5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt5.setForeground(new java.awt.Color(236, 240, 241));
        txt5.setText("jRadioButton2");

        buttonGroup1.add(txt6);
        txt6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt6.setForeground(new java.awt.Color(236, 240, 241));
        txt6.setText("jRadioButton2");

        jButton3.setBackground(new java.awt.Color(0, 100, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 100, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Previous");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(139, 26, 26));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Submit and Next");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(139, 26, 26));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(128, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Cancel Test");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(128, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Submit Test");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(236, 240, 241));
        txt1.setText("No");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Question No:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("Max Marks:");

        w1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        w1.setForeground(new java.awt.Color(236, 240, 241));
        w1.setText("No");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt6)
                            .addComponent(txt5)
                            .addComponent(txt4)
                            .addComponent(txt3))
                        .addGap(457, 457, 457))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(w1)
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txt3)
                .addGap(18, 18, 18)
                .addComponent(txt4)
                .addGap(29, 29, 29)
                .addComponent(txt5)
                .addGap(26, 26, 26)
                .addComponent(txt6)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        forward = Integer.parseInt(txt1.getText())-1;
       
        if(forward==p-1)
        {
            JOptionPane.showMessageDialog(null, "This is last question.You May Submit Now");
        }
        else
        {
            forward++;
            buttonGroup1.clearSelection();
            showItem(forward);
        }
         if(submit[forward]==0)
        {
            txt3.setEnabled(true);
            txt4.setEnabled(true);
            txt5.setEnabled(true);
            txt6.setEnabled(true);
            
        }
        else
        {
            txt3.setEnabled(false);
            txt4.setEnabled(false);
            txt5.setEnabled(false);
            txt6.setEnabled(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        backward=Integer.parseInt(txt1.getText())-1;
        if(backward==0)
        {
            JOptionPane.showMessageDialog(null, "This is first question.");
        }
        else
        {
            backward--;
            buttonGroup1.clearSelection();
            showItem(backward);
            
        }
         if(submit[backward]==0)
        {
            txt3.setEnabled(true);
            txt4.setEnabled(true);
            txt5.setEnabled(true);
            txt6.setEnabled(true);
            
        }
        else
        {
            txt3.setEnabled(false);
            txt4.setEnabled(false);
            txt5.setEnabled(false);
            txt6.setEnabled(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       int m  = Integer.parseInt(txt1.getText());
        m=m-1;
        if(txt3.isSelected())
        {
            submit[m]=1;
            g=5;
        }
        else if(txt4.isSelected())
        {
            submit[m]=2;
            g=5;
        }
        else if(txt5.isSelected())
        {
            submit[m]=3;
            g=5;
        }
        else if(txt6.isSelected())
        {
            submit[m]=4;
            g=5;
        }
        else if(buttonGroup1.getSelection()==null){
            
            String a = "Submit without selection?";
            String b = "Alert";
            int reply = JOptionPane.showConfirmDialog(null,a,b,JOptionPane.YES_NO_OPTION);
            if(reply ==JOptionPane.YES_OPTION)
            {
               
                submit[m]=8;
                if(m==p-1)
                {
                    showItem(m);
                    JOptionPane.showMessageDialog(null, "This is last question");
            
                }
                else{
                    forward = Integer.parseInt(txt1.getText());
                    
                    buttonGroup1.clearSelection();
                    showItem(forward);
                }
            }
            
        }
        if(g==5){
        if(m==p-1)
        {
       
            showItem(m);
            JOptionPane.showMessageDialog(null, "This is last question");
            
        }
        else{
            
            forward = m+1;
            buttonGroup1.clearSelection();
            showItem(forward);
           
        }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int m  = Integer.parseInt(txt1.getText());
        m=m-1;
        if(txt3.isSelected())
        {
            vec[m]=1;
        }
        else if(txt4.isSelected())
        {
            vec[m]=2;
        }
        else if(txt5.isSelected())
        {
            vec[m]=3;
        }
        else if(txt6.isSelected())
        {
            vec[m]=4;
        }
     
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxActionPerformed
        
    }//GEN-LAST:event_BoxActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        buttonGroup1.clearSelection();
        int u = Integer.parseInt(Box.getItemAt(Box.getSelectedIndex()));
        showItem(u-1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int b= JOptionPane.showConfirmDialog(null, "Are you sure ? All your progress will be lost.","Alert",JOptionPane.YES_NO_OPTION);
        if(b==JOptionPane.YES_OPTION){
        Student_Options rgf=new Student_Options(roll_no.getText());
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int y=0;
        if(t1!=0||t2!=0||t3!=0){y=JOptionPane.showConfirmDialog(null,"Are you sure you want to sumit?","Alert",JOptionPane.YES_NO_OPTION);}
        String b="";
        String a="a"+test_no.getText();
        if(y==JOptionPane.YES_OPTION||f==9)
        {
            count++;
            final_ans = new int[p];
            for(int i=0;i<p;i++)
            {
                final_ans[i]=0;
            }
            for(int i=0;i<p;i++)
            {
                if(submit[i]!=0)
                {
                    final_ans[i]=submit[i];
                }
                else if(vec[i]!=0)
                {
                    final_ans[i]=vec[i];
                }
                b=b+final_ans[i];
                
            }
            ArrayList<Test_Question>  list =universal.getList3(a);
            int final_marks = 0;
            int right = 0;
            for(int i=0;i<p;i++)
            {
                
                if(list.get(i).getcorrectanswer()==final_ans[i])
                {
                    right++;
                    final_marks = final_marks + list.get(i).getmaxmarks();
                }
            }
            Object[] options = {"Go to Main Menu"};
            int v = JOptionPane.showOptionDialog(null, "Congrats your score is: "+final_marks,"Your Score",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,options,options[0]);
            if(v==0||v==JOptionPane.CLOSED_OPTION)
            {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                String q=dateFormat.format(date);
                String r="a"+roll_no.getText();
                //System.out.println(r);
                try{
                    
                    Connection con = universal.getConnection4();
                    PreparedStatement ps= con.prepareStatement("INSERT INTO "+r+"(Test_No,Your_Answer,Date,Your_Score)"+"values(?,?,?,?)");
                    ps.setString(1, test_no.getText());
                    ps.setString(2,b);
                    ps.setString(3,q);
                    ps.setInt(4, final_marks);
                    ps.executeUpdate();
                }catch(Exception e){
                
            }
                Student_Options rgf=new Student_Options(roll_no.getText());   
                rgf.setVisible(true); 
                rgf.pack();
                rgf.setLocationRelativeTo(null);   
                rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
        }
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
            java.util.logging.Logger.getLogger(Test_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Box;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel roll_no;
    private javax.swing.JLabel test_no;
    private javax.swing.JLabel txt1;
    private javax.swing.JTextArea txt2;
    private javax.swing.JRadioButton txt3;
    private javax.swing.JRadioButton txt4;
    private javax.swing.JRadioButton txt5;
    private javax.swing.JRadioButton txt6;
    private javax.swing.JLabel w1;
    // End of variables declaration//GEN-END:variables
}
