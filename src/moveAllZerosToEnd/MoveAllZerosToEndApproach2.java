package moveAllZerosToEnd;

import java.util.Arrays;

public class MoveAllZerosToEndApproach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1,2,0,3,0,5,2,0,0,5};
		
		int pos = 0;
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]=arr[pos];
				arr[pos]= temp;
				pos++;
			}
		}

		System.out.print("2nd approach "  + Arrays.toString(arr));
	}

}
