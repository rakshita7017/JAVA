public class Searchelementinarray {
    public static void searchelement(int arr[],int n,int x){
        for(int i=0;i<n;i++){
        if(arr[i]==x){
            System.out.println(i);

        }
        }
    }
    public static void main(String[] args) {
        int arr[]={12,2,7,5,1};
        int n=arr.length;
        int x=5;
        searchelement(arr,n,x);
    }
    
}
