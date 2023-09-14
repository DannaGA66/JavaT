package trabajo.javahoy;
//1.relizar un programa que genere una matrix cuadrada que tanto la fila como la colobmna este en el rango de 4 a 12 llenarla con numeros impares
public class MatrizCuadrada 
{
        public static void main(String[] args)
    {
        int myMatriz [][] = new int[6][6];
        
        System.out.println("******");
        
        int acumulador = 10;
        
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++ )
            {
                myMatriz[i][j] = acumulador + 3 ;
                
            }
            acumulador = acumulador + 4; 
            
        }
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++ )
            {
                System.out.print(" | "+ myMatriz[i][j] +" | ");
            }
                System.out.println(" ");
         }
    }  
}
