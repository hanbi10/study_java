package section09;

import org.w3c.dom.ls.LSOutput;

public class Method3 {
    public static void main(String[] args) {
        // 매개변수가 없거나 반환 타입이 없는 경우
        //1. 반환값 x, 매개변수 o
        //호출은 동일
        printMassage("길동"); // "길동"을 전달 -> 콘솔화면에 인사 출력

        //2. 반환값 x, 매개변수 x
        //인수를 비워두고 호출하면 된다.
        printLint(); //아무것도 전달하지 않고, 반환도 없음 -> 화면에 구분선 출력
    }

    // 1. 반환값 x, 매개변수 o
    // 입력은 받지만 "출력만" 하고 반환값은 없는 메서드
    // 반환 타입을 void로 정의

    public static void printMassage(String name) {
        System.out.println("Hello " + name);
        //return 생략 가능
    }

    //2. 반환값 x, 매개변수 x
    // 입력도 없고 반환도 없으며, 단순히 "동작만 수행"하는 메서드
    public static void printLint() { // 매개변수를 비워두고 정의
        System.out.println("----------------");
        //return 생략 가능
    }


}
