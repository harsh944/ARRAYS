package findMinAndMax;

public class FindMinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,3,1,5};
		int min =Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;		
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("min value is "+ min );
		System.out.println("max value is "+ max);
	}

}
