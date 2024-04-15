package SolarSystem;

import Exceptions.InvalidCelestialBodyException;

/**
 * This is the Moon Class that extends Celestial Body class implements IOrbit interface
 * This class has the defined constructor for a Moon
 * Also has the getOrbit method
 */
public class Moon extends CelestialBody implements IOrbit{
    private CelestialBody orbits;
    public String mn;

    /**
     * This is the Moon Constructor
     * This is the defined constructor for a Moon
     * Sends the name and type "Moon" to the super class.
     * Checks if Moon orbits Planet, otherwise throws exception
     * @param name
     * @param type
     * @param orbits
     */
    public Moon(String name, String type, CelestialBody orbits) throws InvalidCelestialBodyException {
        super(name, "Moon");
        mn = name;
        String om = orbits.getType();
        if(om.equals("Planet")){
            this.orbits = orbits;
        }
        else{
            throw new InvalidCelestialBodyException("A moon must orbit a planet");
        }

    }

    /**
     * This is the getOrbit method
     * prints what the moon is orbiting
     */
    public void getOrbit(){
        String pt1 = orbits.getType();
        String pn1 = orbits.getName();

        System.out.println(mn + " is orbiting the " + pt1 + " " + pn1);
    }

}
