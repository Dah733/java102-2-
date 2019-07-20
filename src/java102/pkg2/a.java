/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java102.pkg2;


public class a {
    public int x;
   public static int y=10;
    public static int add(int a,int b)
    {
        return a+b;
    }
     public static int mul(int a,int b)
    {
        return a*b;
    }
      public static int div(int a,int b)
    {
        if(b==0)
            return 0;
        return a/b;
    }
      public static void sett(int t)
      {
         
          a.y =t;
           y=t;
      }
      public static int gett()
      {
          return a.y;
      }
}
