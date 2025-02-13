import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> products = new ArrayList<>();
        for(int i = 0; i < N; i++) products.add(Integer.parseInt(br.readLine()));

        products.sort(Collections.reverseOrder());
        int totalPrice = 0;
        for(int i = 0; i < N; i++) {
            if(i%3 == 2) continue;
            totalPrice+= products.get(i);
        }

        System.out.println(totalPrice);

    }

}
