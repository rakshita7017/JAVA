import java.util.Arrays;

public class Removeduplicatelem {
    public static void main(String[] args) {
        //approach1 sorting
        int arr[]={12,1,12,89,1,7,123,96,1};
        Arrays.sort(arr);
        int n=arr.length;
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        for(int k=0;k<j;k++){
            System.out.println(arr[k]+" ");
        }
    }
    
}
