package kadanesAlgorithm;

public class MaxSubArrayValueKadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, -8, 7, -1, 2, 3};
		
		int sum = 0;
		int pos=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			
			sum = sum + arr[i];
			
			if(sum<=0) {
				sum=0;
			}
			
		}
		
		System.out.print(sum);
	}

}
