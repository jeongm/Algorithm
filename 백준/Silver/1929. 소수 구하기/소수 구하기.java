import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int M;
    private static int N;
    

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        ArrayList<Boolean> primeList = new ArrayList<>();

        primeList.add(false);
        primeList.add(false);

        for(int i = 2; i <= N; i++) {
            primeList.add(true);
        }

        for( int i = 2; (i*i) <= N ; i++) {
            if(primeList.get(i)){
                for(int j = i*i; j <= N; j+=i) {
                    primeList.set(j, false);
                }
            }
        }

        for( int i = M; i <= N ; i++) {
            if(primeList.get(i) == true){
                System.out.println(i);
            }
        }
    }
}


