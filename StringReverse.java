import java.lang.*;

public class StringReverse{
	public static void main(){
		String s = "This is try1.";
		Integer n = s.length();
		for(int i=0;i<n;i++){
			System.out.printf(s.charAt(n-i-1));
		}
	}


}
