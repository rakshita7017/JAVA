public class Gcd {
    public static int gcd(int a,int b){
        int r=a%b;
        if(r==0){
            return b;
        }
        else{
            return gcd( b,r);
        }

    }
    public static void main(String[] args) {
        int a=12,b=4;
        System.out.println(gcd(a, b));
    }
    
}
