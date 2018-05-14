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
public class FizzBuzztest {
    
    private FizzBuzz fizzbuzz;
    
    public FizzBuzztest() {
        fizzbuzz = new FizzBuzz();
    }
    
    @Test
    public void verifyNumber() {
        int number = 2;
        String result;
        
        result = fizzbuzz.evaluateFizzBuzz(number);
        
        assertEquals("2", result);
    }
    
    @Test
    public void verifyFizz() {
        int number = 6;
        String result;
        
        result = fizzbuzz.evaluateFizzBuzz(number);
        
        assertEquals("Fizz", result);
    }
    
    @Test
    public void verifyBuzz() {
        int number = 10;
        String result;
        
        result = fizzbuzz.evaluateFizzBuzz(number);
        
        assertEquals("Buzz", result);
    }
    
    @Test
    public void verifyFizzBuzz() {
        int number = 30;
        String result;
        
        result = fizzbuzz.evaluateFizzBuzz(number);
        
        assertEquals("FizzBuzz", result);
    }
}
