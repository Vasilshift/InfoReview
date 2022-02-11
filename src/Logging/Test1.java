package Logging;

import StreamAPI.T1cosaltingTest;

import java.io.IOException;
import java.util.logging.*;

public class Test1 {

    private static final Logger LOGGER = Logger.getLogger(T1cosaltingTest.class.getName());
    public static void main(String[] args) throws IOException {

        Handler fileHandler = new FileHandler();

        Handler handler = new ConsoleHandler();
        handler.setFilter(new MyFilter());
        handler.setFormatter(new MyFormatter());
        LOGGER.addHandler(handler);
        LOGGER.info("info");


    }
}

class MyFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getMessage().startsWith("info");
    }
}

class MyFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return record.getMessage() + " : " + record.getLevel();
    }
}