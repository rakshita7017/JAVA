public class Largestnoofarr {
    public static void main(String[] args) {
        int arr[]={56,89,2,78,8,1,90};
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                max=arr[i+1];
            }
        }
       System.out.println("largest is:"+max); 
    }
}
