package findMinAndMax;

public class FindMinAndMaxForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,3,1,5};
		int min =Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i : arr) {
			if(i<min) {
				min = i;
			}
			
			if(i>max) {
				max = i;
			}
		}
		
		
		
		System.out.println("min value is "+ min );
		System.out.println("max value is "+ max);

	}

}
