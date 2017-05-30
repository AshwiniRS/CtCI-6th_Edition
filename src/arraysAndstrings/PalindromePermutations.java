/*
 * 
 * 
 */

import java.util.Arrays;

public class PalindromePermutations {

	public static boolean palindrome_permute(String str){
		str = str.toLowerCase();
		str = str.replaceAll(" ", "");
		char[] strArray = str.toCharArray();
		Arrays.sort(strArray);
		int i = 0;
		int flag=0;
		while(i<strArray.length-1){
			if(strArray[i] != strArray[i+1]){
				flag++;
				i++;
			}else{
				if(i!=strArray.length-2){
					i+=2;
					if(i>=strArray.length-1)
						flag++;
				}else
					i++;
			}
			if(flag>1) break;
		}
		if(flag>1){
			return false;
		}else{
			return true;
		}
		
	}
	public static void main(String[] args) {
		
		String str = "tact coat";
		boolean result = palindrome_permute(str);
		System.out.println(result);
	}

}
