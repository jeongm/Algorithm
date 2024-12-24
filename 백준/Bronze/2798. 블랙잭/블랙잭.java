import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt(); 
        ArrayList<Integer> cards = new ArrayList<>();

        for(int i = 0; i < N; i++) 
            cards.add(sc.nextInt());
        
        ArrayList<Integer> cSum = new ArrayList<>(); 

        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                for(int r = j+1; r < N ; r++) {
                    cSum.add(cards.get(i)+cards.get(j)+cards.get(r));
                }
            }
        }
    
       cSum.sort((a,b) -> b.compareTo(a));

        for(int i = 0; i < cSum.size();i++) {
            if(cSum.get(i) <= M) {
                System.out.println(cSum.get(i));
                break;

            }
        }        

        sc.close();
    }
}
