package org.unibl.etf.Calculator;

/**The calculator is a simple class that lets us do basic mathematical operations.
 * @author Goran Sarac
 *
 */

public class Calculator {

    /**
     * currentValue is a variable that is our current value on calculator.
     */
    private double currentValue;

    /**
     * this is basic constructor for class Calculator and it sets currentValue to 0.0.
     */
    public Calculator(){
        currentValue=0.0;
    }
    /**

    /**
     * setCurrentValue(double currentValue) method is used to set value to currentValue.
     * @param currentValue Is value that is currently on our calculator.
     */
    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    /** getCurrentValue() is a method that gives us our currentValue.
     * @return it returns currentValue.
     */
    public double getCurrentValue() {
        return currentValue;
    }

    /**
     * This method works the basic operations like {+,-,*,/} on currentValue with value.
     * @param value This is value that is added,subtracts,multiples or divides our currentValue.
     * @param operator This is operation that we want to use it can be {+,-,*,/}.
     * @throws DivideByZeroException  when we divide with 0.
     * @throws NotSupportedOperationException when we use operation or symbol that is not one of {+,-,*,/}.
     * @see DivideByZeroException
     * @see NotSupportedOperationException
     */
    public void calculate(double value, char operator) throws DivideByZeroException,NotSupportedOperationException{
        switch(operator)
        {
            case '+':
                currentValue = currentValue + value;
                break;

            case '-':
                currentValue = currentValue - value;
                break;

            case '*':
                currentValue = currentValue * value;
                break;

            case '/':
                if(value != 0.0)
                    currentValue = currentValue / value;
                else
                    throw new DivideByZeroException("Diviser cannot be zero!");
                break;
            default:
                throw new NotSupportedOperationException("Invalid operator!");
        }
    }

}
