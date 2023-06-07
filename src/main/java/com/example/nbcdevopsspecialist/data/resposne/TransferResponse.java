package com.example.nbcdevopsspecialist.data.resposne;

public class TransferResponse {
    private String code;
    private String message;

    // getters and setters


    public TransferResponse() {
    }

    public TransferResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}