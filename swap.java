import java.io.*;
import java.util.*;
class swap
{
  public static void main(String args[])
  {
   int p=5,r=3;
    System.out.println("before calling a="+p+"b="+r);
    swap s=new swap();
    s.swapping(p,r);
    System.out.println("before calling a="+p+"b="+r);
}
 void swapping(int a,int b)
 {
    System.out.println("before swapping a="+a+"b="+b);
   int t;
   t=a;
   a=b;
   b=t;
   System.out.println("after swapping a="+a+"b="+b);
  }
}

