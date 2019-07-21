
package java102.pkg2;

import java.util.Scanner;
public class Java1022 {

    public static void main(String[] args) {
       
    Scanner f =new Scanner(System.in);
    
    String  name;
    try{
    System.out.print("your name please:");
    name =f.next();
    System.out.print("your age please:");
    int c=f.nextInt();
    
     
    System.out.println(" your name is:" + name);
    System.out.println(" your age:" + c);
     
   }
   catch(Exception e)
           {
                 System.out.println("Exception");
              return;
           }
    finally{
         System.out.println("Done");
    }
    
    
   }
}
