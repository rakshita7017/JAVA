public class Moveallzeroes {
    public static void main(String[] args) {
        int arr[]={1,0,78,0,25,0,10,45};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
        for( int j=0;j<n;j++){
            System.out.println(arr[j]+"");
        }
    }
}
