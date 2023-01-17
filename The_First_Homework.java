//the first homework
import java.util.Scanner;
import static java.lang.System.out;
class The_First_Homework 
{
    public static void main(String[] args)
    {
        int[]b= new int[100];
        Scanner scan = new Scanner(System.in);
         out.println("Enter the number of the heights:");
        int n=scan.nextInt();
        out.println("Now enter the heights:");
        for(int i=0;i<n;i++)
        b[i]=scan.nextInt();
        out.println("The answer is:"+height(b,n));

        out.println("Enter the number of the studentId:");
        n=scan.nextInt();
        String[]stud=new String[1001];
        out.println("Now enter the Ids(A number in a line):");
        //scan.next();
        for(int i=0;i<=n;i++)
        stud[i]=scan.nextLine();
        out.println("Now enter the Id you wanna check:");
        String sId=scan.nextLine();
        out.println("The answer is:"+studentId(stud,sId,n));
        scan.close();
    }
    public static double height(int[]a,int n)
    {
        double average=0;
        double sum=0;
        for(int i:a) sum+=i;
        average=sum/n;
        return average;
    }
    public static int studentId(String []stud,String sId,int n)
    {
        for(int i=1;i<=n;i++)
        {
           // out.println(stud[i]);
            if(stud[i].equals(sId)) return i-1;
        }
        return -1;
    }
}