package movieRental;

import movieRental.Interceptor.*;

public class main {
    public static void main(String[] args) {

        ConcreteInt inter = new ConcreteInt();
        Dispatcher dis = new Dispatcher();
        dis.addInterceptor(inter);

        Movie movie = new Movie("Tangled", 2);
        Movie movie1 = new Movie("Star Wars", 1);
        Customer customer = new Customer("Ben", dis);
        customer.addRental(new Rental(movie, 2));
        customer.addRental(new Rental(movie1, 2));
        System.out.println(customer.htmlStatement());
    }
}   
    