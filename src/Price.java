abstract class Price {

    abstract int getPriceCode() {
   }

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

    abstract double getCharge(int daysRented) {

        double result = 0;
       
        switch (getPriceCode()) {
        case Movie.REGULAR:
        result += 2;
        if (daysRented > 2)
        result += (daysRented - 2) * 1.5;
        break;
        case Movie.NEW_RELEASE:
        result += daysRented * 3;
        break;
        case Movie.CHILDREN:
        result += 1.5;
        if (daysRented > 3)
        result += (daysRented - 3) * 1.5;
        break;
        }
        return result;
        } 
   } 

    int getFrequentRenterPoints(int daysRented){
    return 1;
    }
   
}