import java.util.HashSet;
public class Unionandintersection {

static void Union(int arr1[],int arr2[]){
    HashSet<Integer>hs=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
         hs.add(arr1[i]);}
    for(int i=0;i<arr2.length;i++){
        hs.add(arr2[i]);
    }
    System.out.println(hs);
}   
static void Intersection(int arr1[],int arr2[]) {
    HashSet<Integer>hs=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        hs.add(arr1[i]);}
   for(int i=0;i<arr2.length;i++){
       if(hs.contains(arr2[i])){
          System.out.println(arr2[i]+"");
       }
   }
   System.out.println(hs);
}
public static void main(String[] args) {
        int arr1[]={1,9,4,7,3,30};
        int arr2[]={56,9,30,89,600,4,8};
        //function call
        System.out.println("union of arrays:");
        Union(arr1,arr2);
        System.out.println("intersection is:");
        Intersection(arr1,arr2);
    }
    
}
