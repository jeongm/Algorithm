import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();

            long big = Math.max(a, b);
            long small = Math.min(a, b);

            while(big%small != 0) {
                long tmp = big%small;
                big = small;
                small = tmp;
            }
            long LCM = (Long)a*b/small;
            System.out.println(LCM);

        }

        sc.close();
    }

}
