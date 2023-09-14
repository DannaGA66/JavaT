
package trabajo.javahoy;
import java.util.Scanner;
public class Matriz1 {
    //2.crear un arreglo con n cantidad de notas sacar el promedio imprimir arreglo y promedio.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de notas: ");
        int canNotas = leer.nextInt();
        double myArray[] = new double [canNotas];
        System.out.println("******");
        double Promedio = 0;
        for (int i = 0; i < canNotas; i++)
        {
            System.out.println("Ingrese la nota numero " + (i + 1) + " : ");
            double nota = leer.nextDouble();
            myArray[i] = nota;  
            Promedio =  Promedio + nota;
        }
        for(int i = 0; i < canNotas; i++)
        {
            System.out.print(" "+myArray[i] + " | " );
        }
         Promedio =  Promedio / canNotas;
         System.out.println("\n El promedio es: " + Promedio);
         
    }
    
}
