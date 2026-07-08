import java.util.Scanner;
public class Discount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter purchase amount:");
        double amount=sc.nextDouble();
        double finalAmount;
        if(amount>5000){
            finalAmount=amount-(amount*20/100);
            System.out.println("20% Discount applied");
        }else{
            finalAmount=amount;
            System.out.println("no discount");
        }
        System.out.println("final amount payable="+finalAmount);
    }
}