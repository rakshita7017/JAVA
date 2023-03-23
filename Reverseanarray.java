import java.util.Arrays;
public class Reverseanarray {
    public static void main(String[] args) {
        int arr[]={12,7,45,90,45,78,2};
        System.out.println("input array:"+Arrays.toString(arr));
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=n-1;i>=0;i--){
            temp[n-i-1]=arr[i];
        }
        System.out.println("Reversed array:"+Arrays.toString(temp));
    }
}
