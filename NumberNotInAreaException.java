package org.unibl.etf.Calculator;
import java.lang.Exception;

/**
 * This exception is thrown when number is not in area
 * @author Goran Sarac
 *
 */
public class NumberNotInAreaException extends Exception{
    public NumberNotInAreaException(String message)
    {
        super(message);
    }
}
