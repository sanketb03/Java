//sorting the numbers present in an array 

import java.io.*;
public class sorting_array
{
   public void accept(int a[])throws IOException
   {
       int i;
       InputStreamReader x = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(x);
       System.out.println("Enter the 10 numbers");
       for(i =0 ;i<=9;i++)
       {
           a[i]=Integer.parseInt(br.readLine());
        }
    }
   public void display(int a[])
   {
       int i;
         for(i=0;i<=9;i++)
         System.out.println(a[i]);
   }
   public void bubblesort(int a[])
   {
       int i,j,t;
       for(i=0;i<9;i++)
       {
          for(j=0;j<9-i;j++)
           {
               if(a[j]>a[j+1])
               {
                  t=a[j];
                  a[j]=a[j+1];
                  a[j+1]=t;
               }
            }
        }
   }             
   public void selectionsort(int a[])
   {
      int i,j,t;
      for(i=0;i<=9;i++)
      {
        for(j=i+1;j<=9;j++)
        {
          if(a[i]<a[j])
          {
            t = a[i];
            a[i] = a[j];
            a[j] = t;
          }
        }
       }
   }
   public static void main(String args[])throws IOException
   {
      sort_by_array_and_function s = new 	 	    sort_by_array_and_function();
      int a[]=new int[10];
      s.accept(a);
      s.bubblesort(a);
      System.out.println("Number in accending order are ");
      s.display(a);
      s.selectionsort(a);
      System.out.println("Nnmbers in desending order are ");
      s.display(a);
   }
}