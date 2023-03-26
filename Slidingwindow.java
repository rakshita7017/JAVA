public class Slidingwindow {
    public static void main(String[] args) {
        
    
    int arr[]={1,40,30,10,20,5};
    int k=3;
    int sum=0;
    int max=0;
    int n=arr.length;
    for( int i=0;i<k;i++){

        sum=sum+arr[i];
        max=sum;
    }
    for( int j=k;j<n;j++){
        sum=sum+(arr[j]+arr[j-k]);
        if(max<sum){
            max=sum;
        }


    }
    System.out.println("MAX IS:"+max);
}
}
