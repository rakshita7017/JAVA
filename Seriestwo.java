import java.util.Scanner;

public class Seriestwo {
    public static void main(String[] args) {
        int n,c,i;
        float s,x,term;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of x and n:");
        x=sc.nextFloat();
        n=sc.nextInt();
        s=0;c=1;i=1;
        term=x*x;
        while(c<=n){
            s=s+term;
            term=term*x*x*(-1);
            c=c+1;
            
        }
        System.out.println(s);
    }
    
}
