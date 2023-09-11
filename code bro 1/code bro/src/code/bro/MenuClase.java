package code.bro;
import java.util.Scanner;
public class MenuClase 
{
    public static void main(String[] args) 
    {
        boolean salir = false;
      
        Scanner leer = new Scanner(System.in);
            System.out.println("************" + "Menu" + "************");
            System.out.println("1. Suma");  
            System.out.println("2. resta"); 
            System.out.println("3. division"); 
            System.out.println("4. mod"); 
            System.out.println("5. Multimplicasion"); 
            System.out.println("0. Salida"); 
       do
       {
         System.out.println("Digite el numero que desea ver: ");
         int caso = leer.nextInt();
        switch(caso)
        {
            case 0:
                salir = true;
                break;
                
            case 1: 
                System.out.println("Digite el el numero 1: ");
                         int num1 = leer.nextInt();
                         System.out.println("Digite el el numero 2: ");
                         int num2 = leer.nextInt();
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2: 
                System.out.println("Digite el el numero 1: ");
                         int num4 = leer.nextInt();
                         System.out.println("Digite el el numero 2: ");
                         int num3 = leer.nextInt();
                System.out.println("El resultado de la resta es: " + (num4 - num3));
                break;
            case 3: 
                System.out.println("Digite el el numero 1: ");
                         int num5 = leer.nextInt();
                         System.out.println("Digite el el numero 2: ");
                         int num6 = leer.nextInt();
                System.out.println("El resultado de la Division es: " + (num5 / num6));
                break;
            case 4: 
                 System.out.println("Digite el el numero 1: ");
                         int num7 = leer.nextInt();
                         System.out.println("Digite el el numero 2: ");
                         int num8 = leer.nextInt();
                System.out.println("El resultado del mod es: " + (num7 % num8));
                break;   
            case 5: 
                System.out.println("Digite el el numero 1: ");
                         int num9 = leer.nextInt();
                         System.out.println("Digite el el numero 2: ");
                         int num10 = leer.nextInt();
                System.out.println("El resultado de la multiplicacion es: " + (num9 * num10));
                break; 
            default: System.out.println("No es una opcion");   
        }
       } while(!salir);
        
    }
    
}
