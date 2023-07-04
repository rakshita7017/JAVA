public class Maxsubarraysum {
    public static void maxsubarr(int arr[]){
    int maxsum=INTEGER.MIN_VALUE;
    int currsum=0;
         for(int i=0;i<arr.length;i++){

             for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                     currsum+=arr[k];
                     if(maxsum<currsum){
                        maxsum=arr[k];
                     }
                    
                }
                
            
             }
             
        }
        System.out.println(maxsum);

    }
    public static void main(String[] args) {
        int arr[]={-1,2,-4,0,6};
        maxsubarr(arr);
    }
    
}
