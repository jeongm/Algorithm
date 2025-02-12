import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 리스트 내림차순 정렬, for문 i만큼 -i한 값을 더함, 값이 0이면 break
        ArrayList<Integer> tips = new ArrayList<>();
        for(int i = 0; i < N; i++){
            tips.add(Integer.parseInt(br.readLine()));
        }

        tips.sort(Collections.reverseOrder());

        long maxTip = 0;
        for(int i = 0; i < N; i++) {
            if(tips.get(i)-i < 1) break;
            maxTip += tips.get(i)-i;
        }

        System.out.println(maxTip);
    }

}
