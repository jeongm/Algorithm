import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            for(int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int dcmCnt = Integer.parseInt(st.nextToken());
                int wonderDcm = Integer.parseInt(st.nextToken());

                Queue<int[]> dcmQueue = new LinkedList<>();
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < dcmCnt; j++) {
                    int imprt = Integer.parseInt(st.nextToken());
                    dcmQueue.add(new int[]{j,imprt});
                }

                int printCnt = 0;
                while(!dcmQueue.isEmpty()) {
                    int[] dcm = dcmQueue.poll();
                    boolean maxCheck = true;
                    for(int[] od : dcmQueue) {
                        if(dcm[1] < od[1]){
                            maxCheck = false;
                            break;
                        }
                    }
                    if(maxCheck) {
                        printCnt++;
                        if(dcm[0] == wonderDcm) {
                            System.out.println(printCnt);
                            break;
                        }
                    }else {
                        dcmQueue.add(dcm);
                    }
                }

            }
    }

}
