package org.unibl.etf.Calculator;
import java.lang.Exception;

/**
 * This exception is thrown when operation is not suported
 * @author Goran Sarac
 *
 */
public class NotSupportedOperationException extends Exception{
    public NotSupportedOperationException(String message)
    {
        super(message);
    }
}
