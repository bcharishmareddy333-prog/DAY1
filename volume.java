import java.util.Scanner;
public class volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        double length= sc.nextDouble();
        System.out.print("Enter breadth:");
        double breadth= sc.nextDouble();
        System.out.print("Enter height:");
        double height= sc.nextDouble();
        double volume=length*breadth*height;
        System.out.println("volume:" + volume);
    }
}