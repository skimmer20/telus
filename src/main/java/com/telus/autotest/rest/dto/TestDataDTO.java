package com.telus.autotest.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yurii Pavliuk
 */
public class TestDataDTO {

    @JsonProperty("baseURL")
    private String baseURL;

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }
}
