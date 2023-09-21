/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculo.desuelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uestudiantes
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
    }

    @Test
    public void testCalculoDesueldo() {
        System.out.println("calculoDesueldo");
        Empleado instance = new Empleado(5000,16,1);
        double expResult = 5000;
        double result = instance.calculoDesueldo();
        assertEquals(expResult, result, 0.0);
       
    }
    
    
}
