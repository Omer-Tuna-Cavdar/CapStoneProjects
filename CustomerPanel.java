/**
 * SalesManager
 */
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;


    
    
    public class CustomerPanel extends JFrame {
    
    private JTextField nameField, customerIDfield, customerTypeField; 
    private JButton displayButton;
    
    private Customer Customer;
    
    public CustomerPanel() {
        // Setting up the JFrame
        super("Customer Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
    
        // Creating Customer instance using getInstance method
        Customer = Customer.getInstance(0,"", "");
    
        // Creating components
        nameField = new JTextField(20);
        customerTypeField = new JTextField(20);
        customerIDfield = new JTextField(20);
        displayButton = new JButton("Display Information");
    
        // Setting up layout
        setLayout(new GridLayout(5, 2));
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("ID:"));
        add(customerIDfield);
        add(new JLabel("Type:"));
        add(customerTypeField);
        add(new JLabel(""));
        add(displayButton);
    
        // Adding action listener to the button
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display information when the button is clicked
                displayInformation();
            }
        });
    }
    
    private void displayInformation() {
        // Retrieving information from text fields
        String name = nameField.getText();
        int customerID = Integer.parseInt(customerIDfield.getText());
        String Type = customerTypeField.getText();
    
        // Setting information to the Customer instance
        Customer.setCustomerName(name);
        Customer.setCustomerID(customerID);
        Customer.setCustomerType(Type);
    
        // Displaying the information in console
        System.out.println("Name: " + Customer.getCustomerName());
        System.out.println("ID: " + Customer.getCustomerID());
        System.out.println("Type: #" + Customer.getCustomerType());
    
        // Displaying the information on the JPanel
        updatePanelWithInformation();
    }
    
    private void updatePanelWithInformation() {
        // Setting the information in text fields
        nameField.setText(Customer.getCustomerName());
        customerTypeField.setText(Customer.getCustomerType());
        customerIDfield.setText(Integer.toString(Customer.getCustomerID()));
    }
    
    public static void main(String[] args) {
        // Create and show the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerPanel().setVisible(true);
            }
        });
    }
    }
    //resources: 
    //https://docs.oracle.com/javase/tutorial/uiswing/components/textfield.html
    //https://github.com/Cpiskin/Capstone-AP-CSA-Project-Mid-I-Performance-/blob/main/BankAccount.md
    
    