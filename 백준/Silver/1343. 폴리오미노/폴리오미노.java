import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        
        String polyominoBoard = "";
        for(int start = 0, end = 0; end < board.length();end++){
            if(board.charAt(end) == '.' || end+1 == board.length()){
                int targetLen = 0;
                if(board.charAt(end) == '.') targetLen = end-start;
                else targetLen = end-start+1;
                
                for(int j = targetLen/4; j >= 0; j--){ // 사전순이므로 A우선
                    if((targetLen-j*4)%2 == 0){
                        //j*4만큼 A로 채우고 나머지는 B로 채움
                        polyominoBoard += "A".repeat(j*4);
                        polyominoBoard += "B".repeat(targetLen-j*4);
                        break;
                    }
                }
                if(board.charAt(end) == '.') polyominoBoard+=".";
                if(polyominoBoard.length() != end+1) {
                    System.out.println(-1);
                    return;
                }
                start = end+1;
            }

        }

        System.out.println(polyominoBoard);

    }

    

}
