package twoSum;

public class TwoSumBrutForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,4,7,2};
		int key  = 10;
		
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=i+1 ;j<=arr.length-1;j++) {
				if(arr[i]+arr[j] == key) {
					System.out.println(i +" ---- "+ j);
					return;
				}
			}
		}

	}

}
