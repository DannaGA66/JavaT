
package trabajo.javahoy;
//5.crear una matriz con posiciones mayores a 4 y cuadrada dibujar un cuadrado
public class MatrizCuadrado
{
    public static void main(String[] args)
    {
         int matrizSq[][] = new int[4][4];
        System.out.println("\n\nPunto V: ");
        System.out.println("\nCuadrado: ");
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                
                if ((i == 0)||(j == 0) ||(j == 3)||(i == 3)){
                    matrizSq[i][j] = 1;
                }
                else{
                    matrizSq[i][j] = 0;
                }     
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                
                System.out.print("| " + matrizSq[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
}
