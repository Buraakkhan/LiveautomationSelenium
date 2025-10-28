package firstsel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Email {

    public static String generateTimestampEmail() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String timestamp = sdf.format(new Date());
        return "testuser" + timestamp + "@example.com";
    }
}
