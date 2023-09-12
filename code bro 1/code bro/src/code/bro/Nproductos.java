package code.bro;
import java.util.Scanner;
public class Nproductos 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de productos: ");
        int canP = leer.nextInt();
        int i = 0;
        double totalCom = 0;
        double compra = 0;
        while(canP > i)
        {
            System.out.println("Digite el precio numero " + (1 + i ) + " : ");
            double precio = leer.nextDouble();
            compra = compra + precio;
            i++;
        }
        totalCom = compra * 0.19;
        totalCom = compra + totalCom;
        
        System.out.println("El total de la compra sin IVA: "+ compra);
        System.out.println("El total de la compra con IVA: "+ totalCom);
        
    }
    
}
