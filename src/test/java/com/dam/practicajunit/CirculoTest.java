/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dam.practicajunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jhonatan.cucunamelop
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void testCirculo(){
        System.out.println("A");
        Circulo instancia = new Circulo();
        double resultadoEsperado = 0;
        double resultado = instancia.getRadio();
        assertEquals(resultadoEsperado,resultado, 0);
        
    }
    
    /**
     * Test of getRadio method, of class Circulo.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circulo instance = new Circulo();
        instance.setRadio(10.0);
        double radioEsperado = 10.0;
        
        double resultRadio = instance.getRadio();
        assertEquals(radioEsperado, resultRadio,0);
        
    }
    
     /**
     * Test of setRadio method, of class Circulo.
     */
    @Test
    public void testSetRadio() {
        System.out.println("setRadio");
        Circulo instanciaC = new Circulo(15);
        double radio = 24.0;
        System.out.println(instanciaC.getRadio());
        instanciaC.setRadio(radio);
        System.out.println(instanciaC.getRadio());
    }

    
    
    
    /**
     * Test of calcularArea method, of class Circulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPerimetro method, of class Circulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
    }

    

   
    /**
     * Test of mostrarNombre method, of class Circulo.
     */
    @Test
    public void testMostrarNombre() {
        System.out.println("mostrarNombre");
        Circulo instance = new Circulo();
        instance.mostrarNombre();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarRadio method, of class Circulo.
     */
    @Test
    public void testMostrarRadio() {
        System.out.println("mostrarRadio");
        Circulo circulito = null;
        double expResult = 0.0;
        double result = Circulo.mostrarRadio(circulito);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
