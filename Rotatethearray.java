import java.util.Arrays;

public class Rotatethearray {
    static int[] rotate(int a[]){
        int l = a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=l;
        return a;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
    
        System.out.println(Arrays.toString(rotate(arr1)));
    
    }
}  

