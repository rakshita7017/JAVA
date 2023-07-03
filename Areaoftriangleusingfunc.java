public class Areaoftriangleusingfunc {
    public static int area(int h,int b){
        int area=(int) (0.5*b*h);
        return area;
    }
    public static void main(String[] args) {
        int b=2;int h=1;
       int area=area( h, b);
       System.out.println(area);
    }
    
}
