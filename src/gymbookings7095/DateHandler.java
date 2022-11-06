
package gymbookings7095;
import java.text.*; // for SimpleDateFormat
import java.util.*; // for Date
/**
 *
 * @author aaronmontgomery
 */
public abstract class DateHandler {
  
    
    private static SimpleDateFormat dbFormat= new SimpleDateFormat("yyyy-MM-dd");

    public static String ConvertDateInsertion(Date givenDate) {
        return dbFormat.format(givenDate);
    }
    
    public static String ConvertDateExtracton(String givenDate) {
        return dbFormat.format(givenDate);
    }

}

