public class Buyandsell {
    public static int Maxprofit(int arr[]){
        int Maxprofit=0;
        int minele= arr[0];
        for(int i=0;i<=arr.length-1;i++){
             minele= Math.min(minele,arr[i]);
           int  profit=arr[i]-minele;
           Maxprofit=Math.max(Maxprofit,profit);
            
        }
        return Maxprofit;

    }
    public static void main(String[] args) {
        int arr[]={2,7,10,60};
        System.out.println(Maxprofit(arr));
    }
    
}
