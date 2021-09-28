package com.Design.Ch4.DogDoorRecognizer;

import java.util.List;

public class DogDoor {
private boolean open = false;
private List<Bark> allowedBarks;

public DogDoor(){

}

public void open(){
    if(!isOpen()){
        open = true;
    }

    try {
        Thread.sleep(5000);
    }
    catch (InterruptedException ex){

    }
    close();
}

public void close(){
    open = false;

}

public boolean isOpen(){
    return open;
}

public void addAllowedBark(Bark bark){

    if (!allowedBarks.contains(bark)){
        allowedBarks.add(bark);
    }


}

public List<Bark> getAllowedBarks(){
    return allowedBarks;
}
}
