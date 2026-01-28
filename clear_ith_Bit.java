import java.util.*;
public class Main
{
    static int clearithBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
	public static void main(String[] args) {
	    int n = 10;
	    int i = 1;
		System.out.println("Clear the ith bit : "+ clearithBit(n,i));
	}
}
