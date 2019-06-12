package Gdemo.demo;

import java.util.Scanner;

public class Multiplication
{
   private static Scanner in;

public static void main(String args[])
   {
Multiplication obj= new Multiplication ();
      int x, y, z;
 
      System.out.println("Enter two integers to calculate their Product");
      in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = obj. multi(x,y);
     
      System.out.println("Product of the integers = " + z);
   }

public int multi(int x,int y) {
	return x * y;
}

}
