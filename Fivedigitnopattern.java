import java.util.Scanner;

public class Fivedigitnopattern {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the five digit no:");
        n=sc.nextInt();
        for(int i=10000;i>0;i=i/10){
         System.out.println(n);
         n=n%i;
        }
    }
    
}
