public class Sumofdigitusingfunc {
    public static int sum(int n){
        int s=0;
        while(n!=0){

     
        s=s+n%10;
        n=n/10;
       
        }
    
    return s;

    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(sum( n));
    }
    
}
