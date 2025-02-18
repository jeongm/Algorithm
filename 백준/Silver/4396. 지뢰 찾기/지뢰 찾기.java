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
                if(input.charAt(j) == 'x' && board[i][j] == '*'){
                    flag = true;
                }
                if(input.charAt(j) == 'x'&& board[i][j] != '*'){
                    board[i][j] = input.charAt(j);
                    playBoard[i][j] = '0';
                }
                else {
                    playBoard[i][j] = '.';
                }

            }
                
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(flag && board[i][j] == '*') playBoard[i][j] = '*';
                if(board[i][j] == '*'){
                    // 보드판
                    if( j-1 >= 0 && board[i][j-1] == 'x' ) playBoard[i][j-1]++;
                    if( j+1 < n && board[i][j+1] == 'x' ) playBoard[i][j+1]++;
                    if(i+1 < n && j-1 >= 0 && board[i+1][j-1] == 'x') playBoard[i+1][j-1]++;
                    if(i+1 < n && board[i+1][j] == 'x') playBoard[i+1][j]++;
                    if(i+1 < n && j+1 < n && board[i+1][j+1] == 'x') playBoard[i+1][j+1]++;
                    if(i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 'x') playBoard[i-1][j-1]++;
                    if(i-1 >= 0 && board[i-1][j] == 'x') playBoard[i-1][j]++;
                    if(i-1 >= 0 && j+1 < n && board[i-1][j+1] == 'x') playBoard[i-1][j+1]++;
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
