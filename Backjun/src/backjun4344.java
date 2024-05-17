import  java.io.*;
import  java.util.*;

public class backjun4344 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[Integer.parseInt(br.readLine())];


        for(int i = 0; i<arr.length; i++){
            arr[i] = br.readLine();
        }

        for(String arrResult : arr){
            double sum = 0;
            for(int i = 0; i<arr.length; i++) {
                StringTokenizer st = new StringTokenizer(arr[i]);
                System.out.println(st.nextToken());
            }
        }




    }
}
