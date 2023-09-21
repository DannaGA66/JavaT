
package calculo.desuelo;

/**
 *
 * programa que permita calcular el sueldo a pagar a un empleado, 
 * desean registrar nombres, apellidos y documentos, sueldo base, el sueldo total a pagar.
 * si el empleado es mayor a 60 años,se le da un 10% mas sobre el suldo base.
 */
public class CalculoDesuelo {

    public static void main(String[] args) {
        //crear instancia de empleado
        Empleado miEmpleado = new Empleado(/*casado con el contructor*/);
        double sueldo = miEmpleado.calculoDesueldo();
        System.out.println("sueldo: " +sueldo);
        Empleado empleado = new Empleado("Sergio" , "Ardila", "1200", 5000,16 ,1);
        System.out.println(empleado.calculoDesueldo());
        Empleado empleadito = new Empleado (15000,76);
        System.out.println(""+empleadito.calculoDesueldo());
    }
    
}
