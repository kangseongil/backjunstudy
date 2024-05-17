import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjun11021 {
    public static void main(String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopNum = Integer.parseInt(br.readLine());
        String num;
        StringTokenizer st;

        for(int i = 1; i<=loopNum; i++){
            num = br.readLine();
            st = new StringTokenizer(num," ");
            int sum =Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            System.out.println("Case #"+i+":"+" "+sum);
        }
    }
}
