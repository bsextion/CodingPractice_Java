package com.Design.Ch4.DogDoorRecognizer;

public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door = door;
    }
    public void recognize(Bark bark){
        if (door.getAllowedBarks().contains(bark)){
            door.open();
        }

    }

}
