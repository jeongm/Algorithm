import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 하나의 로프에는 w/k의 중량이 걸림 r = w/k w = rk (r:하나의 로프중량, k:선택 로프 수, w: 중량)
        // 오름차순으로 정렬 , for문 rope[i] * (N-i), maxWeight 비교
        ArrayList<Integer> ropes = new ArrayList<>();
        for(int i = 0; i < N; i++){
            ropes.add(Integer.parseInt(br.readLine()));
        }
        ropes.sort(null);

        int maxWeight = ropes.get(0)*N;
        for(int i = 0; i < N; i++){
            maxWeight = Math.max(maxWeight, ropes.get(i) * (N-i));
        }

        System.out.println(maxWeight);

    }

}
