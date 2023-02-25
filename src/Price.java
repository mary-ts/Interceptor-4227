abstract class Price {

    abstract int getPriceCode();

   class ChildrensPrice extends Price {
    int getPriceCode() {
    return Movie.CHILDREN;
    }

   }
   class NewReleasePrice extends Price {
    int getPriceCode() {
    return Movie.NEW_RELEASE;
    }
   }

   abstract class RegularPrice extends Price {
    int getPriceCode() {
    return Movie.REGULAR;
    }

    abstract double getCharge(int daysRented); 
   } 

    int getFrequentRenterPoints(int daysRented){
    return 1;
    }

    double getCharge(int daysRented) {
        return 0;
    }
   
}