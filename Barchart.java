public class Barchart{
        static void Pattern(){
    
        }
       static int approach(int arr[], int n){
            int m= arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]>m){
                    m=arr[i];
                }
            }
            return m;
        }
        public static void main(String[] args) {
            int arr[]={6,4,7,1,4};
            int k = arr.length;
           int max= approach(arr,k);
        //    System.out.println(max);
        for(int i = max; i >= 1; i--) {
            for(int j = 0; j < k; j++) {
                if(i <= arr[j]) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    
    }
    }
