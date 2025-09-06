package ex;

public class Ex3 {
    public static void main(String[] args) {
        // n 변수를 사용해 1~5까지 합계를 구하는 프로그램을 작성하세요.
        // while, for 2가지 버전의 정답을 만들어야 합니다

        // for

        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        // while

        int n2 = 1;
        sum = 0; // 초기화

        while (n2 <= 5) {
            sum += n2;
            n2++;
        }
        System.out.println(sum);
    }
}
