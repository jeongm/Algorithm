import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        Map<String,Integer> extensionMap = new TreeMap<>();

        for(int i =0; i < N; i++) {
            String[] file = br.readLine().split("\\.");
            extensionMap.put(file[1], extensionMap.getOrDefault(file[1], 0)+1);
        }

        for(Map.Entry<String,Integer> extension : extensionMap.entrySet()) {
            System.out.println(extension.getKey() + " " + extension.getValue());
        }
        

    }


}
