package findSecondLargestElement;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,3,1,5};
		int max = Integer.MIN_VALUE;		
		int secondMax=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				secondMax = max;
				max=arr[i];
			}
		}
	
		System.out.println("max value is "+ secondMax);

	}

}
