import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();

        ArrayList<String> wordList = new ArrayList<>();
        String word="";
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '<') {
                if(!word.isBlank()) {
                    wordList.add(reverseString(word));
                    word = "";
                }wordList.add(String.valueOf(S.charAt(i)));
                
            }else if(S.charAt(i) == '>'){ 
                wordList.add(word);
                wordList.add(">");
                word = "";
            }else {
                word+=S.charAt(i);
            }   
        }
        if(!word.isBlank()) {
            wordList.add(reverseString(word));
            word = "";
        }

        System.out.println(String.join("", wordList));

    }

    /**
     * 문자열을 입력받아 공백으로 분리 후 각각 reverse 후 join
     * @param str 뒤집고 싶은 문자열
     * @return 뒤집은 문자열
     */
    static String reverseString(String str) {
        String[] splitList = str.split(" ");
            for(int j = 0; j < splitList.length; j++) {
                String revStr = new StringBuilder(splitList[j]).reverse().toString();
                splitList[j] = revStr;
            }
        return String.join(" ",splitList);
    }
}
