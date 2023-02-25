import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    public Customer(String name) {
    _name = name;
    }
    public void addRental(Rental arg) {
    _rentals.addElement(arg);
    }
    public String getName() {
        return _name;
    }

    public String htmlStatement() {

        Enumeration rentals = _rentals.elements();
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
       
        while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
       
        //show figures for each rental
        result += each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
       
        }
        //add footer lines
        result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
        String.valueOf(getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
        return result;
       
        }

        private double getTotalCharge(){

            double result = 0;
            Enumeration rentals = _rentals.elements();
           
            while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
            }
            return result; 
        }

        private double getTotalFrequentRenterPoints(){

            double result = 0;
            Enumeration rentals = _rentals.elements();
           
            while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
            }
            return result;
           } 

}
    