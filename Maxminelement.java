public class Maxminelement {
    public static   int max(int arr[],int n){
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[],int n){
        int min=arr[0];
        for(int i=0;i<n;i++){
           if(arr[i]<min){
            min=arr[i];
           }
        }
        return min;
    }
   public static void  main(String[] args) {
        int arr[]={5,6,2,1,9,3};
        int n=arr.length;
        int max=max( arr, n);
        int min=min( arr,n);
        System.out.println("min value is:"+min);
        System.out.println("the max is:"+max);
    }
}
