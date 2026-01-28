import java.util.*;
public class Main
{
    static int setithBit(int n, int i){
        int bitmask = 1<<i;
        return n| bitmask;
    }
	public static void main(String[] args) {
	    int n = 10;
	    int i = 2;
		System.out.println("Set the ith bit : "+ setithBit(n,i));
	}
}
