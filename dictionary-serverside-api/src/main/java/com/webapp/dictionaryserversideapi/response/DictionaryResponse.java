package com.webapp.dictionaryserversideapi.response;

public class DictionaryResponse {

    public String successMessage;
    public String errorMessage;

    public DictionaryResponse(String successMessage, String errorMessage) {
        this.successMessage = successMessage;
        this.errorMessage = errorMessage;
    }

    public DictionaryResponse(String successMessage) {
        this.successMessage = successMessage;
        this.errorMessage = null;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
