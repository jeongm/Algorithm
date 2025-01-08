import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());

            int[] answerSqnc = new int[N];
            for(int i = 0; i < N; i++) {
                answerSqnc[i] = Integer.parseInt(br.readLine());
            }
        
            Stack<Integer> stack = new Stack<>();
            ArrayList<Character> result = new ArrayList<>();
            int idx = 0;
            int num = 0;
            while(idx < N && num < N+1) {
                
                if(!stack.isEmpty() && stack.peek() == answerSqnc[idx]) {
                    stack.pop();
                    idx++;
                    result.add('-');
                }else {
                    stack.push(++num);
                    result.add('+');
                }
            }

            if(stack.isEmpty()) {
                result.forEach(System.out::println);
            }else {
                System.out.println("NO");
            }

            
    }

}
