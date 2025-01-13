import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String line;
        
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            String s = st.nextToken();
            String t = st.nextToken();
            
            int equalCnt = 0;
            for(int i = 0; i < t.length(); i++) {
                if(t.charAt(i) == s.charAt(equalCnt)) {
                    equalCnt ++;
                }

                if(equalCnt == s.length()) break;
            }
            if (equalCnt == s.length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
