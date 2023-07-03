import java.util.Scanner;
public class Seriesfour {
    public static void main(String[] args) {
        int i,c,n,x;
        float term,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        c=1;s=0;
        x=1;
        term=x*x;
        while(c<=n){
            s=s+term;
            x=x+2;
            term=term*x*x*x*x;
            c=c+1;
        }
        System.out.println(s);
    }
    
}
