package main.java;

import java.util.ArrayList;

public class CustomerHandler implements CustomerService.Iface {

    private ArrayList<Customer> myCustomers = new ArrayList<>();

    @Override
    public ArrayList<Customer> findAllCustomers() {
        return myCustomers;
    }

    @Override
    public Customer findCustomer(String vorname, String nachname) {
        for (Customer myCustomer : myCustomers) {
            if (myCustomer.vorname.equals(vorname) && myCustomer.nachname.equals(nachname)) {
                return myCustomer;
            }
        }
        return new Customer(null, null, 0);
    }

    @Override
    public boolean addCustomer(Customer c) {
        myCustomers.add(c);
        return true;
    }

    @Override
    public boolean isCreditWorthy(Customer c, int Credit) {
        if(c.worthiness >= Credit) return true;
        return false;
    }




}
