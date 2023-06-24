package com.telus.autotest.rest.testData;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.telus.autotest.rest.dto.TestDataDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * @author Yurii Pavliuk
 */
public class DataHandler {

    private static DataHandler instance;
    private String baseURL;
    private TestDataDTO testDataDTO;

    private DataHandler() {

        String baseDir = System.getProperty("user.dir");
        File yaml = new File(baseDir + "/src/main/resources/testData.yaml");

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        testDataDTO = null;

        try {
            testDataDTO = mapper.readValue(yaml, TestDataDTO.class);
        } catch (IOException e) {
            throw new RuntimeException();
        }

        baseURL = testDataDTO.getBaseURL();
    }

    public static DataHandler getInstance() {
        if (instance == null) {
            instance = new DataHandler();
        }
        return instance;
    }

    public String getBaseURL(){
        return baseURL = testDataDTO.getBaseURL();
    }
}
