import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bakjun10953 {
    public  static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCount = Integer.parseInt(br.readLine());
        String a;
        StringTokenizer st ;

        for(int i = 0; i<loopCount; i++){

            a = br.readLine();
            String[] b = a.split(",");
            System.out.println(Integer.parseInt(b[0])+Integer.parseInt(b[1]));
        }
    }
}
