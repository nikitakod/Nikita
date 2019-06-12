package Gdemo.demo;

import java.util.Scanner;

public class Substraction
{
   private static Scanner in;

public static void main(String args[])
   {
Substraction obj = new Substraction();
      int x, y, z;
 
      System.out.println("Enter two integers to calculate their sub");
      in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = obj.sub(x,y);
     
      System.out.println("Sub of the integers = " + z);
   }

public int sub(int x,int y) {
	return x - y;
}
}
