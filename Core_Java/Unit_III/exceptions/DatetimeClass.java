import java.time.LocalDateTime; 
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatetimeClass {
    public static void main(String[] args) {
        // LocalDate cd = new LocalDate();
        LocalDateTime dt = LocalDateTime.now();
        LocalDate cDate = LocalDate.now();
        LocalTime cTime = LocalTime.now();
        System.out.println(dt);
        System.out.println(cDate);
        System.out.println(cTime);    
}
}
