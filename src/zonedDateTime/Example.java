package zonedDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Example {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        long epochMilli = now.toInstant().toEpochMilli();
        System.out.println(epochMilli);

        ZonedDateTime plus = now.plus(1, ChronoUnit.DAYS);
        System.out.println(plus);

        ZonedDateTime minus = now.minus(1, ChronoUnit.DAYS);
        System.out.println(minus);

        ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(zonedDateTime);

        LocalDateTime localDateTimeUTC = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(localDateTimeUTC);

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
    }
}
