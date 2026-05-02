package countEvenAndOdd;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,2,4,6,7};
		
		int even = 0;
		int odd = 0;
		for(int i : arr) {
			if(i%2 ==0) {
				even++;
			}else {
				odd++;
			}
		}
		
		System.out.print("even"+ even + "odd" + odd);

	}

}
