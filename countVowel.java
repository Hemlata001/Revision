import java.util.*;
public class Main
{
    public static int countVowels(String s){
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(char c : s.toCharArray()){
            if(vowels.indexOf(c)!=-1){
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int vowelCount = countVowels(s);
		System.out.println("Number of vowels : "+vowelCount);
	
		
	}
}
