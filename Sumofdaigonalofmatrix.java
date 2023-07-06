public class Sumofdaigonalofmatrix {
    public static void sumdaigonal(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            if(i==j){
            sum+=arr[i][j];
            }
            }
        }
        System.out.println("sum of daigonal is"+sum);

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                      {2,6,1},
                      {1,2,1}};
                      sumdaigonal(arr);
    }
    
}
