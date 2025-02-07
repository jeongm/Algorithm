import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static String T;
    static int N;
    static int[] bookPrice;
    static String[] bookTitle;
    static int minPrice = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        T = br.readLine();
        N = Integer.parseInt(br.readLine());
        bookPrice = new int[N];
        bookTitle = new String[N];

        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bookPrice[i] = Integer.parseInt(st.nextToken());
            bookTitle[i] = st.nextToken();
        }

        bookSubset(0, 0, new Stack<>());

        if(minPrice == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else{
            System.out.println(minPrice);
        }
        
    }

    static void bookSubset(int start, int depth, Stack<Integer> subset){
        int priceSum = 0;
        String[] selectBook = new String[N];
        for(int i = 0; i < subset.size(); i++) {
            priceSum += bookPrice[subset.get(i)];
            selectBook[i] = bookTitle[subset.get(i)];
        }
        if(priceSum > minPrice) return;
        

        int find = 0;
        for(int i = 0; i < T.length(); i++) {
            boolean flag = false;
            for(int j = 0; j < subset.size(); j++) {
                for(int k = 0; k < selectBook[j].length();k++){
                    if(T.charAt(i) == selectBook[j].charAt(k)){
                        flag = true;
                        find++;
                        selectBook[j] = selectBook[j].replaceFirst(String.valueOf(T.charAt(i)), "");
                        break;
                    }
                }
                if(flag) break;
            }
            
        }
        if(find == T.length() && priceSum < minPrice){
            minPrice = priceSum;
        }
        
        if(depth == N) {
            return;
        }
        for(int i = start; i < N; i++) {
            subset.add(i);
            bookSubset(i+1, depth+1, subset);
            subset.pop();
        }

    }
}
