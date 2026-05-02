package findFrequencyOfAnElement;

public class FindfrequencyOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,1,2,1,5};
		int key = 1;
		int count =0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		
		System.out.println("key "+ key + " = " + count);

	}

}
