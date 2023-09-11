package code.bro;
import java.util.Scanner;
public class Rango1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite desde donde comienza la suma: ");
        int numIn = leer.nextInt();
        System.out.println("Digite hasta donde finaliza la suma: ");
        int numOut = leer.nextInt();
        int i = 0;
        int c = numIn;
        int sumaP = 0;
        int sumaI = 0;
         if(numIn < numOut)
        {
           while((c < numOut) && (c >= numIn))
           {
               if(c % 2 == 0){
                   
                   sumaP = sumaP + c;
                   
                   c++;
                      
               }else{
                   sumaI = sumaI + c;
                   
                   c++;
               }
            i++;
               
           }
       }
         System.out.println("La suma de los numeros pares es: "+ sumaP);
         System.out.println("La suma de los impares es: "+ sumaI);
         System.out.println("La diferencia de los dos es: "+ (sumaP - sumaI));
    }
    
}
