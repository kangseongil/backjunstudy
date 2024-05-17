import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class backjun3052two {

    public static  void main(String args[]) throws IOException {

        //배열로 할 수 있지만 HashSet으로도 풀 수 있다.
        //HashSet은 중복값을 저장하지 않는다. 그러므로 입력한 10개의 값을 HashSet에 담고 Size를 출력하면 된다.

        //Scanner input = new Scanner(System.in);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> result = new HashSet<Integer>();

        for(int a = 0; a<10; a++){
              int num = Integer.parseInt(bf.readLine());
//            int num = input.nextInt();
              int remainder = num % 42;
              result.add(remainder);
        }
        System.out.println(result.size());

    }

}
