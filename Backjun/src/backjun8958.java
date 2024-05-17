import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjun8958  {
    public  static  void main(String[] args) throws IOException {

        //1.배열크기 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr =new String[Integer.parseInt(br.readLine())];

        for(int i = 0; i<arr.length; i++){
            //2.배열에 값 삽입
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i] = st.nextToken();
        }

        //3.입력한 배열 크기만큼 for
       for(String result : arr){
           int sum = 0;
           int count = 0;
           //4. 배열에 들어있는 문자열 길이만큼 for
           for(int i=0; i<result.length(); i++){
               //5.배열의 글자가 0일경우
               if(result.charAt(i)=='O'){
                   //문자열의 첫번쨰가 0일경우 1이니깐 1을 더하고 카운트를 ++해줌
                   if(i ==0){
                       sum = sum + 1;
                       count++;
                   //문자가 0이고 첫번째가 아닐경우 앞에 문자를 확인해서 0일경우
                   }else if(i != 0 && result.charAt(i-1)=='O'){
                       //먼저 ++해주고
                       //OO일경우 1+2가 되어야 한다. 이경우 첫번쨰에서 카운트를 해서 1이고 그다음은 2가 되어야 하는데 이경우 먼저 증감을 시켜서 더해줘야한다.
                       ++count;
                       //그다음 썸하고 더하기
                       sum = sum + count;
                   //문자열의 첫번째가 아니고 앞글자가 x일경우는 1이므로 sum에 1을 더하고 카운트를 해준다.
                   }else if(i != 0 && result.charAt(i-1)=='X'){
                       sum = sum + 1;
                       count++;
                   }
                 }else {
                   //x일경우 아무것도 하지않고 카운트를 초기화 한다.
                   count = 0;
               }
            }
           //4. 출력
           System.out.println(sum);
       }
    }
}
