
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class universal {
    
public static Connection getConnection1()
    {
        Connection con=null;
        try {
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(universal.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
public static Connection getConnection2()
    {
        Connection con=null;
        try {
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/admin","root","");
            //JOptionPane.showMessageDialog(null,"Connected","Status",JOptionPane.INFORMATION_MESSAGE);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(universal.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
        
    }
public static Connection getConnection3()
    {
        Connection con=null;
        try {
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/tests","root","");
            //JOptionPane.showMessageDialog(null,"Connected","Status",JOptionPane.INFORMATION_MESSAGE);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(universal.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
        
    }
public static Connection getConnection4()
    {
        Connection con=null;
        try {
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/test_marks","root","");
            //JOptionPane.showMessageDialog(null,"Connected","Status",JOptionPane.INFORMATION_MESSAGE);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(universal.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
        
    }
public static ArrayList<Student> getList1(){
           ArrayList<Student> studentlist;
           studentlist = new ArrayList<Student>();
           Connection con = getConnection1();
           String query = "SELECT * FROM student_data";
        try {
         
            java.sql.Statement st;
            ResultSet rs;
            st=con.createStatement();
            rs=st.executeQuery(query);
            Student student;
            while(rs.next())
            {
                student = new Student(rs.getString("name"),rs.getString("roll"),rs.getString("contact"),rs.getString("email"),rs.getString("password"),rs.getString("Status"));
                studentlist.add(student);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student_Data_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentlist;
    }

public static ArrayList<Admin> getList2(){
           ArrayList<Admin> adminlist;
           adminlist = new ArrayList<Admin>();
           Connection con = getConnection2();
           String query = "SELECT * FROM admin_data";
        try {
         
            java.sql.Statement st;
            ResultSet rs;
            st=con.createStatement();
            rs=st.executeQuery(query);
            Admin admin;
            while(rs.next())
            {
                admin = new Admin(rs.getString("name"),rs.getString("contact"),rs.getString("email"),rs.getString("password"),rs.getString("subject"),rs.getString("Status"));
                adminlist.add(admin);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adminlist;
    }
public static ArrayList<Test_Question> getList3(String u){
           ArrayList<Test_Question> list;
           list = new ArrayList<Test_Question>();
           Connection con = getConnection3();
           String query = "SELECT * FROM "+u+" order by Question_No";
        try {
         
            java.sql.Statement st;
            ResultSet rs;
            st=con.createStatement();
            rs=st.executeQuery(query);
            Test_Question test;
            while(rs.next())
            {
                test = new Test_Question(Integer.parseInt(rs.getString("Question_No")),rs.getString("Question"),rs.getString("Option1"),rs.getString("Option2"),rs.getString("Option3"),rs.getString("Option4"),Integer.parseInt(rs.getString("Correct_Answer")),Integer.parseInt(rs.getString("MAX_MARKS")),rs.getString("hr"),rs.getString("min"));
                list.add(test);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Make_Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;  
        
        
    }
public static ArrayList<Test_Marks> getList4(String k){
           ArrayList<Test_Marks> list;
           list = new ArrayList<Test_Marks>();
           Connection con = getConnection4();
           String query = "SELECT * FROM "+k;
        try {
         
            java.sql.Statement st;
            ResultSet rs;
            st=con.createStatement();
            rs=st.executeQuery(query);
            Test_Marks test;
            while(rs.next())
            {
                test = new Test_Marks(rs.getString("Test_No"),rs.getString("Your_Answer"),rs.getString("Date"),Integer.parseInt(rs.getString("Your_Score")));
                list.add(test);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TestMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
//End of class 
