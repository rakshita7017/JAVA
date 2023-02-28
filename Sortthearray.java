import java.util.ArrayList;
public class Sortthearray {
    static ArrayList<Integer> count(int arr[],int n){
    
        int count_0=0;
        int count_1=0;
        int count_2=0;
        
        int i;
        for(  i=0;i<n-1;i++){
            if(arr[i]==1){
                count_1++;
            }
            else if(arr[i]==0){
                count_0++;
            }
            else{
                count_2=count_2+1;
                count_2++;
            }
        }
        ArrayList<Integer> array=new ArrayList<>();
        while(count_0>0){
            array.add(0);
            count_0--;
            
        }
        while(count_1>0){
            array.add(1);
            count_1--;
        }
        while(count_2>0){
            array.add(2);
            count_2--;
            
        }
        return array;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,0,1,1,0,0};
        int n=arr.length;
        System.out.println("the sorted array is"+count(arr,n));
    }

    }
    

