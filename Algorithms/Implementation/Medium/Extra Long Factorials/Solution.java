import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger factorial = new BigInteger("1");
        
        for(int i=2;i<=n;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i)) ;
        }
        System.out.println(factorial);
        
    }
}
