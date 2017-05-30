import java.util.Arrays;

public class isSubstring {

	public static boolean isSubString(String str1,String str2){
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);
		
		boolean result = Arrays.equals(str1Arr,str2Arr);
		return result;
	}
	public static void main(String[] args) {
		String str1 = "waterbottle";
		String str2 = "bottleatew";
		System.out.println(isSubString(str1,str2));
	}

}
