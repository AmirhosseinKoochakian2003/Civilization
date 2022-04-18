package Controller;

import Model.*;
import Model.Units.Civilian;
import Model.Units.Unit;
import Model.Units.Warrior;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;

public class PlayGameMenuController {

    public ArrayList<Tile> mapCreator(int numOfCivilizations,ArrayList<Member> members){//tik
        const int numOfTiles = 32;
        ArrayList<Tile> map = new ArrayList<>();
        map.add(new Tile())

        return map;
    }
    public StringBuilder showMap(Civilization civilization,ArrayList<Tile> map){//tik
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public ArrayList<Integer> statusChecker(Civilization civilization,ArrayList<Tile> map){
        //TODO... return ArrayList<Integer> with 1 or -1(all fields)
    }
    public ArrayList<Integer> statusComparator(ArrayList<Integer> old, ArrayList<Integer> now){
        //TODO... if(now == fog of war && old == vazeh -> now = moshakhas)
        //TODO... return now;
    }

    public StringBuilder researchInformation(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder unitPanel(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder cityPanel(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder diplomaticInformation(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder victoryImprovement(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder demographics(Civilization civilization,ArrayList<Tile> map){   //Jamiat shenasi
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder historyInformation(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder generalUnitReview(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder economicalReview(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder diplomaticReview(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder tradeHistory(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public String tradeResource(Civilization civilization1, Civilization civilization2, Tile originTile, Resource originResource,Resource neededResource,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String moveUnit(Civilization civilization, Tile origin, Tile destination,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String createUnit(Civilization civilization, City city, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String purchaseUnit(Civilization civilization, City city, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String createCity(Civilization civilization, Civilian civilian,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String attackTile(Civilization civilization, Warrior warrior,Tile destination,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String sleepUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String WarFootingUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String boostUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String boostTillRecoverUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String deploymentUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String readyForRangedBattleUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String lootTile(Civilization civilization, Warrior warrior, Tile destination,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String cancelCommand(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String wakeUpUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String deleteUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String recoverUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String lockCitizen(Civilization civilization, Citizen citizen, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String unLockCitizen(Civilization civilization, Citizen citizen,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String purchaseTile(Civilization civilization, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public StringBuilder showProductionsInProcess(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder showTechnologyMenu(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public String chooseTechnologyToLearn(Civilization civilization, Technology technology,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String changeTechnologyToLearn(Civilization civilization, Technology newTechnology,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String workOnTile(Civilization civilization, City city, Citizen citizen,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String createImprovement(Civilization civilization, Civilian civilian, Tile tile,Improvement improvement,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String createRoad(Civilization civilization,Civilian civilian, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String createRailRoad(Civilization civilization, Civilian civilian, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String removeImprovement(Civilization civilization, Civilian civilian, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String removeRoad(Civilization civilization, Civilian civilian, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String removeRailRoad(Civilization civilization, Civilian civilian, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String cancelImprovementOnProcess(Civilization civilization,Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String repairRoad(Civilization civilization, Civilian civilian, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String repairImprovement(Civilization civilization, Civilian civilian, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String repairWholeTile(Civilization civilization,Civilian civilian, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    public String updateWarrior(Civilization civilization, Warrior warrior, Warrior newWarrior,ArrayList<Tile> map){
        String str;

        return str;
    }
    public StringBuilder showCurrentScore(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    //TODO
    /*
    public boolean winCheck(){

    }
     */
    public StringBuilder nextTurn(Civilization civilization){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
}
