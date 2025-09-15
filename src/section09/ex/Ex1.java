package section09.ex;

public class Ex1 {
    public static void main(String[] args) {
        // 다음 코드를 메서드를 사용해 리펙토링 하시오
        int score1 = 80;
        int score2 = 60;
        int score3 = 100;

        int sum = score1 + score2 + score3;
        double avg = sum / 3.0;
        System.out.println("avg = " + avg);

        int score4 = 50;
        int score5 = 40;
        int score6 = 90;
        sum = score4 + score5 + score6;
        avg = sum / 3.0;
        System.out.println("avg = " + avg);

    }

}
