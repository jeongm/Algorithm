import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String octalNum = br.readLine();
        String[] binaryMap = {
            "000","001","010","011","100","101","110","111"
        };

        StringBuilder binaryNum = new StringBuilder();
        for(int i = 0; i < octalNum.length(); i++){
            int octalTemp = octalNum.charAt(i)-'0';
            binaryNum.append(binaryMap[octalTemp]);
        }

        int idx = 0;
        while(idx < binaryNum.length() && binaryNum.charAt(idx) == '0'){
            idx++;
        }

        if(octalNum.equals("0")) System.out.println(0);
        else System.out.println(binaryNum.substring(idx));


    }

}
