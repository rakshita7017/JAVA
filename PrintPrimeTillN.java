import java.util.Arrays;

public class PrintPrimeTillN {
    public static void main(String[] args) {
        int N=30;
        int prime[]=new int[N+1];
    
            Arrays.fill(prime,1);
            for(int i=2;i*i<=N;i++){
                if(prime[i]==1){
                    for(int j=i*i;j<=N;j+=i){
                        prime[j]=0;
                    }
                }
            }
        
        for(int i=2;i<=N;i++){
            if(prime[i]==1){
                System.out.println(i);
            }
        }
    }
    
}
