import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_Date {
    
    public static void main(String[] args){

        LocalDate myDate = LocalDate.now();

        System.out.println(myDate);

        LocalTime myTime = LocalTime.now();

        System.out.println(myTime);

        LocalDateTime myDateAndTime = LocalDateTime.now();

        System.out.println(myDateAndTime);

        DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateAndTime.format(myDateTimeFormatter);
        
        System.out.println(formattedDate);

    }

}
