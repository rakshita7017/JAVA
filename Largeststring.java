public class Largeststring {
    public static void comparestr(String vege[]){
        String largest=vege[0];
    for(int i=1;i<vege.length;i++){
        if(largest.compareTo(vege[i])<0){
        largest=vege[i];
        }
    }
    System.out.println("the largest string is:"+largest);
    }
    public static void main(String[] args) {
        String vege[]={"onion","beans","pea"};
    comparestr(vege);
}
    
}
