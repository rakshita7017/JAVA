import java.util.Scanner;

public class Perfectnoornot {
    public static void main(String[] args) {
        int i,s,r,n;
        s=0;
        int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the no:");
        n=sc.nextInt();
        for( i=1;i<n;i++){
        r=n%i;
        if(r==0){
            s=s+i;
        }
        }
        if(s==n){
            System.out.println("perfect no");
     }
        else{
            System.out.println("not a perfect no");
            
        }
    }
    }
    

