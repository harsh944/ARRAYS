package stockBuyAndSell;

public class StockBuyAndSellOneTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7, 10, 1, 3, 6, 9, 2};
		
		int maxPrice = 0;
		int minPrice = arr[0];
		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i] < minPrice) {
				minPrice = arr[i];
			}
			
			int price = arr[i] - minPrice;
			
			if(price > maxPrice) {
				maxPrice  =price;
			}
			
		}
		
		System.out.println(maxPrice);

	}

}
