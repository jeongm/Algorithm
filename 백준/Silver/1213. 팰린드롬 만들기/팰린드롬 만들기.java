import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String engName = br.readLine();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < engName.length();i++) {
            list.add(String.valueOf(engName.charAt(i)));
        }

        list.sort(null);

        StringBuilder frontStr = new StringBuilder();
        StringBuilder backStr = new StringBuilder();
        for(int i = 0; i < (int)engName.length() && list.size() > 1; i++) {
            if(list.get(0).compareTo(list.get(1)) != 0) {
                list.add(list.remove(0));
                continue;
            }
            frontStr.append(list.remove(0));
            backStr.insert(0,list.remove(0));
        }

        
        if(engName.length()%2 == 1 && list.size() == 1) {
            frontStr.append(list.remove(0));
        }

        if(list.size() > 1) {
            System.out.println("I'm Sorry Hansoo");
        }else {
            System.out.println(frontStr.append(backStr));
        }
        
    }
}
