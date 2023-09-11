package code.bro;
public class SumaP {
    public static void main(String[] args) {
       
        int suma = 0;
        int i = 0 ;
        int c = 1;
        
        while (i < 2000){
            if (c % 2 == 0){
                suma = suma + c;
                i++;
            }
            c++;
        }
        //System.out.println(c);
        System.out.println("La suma de los pares es igual a: "+ suma);
    }
    
}
