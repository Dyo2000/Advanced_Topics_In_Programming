package Exceptions;
/**
 * This is the DuplicateCelestialBodyException Class that extends Exception
 * This class displays an argMessage when thrown
 */
public class DuplicateCelestialBodyException extends Exception{
    public DuplicateCelestialBodyException(String argMessage){
        super(argMessage);
    }
}
