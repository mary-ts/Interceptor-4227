package movieRental;

public class main {
    public static void main(String[] args) {

        Movie movie = new Movie("Tangled", 1);
        Customer customer = new Customer("Ben");
        customer.addRental(new Rental(movie, 7));
        System.out.println(customer.htmlStatement());
    }
}   
      
      
