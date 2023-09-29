package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> arr = new ArrayList<String>();
		//2. Add five Strings to your list
		arr.add("Brian");
		arr.add("Su");
		arr.add("is");
		arr.add("so");
		arr.add("cool");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i <arr.size(); ++i) {
			String s = arr.get(i);
			System.out.println(s + " ");
		}
		//4. Print all the Strings using a for-each loop
		for(String x : arr) {
			System.out.println(x + " ");
		}
		for(int i = 0; i <arr.size(); ++i) {
			String s = arr.get(i);
			if(i%2 ==0 ) {
			System.out.println(s + " ");
		}
		}
		//5. Print only the even numbered elements in the list.
		for(int i = arr.size(); i > 0; i--) {
			String w = arr.get(i-1);
			System.out.println(w + " ");
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i <arr.size(); ++i) {
			String s = arr.get(i);
			for(int j =0; j < s.length(); j++) {
				if(s.charAt(j) == 'e') {
					System.out.println(s + " ");
					break;
				}
			}
			
			
		}
	}
}
