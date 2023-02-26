package movieRental.Interceptor;

import movieRental.Customer;

public class ContextObj {

    public Customer customer;
    public ContextObj(Customer customer) {
            this.customer = customer;
    } 

    public String getName(){
       return  customer.getName();
    }

}
