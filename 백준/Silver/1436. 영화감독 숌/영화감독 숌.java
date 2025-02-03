import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 0;;i++){
            if(!String.valueOf(i).contains("666")) continue;
            if(++cnt == N) {
                System.out.println(i);
                return;
            }
        }

    }
}
