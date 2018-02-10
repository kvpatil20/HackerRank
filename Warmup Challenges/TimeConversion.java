import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        StringBuilder str = new StringBuilder(s);
        if(str.charAt(str.length()-2)=='A')
        {
            if((str.charAt(0)=='1') && (str.charAt(1)=='2'))
            {
                str.replace(0,2,"00");
            }
            str.replace(8,10,"");
        }
        else
        {
            if((str.charAt(0)=='1') && (str.charAt(1)=='2'))
            {
                str.replace(8,10,"");
            }
            else
            {
                String hh = Character.toString(str.charAt(0))+Character.toString(str.charAt(1));
                hh=Integer.toString(Integer.parseInt(hh)+12);
                str.replace(0,2,hh);
                str.replace(8,10,"");
            }
            
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
