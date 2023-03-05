import java.io.*;
import java.util.*;
public class Spanofthearray {
    public static  int min(int n,int arr[]){
        int  min=arr[0];
        for(int i=0;i<=n;i++){
        
        if(arr[i]<min){
            min=arr[i];
        }
        }
        return min;
    }
    public static int  max(int n,int arr[]){
        int max=0;
        for(int i=0;i<=n;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
     }
    public static void main(String[] args) {
        int arr[]={7,9,3,5,2};
        int n=arr.length-1;
        int min=  min(n,arr);
        int max= max(n,arr);
        int span=max(n,arr)-min(n,arr);
        System.out.println("span is"+span);
    }
    
}    

