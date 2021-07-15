/**
 * create a car class to model the car object.
 * the class should have make, mdoel and year attributes.
 * it should also have methods to return the aforementioned attributes,
 * getmake(), getModel(), getYear().
 */

public class Car {
    private String make; // store the make of the car in a variable
    private String model; // store the model of the car in variable
    private int year; // store the year of the car in a variable

    public Car(String Make, String Model, int Year){
        make = Make;
        model = Model;
        year = Year;
    }

    /**
     * create a getmake method to return make of the car object
     */

    public String getMake(){
        return make;
    }

    /**
     * create a getmodel method to return the model of the car object
     */

    public String getModel(){
        return model;
    }

    /**
     * create a getyear method to return the year of the car object
     */


    public int getYear(){
        return year;
    }
}
