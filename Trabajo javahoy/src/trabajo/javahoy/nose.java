
package trabajo.javahoy;
import java.util.Scanner;
public class nose {

    public static void main(String[] args) {
          /*III*/
        Scanner leer = new Scanner(System.in);
        int posicion = 0;
        int a = 0;
        int b = 1;
        int c;
        /* III */
        
        System.out.println("Punto III: ");
        System.out.print("Cuantos datos desea ver? (MAXIMO 5): ");
        posicion = leer.nextInt();
        
        if(posicion <= 5)
        {
            int fibonacci[] = new int[posicion];

            for(int i = 0; i < (posicion-2); i++)
            {

                c = a + b;

                fibonacci[i] = c;

                a = b;
                b = c;
            }
            System.out.println("\nSucesion fibonacci: ");
            System.out.print("| " + "0" + " | " + "1 ");  
            for(int i = 0;i < (posicion-2); i++)
            {
                System.out.print("| " + fibonacci[i] + " | ");
            }
        }else{
            System.out.println("No se puede mostrar esa cantidad de datos ");
        }
        
    }
    
}
