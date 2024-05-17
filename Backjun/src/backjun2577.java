import java.util.Scanner;

public class backjun2577 {

    public static void main(String[] args) {

        // 1.정수를 입력받을 Scanner 생성
        Scanner scan = new Scanner(System.in);

        // 2.입력받을 정수형 변수 a,b,c 선언
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // 3.정수형 변수 multiplication에 입력받은 정수 a,b,c를 곱한 값을 대입
        int multiplication = a * b * c;
        // 4.multiplication 값을 하나씩 잘라서 배열에 넣기 위하여 문자형 CastMultiplication변수에 multiplication를 형변환 하여 대입
        String CastMultiplication = Integer.toString(multiplication);
        // 5. CastMultiplication를 하나씩 자른 값을 넣기 위하여 정수배열 arr를 선언하고 크기는 CastMultiplication의 길이만큼 선언
        int arr[] = new int[CastMultiplication.length()];
        // 6. CastMultiplication 길이만큼 for문을 돌리고 문자열 CastMultiplication를 charAt으로 하나씩 자르면서 형변환을 통해 arr배열에 넣음
        for(int j = 0; j<CastMultiplication.length(); j++){
           arr[j] =Character.getNumericValue(CastMultiplication.charAt(j));
           }
        // 7.0~9까지 숫자를 세기위해 for문을 돌리고 다시 for문 안에서는 arr배열값과 비교하여 j와 똑같은 값이 있으면 count하여 출력
          for(int j = 0; j<10; j++){

              int count = 0;

              for(int k=0; k<arr.length; k++){
                  if(j==arr[k]){
                      count++;
                  }
              }
              System.out.println(count);
          }
        // 8. 스캐너 종료
        scan.close();

    }
}
