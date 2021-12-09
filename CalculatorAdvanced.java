package org.unibl.etf.Calculator;

/**
 * The Calculator advanced is a simple class that inherits class Calculator and lets us do
 * some more complex mathematical functions like calculating power of number, factorial of number
 * and also let us to check if number is Perfect or Armstrong number.
 * @see Calculator
 * @author Goran Sarac
 *
 */
public class CalculatorAdvanced extends Calculator{
/**
 * This method calculates the value of the number on the power and factorial of the number.
 * @param action Can be either ! which is action for calculating the factorial of currentValue, or
 * one of the numbers from 0 to 9 and they represent power of the number.
 * @throws NumberNotInAreaException value of currentValue is not between [0,10] when calculating factorial.
 * @throws NotSupportedOperationException action is not one of symbols that it should be(!,[0,9]).
 * @see NumberNotInAreaException
 * @see NotSupportedOperationException
 */
    public void calculateAdvanced(char action) throws NotSupportedOperationException,NumberNotInAreaException
    {
        int value = (int)getCurrentValue();
        int temp = value;
        switch(action) {
            case '0':
                value = 1;
                setCurrentValue((double) value);
                break;

            case '1':
                setCurrentValue((double) value);
                break;

            case '2':
                value *= value;
                setCurrentValue((double) value);
                break;

            case '3':
                for (int i = 1; i < 3; i++) {
                    value = value * temp;
                }
                setCurrentValue((double) value);
                break;

            case '4':
                for (int i = 1; i < 4; i++) {
                    value = value * temp;
                }
                setCurrentValue((double) value);
                break;

            case '5':
                for (int i = 1; i < 5; i++) {
                    value = value * temp;
                }
                setCurrentValue((double) value);
                break;

            case '6':
                for (int i = 1; i < 6; i++) {
                    value = value * temp;
                }
                setCurrentValue((double) value);
                break;

            case '7':
                for (int i = 1; i < 7; i++) {
                    value = value * temp;
                }
                setCurrentValue((double) value);
                break;

            case '8':
                for (int i = 1; i < 8; i++) {
                    value = value * temp;
                }
                setCurrentValue((double) value);
                break;

            case '9':
                for (int i = 1; i < 9; i++) {
                    value = value * temp;
                }
                setCurrentValue((double) value);
                break;
            case '!':
                if (value >= 0 && value <= 10) {
                    for (int i = temp - 1; i > 0; i--) {
                        value = value * i;
                    }
                    setCurrentValue((double) value);
                } else
                    throw new NumberNotInAreaException("Number is not in area!");
            default:
                throw new NotSupportedOperationException("Invalid operator!");
        }

    }

    /**
     * This is method  that checks if currentNumber has  special attributes. It can check
     * if number is perfect or Armstrong number.
     * @param value Can have two values 'A' or 'P'. if there is 'A' we are checking if number is Armstrng number
     * and if it is 'P' we check if number is perfect number.
     * @return boolean If number has that specific attribute it returns true else false.
     * @throws NotSupportedOperationException if value has value of anything else that 'A' or 'P'.
     * @throws NumberNotInAreaException if currentValue is less than 1.
     * @see NotSupportedOperationException
     * @see NumberNotInAreaException
     */
    public Boolean hasCharacteristic(char value) throws NumberNotInAreaException,NotSupportedOperationException{
        if(value == 'A'){
            if(getCurrentValue()<1)
                throw new NumberNotInAreaException("Number is not in area!");
            return armstrongNumber();
        }
        else if(value == 'P'){
            if(getCurrentValue()<1)
                throw new NumberNotInAreaException("Number is not in area!");
            return perfectNumber();
        }
        else
            throw new NotSupportedOperationException("Invalid operator!");
    }
    /**
     * function that checks if number is Armstrong number.
     * @return boolean If number is Armstorng number returns true else false.
     */
    private boolean armstrongNumber(){
            int val = (int)getCurrentValue();
            int temp = val;
            int counter = 0, sum = 0, number = 0, tempSum = 1;
            while(temp != 0)
            {
                temp = temp / 10;
                counter++;
            }
            temp = val;
            while(temp != 0)
            {
                number = temp % 10;
                for(int i = 0; i < counter; i++)
                {
                    tempSum = tempSum * number;
                }
                sum = sum + tempSum;
                temp = temp / 10;
                tempSum = 1;
            }
            if(sum == val)
                return true;
            else
                return false;
        }
    /**
     * function that checks if number is perfect number.
     * @return boolean If number is perfect returns true else false.
     */
        private boolean perfectNumber(){
            int val = (int)getCurrentValue();
            int temp = val, sum = 0;
            for(int i = 1; i < temp; i++)
            {
                if(temp % i == 0)
                {
                    sum = sum + i;
                }
            }
                if(sum == val)
                    return true;
                else
                    return false;
        }
}





