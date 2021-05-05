package com.frankmoley.lil.sbet.landon.roomwebapp.models;

public enum Position {
    HOUSEKEEPING,FRONT_DESK,SECURITY;


    public String toString() {
        switch (this){
            case SECURITY: return "Security";
            case HOUSEKEEPING: return "HOUSEKEEPING";
            case FRONT_DESK: return "FRONT_DESK";
        }
        return "";
    }
}
