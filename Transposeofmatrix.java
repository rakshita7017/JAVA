public class Transposeofmatrix {
    public static void transpose(int mat[][],int mat_res[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                mat_res[j][i]=mat[i][j];
            
            }
        }
    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3},
                     {3,12,8},
                    {9,0,3}};
                    int mat_res[][]=new int[3][3];
                transpose(mat, mat_res);
                for(int i=0;i<mat_res.length;i++){
                    for(int j=0;j<mat_res.length;j++){
                    System.out.print(mat_res[i][j]+" ");
                }
                System.out.println();
            }
        
    }
    
}
