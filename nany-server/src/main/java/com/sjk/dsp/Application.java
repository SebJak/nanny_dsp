package com.sjk.dsp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.post;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info("Application started ...");
        post("/nany/alarm", (req, res) -> "Alarm received");
    }
}
