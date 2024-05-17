import java.util.Scanner;

public class backjun3052 {

    public static  void main(String[] args){


        //방법1 for문으로
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        boolean bl  ;
        int count = 0;

        for(int a = 0; a<10; a++){
            int num = sc.nextInt();
            int remainder = num % 42;
            arr[a]=remainder;
        }

        for(int a = 0; a<10; a++){
            bl = false;
          for(int b = a+1; b<arr.length; b++){
              if(arr[a]==arr[b]){
                  bl=true;
                  break;
              }
          }
          if(bl==false){
              count++;
          }
        }

        System.out.println(count);
    }
}
