package test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SandBox {

    public static void main(String[] args) {

        SandBox application = new SandBox();

        /*
        The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of the initial string)
        of size sz (ignore the last chunk if its size is less than sz).

        If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2, reverse that chunk; otherwise rotate it to the left by one position.
        Put together these modified chunks and return the result as a string.

        If

        sz is <= 0 or if str is empty return ""
        sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".

        revrot("123456987654", 6) --> "234561876549"
        revrot("123456987653", 6) --> "234561356789"
        revrot("66443875", 4) --> "44668753"
        revrot("66443875", 8) --> "64438756"
        revrot("563000655734469485", 4) --> "0365065073456944"
         */


    }

    public String revRot(String strng, int sz) {

        // get length of strng, ignore if last chunk size is < sz
        // new String - return
        // put back the chunks
        // a chunk is the substring of strng from 0, sz

        // strng.substring(0, sz) --> 123456, 987654
        // 1 ^ 3 + 2 ^ 3 + 3 etc? % 2 == 0 --> then we reverse the strng
        // else rotate the string to the left by one position
        // then concat the two chunks back together if we did not ignore the last chunk

        int lengthOfString = strng.length();

        String str = "";

        if (sz <= 0 || lengthOfString == 0 || sz > lengthOfString) {
            return "";
        }

        List<String> chunks = new ArrayList<>();

        while (strng.length() >= sz) {
            str = strng.substring(0, sz);
            chunks.add(str);
            strng = strng.substring(sz);
        }

        return "placeholder";
    }

    /*
    Create a method or function that takes in array of Strings.
    The method returns an array that only contains the distinct values from the input:
    distinct( [ "red", "yellow", "green", "yellow  ] ) -> [ "red", "yellow", "green"  ]
     */

    public String [] distinct(String [] str) {

        ArrayList<String> newArr = new ArrayList<>();

        // loop over the array, check if something is seen once first
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i] == str[j])
            }
        }

        newArr.add("new value");
    }
};
