import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        int[] cnt = new int[2];
        if(board.charAt(0) == '0') cnt[0]++;
        else cnt[1]++;

        for(int i = 1; i < board.length();i++){
            if(board.charAt(i) != board.charAt(i-1)) {
                cnt[Integer.parseInt(String.valueOf(board.charAt(i)))]++;
            }
        }
        if(cnt[0] < cnt[1]) System.out.println(cnt[0]);
        else System.out.println(cnt[1]);

    }

}
