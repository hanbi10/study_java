package ex;

public class Ex8 {
    public static void main(String[] args) {
        // 구구단 중에서 3단부터 5단까지만 출력하세요
        // for 문을 사용해 작성하세요

        for (int i = 3; i < 6; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
