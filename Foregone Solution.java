import java.util.*;
    import java.io.*;
    public class Solution {
        public static  boolean  ray(long r){
           boolean m =true;
           while(r>0 && m ){
              long x=r%10;
            if(x==4){
                m= false;
            }
            r=r/10;
           }  
           return m;
        } 

        public static  int sam(long r){
           boolean m =true;
           int count=0;
           while(r>0 && m ){
              long x=r%10;
              count++;
            if(x==4){
                m= false;
            }
            r=r/10;
           }  
           return count;
        } 

           
        
      public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
          long n = in.nextLong();
          boolean x= true;
          boolean b= true;
          long v=1;
          long ans=0;
          while (x || b){
            ans=n-v;
     
            if(ray(ans)){
                x=false;
                
            }
            if(x==true || ray(v)==false){
                int count=sam(ans)-1;
                if(ray(v+1)){
                    v= (long)((v+1)+(Math.pow(10,count)));
                    x=true;
                }
                else{
                    v=(long)((v+2)+(Math.pow(10,count)));
                    x=true;
                }
            }
             if(ray(v)){
                b=false;
            }
            else{
                b=true;
            }
          }
         
          System.out.println("Case #" + i + ": " + v + " " + ans);
         
        
        }
      }
    }
