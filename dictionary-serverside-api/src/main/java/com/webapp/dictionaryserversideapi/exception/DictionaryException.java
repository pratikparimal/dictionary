package com.webapp.dictionaryserversideapi.exception;

public class DictionaryException extends Exception {

    public String message;
    public String exceptionCause;

    public DictionaryException(String message) {
        this.message = message;
    }

    public DictionaryException(String message, String exceptionCause) {
        this.message = message;
        this.exceptionCause = exceptionCause;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExceptionCause() {
        return exceptionCause;
    }

    public void setExceptionCause(String exceptionCause) {
        this.exceptionCause = exceptionCause;
    }
}
