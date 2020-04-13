package com.proj1.FirstSpring.Tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * TimeTask
 */
@Component
public class TimeTask {
    private static final Logger log = LoggerFactory.getLogger("Time Task");

    private static final SimpleDateFormat dateformat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 1000 * 60 * 5)
    public void logTime() {
        log.info("Logged Time is {}", dateformat.format(new Date()));
    }
}