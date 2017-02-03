import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by gorshkov on 08.09.2016.
 */
public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World!");
        String abc = "abc";
        String xyz = "xyz";
        Calendar now = new GregorianCalendar(TimeZone.getTimeZone(ZoneId.systemDefault()));
        new InputStreamReader(new FileInputStream(new File("index.html")));
    }

    @Override
    @Deprecated
    @SuppressWarnings({"warning0", "warning1", "warning2"})
    public String toString() {
        return super.toString();
    }

    private void foo() {
        System.out.println("foo");
    }
}
