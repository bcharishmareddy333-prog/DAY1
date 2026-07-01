import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        double a= sc.nextDouble();
        System.out.print("Enter b:");
        double b= sc.nextDouble();
        System.out.print("Enter c:");
        double c= sc.nextDouble();
        System.out.println("Average:" + ((a+b+c)/3));
    }
}
