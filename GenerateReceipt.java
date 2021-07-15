import java.util.Scanner;
import java.io.*;


public class GenerateReceipt {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        String customerName,
               customerAddress,
               customerPhone,
               carMake,
               carModel;


        int carYear;

        double partsCharges,
               laborCharges; 
        
        System.out.println("enter cutomer name; ");       
        customerName = keyboard.nextLine();
        System.out.println("enter customer address; ");
        customerAddress = keyboard.nextLine();
        System.out.println("Enter customer Phone; ");
        customerPhone = keyboard.nextLine();
        System.out.println("enter car's make; ");
        carMake = keyboard.nextLine();
        System.out.println("enter car model; ");
        carModel = keyboard.nextLine();


        System.out.println("enter car make year; ");
        carYear = keyboard.nextInt();
        System.out.println("enter parts charges; ");
        partsCharges = keyboard.nextDouble();
        System.out.println("enter labor charges; ");
        laborCharges = keyboard.nextDouble();

        Car car = new Car(carMake, carModel, carYear);
        Customer customer = new Customer(customerName, customerAddress, customerPhone);
        ServiceQuote serviceQuote = new ServiceQuote(partsCharges, laborCharges);

        ReceiptGenerator(car, customer, serviceQuote);};

    private static void ReceiptGenerator(Car car, Customer customer, ServiceQuote serviceQuote) throws IOException
    {
        PrintWriter outPutFile = new PrintWriter("receipt.txt");
                outPutFile.println("---------------------------------");
                outPutFile.println("     codegeek car repairs         ");
                outPutFile.println("---------------------------------");
                outPutFile.println("       CUSTOMER DETAILS:       ");
                outPutFile.println("name; "+ "      "+ customer.getName());
                outPutFile.println("Address; "+ "    "+ customer.getAddress());
                outPutFile.println("Phone; "+ "     "+ customer.getPhone());
                outPutFile.println("car Make; " + car.getMake()+ "  " + "car model; " + car.getModel());
                outPutFile.println("----------------------------------");
                outPutFile.println("      service qoute details        ");
                outPutFile.println("parts charges; ---------" + serviceQuote.getPartsCharges());
                outPutFile.println("labor charges; ---------" + serviceQuote.getLaborCharges());
                outPutFile.println("total charges  ---------"+ serviceQuote.getTotalCharges());
                outPutFile.close();
    }
}
