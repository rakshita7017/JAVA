import java.util.Scanner;

public class Seriesone {
    public static void main(String[] args) {
        float term,s,x;
        int n,c,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x and n:");
        x=sc.nextInt();
        n=sc.nextInt();
        s=0;
        c=1;
        term=x;
        i=1;
        while(c<=n){
            s=s+term;
            term=(term*x*x*(-1))/((i+1)*(i+2));
            i=i+2;
            c=c+1;
        }
        System.out.println(s);
    }
    
}
