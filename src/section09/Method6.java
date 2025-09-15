package section09;

public class Method6 {
    public static void main(String[] args) {
        // 메서드 호출과 자바의 값 전달
        // !!자바는 항상 변수의 값을 복사하여 대입!!
        // Alt + shift + 방향키 -> 라인 이동
        // 메서드 호출과 이름이 다른 변수

        int a = 5;
        System.out.println("1. main 매서드 시작, a = " + a); // 5

        // a 값을 메서드에 전달
        // a = 5
        changeValue(a);
        // num의 변경은 a에 아무런 영향도 주지 않는다 (값을 복사해서 전달했기 때문)
        //1. a = 5, num(없음)
        //2. a = 5, num = 5
        //3. a = 5, num = 10
        //4. a = 5, num(사라짐)
        System.out.println("4. main 메서드 시작, a = " + a); //5
    }
    // 전달받은 값을 변경하는 메서드
    public static void changeValue(int num) { // a르르 복사한 값인 5를 대입함 num, a가 메모리 공간에 둘 다 올라가있음
        System.out.println("2. changeValue 시작, num = " + num); //5
        num = 10; // 값 변경
        System.out.println("3.  changeValue 끝, num = " + num);// 10
    }
}
