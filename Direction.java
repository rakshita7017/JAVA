public class Direction {
    public static void finddirec(String str){
        float shortestpath=0;
    
        float y=0,x=0;
        float X2=x*x;
        float Y2=y*y;
        for(int i=0;i<str.length();i++){
        char direc=str.charAt(i);
        if(direc=='S'){
            y--;
        }
        else if(direc=='N'){
            y++;
        }
       else if(direc=='E'){
           x++;
}
        else{
            x--;

        }
     }
        System.out.println((float)(Math.sqrt(X2+Y2)));
        
    }

    
    public static void main(String[] args) {
        String str="NS";
        finddirec(str);
    }
    
}
