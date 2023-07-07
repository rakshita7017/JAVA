public class Countnoofvowels {
    public static void count(String str){
        int vowel=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            switch(ch){
                case'a':
                case'A':
                case'e':
                case'E':
                case'i':
                case'I':
                case'o':
                case'O':
                case'u':
                case'U':
                vowel++;
                
                
            
            }
        }
        System.out.println(vowel);

    }
    public static void main(String[] args) {
        String  str="I am a bird";
        count(str);
    }
    
}
