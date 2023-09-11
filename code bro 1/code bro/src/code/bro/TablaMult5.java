
package code.bro;

public class TablaMult5 {

    public static void main(String[] args)
    {
        int y = 0;
        int x = 5;
        int i =0;
        System.out.println("Tabla del 5 : ");
        
        while( y < 11 )
        {
           i = (x * y);
           
            System.out.println("5 * " + y + " = " + i); 
            
           y++;
        } 
    }
}
