package Greedy01;
/**
 * 거스름돈 알고리즘
 */
public class Greedy01 {
    public static void main(String[] args){
        int N = 1260;
        int count = 0;
        int[] coinType = {500,100,50,10};

        for (int coin : coinType) {
            count += N / coin;
            N = N % coin;
        }
        System.out.println("count = " + count);
    }
}
/**
 *  화폐의 종류가 K 개라고 할 때 위 소스의 시간 복잡도는 O(K)이다.
 */


