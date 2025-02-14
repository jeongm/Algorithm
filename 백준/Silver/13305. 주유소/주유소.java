import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 도시의 개수

        int[] roadDistances = new int[N-1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N-1; i++){
            roadDistances[i] = Integer.parseInt(st.nextToken());
        }
        int[] fuelPrices = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            fuelPrices[i] = Integer.parseInt(st.nextToken());
        }

        long totalPrice = 0;
        long minFuelPrice = fuelPrices[0];
        for(int i = 0 ; i< N-1; i++){
            totalPrice += minFuelPrice * roadDistances[i];
            if(fuelPrices[i+1] < minFuelPrice){  // 다음 주유소 가격이 지금 가격보다 싸면 변경
                minFuelPrice = fuelPrices[i+1];
            }
            
        }
        
        System.out.println(totalPrice);
    }

}
