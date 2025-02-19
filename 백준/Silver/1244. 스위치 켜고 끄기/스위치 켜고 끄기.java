import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] switchs = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n ; i++) {
            switchs[i] = Integer.parseInt(st.nextToken());
        }

        // 학생 수
        int sn = Integer.parseInt(br.readLine().strip());
        for(int i = 0; i < sn; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int targetNum = Integer.parseInt(st.nextToken());

            if(gender == 1){ // 남학생일 경우 1
                for(int j = targetNum-1; j < n ; j++) {
                    if((j+1)%targetNum == 0) {
                        switchs[j] ^= 1; // xor 연산 사용 같으면 0, 다르면 1
                    }
                }

            }else { // 여학생일 경우 2
                switchs[targetNum-1] ^= 1;

                for(int j = targetNum, range = 2; j < n && j-range >= 0 ; j++, range+=2){
                    if(switchs[j] == switchs[j-range]) {
                        switchs[j] ^= 1;
                        switchs[j-range] ^= 1; 
                    }
                    else break;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(i != 0 && i%20 == 0) System.out.println();
            System.out.print(switchs[i] + " ");

        }

    }

}
