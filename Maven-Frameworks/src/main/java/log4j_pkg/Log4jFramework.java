package log4j_pkg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jFramework{

    static Logger log = LogManager.getLogger(Log4jFramework.class);

    public static void main(String[] args) {

        log.info("Browser launched");
        log.info("Navigating to login page");
        log.error("Login button not found");
    }
}
