import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            int ab = 1;

            int insu = 2;
            while(insu <= a || insu <= b) {
                if(a%insu == 0 && b%insu == 0) {
                    a /= insu;
                    b /= insu;
                    ab *= insu;
                }else {
                    insu++;
                }
            }
            System.out.println(ab);
            ab *= a*b;
            System.out.println(ab);

        sc.close();
    }

}
