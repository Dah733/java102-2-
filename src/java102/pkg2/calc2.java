/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java102.pkg2;

/**
 *
 * @author KingSoft
 */
public class calc2 extends simplecalc {
    
    public calc2()
    {
        super();
    }
    public calc2(int a,int b)
    {
        super(a,b);
    }
    public int mul()
    {
        return this.getx() * this.gety();
    }
      public int div()
    { 
        int Y=this.gety();
        if(Y==0)
            return 0;
        return this.getx() / this.gety();
    }
}
