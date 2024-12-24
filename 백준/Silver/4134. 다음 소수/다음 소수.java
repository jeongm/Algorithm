import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        for(int tc = 0 ; tc < TC; tc++) {
            long n = sc.nextLong();
            
            for(long i = n; ; i++) {
                if(isPrime(i) == true) {
                    System.out.println(i);
                    break;
                }
            }
        }

        sc.close();
    }

    static boolean isPrime(long num) {
        
        if(num == 0 || num == 1) 
            return false;
        for(long i = 2; i <= Math.sqrt(num); i++) {
            if(num %i == 0) {
                return false;
            }
        }

        return true;
    }

}
