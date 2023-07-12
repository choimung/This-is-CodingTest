package Greedy03;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 숫자 카드게임
 * 각 행마다 가장 작은 수를 찾은 뒤에 그 수 중에서 가장 큰 수를 찾는 알고리즘
 */

public class Greedy03 {
    public static void main(String[] args) throws IOException {

        long startTime = System.nanoTime(); // 코드 시작 시간 기록

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   //행
        int M = Integer.parseInt(st.nextToken());   //열
        int[][] arr = new int[N][M];
        int max = 0;


        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            if(max < min){
                max = min;
            }
        }
        System.out.println("max = " + max);



        long endTime = System.nanoTime(); // 코드 종료 시간 기록

        long executionTime = endTime - startTime; // 실행 시간 계산 (나노초 단위)

        double seconds = (double) executionTime / 1_000_000_000.0; // 실행 시간을 초 단위로 변환

        System.out.println("실행 시간: " + seconds + "초");
        br.close();
    }
}
