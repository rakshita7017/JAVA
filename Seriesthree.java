import java.util.Scanner;
public class Seriesthree {
    
    public static void main(String[] args) {
        int x,n,i;
        float term,c,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        s=0;
        c=1;x=1;
        term=(float) Math.pow((-1),3);
        while(c<=n){
            s=s+term;
            x=x+2;
            term=term*x*x*x*(-1);
            
            c=c+1;
        }
        System.out.println(s);
    }
    
}
