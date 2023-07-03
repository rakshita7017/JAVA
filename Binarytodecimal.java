import java.util.Scanner;

public class Binarytodecimal {
    public static void main(String[] args) {
        int i,j,n;
        int arr[]= new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        n=sc.nextInt();
        i=0;
        while(n!=0){
            
            arr[i]=n%2;
            i=i+1;
            n=n/2;
        }
        
        for(j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
    
}
