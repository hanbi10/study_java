package ex;

public class Ex1 {
    public static void main(String[] args) {
        // index라는 변수를 사용해 10부터 20까지 자연수를 출력하는 프로그램을 작성하세요
        // while, for 두가지 버전의 정답을 만들어야 합니다

        // for

        for (int index = 10; index <= 20; index++) {
            System.out.println(index);
        }

        // while

        int index = 10;

        while (index <= 20) {
            System.out.println(index);
            index++;
        }
    }
}
