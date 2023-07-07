public class Findingnormofmatrix {
    public static void norm(int mat[][]){
        float norm=0;
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                 sum=sum+mat[i][j]*mat[i][j];
                 norm= (float)Math.sqrt(sum);
            
            }
            
        }
        System.out.println(norm);

    }
    public static void main(String[] args) {
        int mat[][]={{1,1,1},
                      {1,1,1},
                      {1,1,1}};
                      norm(mat);
    }
    
}
