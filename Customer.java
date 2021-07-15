/*
* create a customer class to model the customer object.
* it will have attributes including name, address, phone.
* and methods such as getName to return name, getAddress to return address,
* and getPhone to return phone.
**/

public class Customer{
    private String name; // save a customer's name in a variable
    private String address; // save customer's address in a variable
    private String phone; // save customer's phone in a variable

    /*
    *create a class contructor to iniatiate with a 
    *name, address and phone references
    **/
    public Customer(String Name, String Address, String Phone){
        name = Name;
        address = Address;
        phone = Phone;
    }

    /*
    * create a method that return the customer name
    **/

    public String getName(){
        return name;
    }

    /*
    * create a method that return the customer address
    **/

    public String getAddress(){
        return address;
    }

    /*
    * create a method that return the customer phone
    **/

    public String getPhone(){
        return phone;
    }


}