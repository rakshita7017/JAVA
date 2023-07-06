public class Additionofmatrix {
    public static void addition(int arr1[][],int arr2[][]){
        int arr3[][]=new int[3][3];
        for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
        arr3[i][j]=arr1[i][j]+arr2[i][j];
        System.out.print(arr3[i][j]);
        }
        System.out.println();
        }

    }
    public static void main(String[] args) {
        
        int arr1[][]={{1,2,3},{4,6,8},{5,4,1}};
        int arr2[][]={{2,6,3},{7,1,1},{1,1,1}};
        int arr3[][]=new int[3][3];
        addition(arr1, arr2);
        
    }
    
}
