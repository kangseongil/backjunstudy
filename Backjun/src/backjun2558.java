import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjun2558 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ="";
        int sum = 0;
        for(int i = 0; i<2; i++){
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, "");
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
