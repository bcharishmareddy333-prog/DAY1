import java.util.Scanner;
public class celtofah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temp in celcius:");
        double celsius= sc.nextDouble();
        double fahrenhiet=(celsius*9/5)+32;
        System.out.println("temp in fahrenhiet:"+fahrenhiet);
    }
}