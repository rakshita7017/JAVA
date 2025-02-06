public class PrimeOrNot {
    public static void main(String[] args) {
        int N=15;
        int cnt=0;
        for(int i=1;i<=Math.sqrt(N);i++){
            if(N%i == 0){
             cnt+=1;
                if(N/i!=i){
                cnt=cnt+1;
            }
        }
    }
            
                if(cnt==2){
                    System.out.println("its a prime no....");
                }
                else{
                    System.out.println("not a prime number...");
                }
            }
            
            }
        
    
    

