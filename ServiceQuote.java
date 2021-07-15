/*
* create a class to hold to model the service quote object.
* the class will have two attributes, parts charges and labor charges.
* and it will also have three methods including getpartschages to return parts
* charges and get labor charges to return labor charges, gettotalcharges to return the sum of 
* parts charges and labor charges.
**/
public class ServiceQuote {
    private double partsCharges; // variable to hold parts charges
    private double laborCharges; // varibale to hold labor charges

    /* create a contructor to be used in iniatialising a service qoute object.
    * the constructor should take partscharges and laborCharges as arguments
    **/
    public ServiceQuote(double PartsCharges, double LaborCharges){
        partsCharges = PartsCharges; 
        laborCharges = LaborCharges;
    }
    /*create a method to return parts charges
    **/
    public double getPartsCharges(){
        return partsCharges;
    }
     /*create a method to return labor charges
    **/
    public double getLaborCharges(){
        return laborCharges;
    }
     /*create a method to return total charges
    **/
    public double getTotalCharges(){
        return partsCharges + laborCharges;
    }
}
