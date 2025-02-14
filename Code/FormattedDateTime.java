import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateTime {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        // Formatting the date in MM/dd/yyyy format
        DateTimeFormatter mm_dd_yyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = now.format(mm_dd_yyyy);
        System.out.println("Date (MM/dd/yyyy): " + formattedDate);

        // Formatting the date and time in dd-MM-yyyy HH:mm:ss format
        DateTimeFormatter dd_MM_yyyy_HH_mm_ss = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(dd_MM_yyyy_HH_mm_ss);
        System.out.println("Date and Time (dd-MM-yyyy HH:mm:ss): " + formattedDateTime);
    }
}
