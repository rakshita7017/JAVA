import java.util.*;
import java.io.*;
public class Longestsubarr {
    static int longestsub(int arr[],int k,int n){
        int maxlength=0;
        for(int i=0;i<n;i++){
            int maxsum=0;
            for(int j=i;j<n;j++){
                maxsum+=arr[j];
                if(maxsum==k){
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
    int arr[]={10,5,2,7,1,9};
    int k=15;
    int n=arr.length;
    
    System.out.println("length:"+longestsub(arr, k, n));
    
    }
    
}
