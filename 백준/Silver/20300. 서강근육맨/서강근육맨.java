import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Long> muscleLosses = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            muscleLosses.add(Long.parseLong(st.nextToken()));
        } 

        muscleLosses.sort(null);
        long minMuscleLoss = N%2 == 0? 0:muscleLosses.get(N-1);
        int MLLen = N%2 == 0 ? N:N-1;
        for(int i = 0; i < MLLen/2; i++) {
            long muscleLoss = muscleLosses.get(i) + muscleLosses.get(MLLen-i-1);
            minMuscleLoss = Math.max(minMuscleLoss, muscleLoss);
        }
        System.out.println(minMuscleLoss);

    }

}
