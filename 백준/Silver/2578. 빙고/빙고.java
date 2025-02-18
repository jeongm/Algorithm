import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] bingoBoard = new int[5][5];
        

        // 빙고판
        for(int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++) {
                bingoBoard[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 사회자가 부름
        int[] targetNumbers = new int[25];
        for(int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++) {
                targetNumbers[i*5+j] = Integer.parseInt(st.nextToken());
            }
        }

        int bingoCnt = 0;
        for(int i = 0; i <25; i++){
            int targetNum = targetNumbers[i];
            boolean searchFlag = false;
            for(int r = 0; r < 5 && !searchFlag ; r++) {
                for(int c = 0; c < 5 && !searchFlag; c++) {
                    if(targetNum == bingoBoard[r][c]) {
                        bingoBoard[r][c] = 0;
                        searchFlag = true;
                    }
                }
            }

            // 빙고판 확인
            // 가로확인5개, 세로확인5개
            bingoCnt = 0;
            for(int r = 0; r < 5; r++){
                int rowCnt = 0;
                int colCnt = 0;
                for(int c = 0; c < 5; c++) {
                    if(bingoBoard[r][c] == 0) rowCnt++;
                    if(bingoBoard[c][r] == 0) colCnt++;
                }
                if(rowCnt == 5) bingoCnt++;
                if(colCnt == 5) bingoCnt++;
            }
            //대각선 확인 2개
            if(bingoBoard[0][0]==0 && bingoBoard[1][1]==0 && bingoBoard[2][2]==0 && bingoBoard[3][3]==0&&bingoBoard[4][4]==0) bingoCnt++;
            if(bingoBoard[0][4]==0 && bingoBoard[1][3]==0 && bingoBoard[2][2]==0 && bingoBoard[3][1]==0&&bingoBoard[4][0]==0) bingoCnt++;
            if(bingoCnt >= 3) {
                System.out.println(i+1);
                return;
            }

        }
        
    }

}
