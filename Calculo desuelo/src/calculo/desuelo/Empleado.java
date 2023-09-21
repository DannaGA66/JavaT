package calculo.desuelo;
public class Empleado
{
    //atributos clase empleados
    public String nombres;
    public String apellidos;
    public String documento;
    public double sueldoBase;
    public int edad;
    public int horasEx;
    final public int HORASEX = 300;
    //constructores
    public Empleado(/*se pueden recibir parametros*/)
    {
        this.nombres ="";
        this.apellidos="";
        this.documento = "";
        this.sueldoBase = 0.0;
        this.edad = 0;
        this.horasEx = 0;
    }

    public Empleado(String nombres, String apellidos, String documento, double sueldoBase, int edad, int horasEx ) 
    {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.sueldoBase = sueldoBase;
        this.edad = edad;
        this.horasEx = horasEx;
    }

    public Empleado(double sueldoBase, int edad, int horasEx) 
    {
        this.sueldoBase = sueldoBase;
        this.edad = edad;
        this.horasEx = horasEx;
    }
    
    public double calculoDesueldo()
    {
        double sueldoPagar = 0;
        if (this.edad > 60)
        {
            sueldoPagar = (this.sueldoBase * 0.10) + this.sueldoBase ;
        }else
        {
            sueldoPagar = this.sueldoBase;
        }
        return sueldoPagar;
    }
    
    
    
}
