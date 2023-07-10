package Greedy03;

import java.util.Scanner;

/**
 * 숫자 카드게임
 * 각 행마다 가장 작은 수를 찾은 뒤에 그 수중에서 가장 큰 수를 찾는 알고리즘
 */
public class Greedy03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 행을 의미한다.
        int M = sc.nextInt();   // 열을 의미한다.

        int[][] array = new int[N][M];
        System.out.println("array[0].length = " + array[0].length);
//        for(int i = 0; i < array.length; i++){
//            System.out.println("i = " + i);
//        }
    }
}
