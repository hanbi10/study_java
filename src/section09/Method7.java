package section09;


public class Method7 {
    public static void main(String[] args) {
        //메서드 호출과 이름이 같은 변수
        int num = 5;
        System.out.println("1. main 시작, num = " + num); // 5

        // 같은 이름의 변수를 가진 메서드 호출
        changeValue(num);
        //      main  메서드             changeValue 메서드
        // 1. num = 5                   num (없음)
        // 2. num = 5                   num = 5
        // 3. num = 5                   num = 10
        // 4. num = 5                   num (생명주기 종료)

        // 자바의 값에 의한 복사(Call by Value)


        System.out.println("4. main 종료, num = " + num); // 5

    }
    // 메서드 호출시에 명시적 형변환이 필요하다면 해주기
    // 전달받은 값을 변경하는 메서드
    public static void changeValue(int num) { // 메서드의 변수
        System.out.println("2. changeValue 시작, num = " + num); //5
        num = 10; // 값 변경
        System.out.println("3.  changeValue 끝, num = " + num);// 10
    }

}
