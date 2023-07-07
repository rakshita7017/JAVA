public class LargestandsmallestintwoDarray {
    public static void largesmall(int mat[][]){
        int largest=INTEGER.MIN_VALUE;
        int smallest=INTEGER.MAX_VALUE;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(largest<mat[i][j]){
                    largest=mat[i][j];
                }
                if(smallest>mat[i][j]){
                    smallest=mat[i][j];
                }

            }
        }
        System.out.println("largesgt is:"+largest);
        System.out.println("smallest is:"+smallest);
    }
public static void main(String[] args) {
    int mat[][]={{1,2,6},
                 {2,4,7},
                 {4,9,0}};
                 largesmall(mat);
}
    
}
