import java.util.*;

public class Main {

    static int getLengthOfString(String name){
        int count = 0;

        for(char ch : name.toCharArray()){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String name = "Babbar";

        int length = getLengthOfString(name);
        System.out.println(length);
    }
}
