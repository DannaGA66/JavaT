
package trabajo.javahoy;

public class MatrizX
{

    public static void main(String[] args) 
    {
        int matrizX[][] = new int[3][3];
         System.out.println("\n\nPunto IV: ");
        System.out.println("\nX: ");
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                
                if(i == j)
                {
                    matrizX[i][j] = 1;
                }
                else{
                    matrizX[i][j] = 0;
                }
                
            }
        }
        matrizX[0][2] = 1;
        matrizX[2][0] = 1;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                System.out.print("| " + matrizX[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
}
