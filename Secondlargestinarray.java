public class Secondlargestinarray {
    public static void main(String[] args) {
        int arr[]={12,67,90,3,20,78};
        int n=arr.length;
        int temp;
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("the second largest no is:"+arr[n-2]);
    }
    
}
