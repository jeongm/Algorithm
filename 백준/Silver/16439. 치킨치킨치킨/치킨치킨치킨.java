import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M = 0;
    static int[][] likeChicken;
    static int bestPreference = 0;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        likeChicken = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                likeChicken[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    
        dfs(0, 0,new int[3]);

        System.out.println(bestPreference);


    }

    static void dfs(int start, int depth, int[] selectChicken) {
        if(depth == 3) {
            int preference = 0;
            for(int i = 0; i < N; i++) {
                int bestLike = Math.max(likeChicken[i][selectChicken[0]], Math.max(likeChicken[i][selectChicken[1]], likeChicken[i][selectChicken[2]]));
                preference += bestLike;
            }
            if(preference > bestPreference)
                bestPreference = preference;
            return;
        }

        for(int i = start; i < M; i++) {
            selectChicken[depth] = i;
            dfs(i+1, depth+1, selectChicken);
        }
    }

    
}
