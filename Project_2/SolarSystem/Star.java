package SolarSystem;

/**
 * This is the Star Class that extends Celestial Body class
 * This class has the defined constructor for a Star
 * Also has the getSurfaceTemp method
 */
public class Star extends CelestialBody{

    private int surfaceTemp;

    /**
     * This is the Star Constructor
     * This is the defined constructor for a Star
     * returns the name and type to the super class (Celestial Body)
     * @param name
     * @param type
     * @param surfaceTemp
     */
    public Star(String name, String type, int surfaceTemp) {
        super(name, type);
        this.surfaceTemp = surfaceTemp;
    }
    /**
     * This is the getSurfaceTemp method
     * that returns the surface temperature defined
     */
    public int getSurfaceTemp(){
        return surfaceTemp;
    }
}
