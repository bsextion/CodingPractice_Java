package com.Design.Ch3.Guitar.Constants;

public enum Wood {
    CHERRY, BLACKWOOD;

    public String toString(){
        switch (this){
            case CHERRY: return "Cherry";
            case BLACKWOOD: return "Blackwood";
        }
        return "";
    }
}
