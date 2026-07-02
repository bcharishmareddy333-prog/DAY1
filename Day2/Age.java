import java.util.Scanner;
public class Age{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        int age=sc.nextInt();
        if(age<13){
            System.out.println("child");
        }else if(age<20){
            System.out.println("teenager");
        }else if(age<60){
            System.out.println("adult");
        }else{
            System.out.println("senior citizen");
        }
    }
}
