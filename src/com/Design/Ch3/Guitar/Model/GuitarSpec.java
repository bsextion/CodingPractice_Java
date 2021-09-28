package com.Design.Ch3.Guitar.Model;

import com.Design.Ch3.Guitar.Constants.Type;
import com.Design.Ch3.Guitar.Constants.Wood;

import java.util.LinkedList;

public class GuitarSpec {
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(String model, Type type, Wood backWood, Wood topWood) {
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        int [] arr = new int[]{1,2};
        LinkedList<Integer> linkedList = new LinkedList<>();

;    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }
}
