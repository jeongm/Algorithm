import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            
            Queue<Integer> cards = new LinkedList<>();
            for(int i = 1; i <= N ; i++) {
                cards.add(i);
            }

            while(cards.size() > 1) {
                cards.poll();
                cards.add(cards.poll());
            }

            System.out.println(cards.peek());

    }

}
