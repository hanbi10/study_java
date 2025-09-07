package ex;

public class Ex7 {
    public static void main(String[] args) {
        //1부터 20까지 출력하되, 3의 배수는 건너뛰고 출력하세요
        // for 문을 사용해 작성하세요

        for (int i = 1; i<=20; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }

        //다른 풀이
//        for (int i =1; i<=20; i++) {
//            continue; //배수 건너뛰기
//            System.out.println(i);
//        }
    }
}
