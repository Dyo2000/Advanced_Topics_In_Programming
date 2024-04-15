package solarsystem;

import exceptions.DuplicateCelestialBodyException;
import exceptions.InvalidCelestialBodyException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import panes.ErrorPane;
import panes.SolarSystemPane;

/**
 * @author Dylan O'Connor
 * date 2/22/2023
 * This program creates a model of our solar system
 */
public class SolarSystem extends Application{

    /**
     * This is the main method
     * Defines the Star, Planets, and Moons
     * Also calls the add function
     * At the bottom calls the function to print what is orbiting also the surface temp of Sun
     * @param args
     */
    public static void main(String [] args) throws InvalidCelestialBodyException{
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        CelestialBody Star = new CelestialBody("Sun", "Star", Color.YELLOW, 150);


        Star Sun = new Star("Sun", "Star", 5778, Color.YELLOW, 150);
        Planet Mercury = new Planet("Mercury", "Planet", Star, Color.GREY, 10);
        Planet Venus = new Planet("Venus", "Planet", Star, Color.ORANGE, 20);
        Planet Earth = new Planet("Earth", "Planet", Star, Color.BLUE, 23);
        Planet Mars = new Planet("Mars", "Planet", Star, Color.RED, 18);
        Planet Jupiter = new Planet("Jupiter", "Planet", Star, Color.TAN, 45);
        Planet Saturn = new Planet("Saturn", "Planet", Star, Color.HONEYDEW, 42);
        Planet Uranus = new Planet("Uranus", "Planet", Star, Color.SKYBLUE, 32);
        Planet Neptune = new Planet("Neptune", "Planet", Star, Color.INDIGO, 32);
        Moon Moon = new Moon("Moon", "Moon", Earth, Color.GREY,5);
        Moon Phobos = new Moon("Phobos", "Moon", Mars, Color.GREY,4);
        Moon Deimos = new Moon("Deimos", "Moon", Mars, Color.GREY,5);

        try {
            Sun.add(Mercury);
            //Sun.add(Venus);
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

            SolarSystemPane pane = new SolarSystemPane(); //creates a new solarSystemPane
            //below adds all the planets to the pane
            pane.addStar(Sun);
            pane.addPlanet(Mercury, 140);
            pane.addPlanet(Venus, 200);
            pane.addPlanet(Earth, 265);
            pane.addPlanet(Mars, 330);
            pane.addPlanet(Jupiter, 400);
            pane.addPlanet(Saturn, 470);
            pane.addPlanet(Uranus, 537);
            pane.addPlanet(Neptune, 595);

            pane.addMoon(Moon, 23);
            pane.addMoon(Phobos, 25);
            pane.addMoon(Deimos, 21);

            Scene scene = new Scene(pane, 850, 700); //new scene with the defined pane
            stage.setTitle("Solar System Model");

            stage.setScene(scene);

        } catch (DuplicateCelestialBodyException e) {
            //if this error occurs it sets a new ErrorPane with the errorMessage in it
            e.printStackTrace();
            stage.setTitle("Error");
            Scene scene2 = new Scene(new ErrorPane(e.getMessage()), 270, 80);
            stage.setScene(scene2);
        }

        Earth.getOrbitInformation();
        Venus.getOrbitInformation();
        Moon.getOrbitInformation();
        Phobos.getInformation();
        Phobos.getOrbitInformation();
        System.out.println("The " + Sun.getName() + " is " + Sun.getSurfaceTemp() + "°k");

        stage.show();

    }
}

