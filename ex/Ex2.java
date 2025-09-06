package ex;

public class Ex2 {
    public static void main(String[] args) {
        // num 변수를 사용해 1~10까지 짝수만 출력하는 프로그램을 작성하세요
        // while, for 2가지 버전의 정답을 만들어야 합니다.

        //for

        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        //선생님 풀이
        // for (int num = 2; num <= 10; num += 2) {
        //      System.out.println(num);
        //      }


        //while

        int num= 10;
        while  (num < num) {
            System.out.println(num);
            num++;
        }

    }

}
