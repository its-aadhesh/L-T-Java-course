package inheritance_lesson;
class College {
    String college_name;
    protected String branch;
    protected String college_location;
    College(String cn, String b, String cl)
    {
        this.college_name = cn;
        this.branch = b;
        this.college_location = cl;
    }
    void display()
    {
        System.out.println("College Name : "+college_name);
        System.out.println("Branch : "+branch);
        System.out.println("Location : "+college_location);
    }
}
class Teacher extends College{
    String name;
    String designation;
    String education_qualification;
    int experience;
    Teacher(String college_name, String branch, String college_location, String n,String des, String edu_q, int exp )
    {
        super(college_name,branch,college_location);
        this.name = n;
        this.designation = des;
        this.education_qualification = edu_q;
        this.experience = exp;
    }
    void display_info()
    {
        super.display();
        System.out.println("Designation : "+designation);
        System.out.println("Education Qualification : "+education_qualification);
        System.out.println("Designation : "+designation);
    }
}
class Student extends College {
    String nname;
    int year;
    int register_number;
    Student(String college_name, String branch, String college_location, String nn, int yr, int regno)
    {
        super(college_name, branch, college_location);
        this.nname = nn;
        this.year = yr;
        this.register_number =regno;
    }
    void display_info()
    {
        super.display();
        System.out.println("Name : "+nname);
        System.out.println("Year of Study : "+year+"st Year");
        System.out.println("Register Number: "+register_number);
    }
}
public class inheritance{
    public static void main(String[] args) {
        Student s1 = new Student("DMI","Engineering","Poonamallee","Aadhesh",1,001);
        s1.display_info();
        System.out.println("----------------------");
        Teacher t1 = new Teacher("SRM","Engineering","Ramapuram","Mr. Karthik","Dean of Student Affairs","PHD in Computerscience Engineering",10);
        t1.display_info();
        System.out.println("----------------------");
        College c = new College("REC", "Engineering", "Chennai");
        c.display();
    }
}