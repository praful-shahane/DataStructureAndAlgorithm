package in.practice.Basic_Hashing_Question;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountFrequencyOfElementInArray {

	public static void main(String[] args) {
		/*problem  link :- 
		 * https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array/
		 * 
		 */

		int [] arr= {10,5,10,15,10,5};
		countFrequencyOfElementInArray(arr);
	}

	
	public static void countFrequencyOfElementInArray(int [] arr) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			 if(map.containsKey(arr[i])) {
				 //if array element present in map update count by 1;
				  Integer count = map.get(arr[i]);
				  map.put(arr[i], count+1);
			 }else {
				 //if array element not present in map make count to 1;
				 map.put(arr[i], 1);
			 }
		}
		
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println("The Element is ::"+e.getKey() + "  and its Count is  :: " + e.getValue());

		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
