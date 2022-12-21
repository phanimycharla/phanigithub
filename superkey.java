import java.io.*;
import java.util.*;
class pc
{
 int i,j;
 void disp(int a,int b)
 {
  i=a;j=b;
  System.out.println("i="+i+" j="+j);
 }
}
class ch extends pc
{
 int j;
 void disp(int a1,int b1)
 {
  super.disp(3,4);
  j=a1+b1;
  System.out.println("j="+j);
  }
}
class superkey
{
 public static void main(String args[])
 {
  pc o=new pc();
  o.disp(2,3);
  ch o1=new ch();
  o1.disp(4,5);  
  }
}