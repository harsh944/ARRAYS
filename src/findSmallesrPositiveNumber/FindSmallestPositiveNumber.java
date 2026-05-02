package findSmallesrPositiveNumber;

import java.util.HashSet;
import java.util.Set;

public class FindSmallestPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, -3, 4, 1, 1, 7};
		
		Set<Integer> ss = new HashSet<>();
		int min = 0;
		
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]>0) {
				ss.add(arr[i]);
			}	
		}
		
		min = 1;
		
		while(ss.contains(min)){
			min++;
		}
		
		System.out.println(min);
		
		
		

	}

}
