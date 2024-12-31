import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<String> possible = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        dfs(0, new boolean[10],"");        

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String questionNum = st.nextToken();
            int questionStrike = Integer.parseInt(st.nextToken());
            int questionBall = Integer.parseInt(st.nextToken());

            Iterator<String> iterator = possible.iterator();

            while(iterator.hasNext()) {
                String num = iterator.next();
                int strike = 0;
                int ball = 0;
                for(int k = 0; k < 3; k++) {
                    if(num.charAt(k) == String.valueOf(questionNum).charAt(k)) {
                        strike++;
                    }else if (num.contains(String.valueOf(questionNum.charAt(k)))) {
                        ball++;
                    }
                }
                if (strike != questionStrike || ball != questionBall) {
                iterator.remove();
                }
            }
        }

        System.out.println(possible.size());

    }

    static void dfs(int depth,boolean[] visited, String num) {
        if(depth == 3) {
            possible.add(num);
            return;
        }
        for(int i = 1; i < 10; i++) {
            if(visited[i] == true) continue;
            visited[i] = true;
            num += String.valueOf(i);
            dfs(depth+1, visited, num);
            num = num.substring(0, num.length()-1);
            visited[i] = false;
        }
    }
}
