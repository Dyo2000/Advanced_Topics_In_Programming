package Exceptions;
/**
 * This is the InvalidCelestialBodyException Class that extends Exception
 * This class displays an argMessage when thrown
 */
public class InvalidCelestialBodyException extends Exception{
    public InvalidCelestialBodyException(String argMessage){
        super(argMessage);
    }
}
