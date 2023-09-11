
package code.bro;
public class Suma90P {
    public static void main(String[] args) {
        
        int i= 12;
        int c = 0;
        int suma = 0;
        while (c < 90)
        {
            if( i % 2 == 0)
            {
                suma = i + suma;
                
            c++;
           }
            i++;
        }
        //System.out.println(c);
        System.out.println("El resultado de la suma es: " + suma);
    }
    
}
