public class Convertseentenceintouppercase {
    public static String convert(String str){
        
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
         char ch=Character.toUpperCase(str.charAt(i));
         sb.append(ch);
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String str="hello everyone";
        System.out.println(convert(str));
    }
    
}
