import java.util.Scanner;

public class Seriesfive {
    public static void main(String[] args) {
        int c,s,term;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        
        s=0;
        c=1;
        term=1;
        while(c<=n){
            s=s+term;
            term=term*(c+1);
            c=c+1;
        }
        System.out.println(s);
    }
    
}
