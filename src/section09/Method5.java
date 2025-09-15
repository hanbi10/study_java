package section09;

public class Method5 {
    public static void main(String[] args) {
        // return 문을 만나면 즉시 메서드를 빠져나감
        // 메서드의 흐름을 중간에서 끊고 싶을 때 자주. ㅏ용된다.
        // return (뒤) 뒤에 값이 있으면 -> 호출자에게 그 값을 반환
        // return (뒤) 뒤에 값이 없으면 -> 단순히 메서드를 종료
        checkNum(-3);
    }

    //음수면 return 으로 빠져나가기
    public static void checkNum(int num) {
        if (num < 0) {
            System.out.println("음수입니다. 메서드를 종료합니다.");
        }
        System.out.println("입력한 수 : " + num);
    }
}
