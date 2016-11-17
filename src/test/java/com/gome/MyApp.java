package com.gome;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyApp {

	private static final Logger logger = LogManager.getLogger(MyApp.class);
	//private static final Logger logger = LoggerFactory.getLogger(MyApp.class);
    public static void main(final String... args) {
    	 
        // Set up a simple configuration that logs on the console.
 
        logger.trace("Entering application.");
        Bar bar = new Bar();
        if (!bar.doIt()) {
            logger.error("Didn't do it.");
        }
        logger.trace("Exiting application.");
    }
}
