public class Factorialusingrecursion {
    public static int fact(int n){
        int fact=1;
     if(n==0){
        return 1;
     }
    else if(n==1){
        return 1;
        }
        else{
             fact=n*fact(n-1);
        }
        return fact;
     
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(fact(n));
    }
    
}
