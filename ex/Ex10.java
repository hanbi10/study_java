package ex;

import jdk.swing.interop.SwingInterOpUtils;

public class Ex10 {
    public static void main(String[] args) {
        // 1부터 시작해서 숫자를 계속 누적하세요 (조건 기반 반복)

        // 아래의 조건에 따라 값을 기록, 출력하세요
        // 1. 짝수의 합이 200 이상 되는 순간, 그 합을 기록한다. (최초의 순간)
        // 2. 홀수의 합이 150 이상 되는 순간, 그 합을 기록한다. (최초의 순간)
        // 3. 짝수의 합이 300 이상 홀수의 합이 200 이상 되는 순간 반복문을 종료한다.
        // 4. 200 이상이 되는 순간의 짝수합을 출력한다
        // 5. 150 이상이 되는 순간의 홀수합을 출력한다.
        // 6. 둘 중 어떤 조건이 먼저 만족되었는지 출력한다.
        // 7. 마지막으로 더한 수가 짝수인지 홀수인지 출력한다.

        int evenSum = 0; // 현재까지 누적된 짝수의 합
        int oddSum = 0; // 현재까지 누적된 홀수의 합
        int count = 0; // 초기식 -> 삼항연사자를 통해 판단

        int evenSumTo200 = 0; //200 이상 짝수 (최초의 순간)
        int oddSumTo150 = 0; // 150 이상 홀수 (최초의 순간)

        boolean check = false; // 처음 조건 도달 여부 확인
        String result = ""; // 처음 조건 도달한 쪽 (홀수/짝수)

        while (true) {
            count++;

            if (oddSum >= 300 && evenSum >= 200) { // 짝수의 합이 300 이상 홀수의 합이 200 이상 되는 순간
                break; // 반복문 종료
            }

            if (count % 2 == 0) {
                evenSum += count;
            } else {
                oddSum += count;
            }

            if (oddSum >= 150 && oddSumTo150 == 0) {
                oddSumTo150 = oddSum; // 기록
                if (!check) {
                    result = "홀수";
                    check = true;
                }
            }

            if (evenSum >= 200 && evenSumTo200 == 0) {
                evenSumTo200 = evenSum;
                if (!check) {
                    result = "짝수";
                    check = true;
                }
            }
        }

        System.out.println("결과");
        System.out.println("짝수합 : " + evenSum + " 처음 200 이상 도달 짝수합:" + evenSumTo200);
        System.out.println("홀수합 : " + oddSum + " 처음 150 이상 도달 홀수합:" + oddSumTo150);
        System.out.println("마지막으로 더한 수 : " + count + " 짝수/홀수 여부: " + (count % 2 == 0 ? "짝수" : "홀수"));
        System.out.println("처음 조건 도달 : " + result);
    }

}
