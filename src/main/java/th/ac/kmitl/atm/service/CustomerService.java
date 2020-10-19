package th.ac.kmitl.atm.service;

import org.springframework.stereotype.Service;
import th.ac.kmitl.atm.model.Customer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    
    private List<Customer> customerList;

    @PostConstruct
    public void postConstruct() {
        this.customerList = new ArrayList<>();
    }
    
    public void createCustomer(Customer customer) {         
        // ... hash pin for customer ...
        customerList.add(customer);
    }

    public List<Customer> gerCustomers() {
        return new ArrayList<>(this.customerList);
    }
}
