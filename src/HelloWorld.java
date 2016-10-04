import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by gorshkov on 08.09.2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String abc = "abc";
        String xyz = "xyz";
        Calendar now = new GregorianCalendar(TimeZone.getTimeZone(ZoneId.systemDefault()));
    }
}
