package stringPrograms;
import java.util.Arrays;

public class Anagram {
    public static void CheckAnagram() {

        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean flag = true;

        flag = str1.length() == str2.length();

        if (flag) {
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);
            //flag = Arrays.equals(c1, c2);

            for (int i = 0; i < str1.length(); i++)
                if (c1[i] != c2[i])
                    flag = false;
        }

        if (flag)
            System.out.println("Strings are Anagram");
        else
            System.out.println("Strings are not Anagram");
    }
}
