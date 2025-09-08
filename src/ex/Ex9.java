package ex;

public class Ex9 {
    public static void main(String[] args) {
        // for 문을 사용하여 다음과 같은 결과가 나오도록 프로그램을 작성하세요
        // System.out.print(""); 줄바꿈 없는 출력문
        // 힌트 -> 중첩 반복문 (for)
        // *        i = 1, j = 1
        // **       i = 2, j  =2
        // ***
        // ****
        // *****

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
