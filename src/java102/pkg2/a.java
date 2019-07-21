
package java102.pkg2;


public class a {
    /*  exception thrower:
          a-exception catcher
          b-exception propagator
    */
    public void fun(int val)
    {
    try{
     if(val>100)
     {
         throw new Exception("overflow");
         
     }
    }
    catch(Exception e)
    {
    
    }
    }
    public void fun2(int va) throws Exception
    {
        if(va>200){
        Exception ex=new Exception ("exception");
        throw ex;}
    }    
    
}
