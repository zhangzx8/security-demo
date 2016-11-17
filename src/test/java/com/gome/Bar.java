package com.gome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bar {
	  static final Logger logger = LogManager.getLogger(Bar.class.getName());
	  
	  public boolean doIt() {
	    logger.entry(22);
	    logger.error("Did it again!");
	    logger.warn("Did it again! warn");
	    return logger.exit(false);
	  }
}
