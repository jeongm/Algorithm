import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cycleCnt = 0;
        int newN = N;

        do {
            newN = (newN%10*10) + (newN/10 + newN%10)%10;
            cycleCnt += 1;
        }while(N != newN);

        System.out.println(cycleCnt);

        sc.close();
    }
}
