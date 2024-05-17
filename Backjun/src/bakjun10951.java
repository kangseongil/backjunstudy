import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bakjun10951 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a;
        //null이 아닐때까지 해야함
        while((a = br.readLine())!=null){

            StringTokenizer st = new StringTokenizer(a," ");
            int sum1 = Integer.parseInt(st.nextToken());
            int sum2 = Integer.parseInt(st.nextToken());
            System.out.println(sum1+sum2);
        }
    }
}
