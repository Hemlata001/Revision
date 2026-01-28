import java.util.*;
public class Main
{
    static int setithBit(int n, int i){
        int bitmask = (1<<i);
        return  n| bitmask;
    }
    static int clearithBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n,int i, int newBit){
        n = clearithBit(n,i);
        int bitmask = newBit <<i;
        return n|bitmask;
    }
	public static void main(String[] args) {
		System.out.println("Update the ith bit : "+ updateIthBit(10,2,1));
	}
}
