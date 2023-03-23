package Greedy01;
/**
 * 거스름돈 알고리즘
 */
public class Greedy01 {
    public static void main(String[] args){
        int n = 1260;
        int count = 0;
        int[] coinType = {500,100,50,10};

        long beforeTime = System.currentTimeMillis(); // 코드 실행전 시간 받아오기

        for (int coin : coinType) {
            count += n / coin;
            n = n % coin;
        }

        System.out.println("result = " + count);

        long afterTime = System.currentTimeMillis(); // 코드 실행후 시간 받아오기
        long secDiffTime = (afterTime - beforeTime) / 1000;
        System.out.println("시간차이(m) = " + secDiffTime);
    }
}
/**
 * 코드를 보면 화폐의 종류만큼 반복을 수행해야 한다. 따라서 화폐의 종류가 K 라고 할때
 * 위 소스코드의 시간 복잡도는 O(K) 이다.
 */
