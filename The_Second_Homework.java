//the second homework
import java.util.*;
import static java.lang.System.out;
class The_Second_Homework
{
   public static void main(String[] args)
   {
        Scanner scan =new Scanner(System.in);
        Student[]student_list=new Student[1001];
        int n;
        out.println("Enter the number of the students");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            scan.nextLine();
            out.println("Student"+i+":");
            String name=scan.nextLine();
            String id=scan.nextLine();
            double grade=scan.nextDouble();
            boolean isOff=scan.nextBoolean();
            student_list[i]=new Student(name,id,grade,isOff);
        }
        Student.unpassedList(student_list,n);
        scan.close();
    }
}
class Student
{
    private String id,name;
    private double grade;
    private boolean isOff;
    public Student(String name,String id,double grade,Boolean isOff)
    {
        this.name=name;
        this.id=id;
        this.grade=grade;
        this.isOff=isOff;
    }
    public static void update(Student s1,double new_grade)
    {
        if(!s1.getOff()&&new_grade<=100&&(int)new_grade==new_grade)
        {
            s1.setGrade(new_grade);
            out.println("successful!");
        }
       else out.println("Error!");
    }
    public String toString()
    {
        return "student "+"name = "+getName()+"\r\n"+
                "id = "+getId()+"\r\n"+
                "grade = "+getGrade()+"\r\n"+
                "isOff = "+getOff();
    }
    public boolean isPassed()
    {
        if(getGrade()<60) return false;
        return true;
    }
    public static void unpassedList(Student s1[],int n)
    {
        int book=0;
        for(int i=1;i<=n;i++)
        {
            if(s1[i].getGrade()<60&&!s1[i].getOff())
            {
                book=1;
                out.println("failed student:"+"\r\n"+s1[i].toString());
            }
            else if(s1[i].getOff())
            {
                book=1;
                out.println("off-school student:"+"\r\n"+s1[i].toString());
            }
        }
        if(book==0)
        {
            out.println("all is passed!");
        }
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setGrade(double grade)
    {
        this.grade = grade;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setOff(boolean isOff)
    {
        this.isOff = isOff;
    }
    public double getGrade()
    {
        return grade;
    }
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public boolean getOff()
    {
        return isOff;
    }

}
