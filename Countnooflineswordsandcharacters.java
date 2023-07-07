public class Countnooflineswordsandcharacters {
    public static void count(String str){
        int noofch=0;
        int noofline=0;
        int noofword=1;
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        switch(ch){
            case '.':
        
            noofline++;
            break;
            case' ':
            noofword++;
            break;
            default:
            noofch++;
            break;
        }
}
System.out.println("characters are:"+noofch);
System.out.println("words are:"+noofword);
System.out.println(" no of lines are:"+noofline);
    }
    public static void main(String[] args) {
        String str="there hello. we are bears.";
                   count(str);  
    }
    
}
