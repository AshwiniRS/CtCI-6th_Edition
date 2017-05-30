
public class OneAway {

	public static boolean checkaddOrremoveChar(String strbig, String strsmall){
		int edits = 0;
		int i=0;
		int j=0;
		
		if(strbig.length() - strsmall.length() != 1) return false;
		
		while(i<strbig.length()-1 && j<strsmall.length()-1){
			if(strbig.charAt(i)!=strsmall.charAt(j)){
				edits++;
				i++;
			}else{
				i++;
				j++;
			}
		}
		if(edits>1) return false;
		else return true;
			
	}
	
	public static boolean checkReplaceChar(String str1, String str2){
		int i = 0;
		int j = 0;
		int edits = 0;
		while(i<str1.length() && j<str2.length()){
			if(str1.charAt(i) != str2.charAt(j)){
				edits++;
			}
			i++;
			j++;
		}
		if(edits>1) return false;
		else return true;
	}
	public static void main(String[] args) {
		String str1 = "pale";
		String str2 = "bale";
		String strbig = str1;
		String strsmall = str2;
		if(str2.length() > str1.length()){
			strbig = str2;
			strsmall = str1;
		}
		if(str2.length() != str1.length()){
			System.out.println(checkaddOrremoveChar(strbig, strsmall));
		}
		else if(str2.length() == str1.length()){
			System.out.println(checkReplaceChar(strbig, strsmall));
		}
	}

}
