import java.util.Scanner;

public class Sreriessix {
    public static void main(String[] args) {
        int c,i,x,n;
        float s,term;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        s=0;
        c=1;
        x=2;
        i=1;
        term=x;
    int base=2;
int exp=1;
        while(c<=n){
            s=s+ (float)Math.pow(base,exp);
            base+=2;
            exp+=2;
            c=c+1;
        }
        System.out.println(s);
    }
    
}
