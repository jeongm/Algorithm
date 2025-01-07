import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            String pstfExpr = br.readLine();
            double[] alpa = new double[26];

            for(int i = 0; i < pstfExpr.length(); i++) {
                if(pstfExpr.charAt(i)-0 >= 65 && pstfExpr.charAt(i)-0 <= 90 && alpa[pstfExpr.charAt(i)-65] == 0) {
                    alpa[pstfExpr.charAt(i)-65] = Double.parseDouble(br.readLine());
                } 
            }
            
            Stack<Double> stack = new Stack<>();
            for(int i = 0; i < pstfExpr.length(); i++) {
                if(pstfExpr.charAt(i)-0 >= 65 && pstfExpr.charAt(i)-0 <= 90) {
                    stack.push(alpa[pstfExpr.charAt(i)-65]);
                }else {
                    double b = stack.pop();
                    double a = stack.pop();
                    if(pstfExpr.charAt(i) == '+'){
                        stack.push(a+b);
                    }else if(pstfExpr.charAt(i) == '-'){
                        stack.push(a-b);
                    }else if(pstfExpr.charAt(i) == '*'){
                        stack.push(a*b);
                    }else if(pstfExpr.charAt(i) == '/'){
                        stack.push(a/b);
                    }                
                }
            }

            System.out.println(String.format("%.2f",stack.pop()));            

    }

}
