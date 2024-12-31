import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;

public class Main {

    static int n, k = 0;
    static String[] cards;
    static HashSet<String> nums = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        cards = new String[n];
        for(int i = 0; i < n; i++) {
            cards[i] = br.readLine();
        }

        Boolean[] visited = new Boolean[n];
        for(int i = 0; i < n; i++) visited[i] = false;
        dfs(0,visited,new Stack<String>());

        System.out.println(nums.size());

    }

    static void dfs(int depth, Boolean[] visited, Stack<String> stack ) {
        if (depth == k) {
            nums.add(String.join("", stack));
            return ;
        }
        for(int i = 0; i < n; i++) {
            if(visited[i] == true) continue;
            visited[i] = true;
            stack.add(cards[i]);
            dfs(depth+1,visited,stack);
            visited[i] = false;
            stack.pop();
        }
    }
    
}
