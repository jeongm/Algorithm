import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            
            ArrayList<Integer> joseps = new ArrayList<>();
            for(int i = 1; i <= N ; i++) {
                joseps.add(i);
            }
            
            ArrayList<Integer> ansList = new ArrayList<>();

            int idx = 0;
            while(joseps.size() != 0) {
                idx = (idx+K-1)%joseps.size();
                ansList.add(joseps.remove(idx));
            }

            String answer = ansList.toString();
            answer = answer.replace("[", "<").replace("]", ">");
            System.out.println(answer);


    }

}
