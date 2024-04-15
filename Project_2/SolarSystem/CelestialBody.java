package SolarSystem;

import Exceptions.DuplicateCelestialBodyException;

import java.util.ArrayList;

/**
 * This is the CelestialBody Class
 * This class has the CelestialBody constructor
 * Also has the add method to add a planet or moon to a star or planet
 */
public class CelestialBody {

    private String name;
    private String type;
    private ArrayList<CelestialBody> Children = new ArrayList<CelestialBody>();

    public CelestialBody(String name, String type) {
        this.name = name;
        this.type = type;
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

}
