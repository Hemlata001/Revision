import java.util.*;

public class Main {

    static int getVowelCount(String str){
        int count = 0;

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch =='i'||ch =='o'|| ch =='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Babbar";

        int length = getVowelCount(str);
        System.out.println("Vowel count of the string: " + length);
    }
}
