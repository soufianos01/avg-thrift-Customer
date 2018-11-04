package main.java;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.ArrayList;

public class CustomerClient {
    public static void main(String [] args) {


        try {
            TTransport transport;

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new  TBinaryProtocol(transport);
            CustomerService.Client client = new CustomerService.Client(protocol);

            perform(client);

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    private static void perform(CustomerService.Client client) throws TException
    {
        Customer c1 = new Customer();
        c1.vorname = "Souphianeb";
        c1.nachname = "Bensalimb";
        c1.worthiness = 10000;

        Customer c2 = new Customer();
        c2.vorname = "Emob";
        c2.nachname = "Karab";
        c2.worthiness = 5000;

        // Add Customer
        //System.out.println(client.addCustomer(c1));
        //System.out.println(client.addCustomer(c2));

        // findAll
        ArrayList<Customer> allCustomer;
        allCustomer = (ArrayList<Customer>) client.findAllCustomers();
        for (int i = 0; i < allCustomer.size(); i++) {
            System.out.println("Vorname: " + allCustomer.get(i).vorname + " Nachname: " + allCustomer.get(i).nachname);
        }

        // findCustomer mit vorhandenen Daten
        Customer myCustomerVorhanden = client.findCustomer("Emob", "Karab");
        printFoundCustomer(myCustomerVorhanden);

        // findCustomer mit nicht vorhandenen Daten

        Customer myCustomerNichtVorhanden = client.findCustomer("test1", "test2");
        printFoundCustomer(myCustomerNichtVorhanden);

        // isCreditWorthy
        System.out.println("Is Credit Worthy?");
        System.out.println("Example worthy: " + client.isCreditWorthy(c2, 4000));
        System.out.println("Example not worthy: " + client.isCreditWorthy(c2, 6000));

    }

    public static void printFoundCustomer (Customer c) {
        if(c.vorname == null) {
            System.out.println("Not Found");
        } else {
            System.out.println("------- User found with Data: -------");
            printCustomer(c);
        }
    }

    public static void printCustomer (Customer c) {
        System.out.println("Vorname: " + c.vorname + " Nachname: " + c.nachname + " Worthiness: " + c.worthiness);
    }
}