package Project;

import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class NewMain {

    public static void main(String[] args) throws ParseException {
           Borrow borrow = new Borrow();
        borrow.connection("SELECT * FROM borrow WHERE BookID =" + 10 + " AND StudentID =" + 4);
                java.sql.Date dateb = borrow.getReturnDate();
                System.out.println(dateb);
                
                
      int x= penalty(dateb);
                     System.out.println(x);

    }
    
    
    public static int penalty(java.sql.Date datedue)  {
        int penalty = 0;
        
        
        LocalDate dateBefore = LocalDate.now();
        

        //calculating number of days in between
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore,datedue.toLocalDate());
        //displaying the number of days
        if (noOfDaysBetween == 0) {
            System.out.println("Due Today ");
        } else if (noOfDaysBetween > 0) {
            int nbrofweeks = (int) (noOfDaysBetween / 7);
            penalty = (int) (20 * nbrofweeks);
            System.out.println("Book due, Penalty is equal to " + penalty + "TND");
        } else if (noOfDaysBetween < 0) {
            System.out.println("Book not due");
        } else {
            System.out.println("How to get here?");
        }
    return penalty;}
    
    
    
    
    
 
}

 