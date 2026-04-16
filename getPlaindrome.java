
public class Main
{
    static int reverseDigit(int nums){
        int rev = 0;
        while(nums>0){
            int digit = nums%10;
            rev = rev*10+digit;
            nums = nums/10;
        }
        return rev;
    }
    static void palindrome(int nums){
        int originalNum = nums;
        int reversedNum = reverseDigit(nums);
        if(originalNum == reversedNum){
            System.out.println("yes it is a palindrome");
        }else{
            System.out.println("No it is not a palindrome");
        }
        
    }
	public static void main(String[] args) {
		int nums = 1221;
		palindrome(nums);
	
		
	}
}
