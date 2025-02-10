import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N = 4, 1 1 2 2 3 3 4 4 -> 2개*1 2개*2 2개*3 2개*4 -> 20
        // 최소가 되는 경우 -> 11과 같이 사이에 길이가 2인 경우-> 자리만 변경 -> 팩토리얼

        System.out.println(factorial(N));

    }

    static int factorial(int n) {
        if(n < 2) return 1;
        return factorial(n-1) * n;
    }

}
