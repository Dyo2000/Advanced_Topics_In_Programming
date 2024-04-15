package solarsystem;

import exceptions.DuplicateCelestialBodyException;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.ArrayList;


/**
 * This is the CelestialBody Class
 * This class has the CelestialBody constructor
 * Also has the add method to add a planet or moon to a star or planet
 */
public class CelestialBody extends Circle {

    private String name;
    private String type;
    private ArrayList<CelestialBody> Children = new ArrayList<CelestialBody>();

    /**
     * This is the CelestialBody constructor that returns the name, type, color and radius to the main method
     * it also has a mouseevent where when the celestialbody is clicked it prints out the information
     * @param name
     * @param type
     * @param color
     * @param radius
     */
    public CelestialBody(String name, String type, Color color, double radius) {
        this.name = name;
        this.type = type;
        this.setFill(color);
        this.setRadius(radius);

        this.setOnMouseClicked(event ->{
            this.getInformation();
        });
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    /**
     * This is the add method that throws duplicate exception
     * This method checks if the child exists in the array
     * if not add child to array and print successfully added
     * @param Child
     */
    public void add(CelestialBody Child) throws DuplicateCelestialBodyException {
        String c = Child.getName();
        String t = Child.getType();
        if(!Children.contains(Child)){
            Children.add(Child);
            System.out.println(t + " " + c + " was added successfully to " + name);
        }
        else{
            throw new DuplicateCelestialBodyException(t + " " + c + " is already in the collection");
        }
    }
    /**
     * This is the getChildren Method
     * This method returns the children in the array
     */
    public ArrayList<CelestialBody> getChildren(){
        return Children;
    }

    /**
     * this is the getInformation method that displays the type and name of the celestial body
     */
    public void getInformation(){
        System.out.println("This is the " + type + " " + name);
    }
}

