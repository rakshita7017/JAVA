public class Largestandsmallesteleinarray {
    public static int largestsmallest(int arr[],int number[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<number[i]){
                largest=number[i];
                

            }
            if(smallest>number[i]){
                smallest=number[i];
                
            }
        }
        System.out.println(smallest);
        return largest;
        
    }
    public static void main(String[] args) {
        int arr[]={1,3,89,0,4,71};
       System.out.println( largestsmallest(arr, arr));
    }
    
}
