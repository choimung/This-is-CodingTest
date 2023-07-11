package Greedy02;

import java.util.Scanner;

public class Greedy02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] array = new int[N];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;
        int result = 0;

        for (int num : array) {
            if(num > firstNum){
                secondNum = firstNum;
                firstNum = num;
            }else if (num > secondNum){
                secondNum = num;
            }
        }

        for(int i = 1; i <= M; i++){
            if(i % K != 0){
                result += firstNum;
            }else{
                result += secondNum;
            }
        }

        System.out.println("result = " + result);

    }
}
