package sumOfAllElements;

public class SumOfAllElementsForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		
		for(int n : arr) {
			sum +=n;
		}
		
		System.out.print(sum);
	}

}
