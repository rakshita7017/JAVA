public class Multiplicatationofmatrix {
    public static void multiply(int arr1[][],int arr2[][]){
    
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                int res_arr[][]=new int[3][3];
                for(int k=0;k<arr1.length;k++){
                 res_arr[i][j]+=arr1[i][k]*arr2[k][j];

                }
                System.out.print(res_arr[i][j]+" ");

            }
            System.out.println();
        }
    

    }
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},
                       {3,2,4},
                       {1,7,4}};
        int arr2[][]={{1,7,4},
                      {2,2,3},
                       {1,4,3}};
                       multiply(arr1, arr2);
    }
    
}
