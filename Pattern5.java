public class Pattern5 {
    public static void printstar(int n){
        for(int row=0;row<2*n-1;row++){
            int totalcolinrow=row>n?2*n-row-1:row;
            for(int col=0;col<totalcolinrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printstar(5);
    }
    
}
