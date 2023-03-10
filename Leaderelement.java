public class Leaderelement {
    public static void leader(int arr[],int n){
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==n){
                System.out.println(arr[i]+"");
            }
        }
    }
    public static void main(String[] args) {
        Leaderelement lead=new Leaderelement();
        int arr[]={16,17,13,1,5,2};
        int n=arr.length;
        lead.leader(arr,n);

    }
    
}
