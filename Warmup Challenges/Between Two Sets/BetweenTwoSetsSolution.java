import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        Arrays.sort(a);
        Arrays.sort(b);
        int flag = 0;
        int count=0;
        
        for(int i=a[a.length-1];i<=b[0];i++)
        {
            int x=i;
            flag = 0;
            for(int j=0;j<a.length;j++)
            {
                if(x%a[j]!=0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                for(int k = 0;k<b.length;k++)
                {
                    if(b[k]%x!=0)
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
