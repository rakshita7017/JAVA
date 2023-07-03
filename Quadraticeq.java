import java.util.Scanner;

public class Quadraticeq {
    public static void main(String[] args) {
        int a,b,c,x,y;
        double d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        a=sc.nextInt();
        System.out.println("enter b");
        b=sc.nextInt();
        System.out.println("enter c");
        c=sc.nextInt();
        d=b*b-4*a*c;
        if(d>0){
            System.out.println("the roots are real and unequal");
            x=(int) (-b*b+Math.sqrt(d/2*a));
            y=(int) (-b*b-Math.sqrt(d/2*a));

        }
        else if(d==0){
            System.out.println("the roots are real and equal");
            x=-b/(2*a);
        }
        else{
            System.out.println("the roots are imaginary");
        }
        
    }
    
}
