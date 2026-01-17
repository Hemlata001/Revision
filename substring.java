import java.util.*;
public class Main
{
    public static String substring(String str,int si, int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
	public static void main(String[] args) {
		// SubString
		String str = "Hello";
		System.out.println(substring(str,1,3));
		// inbuilt substring function
		System.out.println(str.substring(1,3));
	}
}
