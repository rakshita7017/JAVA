import java.util.Scanner;

public class Sequentialsearch {
    public static int sequencial(int arr[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter key:");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
    
        }
       
        
       }
        return -1;
    }
        

    
    public static void main(String[] args) {
        int[] arr={1,6,34,8};
        System.out.println(sequencial(arr));
    }
    
}
