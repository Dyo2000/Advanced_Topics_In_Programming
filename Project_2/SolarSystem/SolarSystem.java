package SolarSystem;

import Exceptions.DuplicateCelestialBodyException;
import Exceptions.InvalidCelestialBodyException;

/**
 * @author Dylan O'Connor
 * date 2/22/2023
 * This program creates a model of our solar system
 */
public class SolarSystem {

    /**
     * This is the main method
     * Defines the Star, Planets, and Moons
     * Also calls the add function
     * At the bottom calls the function to print what is orbiting also the surface temp of Sun
     * @param args
     */
    public static void main(String [] args) throws InvalidCelestialBodyException {

        CelestialBody Star = new CelestialBody("Sun", "Star");


        Star Sun = new Star("Sun", "Star", 5778);
        Planet Mercury = new Planet("Mercury", "Planet", Star);
        Planet Venus = new Planet("Venus", "Planet", Star);
        Planet Earth = new Planet("Earth", "Planet", Star);
        Planet Mars = new Planet("Mars", "Planet", Star);
        Planet Jupiter = new Planet("Jupiter", "Planet", Star);
        Planet Saturn = new Planet("Saturn", "Planet", Star);
        Planet Uranus = new Planet("Uranus", "Planet", Star);
        Planet Neptune = new Planet("Neptune", "Planet", Star);
        Moon Moon = new Moon("Moon", "Moon", Earth);
        Moon Phobos = new Moon("Phobos", "Moon", Mars);
        Moon Deimos = new Moon("Deimos", "Moon", Mars);

        try {
            Sun.add(Mercury);
            Sun.add(Venus);
            Sun.add(Earth);
            Sun.add(Mars);
            Sun.add(Jupiter);
            Sun.add(Saturn);
            Sun.add(Uranus);
            Sun.add(Neptune);
            Earth.add(Moon);
            Mars.add(Phobos);
            Mars.add(Deimos);

        } catch (DuplicateCelestialBodyException e) {
            e.printStackTrace();
        }

        Earth.getOrbit();
        Venus.getOrbit();
        Moon.getOrbit();
        Phobos.getOrbit();
        System.out.println("The " + Sun.getName() + " is " + Sun.getSurfaceTemp() + "°k");


    }
}
