import java.util.Scanner;
public class studentadm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks:");
        int marks=sc.nextInt();
        if(marks>=70){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
    }
}