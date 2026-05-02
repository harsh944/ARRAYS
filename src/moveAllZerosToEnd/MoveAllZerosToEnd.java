package moveAllZerosToEnd;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1,2,0,3,0,5,2,0,0,5};
		
		int pos = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[pos]=arr[i];
				pos++;
			}
		}
		
		while(pos<arr.length) {
			arr[pos]= 0;
			pos++;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
