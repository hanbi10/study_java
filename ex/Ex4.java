package ex;

public class Ex4 {
    public static void main(String[] args) {
        // 1부터 100까지 숫자중 짝수 합과 홀수 합을 각각 구하세요.
        // for 문을 사용해 작성하세요

        int n = 100;
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {
            if  (i % 2 == 0) {
                even++;
            }
            else odd++;
        }
        System.out.println(even);
        System.out.println(odd);


        // 선생님 풀이

//        int evenSum = 0;
//        int oddSum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                evenSum = i;
//            } else {
//                    oddSum += i;
        //soutv 단축키
        System.out.println("odd = " + odd);
//        System.out.println(evenSum);
//        System.out.println(oddSum);
    }
}
