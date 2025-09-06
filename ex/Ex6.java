package ex;

public class Ex6 {
    public static void main(String[] args) {
        // 10부터 1까지 역순으로 출력하세요.
        // while, for 2가지 버전의 정답을 만들어야 합니다

        // for

        for  (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // while

        int n = 10;

        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}

