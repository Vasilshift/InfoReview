package Logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SampleLoggingToFile {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        try {
            // This block configure the logger with handler and formatter
            FileHandler fh = new FileHandler("C:/temp/MyLogFile.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            logger.info("My first log");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info("Hi How r u VER 3 ?");
    }
}
