import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //256 = 245 + 2 + 4 + 5 -> 245 : 생성자M, 256 : 분해합N
        //216 = 198 + 18 -> 생성자N : 198, 분해합N : 216
        int desum = 0;
        for(int i = 1; i < N; i++) {
            //분해 알고리즘
            String numStr = String.valueOf(i);
            desum=i;
            for(int j = 0; j < numStr.length(); j++) {
                // if i == 234면 234본인이랑 2, 3, 4 더해보기 각 자리수만 더하기
                desum += Integer.parseInt(String.valueOf(numStr.charAt(j)));
            }
            
            if(desum == N) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }
}
