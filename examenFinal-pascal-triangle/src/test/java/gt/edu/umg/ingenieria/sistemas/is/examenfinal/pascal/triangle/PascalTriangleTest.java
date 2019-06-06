/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import java.util.Arrays;
import java.util.OptionalInt;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enmanuel
 */
public class PascalTriangleTest {
    
    public PascalTriangleTest() {
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

    /**
     * Test of build method, of class PascalTriangle.
     */
    @Test
    public void Prueba1() {
        System.out.println("TEST #1 - Cuando se envía cero retorna un arreglo vacio");

        // given
        int input = 0;
        String expectedResult = Arrays.toString(new long[0]);

        // when
        PascalTriangle ejecucion = new PascalTriangle();
        String actualResult = ejecucion.build(input);

        // then
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void Prueba2() {
        System.out.println("TEST #2 - Cuando se envía un valor el numero de arreglos de respuesta es igual a el mismo");

        // given
        int input = 5;

        
        // when
        PascalTriangle ejecucion = new PascalTriangle();
        String[] actualResult = null;
        actualResult = ejecucion.build(input).split(System.lineSeparator());
      

        // then
        assertEquals(input, actualResult.length);
    }

    @Test
    public void Prueba3() {
        System.out.println("TEST #3 - Cuando se envía negativo");

        // given
        int input = -5;
        String expectedResult = Arrays.toString(new long[0]);

        // when
        PascalTriangle ejecucion = new PascalTriangle();
        String actualResult = ejecucion.build(input);

        // then
        assertEquals(expectedResult, actualResult);
    }
    
    
    
    @Test
    public void Prueba4() {
        System.out.println("TEST #4- No permite letras");

        // given
        String input = "ab";
        String expectedResult = "No permite letras";

        // when
        PascalTriangle ejecucion = new PascalTriangle();
        String actualResult = ejecucion.build(input);

        // then
        assertEquals(expectedResult, actualResult);
    }
    
    
}
