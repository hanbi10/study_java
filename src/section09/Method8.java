package section09;

public class Method8 {
    public static void main(String[] args) {
        // 메서드 오버로딩
        // 같은 이름(add)의 메서드를 여러 형태로 정의하여
        // 매개변수의 타입과 개수에 따라 다른 동작을 수행 할 수 있음

        System.out.println("정수 2개 더하기: " + add(3, 5)); // int, int
        System.out.println("실수 2개 더하기: " + add(2.5, 3.7)); // double, double
        System.out.println("정수 3개 더하기: " + add(1, 2, 3)); // int, int, int
    }

    // 정수 2개를 더하는 add 메서드
    // 오버로딩 : 같은 이름, 매개변수 타입/개수 다름 -> 다른 메서드로 인식
    public static int add(int a, int b) {
        return a + b;
    }

    //실수 2개를 더하는 메서드
    // 오버로딩 : 매개변수 타입이 달라서 같은 이름 사용 가능
    public static double add(double a, double b) {
        return a + b;
    }

    // 정수 3개를 더하는 메서드
    // 오버로딩 : 매개변수 개수가 달라서 같은 이름 사용 가능
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 자바는 메서드 시그니처로 메서드를 구분한다.
    // 메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서_
    // add(int a, int b)
    // add(double a, double b)
}
