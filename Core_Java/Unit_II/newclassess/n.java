package newclassess;
class College
{
    private String name;
    private int collegeid;
    public College(String name,int cid)
    {
        this.name = name;
        this.collegeid = cid;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(collegeid);
    }
}

class student extends College
{
    private int mark;
    private  String sname;
    public student (String name,int cid,String sname,int mark){
        super(name, cid);
        this.sname = name;
        this.mark = mark;
    }
    public void display()
    {
        super.display();
        System.out.println(sname);
        System.out.println(mark);
    }
}

public class n
{
    public static void main(String[] arg)
    {
       student obj1 = new student("DMI",1202,"alice",80);
       student obj2 = new student("Loyola",1203,bob",90);
       obj1.display();
       obj2.display();
    }
}

