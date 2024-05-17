public class programmersSort {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0){
            answer = s.charAt(s.length()/2-1)+""+ s.charAt(s.length()/2);
        }else{
            //빈문자를 대입
            answer = s.charAt(s.length()/2)+"";
        }
        return answer;
    }


    public static void main(String[] args){


        String s = "c";

        programmersSort sol = new programmersSort();

        System.out.println(sol.solution("abㅇㅊeㅇ"));



    }
}
