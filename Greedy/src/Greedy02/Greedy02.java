package Greedy02;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 큰수의 법칙 알고리즘
 */
public class Greedy02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int sum = 0;
        int[] array = new int[N];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int first = array[N-1];
        int second = array[N-2];

        for(int i = 1; i <= M; i++){
            if(i % K == 0){
                sum += second;
            }else{
                sum += first;
            }
        }


        System.out.println("sum = " + sum);
    }
}
/**
 * 주어진 수들을 M번 더하여 가장 큰수 만들기 단 배열의 특정한 인덱스에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없다.
 * 가장큰수와 두번째로 큰수를 구해서 M번 더해주면 될거같다.
 */
