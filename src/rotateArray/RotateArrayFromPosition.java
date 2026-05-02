package rotateArray;

import java.util.Arrays;

public class RotateArrayFromPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int boom  = 2;
		int key = boom % arr.length;
		
		
		reverse(arr,0,key-1);
		
		reverse(arr,key,arr.length-1);
		
		reverse(arr, 0, arr.length-1);

		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverse(int arr[], int start,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
