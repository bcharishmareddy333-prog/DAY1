import java.util.Scanner;
public class divisible35{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        if(num%3==0&&num%5==0){
            System.out.println("it is divisible");
        }else{
            System.out.println("it is not divisible");
        }
    }
}