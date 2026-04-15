
public class Main
{
    static void printDigits(int num){
        while(num != 0){
            int digit = num % 10;
            System.out.print(digit + " ");
            num = num / 10;
            
        }
    }
	public static void main(String[] args) {
		int num = 12345;
		printDigits(num);
	
	
	}
}
