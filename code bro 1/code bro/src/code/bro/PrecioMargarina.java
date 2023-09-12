package code.bro;
import java.util.Scanner;

public class PrecioMargarina 
{
    public static void main(String[] args) 
    {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de precios de margarina: ");
        int cantMarg = leer.nextInt();
        int i = 0;
        int mayor = 0;
        while(i < cantMarg)
        {
         System.out.println("Digite el precio de la "+ ( i + 1 ) + " margarina: ");
         int precio = leer.nextInt();
         i++;
          if (precio > mayor){
              mayor = precio;
          }
        } 
        System.out.println("El precio mayor es: "+ mayor);
       
    }
    
}
