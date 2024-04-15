package panes;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import solarsystem.Moon;
import solarsystem.Planet;
import solarsystem.Star;

/**
 * This is the SolarSystemPane Class
 * This class has the SolarSystemPane constructor that sets the background to black
 * This class has three methods to add the celestial bodies to the pane
 */
public class SolarSystemPane extends Pane{

    /**
     * This is the SolarSystemPane constructor that sets the background to black
     */
    public SolarSystemPane() {
        this.setStyle("-fx-background-color:black");
    }

    /**
     * This is the addStar method that sets the star to 0,0 and adds it to the pane
     * @param star
     */
    public void addStar(Star star){
        star.setCenterX(0);
        star.setCenterY(0);
        this.getChildren().add(star);
    }

    /**
     * This is the addPlanet method  that adds a planet to the pane
     * This also creates the orbit circle with a transparent fill.
     * @param planet
     * @param distance
     */
    public void addPlanet(Planet planet, double distance){

        Circle orbit = new Circle();
        orbit.setFill(Color.TRANSPARENT);  //this is the orbit circle that has a transparent fill
        orbit.setStroke(Color.GREY);
        orbit.setRadius(Math.sqrt(Math.pow(planet.getOrbit().getLayoutX() - distance, 2)+ Math.pow(planet.getOrbit().getLayoutY() - distance, 2)));
        this.getChildren().add(orbit); //adds orbit to the pane


        planet.setCenterX(distance);
        planet.setCenterY(distance);
        this.getChildren().add(planet); //adds planet to the pane

        orbit.setMouseTransparent(true);//need this for mouseEvent. This makes the this.getInformation work
    }

    /**
     * This is the addMoon method that adds a moon to the pane
     * This also creates the orbit circle with a transparent fill.
     * @param moon
     * @param distance
     */
    public void addMoon(Moon moon, double distance){
        moon.setCenterX(moon.getOrbit().getCenterX() + distance); //this sets the moon center to the planet it orbits
        moon.setCenterY(moon.getOrbit().getCenterY() + distance);
        this.getChildren().add(moon);

        Circle orbit1 = new Circle();
        orbit1.setCenterX(moon.getOrbit().getCenterX()); //this sets the orbit center to the planet it is orbiting.
        orbit1.setCenterY(moon.getOrbit().getCenterY());

        orbit1.setFill(Color.TRANSPARENT); //sets the inside of the orbit line to transparent
        orbit1.setStroke(Color.GREY);
        orbit1.setRadius(Math.sqrt(Math.pow(moon.getOrbit().getLayoutX()-distance, 2)+ Math.pow(moon.getOrbit().getLayoutY()-distance, 2)));
        this.getChildren().add(orbit1);

        orbit1.setMouseTransparent(true); //this makes the this.getInformation work

    }
}
