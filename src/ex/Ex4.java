package ex;

public class Ex4 {
    public static void main(String[] args) {
        // 1부터 10까지 숫자를 짝수 합과 홀수 합을 각각 구하세요
        // for 문을 사용해 작업하세요



        int n = 100;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            System.out.println(even);
            System.out.println(odd);
        }

        // 다른 풀이

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum++;
            } else {
                oddSum++;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(evenSum == oddSum);
    }
}
