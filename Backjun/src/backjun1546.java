import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class backjun1546 {
    public  static  void main(String args[]) throws IOException {
        //1.몇 과목인지 입력
        //Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //2.배열에 선언
        //double[] arr = new double[scan.nextInt()];
        double arr[] = new double[Integer.parseInt(br.readLine())];

        //3.배열에 저장
        for(int a = 0; a<arr.length; a++){
            //arr[a] = scan.nextInt();
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[a] = Double.parseDouble(st.nextToken());
        }
        //4.최대값을 구하기 위해서 배열 정렬
        Arrays.sort(arr);
        //5.최대값 저장(배열의 맨 마지막께 최대값)
        double maxNum = arr[arr.length-1];
        //6.총 합을 구하기 위해서 변수 선언
        double sum = 0;
        //7.배열에 저장 되어있는 점수 모두 더하기
        for (double result : arr) {
            //sum = sum+result
              sum += result;
        }
        //8.평균 구하기
        double score = ((sum/maxNum)*100)/arr.length;
        System.out.print(score);
    }
}
