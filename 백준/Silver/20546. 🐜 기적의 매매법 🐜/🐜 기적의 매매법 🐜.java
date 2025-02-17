import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] stocks = new int[14];
        for(int i = 0; i < 14; i++ ) {
            stocks[i] = Integer.parseInt(st.nextToken());
        }

        int joonhyunMoney = money;
        int joonhyunStock = 0;
        int seongminMoney = money;
        int seongminStock = 0;
        for(int i = 0; i < 14; i++) {
            // 준현
            if(joonhyunMoney != 0) { 
                joonhyunStock += joonhyunMoney/stocks[i];
                joonhyunMoney %= stocks[i];
            }
            // 성민
            if(i > 2 ) {
                if(stocks[i-3] >=  stocks[i-2] && stocks[i-2] >= stocks[i-1] && stocks[i-1] >= stocks[i]) { // 하락 -> 전량 매수
                    seongminStock += seongminMoney/stocks[i];
                    seongminMoney %= stocks[i];
                }
                else if(stocks[i-3] < stocks[i-2] && stocks[i-2] < stocks[i-1] && stocks[i-1] < stocks[i] ) { // 상승 -> 전량 매각
                    seongminMoney += seongminStock * stocks[i];
                    seongminStock = 0;
                }                
            }

        }

        if(stocks[13]*joonhyunStock + joonhyunMoney > stocks[13]*seongminStock + seongminMoney){
            System.out.println("BNP");
        }else if(stocks[13]*joonhyunStock + joonhyunMoney < stocks[13]*seongminStock + seongminMoney){
            System.out.println("TIMING");
        }else {
            System.out.println("SAMESAME");
        }

    }

}
