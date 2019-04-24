/*problem description - https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705

import java.util.*;
    import java.io.*;
    public class Solution {

       public static String ans(String x){
          String x1=x.replace('E','T');
          String x2=x1.replace('S','E');
          String x3=x2.replace('T','S');
           return x3;

       } 

      public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
          int n = in.nextInt();
          String r = in.next();
          System.out.println("Case #" + i + ": " + ans(r));
         
        }
      }
    }
