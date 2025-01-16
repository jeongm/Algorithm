import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String strGame = br.readLine();
            int K = Integer.parseInt(br.readLine());

            int shortStr = strGame.length()+1;
            int longStr = -1;
            int alpaCnt[] = new int[26];

            for(int j = 0; j < strGame.length();j++) {
                alpaCnt[strGame.charAt(j)-'a']++;
            }

            if(K == 1) {
                System.out.println("1 1");
                continue;
            }
            for(int left = 0;left < strGame.length();left++) {
                // 해당 문자가 k개만큼 없으면 Pass
                if(alpaCnt[strGame.charAt(left)-'a'] < K) continue;
                int kCnt = 1;
                for(int right = left+1; right < strGame.length(); right++) {
                    // k개만큼 있는지 확인
                    if(strGame.charAt(right) == strGame.charAt(left)){
                        kCnt++; 
                    }
                    if(kCnt == K) {
                        shortStr = Math.min(shortStr, right+1-left);
                        longStr = Math.max(longStr, right+1-left);
                        break;
                    }
                }
            }

            if(shortStr == strGame.length()+1 || longStr == -1){
                System.out.println(-1);
            } else {
                System.out.println(shortStr + " " + longStr);
            }

        }

    }
}
