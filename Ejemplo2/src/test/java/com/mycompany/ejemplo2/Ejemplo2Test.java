/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejemplo2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jogo
 */
public class Ejemplo2Test {
    
    public Ejemplo2Test() {
    }

    @Test
    public void testSumaRecursiva() {
        System.out.println("sumaRecursiva");
        int numero = 3;
        int expResult = 6;
        int result = Ejemplo2.sumaRecursiva(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testSuma() {
        System.out.println("suma");

        int result = Ejemplo2.suma(3);
        assertEquals(6, result);
    }
    
}
