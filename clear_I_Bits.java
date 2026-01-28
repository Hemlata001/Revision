import java.util.*;
public class Main
{
    static int clearIBits(int n, int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
	public static void main(String[] args) {
		System.out.println("Clear the i bit : "+ clearIBits(15,2));
	}
}
