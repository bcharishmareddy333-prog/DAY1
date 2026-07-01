import java.util.Scanner;
public class subjects{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter s1:");
        int s1 = sc.nextInt();
        System.out.print("Enter s2:");
        int s2=sc.nextInt();
        System.out.print("Enter s3:");
        int s3=sc.nextInt();
        System.out.print("Enter s4:");
        int s4 =sc.nextInt();
        int total=s1+s2+s3+s4;
        double percentage=total/4.0;
        System.out.println("Total marks:"+total);
        System.out.println("Percentage:"+ percentage+"%");
    }
}