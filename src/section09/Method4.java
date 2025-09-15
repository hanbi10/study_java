package section09;

public class Method4 {
    public static void main(String[] args) {
        // 짝수인지 판별하는 메서드
        // 반환타입이 있는 경우
        // 1. 반환값 0, 매개변수 x
        // 항상 같은 결과를 반환
        int ten = getTen();
        System.out.println("ten = " + ten);

        // 짝수인지 판별하는 메서드
        boolean result = evenCheck(2);
        System.out.println("result = " + result);

        
    }
    public static int getTen() {
        return 10;
    }

    // 짝수인지 판별하는 메서드
    // 반환타입이 있는 메서드는 반드시 모든 경우의 수에서 return을 사용하여 값을 반환해야 한다. -모든 상황-
    public static boolean evenCheck(int num) {
        if (num % 2 == 0) {
            return true;
        } // 조건을 만족하지 않을 시 return이 없으므로 오류 발생
        // missing return statement 에러
        // 해결방법 : else 블록에서 false 반환
        else {
            return false;
        }
    }
}
