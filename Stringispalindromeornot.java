public class Stringispalindromeornot {
    public static void palindrome(String str){
        int n=str.length();
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1))
             System.out.println("not palindrome");
            
            
            }
            System.out.println("palindrome");
            
        }

    

    
    public static void main(String[] args) {
        String str="racecar";
        palindrome(str);
    }
    
}
