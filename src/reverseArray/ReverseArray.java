package reverseArray;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		int temp;
		int i=0;
				
		while(i<arr.length/2) {
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			i++;
		}
		
		System.out.print(Arrays.toString(arr));

	}

}
