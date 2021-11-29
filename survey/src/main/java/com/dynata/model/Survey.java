package com.dynata.model;

public class Survey {

    int surveyId;
    String surveyName;
    int expectedCompletes;
    int completionPoints;
    int filteredPoints;

    public Survey(int surveyId, String surveyName, int expectedCompletes, int completionPoints, int filteredPoints) {
        this.surveyId = surveyId;
        this.surveyName = surveyName;
        this.expectedCompletes = expectedCompletes;
        this.completionPoints = completionPoints;
        this.filteredPoints = filteredPoints;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public int getExpectedCompletes() {
        return expectedCompletes;
    }

    public void setExpectedCompletes(int expectedCompletes) {
        this.expectedCompletes = expectedCompletes;
    }

    public int getCompletionPoints() {
        return completionPoints;
    }

    public void setCompletionPoints(int completionPoints) {
        this.completionPoints = completionPoints;
    }

    public int getFilteredPoints() {
        return filteredPoints;
    }

    public void setFilteredPoints(int filteredPoints) {
        this.filteredPoints = filteredPoints;
    }
}
