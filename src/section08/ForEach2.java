package section08;

public class ForEach2 {
    public static void main(String[] args) {
//        // 1. 2차원 배열 만들기
//        // 2차원 배열은 배열안에 배열이 있는 형태
//        int[][] arr = {
//                {1, 2, 3},  // 0행  arr[0]
//                {4, 5, 6}  // 1행   arr[1]
//        };
//
//        // 일반 for 출력
//        for (int i = 0; i < arr.length; i++) { // 외부 for
//            //총 2번 반복 -> 첫 반복 {1, 2, 3} 두번째 반복은 {4, 5, 6}
//            System.out.println("행 인덱스 i = " + i);
//            for (int j = 0; j < arr[i].length; j++) {
//                // 총 3-1 번 반복: 1 -> 1, 2 -> 2, 3 -> 3
//                // 총 3-2 번 반복 : 4 -> 4, 5 -> 5, 6 -> 6
//                System.out.println("\t" + arr[i][j]);
//            }
//        }
//    }

        // 2차원 배열 선언 (오류 수정)
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // for-each
        // for(변수 : 배열)
        // 인덱스가 필요 없다, 전체 탐색에 적합, 가독성 높음

//        for (int a : arr1) {
//            System.out.print(a + " ");
//        };

        // 2차원 배열 for-each 쓰기
        for (int[] i : arr) {
            System.out.println(java.util.Arrays.toString(i));
            for (int j : i) {
                System.out.print("\t" + j);
            }
            System.out.println();
        }
    }
}