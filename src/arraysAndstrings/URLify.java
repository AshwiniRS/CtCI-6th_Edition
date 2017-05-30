/*
* Replace spaces with %20
 */
public class URLify {

	public static String URLify_string(String str,int lengthOfStr){
		int actualLength = str.length()-1;
		if(str.length() == 0 || (str.length() == 1 && str.charAt(0)!=' '))
			return str;
		if(str.length() == 1 && str.charAt(0)==' '){
			str.replace(" ", "%20");
			return str;
		}
		char[] strArray = str.toCharArray();
		int i = actualLength;
		int j = lengthOfStr-1;
		while(j>=0){
			if(strArray[j] == ' '){
				strArray[i] = '0';
				i--;
				strArray[i] = '2';
				i--;
				strArray[i] = '%';
				i--;
				j--;
			}else{
				if(i!=j){
					strArray[i] = strArray[j];
					strArray[j] = ' ';
					j--;
					i--;
				}else
					break;
			}
			
		}
		return new String(strArray);
	}
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		int lengthOfStr = 13;
		String resultString = URLify_string(str,lengthOfStr);
		System.out.println("Result  of URLIfy function : "+resultString);
	}

}
