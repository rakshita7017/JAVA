import java.util.Arrays;

public class Sortthestring {
    public static void sortstring(String str){
        
    }
    

    public static void main(String[] args) {
        String str="STRING";
        sortstring(str);
         char charArray[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
       
        Arrays.sort(charArray);
        }
        
    
        System.out.println(Arrays.toString(charArray));
        
    }
    
}
