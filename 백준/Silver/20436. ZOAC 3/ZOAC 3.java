import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static String[] engKeyboard = {
        "qwertyuiop",
        "asdfghjkl",
        "zxcvbnm"};
    static String[] korKeyboard = {
        "ㅂㅈㄷㄱㅅㅛㅕㅑㅐㅔ", 
        "ㅁㄴㅇㄹㅎㅗㅓㅏㅣ",
        "ㅋㅌㅊㅍㅠㅜㅡ"};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] firstHand = new char[2];
        firstHand[0] = st.nextToken().charAt(0); // 왼
        firstHand[1] = st.nextToken().charAt(0); // 오
        String targetStr = br.readLine();
        
        String korVowel = "ㅛㅕㅑㅐㅔㅗㅓㅏㅣㅠㅜㅡ";

        // 처음 손 위치
        int[] leftPreviousXY = findHandPosition(firstHand[0]); // 0:x, 1:y
        int[] rightPreviousXY = findHandPosition(firstHand[1]);
        int minTime = 0;
    
        for(int i = 0; i < targetStr.length(); i++) {
            char targetWord = targetStr.charAt(i);
            // 위치찾기 
            int[] targetXY = new int[2];
            targetXY = findHandPosition(targetWord);
            // targetWord가 한글 모음인지 자음인지 확인, 위치계산
            if(korVowel.contains(String.valueOf(korKeyboard[targetXY[0]].charAt(targetXY[1])))){ //모음임 y-y
                minTime += Math.abs(rightPreviousXY[0]-targetXY[0]) + Math.abs(rightPreviousXY[1]-targetXY[1]);
                rightPreviousXY = targetXY;
                
            }else {// 자음임
                minTime += Math.abs(leftPreviousXY[0]-targetXY[0]) + Math.abs(leftPreviousXY[1]-targetXY[1]);
                leftPreviousXY = targetXY;
            }
        }

        System.out.println(minTime + targetStr.length());

    }

    static int[] findHandPosition(char targetWord){ // 손 위치 찾기

        for(int r = 0; r < 3 ; r++) {
            for(int c = 0; c < engKeyboard[r].length(); c++) {
                if(engKeyboard[r].charAt(c) == targetWord){
                    return new int[]{r,c};
                }
            }
        }

        return new int[2];
    }

}
