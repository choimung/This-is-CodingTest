package Greedy03;

import java.util.Scanner;

/**
 * 숫자 카드게임
 * 각 행마다 가장 작은 수를 찾은 뒤에 그 수 중에서 가장 큰 수를 찾는 알고리즘
 */
public class Greedy03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 행
        int M = sc.nextInt();   // 열
        int min_number = Integer.MIN_VALUE;

        int[][] array = new int[N][M];

        for(int i = 0; i < array.length; i++){
            int min_value = Integer.MAX_VALUE;

            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
            for (int num : array[i]) {
                if(num < min_value){
                    min_value = num;
                }
            }
            if(min_number < min_value){
                min_number = min_value;
            }
        }
        System.out.println("min_number = " + min_number);
    }
}
