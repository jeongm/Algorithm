import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String K = st.nextToken();
        
        //0~24시 0~59분 0~59초 -> 11시 09분 16초 -> 0이 있음
        int cnt =0;
        for(int hour =0; hour < N+1; hour++){
            for(int min = 0; min < 60; min++) {
                for(int sec = 0; sec < 60; sec++) {
                    String hStr = String.valueOf(hour).length() < 2 ? "0" + String.valueOf(hour) :String.valueOf(hour);
                    String mStr = String.valueOf(min).length() < 2 ? "0" + String.valueOf(min) :String.valueOf(min);
                    String sStr = String.valueOf(sec).length() < 2 ? "0" + String.valueOf(sec) :String.valueOf(sec);
                    String timeStr = hStr + mStr + sStr;
                    if (timeStr.contains(K)){
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
        
    }
}
