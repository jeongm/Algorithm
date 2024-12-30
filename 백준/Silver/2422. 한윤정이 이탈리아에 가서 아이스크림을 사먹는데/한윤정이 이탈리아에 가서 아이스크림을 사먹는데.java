import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        boolean[][] mCombi = new boolean[N+1][N+1];
        
        for(int i = 1; i <= M; i ++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            mCombi[a][b] = true;
            mCombi[b][a] = true;
        }

        for(int i = 1; i <= N; i ++) {
            for(int j = i+1; j <= N; j++) {
                if(mCombi[i][j]) continue;
                for(int k = j+1; k <= N; k++) {
                    if(!mCombi[j][k] &&!mCombi[i][k]) 
                        answer++;
                }
            }
        }

        System.out.println(answer);

    }

    
}
