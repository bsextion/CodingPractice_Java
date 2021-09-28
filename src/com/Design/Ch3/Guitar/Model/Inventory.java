package com.Design.Ch3.Guitar.Model;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Inventory {
    private List<Guitar> guitars;

    public void addGuitar(String serial, double price, GuitarSpec guitarSpec){
        Guitar newGuitar = new Guitar(serial, price, guitarSpec);
        guitars.add(newGuitar);
    }

    public List<Guitar> search(GuitarSpec guitarSpec) {
        List foundGuitars = guitars.stream().filter(g -> Objects.nonNull(g.getGuitarSpec()) && g.getGuitarSpec().getType().equals(guitarSpec.getType()))
                .collect(Collectors.toList());
        return foundGuitars;
    }
}
