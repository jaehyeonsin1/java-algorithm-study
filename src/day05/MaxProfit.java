package day05;

public class MaxProfit {

    /*
    [문제] 주식 최대 수익 구하기

    날짜별 주식 가격이 담긴 배열 prices가 주어졌을 때,
    한 번 매수하고 이후 한 번 매도해서 얻을 수 있는
    최대 수익을 반환하시오.

    반드시 매수한 이후에 매도해야 한다.

    수익을 낼 수 없다면 0을 반환한다.

    예시 1

    입력:
    [7, 1, 5, 3, 6, 4]

    출력:
    5

    설명:
    가격이 1일 때 매수하고
    가격이 6일 때 매도하면

    6 - 1 = 5

    최대 수익은 5이다.


    예시 2

    입력:
    [7, 6, 4, 3, 1]

    출력:
    0

    설명:
    가격이 계속 떨어지기 때문에
    수익을 낼 수 없다.
    */

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = solution(prices);

        System.out.println(result); // 5
    }

    public static int solution(int[] prices) {

        // TODO: 직접 구현
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i + 1; j < prices.length; j++){
                int profit = prices[j] - prices[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        if(maxProfit <= 0){
            return 0;
        }else {
            return maxProfit;
        }

        //return Math.max(maxProfit, 0);

        /*
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){

            int profit = prices[i] - minPrice;

            if(profit > maxProfit){
                maxProfit = profit;
            }

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }

        return maxProfit;
        //시간복잡도 O(N) 버전
         */
    }
}