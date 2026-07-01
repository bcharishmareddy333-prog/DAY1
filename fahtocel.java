import java.util.Scanner;
public class fahtocel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temp in fahrenhiet:");
        double fahrenhiet= sc.nextDouble();
        double celcius=(fahrenhiet-32)*5/9;
        System.out.println("temp in celsius:"+celcius);
    }
}