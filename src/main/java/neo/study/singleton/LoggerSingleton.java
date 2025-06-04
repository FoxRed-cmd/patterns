package neo.study.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LoggerSingleton {
    private static volatile LoggerSingleton logger;

    private LoggerSingleton() {}

    public static LoggerSingleton getInstance() {
        if (logger == null) {
            synchronized (LoggerSingleton.class) {
                if (logger == null) {
                    logger = new LoggerSingleton();
                }
            }
        }
        return logger;
    }

    public void classLog(Object obj, String info) {
        System.out.println("Log info: %s - %s - %s".formatted(
                LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yy")),
                obj.getClass().getSimpleName(), info));
    }
}
