package org.unibl.etf.Calculator;
import java.lang.Exception;

/**
 * This exception is thrown when value is divided by zero
 * @author Goran Sarac
 *
 */
public class DivideByZeroException extends Exception{
    public DivideByZeroException(String message)
    {
        super(message);
    }
}
