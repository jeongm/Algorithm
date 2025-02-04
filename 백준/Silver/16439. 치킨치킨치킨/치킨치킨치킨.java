import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[][] likeChicken;
    static int bestSum = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 고리 회원의 수
        M = Integer.parseInt(st.nextToken()); // 치킨 종류의 수
        likeChicken = new int[N][M];

        //치킨 선호도
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                likeChicken[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(0, 0, new int[3]);

        System.out.println(bestSum);


    }

    static void bfs(int start, int selectCnt, int[] selectChicken) {
        // 선택한 치킨 인덱스
        if(selectCnt == 3) {
            int bestTmp = 0;
            for(int i = 0; i < N; i++) {
                int best = likeChicken[i][selectChicken[0]];
                if(best < likeChicken[i][selectChicken[1]]) best = likeChicken[i][selectChicken[1]];
                if(best < likeChicken[i][selectChicken[2]]) best = likeChicken[i][selectChicken[2]];
                bestTmp+=best;
            }

            if(bestSum < bestTmp) bestSum = bestTmp;

            return;
        }

        for(int i = start; i < M; i++) {
            selectChicken[selectCnt] = i;
            bfs(i+1,selectCnt+1,selectChicken);
        }
    }
}
