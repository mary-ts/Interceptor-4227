package movieRental;

import movieRental.Interceptor.*;

public class main {
    public static void main(String[] args) {

        ConcreteInt inter = new ConcreteInt();
        Dispatcher dis = new Dispatcher();
        dis.addInterceptor(inter);

        Movie movie = new Movie("Tangled", 2);

        Customer customer = new Customer("Tamara", dis);

        customer.addRental(new Rental(movie, 2));
        System.out.println(customer.htmlStatement());

    }
}   
    