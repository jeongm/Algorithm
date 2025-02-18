import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n];
        char[][] playBoard = new char[n][n];

        for(int i = 0; i < n; i++){
            String input = br.readLine();
            for(int j = 0; j < n; j++){
                board[i][j] = input.charAt(j);
            }
        }
        boolean flag = false;
        for(int i = 0; i < n; i++){
            String input = br.readLine();
            for(int j = 0; j < n; j++){
                // * x 겹칠 때 - *, x 혼자 - 0, 그외 .
                if(input.charAt(j) == 'x' && board[i][j] == '*'){
                    flag = true;
                    playBoard[i][j] = '*';
                }
                else if(input.charAt(j) == 'x'&& board[i][j] != '*'){
                    board[i][j] = 'x';
                    playBoard[i][j] = '0';
                }
                else {
                    playBoard[i][j] = '.';
                }

            }
                
        }

        // 보드판
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(flag && board[i][j] == '*') playBoard[i][j] = '*';
                if(board[i][j] == '*'){
                    // 지뢰 주변 8방향
                    int[] x = {-1,-1,-1,0,0,1,1,1};
                    int[] y = {-1,0,1,-1,1,-1,0,1}; 
                    for(int d = 0; d < 8; d++){
                        int ni = i + x[d];
                        int nj = j + y[d];

                        if( ni >= 0 && ni < n && nj >=0 && nj < n && board[ni][nj] == 'x')
                            playBoard[ni][nj]++;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(playBoard[i][j]);
            }
            System.out.println();

        }

    }

}
