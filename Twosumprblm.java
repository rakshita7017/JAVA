public class Twosumprblm {
    static void sumnaiveappr(int k,int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
           
               if(arr[i]+arr[j]==k){
                System.out.println(i);
                System.out.println(j);

               }
                }

            }
        }
    
    
    public static void main(String[] args) {
        int arr[]={1,4,2,6,20,7};
        
        int k=6;
        sumnaiveappr(k,arr);
        

    }
    
    
}
