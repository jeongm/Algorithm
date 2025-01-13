import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<Character> gather = new ArrayList(Arrays.asList('a','e','i','o','u')); 
        String pwd;
        while ((pwd = br.readLine()).compareTo("end")!=0) {
            boolean rule = true;
            if (pwd.contains("a") || pwd.contains("e") || pwd.contains("i") ||
            pwd.contains("o") || pwd.contains("u")) { // 1. 모음 포함 확인
                // 2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다. 
                for(int i = 0; i < pwd.length()-2; i++){
                    int check = 0;
                    for(int j =i; j <= i+2; j++) {
                        if(gather.contains(pwd.charAt(j))) {
                            check++;
                        }
                    }
                    if(check == 0 || check == 3) {
                        rule = false;
                        break;
                    }
                    
                }
                // 3. 같은글자 2번이상 안됨 단, ee, oo는 허용
                for(int i = 0; i < pwd.length()-1; i++) {
                    if(pwd.charAt(i) == pwd.charAt(i+1) && pwd.charAt(i) != 'e' && pwd.charAt(i) != 'o') { // 3.연속 글자 확인
                        rule = false;
                        break;
                    } 
                }
            }else {
                rule = false;
            }

            if (rule) {
                System.out.println("<" + pwd +"> is acceptable." );
            } else {
                System.out.println("<" + pwd +"> is not acceptable." );
            }
            
        }

    }
}
