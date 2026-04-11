package removeDuplicates;

import java.util.Arrays;

public class RemoveDuplicatesTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {0,0,1,1,1,2,2,3,3,4};
	      
	      int pos = 1;
	      for(int i=1;i<=arr.length-1;i++){
	          if(arr[i-1]!=arr[i]){
	              arr[pos]=arr[i];
	              pos++;
	          }
	      }
	      
	     System.out.println(Arrays.toString(Arrays.copyOf(arr, pos)));
	}

}
