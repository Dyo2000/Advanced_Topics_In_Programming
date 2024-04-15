package solarsystem;

import exceptions.InvalidCelestialBodyException;
import javafx.scene.paint.Color;

/**
 * This is the Planet Class that extends Celestial Body class implements IOrbit interface
 * This class has the defined constructor for a Star
 * also has the getOrbit method
 */
public class Planet extends CelestialBody implements IOrbit{

    private CelestialBody orbits;

    public String pn;

    /**
     * This is the Planet Constructor
     * This is the defined constructor for a Planet
     * Sends the name and type "Planet" to the super class.
     * Checks if Planet orbits star, otherwise throws exception
     * @param name
     * @param type
     * @param orbits
     */

    public Planet(String name, String type, CelestialBody orbits, Color color, double radius) throws InvalidCelestialBodyException {
        super(name, "Planet", color, radius);
        pn = name;
        String o2 = orbits.getType();
        if(o2.equals("Star")){
            this.orbits = orbits;
            this.setFill(color);
            this.setRadius(radius);
        }
        else{
            throw new InvalidCelestialBodyException("A planet must orbit a star");
        }

    }

    /**
     * This is the getOrbit method.
     * prints what the planet is orbiting
     *
     * @return
     */
    public CelestialBody getOrbit(){
       return orbits;
    }
    public void getOrbitInformation(){
        String o2 = orbits.getName();
        System.out.println(pn + " is orbiting " + o2);
    }
}
