import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            for(int i = 0; i < N; i++) {
                String st = br.readLine();
                int open = 0;
                int close = 0;
                
                for(int j = 0; j < st.length(); j++) {
                    if(st.charAt(j) == '(') {
                        open++;
                    }else if (st.charAt(j) == ')') {
                        close++;
                    }
                    if(open < close) {
                        break;
                    }
                }
                if(open == close) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

  

    }





}
