public class Pattern9 {
    public static void patterno(int n){
        for(int row=1;row<=2*n-1;row++){
            
             int spaces= row<n?n-row:row-n;
             for(int i=0;i<=spaces;i++){
        System.out.print(" ");
    }
    if(row<n){
            for(int col=row;col>=1;col--){
                System.out.print(col+"");
            }
        for(int col=2;col<=row;col++){
                System.out.print(col+"");
            }
  System.out.println();
        }
        else{
            for(int col=2*n-row;col>=1;col--){
                System.out.print(col+"");
            }
        
            
            for(int col=2;col<=2*n-row;col++){
                System.out.print(col+"");
            }
            System.out.println();

        }

    }
}
    public static void main(String[] args) {
        patterno(4);
    }
    
}

