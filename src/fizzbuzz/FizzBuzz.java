/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author yoinergomez
 */
public class FizzBuzz {

    public String evaluateFizzBuzz(int number) {
        String result = "";
        
        if (ArithmeticOperations.isMultipleOf(number, 3)) {
            result += "Fizz";
        }
        if (ArithmeticOperations.isMultipleOf(number, 5)) {
            result += "Buzz";
        }
        
        if (result.isEmpty()) {
            return Integer.toString(number);
        }
        return result;
    }
    
    public void printFizzBuzz(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(evaluateFizzBuzz(i));
        }
    }

}
