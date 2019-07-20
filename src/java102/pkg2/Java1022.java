
package java102.pkg2;

public class Java1022 {

    public static void main(String[] args) {
        simplecalc calc=new simplecalc(7,5);
        int result = calc.add();
        System.out.println(result);
        
        calc.setx(15);
        calc.sety(50);
        result =calc.add();
        System.out.println(result);
        System.out.println(calc.getx());
        System.out.println(calc.gety());

    }
    
}
