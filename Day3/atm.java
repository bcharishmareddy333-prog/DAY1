import java.util.Scanner;
public class atm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account balance:");
        double balance=sc.nextDouble();
        System.out.print("Enter withdrawal amount:");
        double amount=sc.nextDouble();
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("withdrawal successful");
            System.out.println("remaining balance="+balance);
        }else{
            System.out.println("insufficient balance or invalid amount");
        }
    }
}