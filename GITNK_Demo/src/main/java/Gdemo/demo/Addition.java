package Gdemo.demo;

import java.util.Scanner;

public class Addition
{
   private static Scanner in;

public static void main(String args[])
   {
	Addition obj= new Addition();
      int x, y, z;
 
      System.out.println("Enter two integers to calculate their sum");
      in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = obj.add(x,y);
     
      System.out.println("Sum of the integers = " + z);
   }

public int add(int a,int b) {
	return a+b;
}

}
