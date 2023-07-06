public class Bubblesort {
     static void bubble(int arr[]){
        int i,j;
        boolean swapped=false;
        for(i=0;i<arr.length;i++){
        for(j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                swapped=true;
            }
        }
        }
        

     }
     static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
     }
    public static void main(String[] args) {
        int arr[]={3,7,1,6,9,1};
        bubble(arr);
        System.out.println("sorted array is:");
        print(arr);
    }
    
}
