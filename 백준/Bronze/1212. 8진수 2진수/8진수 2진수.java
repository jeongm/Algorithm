import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String octalNum = br.readLine();

        StringBuilder binaryNum = new StringBuilder();
        for(int i = 0; i < octalNum.length(); i++){
            int octalTemp = Integer.parseInt(String.valueOf(octalNum.charAt(i)));
            String bTemp = "";
            while(octalTemp != 0){
                bTemp = octalTemp%2 + bTemp;
                octalTemp = octalTemp/2;
            }
            if(i > 0 && bTemp.length() < 3) {
                while(bTemp.length() != 3) bTemp = "0" + bTemp;
            }
            binaryNum.append(bTemp);
        }
        if(binaryNum.length() == 0) binaryNum.append(0);
        System.out.println(binaryNum);


    }

}
