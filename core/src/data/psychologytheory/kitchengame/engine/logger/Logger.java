package data.psychologytheory.kitchengame.engine.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger
{
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
    private static LocalDateTime currentDateTime;

    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void logInfo(String info)
    {
        System.out.println(ANSI_CYAN + "[" + getCurrentTime() + "] [INFO] " + info + ANSI_RESET);
    }

    public static void logWarn(String warn)
    {
        System.out.println(ANSI_YELLOW + "[" + getCurrentTime() + "] [WARN] " + warn + ANSI_RESET);
    }

    public static void logError(String err)
    {
        System.out.println(ANSI_RED + "[" + getCurrentTime() + "] [ERROR] " + err + ANSI_RESET);
    }

    private static String getCurrentTime()
    {
        currentDateTime = LocalDateTime.now();
        return formatter.format(currentDateTime);
    }
}
