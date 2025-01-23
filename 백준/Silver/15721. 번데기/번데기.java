import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine()); 
        int T = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine()); 

        int beondegiCnt = 2;
        int[] beondegi = {0,0};
        int beondegiLen = 4+beondegiCnt*2;
        
        int i = 0;
        for(;;) {
            for(int j = 0; j < beondegiLen; j++) {
                if(j%beondegiLen == 0 || j%beondegiLen == 2 || (j%beondegiLen > 3 && j % beondegiLen < 4+beondegiCnt )) {
                    //뻔
                    beondegi[0]++;
                }else {
                    //데기
                    beondegi[1]++;
                }
                if(beondegi[target] == T){
                    System.out.println(i%A);
                    return;
                }
                i++;
            }
            beondegiLen = 4+(++beondegiCnt)*2;
        }
    }
}
