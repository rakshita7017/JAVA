import java.util.Scanner;

public class Decimaltobinary {
    public static void main(String[] args) {
        int i,r,s;
        double n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary no:");
        n=sc.nextDouble();
        i=0;s=0;
        while(n>0){
            r=(int) (n%10);
            s=s+r* (int)Math.pow(2,i);
            i=i+1;
            n=n/10;
        }
        System.out.println(s);

    }
    
}
