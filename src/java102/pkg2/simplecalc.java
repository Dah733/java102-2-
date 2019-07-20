
package java102.pkg2;

public class simplecalc {
    private int x;
    private int y;
    
    public simplecalc()
    {
        this.x=0;
        this.y=0;
        
    }
    public simplecalc(int a,int b)
    {
        this.x=a;
        this.y=b;
    }
    public int add()
    {
        return this.x + this.y;
    }
    public int bub()
    {
        return this.x - this.y;
    }
    
    public void setx(int a)
    {
        this.x=a;
    }
    public void sety(int a)
    {
        this.y=a;

    }
    public int getx()
    {
        return this.x;
    }
    public int gety()
    {
        return this.y;

    }
    
    
    
    
    

}
