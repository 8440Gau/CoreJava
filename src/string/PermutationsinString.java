package string;

import java.util.Arrays;

public class PermutationsinString {
public static void main(String[] args) {
	   String s = "cat";
	   permutation(s, "");
	   String[] strArray = { "Scaler", "by", "InterviewBit"};
	   String sf= Arrays.toString(strArray);
	   System.out.println("************************************");
	   System.out.println(sf);
}
public static void permutation(String str1,String str2) {
	if(str1.length()==0) {
		System.out.println(str2);
		return ;
	}else {
		for(int i=0;i<str1.length();i++) {
			char ch =str1.charAt(i);
			String str3 = str1.substring(0,i)+str1.substring(i+1);
			
			permutation(str3, str2+ch);
		}
		return ;
	}
	
}
}
