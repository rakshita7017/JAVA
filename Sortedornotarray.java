public class Sortedornotarray {
    static boolean isSorted(int arr[],int n){
        for(int i=0;i<=n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={690,69,90,190};
        int n=arr.length;
        System.out.println(isSorted(arr,n));
    }
}