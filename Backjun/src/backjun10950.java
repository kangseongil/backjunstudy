import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class backjun10950 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String end = br.readLine();

        for(int i = 0; i<Integer.parseInt(end); i++){

            String a = br.readLine();

            StringTokenizer st = new StringTokenizer(a," ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            System.out.println(b+c);
        }
    }
}
