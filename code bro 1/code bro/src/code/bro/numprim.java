package code.bro;
import java.util.Scanner;
public class numprim
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digigte un numero: ");
        int num = leer.nextInt();
        if (num != 1)
        {
           if(num % 2 == 0)
            {
                System.out.println("El numero no es primo");
            }else 
            {
               System.out.println("El numero es primo");
            }
        }else{
            System.out.println("El numero uno no es primo ni compuesto");
        }
    }   
}
