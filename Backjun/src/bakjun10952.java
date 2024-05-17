import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bakjun10952 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num;
        StringTokenizer st;

        while((num = br.readLine())!=null) {
            st = new StringTokenizer(num, " ");
            int sumNum1 = Integer.parseInt(st.nextToken());
            int sumNum2 = Integer.parseInt(st.nextToken());

            if (sumNum1 == 0 && sumNum2 == 0) {
                break;
            }
            System.out.println(sumNum1 + sumNum2);
        }
    }
}
