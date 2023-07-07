public class Searchinsortedmatrix {
    public static void staircaseapproach(int mat[][]){
        int key=80;
        int i=0;
        int j=mat.length-1;
        
    while(i<mat.length&&j>0){
            if(key>mat[i][j]){
                i++;

            }
            else{
                j--;

            }
            if(mat[i][j]==key){
        System.out.println("found at:"+i+","+j);

        }
    }
    
    }
    
    public static void main(String[] args) {
        int mat[][]={{10,23,30},
                      {40,50,60},
                      {70,80,90}};
                      int key=80;
                      staircaseapproach(mat);
    }
    
}
