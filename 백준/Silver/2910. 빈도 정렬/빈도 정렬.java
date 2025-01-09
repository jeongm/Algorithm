import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        List<Integer> original = new ArrayList<>();
        Map<Integer, Integer> freqCntMap = new HashMap<>();
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            original.add(num);
            freqCntMap.put(num, freqCntMap.getOrDefault(num, 0)+1);
        }


        // 정렬
        // 원본 데이터로 정렬 시 데이터가 뒤섞이므로 따로 리스트 생성
        List<Integer> sortNumbers = new ArrayList<>(original);
        Collections.sort(sortNumbers,(n1,n2) -> {
            
            if(Integer.compare(freqCntMap.get(n1), freqCntMap.get(n2)) != 0 ) {
                // 1. 빈도수가 다를 때 내림차순 
                return Integer.compare(freqCntMap.get(n2),freqCntMap.get(n1));
            }else {
                // 2. 빈도수가 같을 때 먼저 나온순서대로로
                return Integer.compare(original.indexOf(n1),original.indexOf(n2));
            }   
        });

        for(int num: sortNumbers) {
            System.out.print(num + " ");
        }
                

    }
}
