import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int cnt = N;
        for(int i =0; i < N; i++) {
            String word = br.readLine();
            for(int j = 0; j < word.length()-1; j++) {
                if(word.charAt(j) != word.charAt(j+1)&&
                 word.substring(j+1, word.length()).contains(String.valueOf(word.charAt(j)))) {                    
                    cnt--;
                    break;
                }
            }
        }

        System.out.println(cnt);


    }
    
}
