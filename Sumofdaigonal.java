public class Sumofdaigonal {
    public static void sum(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
        
            
                    sum+=mat[i][i];
                    

                
                 if(i!=mat.length-i-1){
                    sum+=mat[i][mat.length-i-1];
                    
                }
            }
            System.out.println(sum);
        }
    
    
    
    public static void main(String[] args) {
        int mat[][]={{1,2,3},
                     {3,1,2},
                     {3,1,4}};
                     sum(mat);
        


    }
    
}
