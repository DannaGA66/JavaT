package code.bro;
import java.util.Scanner;
public class NEstudiantes 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de estudiantes: ");
        int numE = leer.nextInt();
        double promedio = 0;
        int i = 0;
        
        while (numE > i)
        {
            System.out.println("Digite el nombre numero " + (i + 1) +" : ");
            String nombre = leer.next();
            System.out.println("Digite la edad numero " + (i + 1) + " : ");
            int edad = leer.nextInt();
            promedio = promedio + edad;
            
            i++;
        }
        promedio = promedio/i;
        System.out.println("El promedio de edades de es: "+ promedio);
    }
    
}
