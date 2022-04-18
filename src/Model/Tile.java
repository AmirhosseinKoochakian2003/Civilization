package Model;

import Model.Units.Unit;

import java.util.ArrayList;
import java.util.HashMap;

public class Tile {
    private boolean isDesert;                   //Smooth
    private boolean isMeadow;//Alafzar          //Smooth
    private boolean isHill;//Tape               //2             //isBlocker
    private boolean isMountain;                 //NA            //isBlocker
    private boolean isOcean;                    //NA
    private boolean isPlain;                    //Smooth
    private boolean isSnow;                     //Smooth
    private boolean isTundra;                   //Smooth
    private boolean isBlocker;

    private int food;
    private int production;
    private int gold;
    private int combatChange;
    private int mpCost;
    private int tileNumber;

    private float x,y;
    private int radius;
    private ArrayList<Unit> units;
    private ArrayList<Resource> resources;
    private ArrayList<Attribute> attributes;
    private ArrayList<Improvement> improvements;

    private Improvement workingOnImprovement;//if == null -> null
    private HashMap<Improvement,int> ImprovementEarnedPercent;

    private boolean doesHaveRoad;
    private boolean doesHaveRailWay;
}