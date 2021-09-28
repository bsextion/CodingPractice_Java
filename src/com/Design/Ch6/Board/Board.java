package com.Design.Ch6.Board;

import com.Design.Ch6.Tile.Tile;
import com.Design.Ch6.Unit.Unit;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int width;
    private int height;
    private List tiles;

    public Board(int height, int width){
        this.width = width;
        this.height = height;
        intialize();
    }

    public void intialize(){
        tiles = new ArrayList(width);
        for(int w = 0; w < width; w++){
            tiles.add(w, new ArrayList(height));
            for (int h = 0; h < height;h++){
                ((ArrayList)tiles.get(w)).add(h,new Tile());
            }
        }


    }

    public Tile getTile(int x, int y)
    {
        return (Tile)((ArrayList)tiles.get(x-1)).get(y-1);
    }

    public void addUnit(Unit unit, int x, int y)
    {
        Tile tile = getTile(x, y);
//        tile.addUnit(unit);
    }

    public void removeUnit(Unit unit, int x, int y)
    {
        Tile tile = getTile(x, y);
//        tile.removeUnit(unit);
    }

    public void removeUnits(int x, int y)
    {
        Tile tile = getTile(x, y);
//        tile.removeUnits();
    }

    public List getUnits(int x, int y)
    {
        return getTile(x, y).getUnits();
    }



}
