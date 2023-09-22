import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {    

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> words = new HashMap<>();

        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            if( word.length() >= M) {
                words.put(word, words.getOrDefault(word, 0) + 1);
            }
        }

        List<String> sortedWords = new ArrayList<>(words.keySet());

        sortedWords.sort((o1, o2) -> {
            int c1 = words.get(o1);
            int c2 = words.get(o2);

            if(c1 == c2) { // 빈도 수 같을 때
                if(o1.length() == o2.length()) { // 글자 길이 같을 때
                    return o1.compareTo(o2); // 알파벳 사전순으로 
                }
                return o2.length() - o1.length();
            }

            return c2 - c1; // o1이 o2보다 앞에 위치해야 하는 경우 음수 반환
        
        });


        StringBuilder sb = new StringBuilder();
        for(int i =0; i < sortedWords.size(); i++) {
            sb.append(sortedWords.get(i)).append("\n");
        }
        System.out.println(sb);
            
    }
  
}


