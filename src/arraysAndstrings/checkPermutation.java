package arraysAndstrings;

import java.util.HashMap;
import java.util.Scanner;

public class checkPermutation {

	//hash map
	public static boolean check_permutation(String str1, String str2){
		if(str1.length() != str2.length())
				return false;
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		char[] arr = str1.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(hashMap.containsKey(arr[i])){
				int count = hashMap.get(arr[i]);
				count=count+1;
			}else{
				hashMap.put(arr[i], 0);
			}
		}
		
		HashMap<Character,Integer> hashMap1 = new HashMap<Character,Integer>();
		char[] arr1 = str2.toCharArray();
		for(int i=0;i<arr1.length;i++){
			if(hashMap1.containsKey(arr1[i])){
				int count = hashMap1.get(arr1[i]);
				count=count+1;
			}else{
				hashMap1.put(arr1[i], 0);
			}
		}
		
		if(hashMap.equals(hashMap1))
			return true;
		return false;
	}
	
	// by sorting
	public static String sort(String str1){
		char[] arr = str1.toCharArray();
		java.util.Arrays.sort(arr);
		return new String(arr);
	}
	
	public static boolean check_permutation_sort(String str1,String str2){
		String sorted_arr1 = sort(str1);
		String sorted_arr2 = sort(str2);
		return sorted_arr1.equals(sorted_arr2);
	}
	
	//by ASCII
	public static boolean check_permutation_ASCII(String str1,String str2){
		int[] ascii_arr = new int[128];
		for(int i=0;i<str1.length();i++){
			ascii_arr[str1.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++){
			ascii_arr[str2.charAt(i)]--;
			if(ascii_arr[str2.charAt(i)] < 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String str1 = sc.next();
		System.out.println("Enter second string : ");
		String str2 = sc.next();
		boolean flag = check_permutation_ASCII(str1, str2);
		if(flag) System.out.println("Permutation");
		else System.out.println("Not permutation");
		sc.close();
	}

}
