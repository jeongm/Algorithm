import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());
        
        Set<String> wordSet = new TreeSet<>();
        for(int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }
        int containWordCnt = 0;
        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            if(wordSet.contains(str) ) {
                containWordCnt++;
            }
        }

        System.out.println(containWordCnt);     

    }
}
