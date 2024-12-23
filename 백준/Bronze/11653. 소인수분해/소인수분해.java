import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = N;
        int insu = 2;
        while(num >= insu) {
            if (num % insu == 0) {
                num /= insu;
                System.out.println(insu); 
            } else {
                insu ++;
            }
        }

        sc.close();
    }
}
