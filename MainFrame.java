// Define the Customer class
class Customer {
    private String customerType;
    private String customerName;
    private int customerID;
    private static Customer instance;

    // Constructor
    public Customer(int customerID, String customerName, String customerType) {
        this.customerType = customerType;
        this.customerName = customerName;
        this.customerID = customerID;
    }
    // Singleton getInstance method
public static Customer getInstance(int customerID, String customerName, String customerType) {
    if (instance == null) {
        instance = new Customer (customerID, customerName, customerType);
    }
    return instance;
}


    // Setters and Getters
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerID() {
        return customerID;
    }
}

