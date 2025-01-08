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

                Queue<Integer> dcmQueue = new LinkedList<>();
                Queue<Integer> imprtDcmQueue = new LinkedList<>();
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < dcmCnt; j++) {
                    dcmQueue.add(j);
                    imprtDcmQueue.add(Integer.parseInt(st.nextToken()));
                }

                int printCnt = 0;
                while(!imprtDcmQueue.isEmpty()) {
                    int imprtDcm = imprtDcmQueue.poll();
                    int dcm = dcmQueue.poll();
                    if(imprtDcmQueue.isEmpty() || imprtDcm >= Collections.max(imprtDcmQueue) ) {
                        if(dcm == wonderDcm) {
                            System.out.println(++printCnt);
                            break;
                        }
                        printCnt++;
                    }else {
                        imprtDcmQueue.add(imprtDcm);
                        dcmQueue.add(dcm);
                    }
                }

            }


            
    }

}
