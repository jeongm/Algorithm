import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int T;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            
            System.out.println((num1*num2)/gcd(num1,num2));
        }
    }

    public static int gcd(int num1, int num2){
        int re;

        while(num2 != 0){
            re = num1%num2;
            num1 = num2;
            num2 = re;
        }
        return num1;
    }

}


