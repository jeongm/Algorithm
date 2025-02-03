import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //DNA의 수
        int M = Integer.parseInt(st.nextToken()); //문자열의 길이

        char[][] dnaArr = new char[N][M];
        for(int i = 0; i< N; i++) {
            String dna = br.readLine();
            for(int j = 0; j < M; j++) {
                dnaArr[i][j] = dna.charAt(j);
            }
        } 

        StringBuilder HDMinDna = new StringBuilder(); // Hamming Distance DNA
        int HDMinSum = 0; // Hamming Distance의 합
        for(int col = 0; col < M; col++){
            // ACGT 4 배열 만들어서 개수 카운트
            int[] dnaCnt = new int[4];
            for(int row = 0; row < N; row++) {
                switch (dnaArr[row][col]) {
                    case 'A': dnaCnt[0]++; break;
                    case 'C': dnaCnt[1]++; break;    
                    case 'G': dnaCnt[2]++; break;
                    case 'T': dnaCnt[3]++; break;
                    default: break;
                }

            }
            //각 컬럼에서 가장 많은놈을 새 스트링에 추가 
            int maxDnaIdx = 0;
            for(int i = 1; i < 4; i++) {
                if(dnaCnt[maxDnaIdx] < dnaCnt[i] ) {
                    maxDnaIdx = i;
                }
            }
            switch (maxDnaIdx) {
                case 0: HDMinDna.append("A"); break;
                case 1: HDMinDna.append("C"); break;    
                case 2: HDMinDna.append("G"); break;
                case 3: HDMinDna.append("T"); break;
                default: break;
            }
            // Hamming Distance의 합: DNA의 수-각 컬럼에서 가장 개수가 많은 친구
            HDMinSum += N-dnaCnt[maxDnaIdx];

        }

        System.out.println(HDMinDna);
        System.out.println(HDMinSum);

    }
}
