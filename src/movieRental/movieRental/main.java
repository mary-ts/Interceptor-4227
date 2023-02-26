package movieRental;

public class main {
    public static void main(String[] args) {

        Movie movie = new Movie("Tangled", 2);
        Movie movie1 = new Movie("Star Wars", 1);
        Customer customer = new Customer("Ben");
        customer.addRental(new Rental(movie, 2));
        customer.addRental(new Rental(movie1, 2));
        System.out.println(customer.htmlStatement());
    }
}   
      
      
