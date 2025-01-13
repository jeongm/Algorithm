import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.stream.Collector;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                numbers.add(Integer.parseInt(st.nextToken()));
            }
        }

        for(int i = 0; i < N-1; i++) {
            numbers.poll();
        }

        System.out.println(numbers.peek());


    }
}
