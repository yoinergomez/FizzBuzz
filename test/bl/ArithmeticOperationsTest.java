/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yoinergomez
 */
public class ArithmeticOperationsTest {
    
    @Test
    public void isMultipleOfThree() {
        int number = 9;
        int multiple = 3;
        boolean result;
        
        result = ArithmeticOperations.isMultipleOf(number, multiple);
        
        assertTrue(result);
    }
    
    @Test
    public void isNotMultipleOfThree() {
        int number = 7;
        int multiple = 3;
        boolean result;
        
        result = ArithmeticOperations.isMultipleOf(number, multiple);
        
        assertFalse(result);
    }
    
    @Test
    public void isMultipleOfFive() {
        int number = 100;
        int multiple = 5;
        boolean result;
        
        result = ArithmeticOperations.isMultipleOf(number, multiple);
        
        assertTrue(result);
    }
    
    @Test
    public void isNotMultipleOfFive() {
        int number = 7;
        int multiple = 5;
        boolean result;
        
        result = ArithmeticOperations.isMultipleOf(number, multiple);
        
        assertFalse(result);
    }

}
