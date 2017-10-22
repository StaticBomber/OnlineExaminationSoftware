
public class Test_Marks {
    private String name;
    private String ans;
    private String date;
    private int score;
    Test_Marks(String pname,String pans,String pdate,int pscore)
    {
        this.name=pname;
        this.ans=pans;
        this.date=pdate;
        this.score=pscore;
    }
    public String getname()
    {
        return name;
    }
    public String getans()
    {
        return ans;
    }
    public String getdate()
    {
        return date;
    }
    public int getscore()
    {
        return score;
    }
}
