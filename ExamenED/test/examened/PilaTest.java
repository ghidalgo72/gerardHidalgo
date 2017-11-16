/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examened;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gerar
 */
public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    @Test
    public void testAfegirCorrecte() {
        System.out.println("Afegir correctement");
        int el = 1;
        Pila instance = new Pila();
        for (int i = 0; i < 50; i++) {
             instance.afegir(1);
        }
        int expResult = 1;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testAfegirValorNegatiu() {
        System.out.println("Afegir valor negatiu");
        int el = -10;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testAfegirPilaPlena() {
        System.out.println("La Pila ja esta plena");
        int el = 1;
        Pila instance = new Pila();
         for (int i = 0; i < 100; i++) {
             instance.afegir(1);
         }
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testAfegirIntroduirZero() {
        System.out.println("Afegir valor 0");
        int el = 0;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testAfegirPilaBuida() {
        System.out.println("Afegir amb pila buida");
        int el = 1;
        Pila instance = new Pila();
        int expResult = 1;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
       
    }
    
    

    
    @Test
    public void testTreurePilaBuida() {
        System.out.println("La pila està buida");
        Pila instance = new Pila();
        int expResult = -1;
        int result = instance.treure();
        assertEquals(expResult, result);
        
    }
    
    @Test
     public void testTreureCorrectament() {
        System.out.println("Treure correctement");
        Pila instance = new Pila();
        instance.afegir(10);
        int expResult = 10;
        int result = instance.treure();
        assertEquals(expResult, result);
        
    }
}
