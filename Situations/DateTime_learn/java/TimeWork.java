import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeWork {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("localDateTime: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);

        
        

    }
}
