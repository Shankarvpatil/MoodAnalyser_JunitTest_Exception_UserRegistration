package com.moodanalyser.MoodAnalyser;

public class MoodAnalysisException extends Exception {

    public String message;
    public ExceptionType exceptionType;

    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY;
    }

    public MoodAnalysisException(String message, ExceptionType type) {
        this.message = message;
        this.exceptionType = type;
    }
}