package com.Design.Ch4.DogDoorRecognizer;

public class Bark {
    private String sound;
    public String getSound(){
        return sound;
    }

    public boolean equals(Bark bark){
        if (bark instanceof Bark && bark.getSound().equalsIgnoreCase(sound))
        {
            return true;
        }
        return false;
    }

}
