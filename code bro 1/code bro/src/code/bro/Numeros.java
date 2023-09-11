
package code.bro;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        double y = 12.5;
        double x = 15.2;
        double o = 45.3 ;
        double i = 0;
        double l =0;
        double t = 0;
        
        double m = Math.ceil(y);
        System.out.println(m);
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Enter side l :");
        l = leer.nextDouble();
       System.out.println("Enter side t :");
        t = leer.nextDouble();
        
        i = Math.sqrt((t*t)+(l*l));
        
        System.out.println("The hypotenuse is : " + i);
        
        leer.close();   
    }
    
}
