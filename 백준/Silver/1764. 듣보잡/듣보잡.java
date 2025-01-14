import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Set<String> unheardList = new TreeSet<>();
        Set<String> unheardSeenList = new TreeSet<>();
        for(int i = 0; i < N; i++) {
            unheardList.add(br.readLine());
        }

        for(int i = 0; i < M; i++) {
            String word = br.readLine();
            if(unheardList.contains(word)){
                unheardSeenList.add(word);
            }
        }

        System.out.println(unheardSeenList.size());
        unheardSeenList.forEach(System.out::println);

    }
}
