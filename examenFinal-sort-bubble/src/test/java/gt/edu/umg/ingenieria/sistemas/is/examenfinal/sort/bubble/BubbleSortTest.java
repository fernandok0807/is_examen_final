/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

import java.util.Arrays;
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
public class BubbleSortTest {
    
    public BubbleSortTest() {
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
     * Test of sortBasic method, of class BubbleSort.
     */
@Test
    public void Prueba1() {
        System.out.println("TEST #1 - Cuando se envía un arreglo null retorna  null");

        // given
        
         int input[]= null;
        int expectedResult[] = null;

        // when
        
        int actualResult[] = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals(expectedResult, actualResult);
    }
    
@Test
    public void Prueba2() {
        System.out.println("TEST #2 - Funcionanimiento normal");

        // given
        
        int input[]= new int[]{5,2,3};;
        int expectedResult[] = new int[]{2,3,5};

        // when
        
        int actualResult[] = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals(expectedResult, actualResult);
    }
    
     @Test
    public void Prueba3() {
        System.out.println("TEST #3 - Cuando se Envia un arreglo vacio retorno");

        // given
         int input[]= new int[]{};
        int expectedResult[] = new int[]{};

        // when
        
        int actualResult[] = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void Prueba4() {
        System.out.println("TEST #4 - Si se envia un unico valor retorna el mismo valor");

        // given
        int[] input = new int[]{5};
        int[] expectedResult = new int[]{5};

        // when
        int actualResult[] = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals(expectedResult, actualResult);
    }
    
}
