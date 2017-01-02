package arraysAndstrings;

import java.util.HashSet;
import java.util.Scanner;

public class IsUnique {

	//using hash set
	public static boolean isUnique(String str){
		if (str.length() > 26) { // Only 26 characters
			return false;
		}
		HashSet<Character> set = new HashSet<Character>();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(set.contains(arr[i])){
				return false;
			}else{
				set.add(arr[i]);
			}
		}
		return true;
	}
	
	//bit manipulation
	// 1<<val makes a =1, b=10, c= 110....
	public static boolean isUniqueChars(String str) {
		
		if (str.length() > 26) { // Only 26 characters
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0){
				System.out.println(checker + " ");
				return false;
			}
			checker = checker |  (1 << val);
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string - ");
		String str = sc.next();
		boolean flag = isUniqueChars(str);
		if(flag){
			System.out.println("String has all unique characters");
		}else
			System.out.println("String does not have unique characters");
		sc.close();
	}

}
