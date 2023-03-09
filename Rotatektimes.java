import java.util.Arrays;
public class Rotatektimes {
  public static void rightRotateByOne(int arr[]){
    int last=arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--){
        arr[i+1]=arr[i];

    }
    arr[0]=last;
  }
    public static void rightRotate(int arr[],int k){
    if(k<0||k>=arr.length){
        return;
    }
    for(int i=0;i<k;i++){
        rightRotateByOne(arr);
    }
   }
   
   
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int k=2;
    rightRotate(arr,k);
    System.out.println(Arrays.toString(arr));
}
    
}
