import java.time.*;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);
    }
}
