package com.manulife.msadv3.util;

public enum StatusResponse {
    SUCCESS("Success"), FAILED("Failed");

    private String description;

    private StatusResponse(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
