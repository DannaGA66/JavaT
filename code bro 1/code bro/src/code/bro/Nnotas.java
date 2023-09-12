
package code.bro;
import java.util.Scanner;
public class Nnotas
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de notas: ");
        int cantNotas = leer.nextInt();
        int i =0;
        double promedio = 0;
        double notaMa = 1;
        double notaMe = 5;
        while(i < cantNotas)
        {
            System.out.println("Digite la nota numero "+ (i + 1) +" : ");
            double nota = leer.nextDouble();
            if ((nota >= 1) && (nota <= 5))
            {
                promedio = promedio + nota;
                i++;
                
                if(nota > notaMa)
                {
                    notaMa = nota;
                }
                if(nota < notaMe){
                    notaMe = nota;
                }
            }
          
            
         }
        promedio = promedio / cantNotas;
        System.out.println("El promedio es : "+ promedio);
        System.out.println("La nota mayor  es: "+ notaMa);
        System.out.println("La nota menor  es: "+ notaMe);
    }
    
}
