package maxProductSubarray;

public class MaxproductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,6,-3,-10,0,2};
		
		int left = 1;
		int right = 1;
		int leftmax = 0;
		int rightmax = 0;
		for(int i=0;i<arr.length;i++) {
			left = left*arr[i];
//			System.out.print(arr[arr.length-i-1]);
			right = right*arr[arr.length-i-1];
			
			
			
		}

	}

}
