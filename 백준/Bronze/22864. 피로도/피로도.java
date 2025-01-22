import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
                         
        int work=0;
        int firo=0;
        for(int i = 0; i < 24; i++) {
            if(firo+A > M) {
                // 쉰다
                if(firo-C <0) {
                    firo = 0;
                }else {
                    firo -= C;
                }
            }else {
                firo += A;
                work += B;
            }
        }
        System.out.println(work);
    }
}
