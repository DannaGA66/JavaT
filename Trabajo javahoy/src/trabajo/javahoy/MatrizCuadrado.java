
package trabajo.javahoy;
//5.crear una matriz con posiciones mayores a 4 y cuadrada dibujar un cuadrado
public class MatrizCuadrado
{
    public static void main(String[] args)
    {
        int myMatriz [][] = new int[5][5];
        
        System.out.println("******");
        
        int acumulador = 1;
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++ )
            {
                myMatriz[j][i] = acumulador * 2;
                myMatriz[i][j] = acumulador * 1; 
                
            }
            
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++ )
            {
                System.out.print(" | "+ myMatriz[i][j] +" | ");
            }
                System.out.println(" ");
         }
    }
    
}
