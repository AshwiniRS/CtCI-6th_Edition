
public class StringCompression {

	public static String strCompress(String str){
		int i = 0;
		int count = 1;
		StringBuilder strBuilder = new StringBuilder();
		while(i<str.length()-1){
			if(str.charAt(i) == str.charAt(i+1)){
				count++;
				i++;
			}else{
				strBuilder.append(str.charAt(i));
				strBuilder.append(count);
				count=1;
				i++;
			}
		}
		strBuilder.append(str.charAt(i));
		strBuilder.append(count);
		String resultStr = strBuilder.toString();
		if(resultStr.length() > str.length())
			return str;
		return resultStr;
	}
	public static void main(String[] args) {
		String str = "aabcccccaaaaa";
		System.out.println(strCompress(str));
	}

}
