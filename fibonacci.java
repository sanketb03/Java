
//prints the fibonacci series of desired length

import java.util.Scanner;
public class fibonacci
{
    public static void main(String args[])
    {
	 Scanner sc = new Scanner(System.in);
	 	  
     	 int a=0,b=1,i,s=0;

	 System.out.println("Enter the length of the series");
    	 int n = sc.nextInt();
       System.out.println("\n"+a);
       System.out.println(b);
       for(i=1;i<=n;i++)
       {
           s = a+b;
           System.out.println(s);
           a=b;
           b=s;
       }
   }
}    