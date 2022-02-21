package com.krish.iq;

public class StockBuy {

	public static void main(String[] args) {
		// int[] stocks = { 100, 180, 260, 310, 40, 535, 695 };
		// int[] stocks = { 100, 260, 180, 310, 40, 535, 695 };
		int[] stocks = { 260, 100, 180, 310, 40, 535, 695 };
		//int[] stocks = { 4, 2, 2, 2, 4 };

		System.out.println("Max Profit getMaxProfit() :: " + getMaxProfit(stocks));

		// int[] stocks1 = {7, 1, 5, 3, 6, 4};
		// int[] stocks1 = {7, 6, 4, 3, 1};
		//int[] stocks1 = { 4, 2, 2, 2, 4 };
		int[] stocks1 = { 260, 100, 180, 310, 40, 535, 695 };
		System.out.println("Max Profit getMaxProfitForGivenPrices() :: " + getMaxProfitForGivenPrices(stocks1));

	}

	private static int getMaxProfit(int[] stockPrices) {
		int maxProfit = 0;

		for (int i = 1; i < stockPrices.length; i++) {
			int currentPrice = stockPrices[i];
			int previousPrice = stockPrices[i - 1];

			if (currentPrice > previousPrice)
				maxProfit += currentPrice - previousPrice;

		}

		return maxProfit;
	}

	//{7, 1, 5, 3, 6, 4} //Ans - 5(6-1)
	private static int getMaxProfitForGivenPrices(int[] stockPrices) {
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;

		for (int i = 0; i < stockPrices.length; i++) {
			int currentPrice = stockPrices[i];

			if (currentPrice < minPrice) {
				minPrice = currentPrice;
			} else if (currentPrice - minPrice > maxProfit) {
				maxProfit = currentPrice - minPrice;
			}
		}

		return maxProfit;
	}

}
