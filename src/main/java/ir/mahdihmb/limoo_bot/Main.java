package ir.mahdihmb.limoo_bot;

import ir.limoo.driver.exception.LimooException;
import ir.mahdihmb.limoo_bot.core.ConfigService;
import ir.mahdihmb.limoo_bot.core.CoreManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws LimooException, IOException {
        logger.info("--------------- Starting bot ---------------");
        CoreManager.initApp();

        String limooUrl = ConfigService.get("bot.limooUrl");
        String botUsername = ConfigService.get("bot.username");
        String botPassword = ConfigService.get("bot.password");
        new LimooBot(limooUrl, botUsername, botPassword).run();

        logger.info("--------------- Bot started! ---------------");
    }
}
