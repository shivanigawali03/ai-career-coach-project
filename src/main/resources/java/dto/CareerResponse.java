package com.seroter.azure_basic_app.dto;

public class CareerResponse {

    private String recommendation;

    public CareerResponse(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
}