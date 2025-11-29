package newclassess;
interface ConferenceHall
{
    public void meetingdetails();
    public void meetingtime();
}
interface Mobile {
    public void calling_feature();
    public void app_installed();   
} 
abstract class ClassRoom
{
    public void normalmethod()
    {
        System.out.println("Normal Method");
    }
    abstract public void abstractmethod();
}
class Student extends ClassRoom implements ConferenceHall, Mobile
{
    private String sname;
    private int rn;
    private String mobilemodel;
    private int dt_booked;
    private String app_name;
    public Student(String sn,int rn, String mm, int dt, String app)
    {
        this.sname = sn;
        this.rn = rn;
        this.mobilemodel = mm;
        this.dt_booked = dt;
        this.app_name = app;
    }

 public void abstractmethod()
 {
    System.out.println("Abstract Method");
 }   
 public void meetingdetails()
 {
    System.out.println("Student Details" + sname);
    System.out.println("Student id" + rn);
 }
 public void meetingtime()
 {
    System.out.println("Meeting Time" + dt_booked);
 }
 public void calling_feature()
 {
    System.out.println("Good in" + mobilemodel);
 }
 public void app_installed()
 {
    System.out.println("App Installed"+app_name);
 }
}
public class InterfaceMain {
    public static void main(String[] args) {
    Student st1 = new Student("RJ",101,"Android",10,"Zoom");
    ClassRoom cr = new ClassRoom();
    ConferenceHall ch = new Student("RJ",101,"Android",10,"Zoom");
    st1.meetingdetails();
    st1.meetingtime();
    st1.calling_feature();
    st1.app_installed();
    st1.normalmethod();
    st1.abstractmethod();
    }
}
