package code.bro;
import java.util.Scanner;
public class Suma90I {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite desde donde quiere que se sume : ");
        int cadNum = leer.nextInt();
        int c = 0;
        int i = cadNum;
        int suma = 0;
        while(c < 90)
        {
            if (i % 2 != 0 )
            {
                suma = suma + i;
            c++;
            }
         i++;   
        }
        //System.out.println(c);
        System.out.println("El resultado de la suma es: "+ suma);
                
    }
    
}
