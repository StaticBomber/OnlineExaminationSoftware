/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan Ishwarkar
 */
public class Test_Question {
    private int Question_No;
    private String Question;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String OptionD;
    
   private int correct_ans;
    private int max_marks;
    private String hr;
    private String min;
    Test_Question(int pQuestion_No,String pQuestion,String pOptionA,String pOptionB,String pOptionC,String pOptionD,int pcorrect_ans,int pmax_marks,String phr,String pmin){
         this.Question_No=pQuestion_No;
         this.Question = pQuestion;
         this.OptionA = pOptionA;
         this.OptionB = pOptionB;
         this.OptionC= pOptionC;
         this.OptionD= pOptionD;
         this.correct_ans= pcorrect_ans;
         this.max_marks=pmax_marks;
         this.hr=phr;
         this.min=pmin;
      
         
         
    }
    public int getquestionno(){
        return Question_No;
    }
    public String getquestion(){
        return Question;
    }
    public String getoptiona(){
        return OptionA;
    }
    public String getoptionb(){
        return OptionB;
    }
    public String getoptionc(){
        return OptionC;
    }
    public String getoptiond(){
        return OptionD;
    }
    public int getcorrectanswer(){
        return correct_ans;
    }
    public int getmaxmarks(){
        return max_marks;
    }
    public String gethr(){
        return hr;
    }
    
    public String getmin(){
        return min;
    }
    
}
