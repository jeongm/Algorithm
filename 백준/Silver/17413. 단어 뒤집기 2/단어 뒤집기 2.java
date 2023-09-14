import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {    

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String result ="";
                
        boolean flag = true;
        String word="";
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '<') {
                flag = false;
                StringBuffer sb = new StringBuffer(word);
                result += sb.reverse().toString();
                word = "";
            }
            else if (str.charAt(i) == '>') {
                flag = true;
                result += str.charAt(i);
                continue;
            }

            if(flag == false) {
                result += str.charAt(i);
            }
            else {
                if(str.charAt(i) == ' ') {
                    StringBuffer sb = new StringBuffer(word);
                    result += sb.reverse().toString() + ' ';
                    word = "";
                }
                else {
                    word+=str.charAt(i);
                }
                
            }
        }

        if(word.length() != 0) {
            StringBuffer sb = new StringBuffer(word);
            result += sb.reverse().toString();
        }

        System.out.println(result);

    }

}