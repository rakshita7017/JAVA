public class Pattern7 {
    public static void printstar(int n){
 for(int row=1;row<=2*n-1;row++){
    int spaces= row<n?n-row:row-n;
    for(int i=0;i<=spaces;i++){
        System.out.print(" ");
    }

            int totalcolinrow=row>n?2*n-row:row;
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
