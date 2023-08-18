import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int N;
    private static int minCost;

    public static void dfs(int depth, int[][] visit, int[][] cost) {

        if (depth == 3) {
            int totalCost = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if (visit[i][j] == 1) {
                        totalCost += cost[i][j];
                    }
                }
            }

            if (minCost > totalCost) {
                minCost = totalCost;
            }
            return ;
        }

        for(int i = 1; i < N-1; i++) {
            for(int j = 1; j < N-1; j++) {
                // 꽃 겹치는지 확인
                if (visit[i][j] != 0 || visit[i-1][j] != 0 || visit[i+1][j] != 0 || visit[i][j-1] != 0 || visit[i][j+1] != 0) 
                        continue;
                else {
                    visit[i][j]  = 1;
                    visit[i-1][j] = 1;
                    visit[i+1][j] = 1;
                    visit[i][j-1] = 1;
                    visit[i][j+1] = 1;
                }

                dfs(depth+1,visit,cost);
                visit[i][j]  = 0;
                visit[i-1][j] = 0;
                visit[i+1][j] = 0;
                visit[i][j-1] = 0;
                visit[i][j+1] = 0;

            }
            

        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int[][] cost = new int[N][N];

        for( int i = 0; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N ; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        minCost = 200 * N * N;
        int[][] gride = new int[N][N];
        dfs(0, gride,cost);


        System.out.println(minCost);


    }
}
