import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        while (true) {
            // Get the current time
            Date currentTime = new Date();
            
            // Format the time to display in HH:mm:ss format
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String formattedTime = sdf.format(currentTime);
            
            // Print the formatted time
            System.out.print("\r" + formattedTime);
            
            try {
                // Wait for 1 second before updating the time
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
