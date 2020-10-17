package kz.zhanbolat.memory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat implements Animal {
    private static final Logger logger = LogManager.getLogger(Cat.class);

    @Override
    public void play() {
        logger.info("Cat plays");
    }

    @Override
    public void voice() {
        logger.info("Mew mew");
    }
}
