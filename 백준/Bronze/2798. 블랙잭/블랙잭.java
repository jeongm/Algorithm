import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken()); 
        
        int cards[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int absM[] = {3,M};
        for(int i = 0; i < N-2; i++) {
            for(int j = i+1; j < N-1; j++) {
                for(int r = j + 1 ; r < N; r++) {
                    int sum = cards[i]+cards[j]+cards[r];
                    if(sum <= M && absM[1]> M-sum) {
                        absM[0] = sum; 
                        absM[1] = M-sum;
                    }
                }
            }
        }

        System.out.println(absM[0]);
        
    }
}
