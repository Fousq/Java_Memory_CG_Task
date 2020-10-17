package kz.zhanbolat.memory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog implements Animal {
    private static final Logger logger = LogManager.getLogger(Dog.class);

    @Override
    public void play() {
        logger.info("Dog plays");
    }

    @Override
    public void voice() {
        logger.info("Rof Rof");
    }
}
