package section08;

public class Array5 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 10;
        //arr 변수에는 [0,0,0,0,0] 값들이 직접 들어있는게 아니라
        // . 배열의 참조값(주소값)이 들어있다.
        // 배열 변수 arr ---(주소값) --> [0,0,0,0,0]

        int[] arr2 = arr1;
        arr2[0] = 99;

        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr2[0] = " + arr2[0]);

        int a = 10;
        int b = a;
        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
