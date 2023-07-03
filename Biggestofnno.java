import java.util.Scanner;

public class Biggestofnno {
    public static void main(String[] args) {
        int i,n,max;
        int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("how many data:");
        n=sc.nextInt();
        for(i=0;i<n;i++){
        System.out.println("enter data:");
        arr[i]=sc.nextInt();
    }
    max=arr[0];
    for(i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("the biggest data is:"+max);
    
}
}