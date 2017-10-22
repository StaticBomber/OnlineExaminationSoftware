/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan Ishwarkar
 */
public class Student {
    private String name; 
    private String roll ;
    private String contact;
    private String email;
    private String password;
    private String Status;
    public Student(String pname,String proll,String pcontact,String pemail,String ppassword,String pStatus)
    {
        this.name=pname;
        this.roll=proll;
        this.contact=pcontact;
        this.email=pemail;
        this.password=ppassword;
        this.Status=pStatus;
        
    }    
    public String getname()
    {
        return name;
    }
    public String getroll()
    {
        return roll;
    }
    public String getcontact()
    {
        return contact;
    }
    public String getemail()
    {
        return email;
    }
    public String getpassword()
    {
        return password;
    }
    public String getstatus()
    {
        return Status;
    }
}


