public class Printmarksgreaterthanavg {
    public static void printmarks(int n,int marks[]){
        int s=0;
        for(int i=0;i<n;i++){
            s=s+marks[i];
        }
        int avg=s/n;
        for(int i=0;i<n;i++){
            if(avg<marks[i]){
                System.out.print(marks[i]+" ");
            }
        }
   
    }
    public static void main(String[] args) {
        int marks[]={1,2,3,4,1};
        int n=marks.length;
        printmarks(n, marks);
    }
    
}
