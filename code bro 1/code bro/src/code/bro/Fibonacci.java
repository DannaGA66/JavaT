package code.bro;
public class Fibonacci {
    public static void main(String[] args) {
      
        int i = 0;
        int e = 1;
        int f = 0;
        int serie = 0;
        System.out.println("*********************" + "La serie fibonacci es:" + "*********************");
        while(f <= 500)
        {
            System.out.println(  serie );
            f = i + e;
            i =  e;
            e = f;
        
            serie = f;
        
        
       }
        
    }
    
}
