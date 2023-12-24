class Stock {
    int price;
    int day;

    Stock(int price, int day) {
        this.price = price;
        this.day = day;
    }
}

class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        Stock[] stocks = new Stock[n];

        for (int i = 0; i < n; i++) {
            stocks[i] = new Stock(price[i], i + 1);
        }

        Arrays.sort(stocks, Comparator.comparingInt(a -> a.price));

        int maxStocks = 0;

        for (int i = 0; i < n; i++) {
            int affordableStocks = Math.min(stocks[i].day, k / stocks[i].price);
            maxStocks += affordableStocks;
            k -= affordableStocks * stocks[i].price;
        }

        return maxStocks;
    }
}
