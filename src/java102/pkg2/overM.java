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
public class overM {
    private int x,y;
    public int add(int a,int b )
    {
        this.x=a;
        this.y=b;
        return this.x + this.y;
    }
    public int add(int a)
    {
        this.x=a;
        return this.x +this.x;
    }
}
