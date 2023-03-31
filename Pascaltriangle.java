import java.util.Scanner;
import java.util.*;
public class Pascaltriangle {
    public static void main(String[] args) {
        System.out.println("enetr the lines:");
        Scanner sc= new Scanner(System.in);
        int nooflines=sc.nextInt();
        int spaces=nooflines;
        int number=1;
        for(int i=0;i<nooflines;i++){
            //for spaces
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
         number=1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
            number=number*(i-j)/(j+1);
            }
            spaces--;
            System.out.println();
        }

    }
    
}
