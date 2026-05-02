package checkSortedArray;

public class CheckSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6};
		boolean asc = false;
		
		for(int i=0;i<=arr.length-2;i++) {
			if(!(arr[i] < arr[i+1])) {
				asc = true;
				break;
			}
		}
		
		
		if(asc) {
			System.out.println("not sorted");
		}else {
			System.out.println("sorted");
		}
		

	}

}
