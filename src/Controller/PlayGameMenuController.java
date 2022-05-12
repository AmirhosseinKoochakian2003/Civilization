package Controller;

import Model.*;
import Model.Units.Civilian;
import Model.Units.Unit;
import Model.Units.Warrior;

import java.util.*;
import java.util.regex.Matcher;

public class PlayGameMenuController {

    public ArrayList<Tile> mapCreator(int numOfCivilizations,ArrayList<Member> members){//tik
        int numOfTiles = 72;
        ArrayList<Tile> map = new ArrayList<>();
        float x0 = 10;
        float y0 = 10;

        Tile t0 = new Tile(0,false,false,false,true,false,false,false,false,x0,y0);
        float h = (float)t0.getH();
        float radius = t0.getRadius();

        map.add(t0);
        float x = x0;
        float y = y0 + 2 * h;
        map.add(new Tile(1,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(2,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(3,false,false,false,false,true,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(4,false,false,false,false,true,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(5,false,false,false,false,true,false,false,false,x,y));

        x = x0 + 3 * radius / 2;
        y = y0 + h;
        map.add(new Tile(6,false,false,false,false,false,true,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(7,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(8,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(9,false,false,false,false,false,true,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(10,false,false,false,false,true,false,false,false,x,y));

        x += 3 * radius / 2;
        y = y0;
        map.add(new Tile(11,false,false,true,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(12,false,false,true,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(13,false,false,false,true,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(14,false,false,true,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(15,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(16,false,false,false,false,false,false,true,false,x,y));

        x += 3 * radius / 2;
        y = y0 + h;
        map.add(new Tile(17,false,false,true,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(18,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(19,false,false,true,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(20,false,false,false,false,false,true,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(21,false,false,false,false,true,false,false,false,x,y));

        x += 3 * radius / 2;
        y = y0;
        map.add(new Tile(22,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(23,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(24,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(25,false,false,false,false,false,false,true,false,x,y));
        y += 2 * h;
        map.add(new Tile(26,false,false,false,false,false,false,true,false,x,y));
        y += 2 * h;
        map.add(new Tile(27,false,false,false,false,true,false,false,false,x,y));

        x += 3 * radius / 2;
        y = y0 + h;
        map.add(new Tile(28,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(29,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(30,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(31,false,false,false,false,false,false,true,false,x,y));
        y += 2 * h;
        map.add(new Tile(32,false,false,false,false,true,false,false,false,x,y));

        x += 3 * radius / 2;
        y = y0;
        map.add(new Tile(33,false,false,false,true,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(34,false,false,false,true,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(35,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(36,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(37,false,false,false,false,true,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(38,false,false,false,false,true,false,false,false,x,y));

        x += 3 * radius / 2;
        y = y0 + h;
        map.add(new Tile(39,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(40,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(41,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(42,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(43,false,false,false,false,false,false,true,false,x,y));

        x += 3 * radius / 2;
        y = y0;
        map.add(new Tile(44,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(45,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(46,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(47,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(48,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(49,true,false,false,false,false,false,false,false,x,y));

        x += 3 * radius / 2;
        y = y0 + h;
        map.add(new Tile(50,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(51,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(52,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(53,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(54,true,false,false,false,false,false,false,false,x,y));

        x += 3 * radius / 2;
        y = y0;
        map.add(new Tile(55,false,false,false,false,false,false,true,false,x,y));
        y += 2 * h;
        map.add(new Tile(56,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(57,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(58,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(59,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(60,false,false,false,false,false,false,false,true,x,y));

        x += 3 * radius / 2;
        y = y0 + h;
        map.add(new Tile(61,false,true,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(62,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(63,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(64,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(65,false,false,false,false,false,false,false,true,x,y));

        x += 3 * radius / 2;
        y = y0;
        map.add(new Tile(66,false,false,false,true,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(67,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(68,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(69,true,false,false,false,false,false,false,false,x,y));
        y += 2 * h;
        map.add(new Tile(70,false,false,false,false,false,false,false,true,x,y));
        y += 2 * h;
        map.add(new Tile(71,false,false,false,true,false,false,false,false,x,y));


        return map;
    }
    public String cheatIncreaseGold(Civilization civilization,int amount){
        civilization.setGold(amount);
        return "cheat code activated successfully";
    }
    public String cheatIncreaseFood(Civilization civilization,int amount){
        for(City city : civilization.getCities()){
            city.setTotalFood(amount);
        }
        return "cheat code activated successfully";
    }
    public String cheatIncreaseTechnology(Civilization civilization,int amount){
        civilization.setScience(amount);
        return "cheat code activated successfully";
    }
    public String cheatIncreaseHappiness(Civilization civilization, int amount){
        civilization.setHappiness(amount);
        return "cheat code activated successfully";
    }
    public String cheatTeleportUnit (Matcher matcher, Civilization civilization, ArrayList<Tile> map) {
            String str;
            int numberOfOrigin = Integer.parseInt(matcher.group("numberO"));
            int numberOfDestination = Integer.parseInt(matcher.group("numberD"));
            String unitName = matcher.group("unitName").toLowerCase();

            Tile origin = map.get(numberOfOrigin);
            Tile destination = map.get(numberOfDestination);
            ArrayList<Unit> units = origin.getUnits();
            Unit unit = getUnitInTile(units, unitName);

        if (unit == null) {
            str = "there is no unit with this name !";
            return str;
        }
        if (unit.getIsOnSleep()) {
            str = "this unit is sleeping !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        if (unit.getPath() != null) {
            str = "this unit has another path !";
            return str;
        }
        ArrayList<Unit> unitsDestination = destination.getUnits();
        for (int i = 0; i < unitsDestination.size(); i++) {
            if (unitsDestination.get(i).isCivilian() == unit.isCivilian()) {
                str = "there is another unit with this type in the tile !";
                return str;
            }
        }
        destination.addUnit(unit);
        origin.removeUnit(unit);
        unit.setOrigin(destination);
        unit.setHasOrdered(true);
        str = "unit teleported to destination !";
        return str;
    }
    public ArrayList<Civilization> initializeCivilizations(int numOfCivilizations, ArrayList<Tile> map, ArrayList<Member> members){
        ArrayList<Civilization> civilizations = new ArrayList<>();
        for(int i = 0; i < numOfCivilizations; i++){
            if(i == 0){
                Member member1 = members.get(0);
                City city1 = new City(map.get(7), map);
                civilizations.add(new Civilization(member1, city1));
            }
            else if(i == 1){
                Member member2 = members.get(1);
                City city2 = new City(map.get(48), map);
                civilizations.add(new Civilization(member2, city2));
            }
            else if(i == 2){
                Member member3 = members.get(2);
                City city3 = new City(map.get(62), map);
                civilizations.add(new Civilization(member3, city3));
            }
            else if(i == 3){
                Member member4 = members.get(3);
                City city4 = new City(map.get(45), map);
                civilizations.add(new Civilization(member4, city4));
            }
            else if(i == 4){
                Member member5 = members.get(4);
                City city5 = new City(map.get(30), map);
                civilizations.add(new Civilization(member5, city5));
            }
        }
        return civilizations;
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String BLACK = "\033[0;30m";
    public static final String YELLOW = "\u001B[33m";// --> dessert
    public static final String DARK_GREEN = "\u001b[32m";// --> meadow
    public static final String LIGHT_GREEN = "\u001b[32;1m";// --> plain
    public static final String BLUE = "\u001B[34m";// --> ocean
    public static final String BROWN = "\u001B[34m";// --> mountain
    public static final String PURPLE = "\u001B[35m";// --> tundra
    public static final String SNOW = "\u001B[37m";// --> ice
    public static final String CYAN = "\033[0;36m";// --> hill
    public String[] setTileColors(ArrayList<Integer> tileStatusOfCivilization, ArrayList<Tile> map, HashMap<Integer, Tile> zeroStatusTilesCivilisation, String[] oldTileColors){
        String[] tileColors = new String[72];
        for (int i = 0; i < map.size(); i++) {
            if (tileStatusOfCivilization.get(i) == -1)
                tileColors[i]  = BLACK;
            else if (tileStatusOfCivilization.get(i) == 1){
                if (map.get(i).isDesert())
                    tileColors[i] = YELLOW;
                else if (map.get(i).isMeadow())
                    tileColors[i] = DARK_GREEN;
                else if (map.get(i).isPlain())
                    tileColors[i] = LIGHT_GREEN;
                else if (map.get(i).isOcean())
                    tileColors[i] = BLUE;
                else if (map.get(i).isMountain())
                    tileColors[i] = BROWN;
                else if (map.get(i).isTundra())
                    tileColors[i] = PURPLE;
                else if (map.get(i).isSnow())
                    tileColors[i] = SNOW;
                else if (map.get(i).isHill())
                    tileColors[i] = CYAN;
            }
            else {
                if (zeroStatusTilesCivilisation.get(i).isDesert())
                    tileColors[i] = oldTileColors[i];
                else if (zeroStatusTilesCivilisation.get(i).isMeadow())
                    tileColors[i] = oldTileColors[i];
                else if (zeroStatusTilesCivilisation.get(i).isPlain())
                    tileColors[i] = oldTileColors[i];
                else if (zeroStatusTilesCivilisation.get(i).isOcean())
                    tileColors[i] = oldTileColors[i];
                else if (zeroStatusTilesCivilisation.get(i).isMountain())
                    tileColors[i] = oldTileColors[i];
                else if (zeroStatusTilesCivilisation.get(i).isTundra())
                    tileColors[i] = oldTileColors[i];
                else if (zeroStatusTilesCivilisation.get(i).isSnow())
                    tileColors[i] = oldTileColors[i];
                else if (zeroStatusTilesCivilisation.get(i).isHill())
                    tileColors[i] = oldTileColors[i];
            }
        }
        return tileColors;
    }
    public String[] setTileType(ArrayList<Tile> map){
        String tileType[] = new String[72];
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getAttribute().isIce())
                tileType[i] = "i";
            else if (map.get(i).getAttribute().isMarsh())
                tileType[i] = "m";
            else if (map.get(i).getAttribute().isJungle())
                tileType[i] = "j";
            else if (map.get(i).getAttribute().isPlat())
                tileType[i] = "p";
            else if (map.get(i).getAttribute().isOasis())
                tileType[i] = "v";
            else if (map.get(i).getAttribute().isRainForest())
                tileType[i] = "r";
            else
                tileType[i] = "\u2588";
        }
        return tileType;
    }
    public String[] unitMaker(ArrayList<Tile> map, int index){
        String unit1[] = new String[72];
        for (int i = 0; i < 72; i++)
            unit1[i] = "\\u2588" + "\\u2588";
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getUnits().size() > 0) {
                Unit unit = map.get(i).getUnits().get(index);
                if (unit.isCivilian())
                    unit1[i] = "C";
                else
                    unit1[i] = "W";
                unit1[i] += unit.getCivilization().getName();
            }
        }
        return unit1;
    }
    public String[] cvMaker(ArrayList<Tile> map, Civilization civilization){
        String cv[] = new String[72];
        for (int i = 0; i < 72; i++)
            cv[i] = "\\u2588";
        ArrayList<City> cities = civilization.getCities();
        ArrayList<Tile> cvTiles = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            ArrayList<Tile> tiles = cities.get(i).getTiles();
            for (int j = 0; j < tiles.size(); j++)
                cvTiles.add(tiles.get(j));
        }
        for (int i = 0; i < cvTiles.size(); i++)
            cv[cvTiles.get(i).getTileNumber()] = civilization.getName();
        return cv;
    }
    public String[] showMap(String ANSI_COLORS[], String number[], String types[], String unit1[], String unit2[], String cv[]){
        char block = '\u2588';
        String block5 = " \\" + block + block + block + block + block + block + block + block + block + block + "/";
        String block6 = "  \\" + block + block + block + block + block + block + block + block + "/";
        String block7 = "   \\" + block + block + block + block + block + block + "/";
        String[] map = new String[77];
        map[0] = ANSI_COLORS[0] + "   /" + block + block + block + block + block + block + "\\" + "   " +  ANSI_COLORS[11] + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + "   " + ANSI_COLORS[22] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[33] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[44] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[55] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[66] + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[1] = ANSI_COLORS[0] + "  /" + block + block + block + block + cv[0] + block + block + block + "\\" + "  " +  ANSI_COLORS[11] + "  /" + block + block + block + block + cv[11] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[22] + "  /" + block + block + block + block + cv[22] + block + block + block + "\\" + "  " + ANSI_COLORS[33] + "  /" + block + block + block + block + cv[33] + block + block + block + "\\" + "  " + ANSI_COLORS[44] + "  /" + block + block + block + block + cv[44] + block + block + block + "\\" + "  " + ANSI_COLORS[55] + "  /" + block + block + block + block + cv[55] + block + block + block + "\\" + "  " + ANSI_COLORS[66] + "  /" + block + block + block + block + cv[66] + block + block + block + "\\" + ANSI_RESET;
        map[2] = ANSI_COLORS[0] + " /" + block + block + unit1[0] + block + block + unit2[0] + block + block + "\\" + " " +  ANSI_COLORS[11] + " /" + block + block + unit1[11] + block + block + unit2[11] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[22] + " /" + block + block + unit1[22] + block + block + unit2[22] + block + block + "\\" + " " + ANSI_COLORS[33] + " /" + block + block + unit1[33] + block + block + unit2[33] + block + block + "\\" + " " + ANSI_COLORS[44] + " /" + block + block + unit1[44] + block + block + unit2[44] + block + block + "\\" + " " + ANSI_COLORS[55] + " /" + block + block + unit1[55] + block + block + unit2[55] + block + block + "\\" + " " + ANSI_COLORS[66] + " /" + block + block + unit1[66] + block + block + unit2[66] + block + block + "\\" + ANSI_RESET;
        map[3] = ANSI_COLORS[0] + "|" + block + block + block + block + number[0] + block + types[0] + block + block + block + block + "|" +  ANSI_COLORS[11] + "|" + block + block + block + block + number[11] + block + types[11] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[22] +  "|" + block + block + block + block + number[22] + block + types[22] + block + block + block + block + "|" + ANSI_COLORS[33] + "|" + block + block + block + block + number[33] + block + types[33] + block + block + block + block + "|" + ANSI_COLORS[44] + "|" + block + block + block + block + number[44] + block + types[44] + block + block + block + block + "|" + ANSI_COLORS[55] +"|" + block + block + block + block + number[55] + block + types[55] + block + block + block + block + "|" + ANSI_COLORS[66] + "|" + block + block + block + block + number[66] + block + types[66] + block + block + block + block + "|" + ANSI_RESET;
        map[4] = ANSI_COLORS[0] + block5 + " " +  ANSI_COLORS[11] + block5 + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[22] + block5 + " " + ANSI_COLORS[33] + block5 + " " + ANSI_COLORS[44] + block5 + " " + ANSI_COLORS[55] + block5 + " " + ANSI_COLORS[66] + block5 + ANSI_RESET;
        map[5] = ANSI_COLORS[0] + block6 + "  " +  ANSI_COLORS[11] + block6 + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[22] + block6 + "  " + ANSI_COLORS[33] + block6 + "  " + ANSI_COLORS[44] + block6 + "  " + ANSI_COLORS[55] + block6 + "  " + ANSI_COLORS[66] + block6 + ANSI_RESET;
        map[6] = ANSI_COLORS[0] + block7 + "   " +  ANSI_COLORS[11] + block7 + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[22] + "\\" + block + block + block + block + block + block + "/" + "   " + ANSI_COLORS[33] + block7 + "   " + ANSI_COLORS[44] + block7 + "   " + ANSI_COLORS[55] + block7 + "   " + ANSI_COLORS[66] + block7 + ANSI_RESET;

        map[7] = ANSI_COLORS[6] + "       " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[17] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[28] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[39] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[50] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[61] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[8] = ANSI_COLORS[6] + "       " + "  /" + block + block + block + block + cv[6] + block + block + block + "\\" + ANSI_COLORS[17] + "  " + "  /" + block + block + block + block + cv[17] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[28] + "  " + "  /" + block + block + block + block + cv[28] + block + block + block + "\\" + ANSI_COLORS[39] + "  " + "  /" + block + block + block + block + cv[39] + block + block + block + "\\" + ANSI_COLORS[50] + "  " + "  /" + block + block + block + block + cv[50] + block + block + block + "\\" + ANSI_COLORS[61] + "  " + "  /" + block + block + block + block + cv[61] + block + block + block + "\\" + ANSI_RESET;
        map[9] = ANSI_COLORS[6] + "       " + " /" + block + block + unit1[6] + block + block + unit2[6] + block + block + "\\" + ANSI_COLORS[17] + " " + " /" + block + block + unit1[17] + block + block + unit2[17] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET +  ANSI_COLORS[28] +  " " + " /" + block + block + unit1[28] + block + block + unit2[28] + block + block + "\\" + ANSI_COLORS[39] + " " + " /" + block + block + unit1[39] + block + block + unit2[39] + block + block + "\\" + ANSI_COLORS[50] + " " + " /" + block + block + unit1[50] + block + block + unit2[50] + block + block + "\\" + ANSI_COLORS[61] + " " + " /" + block + block + unit1[61] + block + block + unit2[61] + block + block + "\\" + ANSI_RESET;
        map[10] = ANSI_COLORS[6] + "       " + "|" + block + block + block + block + number[6] + block + types[6] + block + block + block + block + "|" + ANSI_COLORS[17] + "|" + block + block + block + block + number[17] + block + types[17] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[28] +  "|" + block + block + block + block + number[28] + block + types[28] + block + block + block + block + "|" + ANSI_COLORS[39] + "|" + block + block + block + block + number[39] + block + types[39] + block + block + block + block + "|" + ANSI_COLORS[50] + "|" + block + block + block + block + number[50] + block + types[50] + block + block + block + block + "|" + ANSI_COLORS[61] + "|" + block + block + block + block + number[61] + block + types[61] + block + block + block + block + "|" + ANSI_RESET;
        map[11] = ANSI_COLORS[6] + "       " + block5 + ANSI_COLORS[17] + " " + block5 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[28] +  " " + block5 + ANSI_COLORS[39] + " " + block5 + ANSI_COLORS[50] + " " + block5 +  ANSI_COLORS[61] + " " + block5 + ANSI_RESET;
        map[12] = ANSI_COLORS[6] + "       " + block6 + ANSI_COLORS[17] + "  " + block6 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[28] + "  " + block6 + ANSI_COLORS[39] + "  " + block6 + ANSI_COLORS[50] + "  " + block6 + ANSI_COLORS[61] + "  " + block6 + ANSI_RESET;
        map[13] = ANSI_COLORS[6] + "       " + block7 + ANSI_COLORS[17] + "   " + block7 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[28] +  "   " + block7 + ANSI_COLORS[39] + "   " + block7 + ANSI_COLORS[50] + "   " + block7 + ANSI_COLORS[61] + "   " + block7 + ANSI_RESET;

        map[14] = ANSI_COLORS[1] + "   /" + block + block + block + block + block + block + "\\" + "   " +  ANSI_COLORS[12] + "   /" + block + block + block + block + block + block + "\\" + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[23] + "/" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[34] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[45] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[56] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[67] + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[15] = ANSI_COLORS[1] + "  /" + block + block + block + block + cv[1] + block + block + block + "\\" + "  " +  ANSI_COLORS[12] + "  /" + block + block + block + block + cv[12] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[23] + "  /" + block + block + block + block + cv[23] + block + block + block + "\\" + "  " + ANSI_COLORS[34] + "  /" + block + block + block + block + cv[34] + block + block + block + "\\" + "  " + ANSI_COLORS[45] + "  /" + block + block + block + block + cv[45] + block + block + block + "\\" + "  " + ANSI_COLORS[56] + "  /" + block + block + block + block + cv[56] + block + block + block + "\\" + "  " + ANSI_COLORS[67] + "  /" + block + block + block + block + cv[67] + block + block + block + "\\" + ANSI_RESET;
        map[16] = ANSI_COLORS[1] + " /" + block + block + unit1[1] + block + block + unit2[1] + block + block + "\\" + " " +  ANSI_COLORS[12] + " /" + block + block + unit1[12] + block + block + unit2[12] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[23] + " /" + block + block + unit1[23] + block + block + unit2[23] + block + block + "\\" + " " + ANSI_COLORS[34] + " /" + block + block + unit1[34] + block + block + unit2[34] + block + block + "\\" + " " + ANSI_COLORS[45] + " /" + block + block + unit1[45] + block + block + unit2[45] + block + block + "\\" + " " + ANSI_COLORS[56] + " /" + block + block + unit1[56] + block + block + unit2[56] + block + block + "\\" + " " + ANSI_COLORS[67] + " /" + block + block + unit1[67] + block + block + unit2[67] + block + block + "\\" + ANSI_RESET;
        map[17] = ANSI_COLORS[1] + "|" + block + block + block + block + number[1] + block + types[1] + block + block + block + block + "|" +  ANSI_COLORS[12] + "|" + block + block + block + block + number[12] + block + types[12] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[23] +  "|" + block + block + block + block + number[23] + block + types[23] + block + block + block + block + "|" + ANSI_COLORS[34] + "|" + block + block + block + block + number[34] + block + types[34] + block + block + block + block + "|" + ANSI_COLORS[45] + "|" + block + block + block + block + number[45] + block + types[45] + block + block + block + block + "|" + ANSI_COLORS[56] + "|" + block + block + block + block + number[56] + block + types[56] + block + block + block + block + "|" + ANSI_COLORS[67] + "|" + block + block + block + block + number[67] + block + types[67] + block + block + block + block + "|" + ANSI_RESET;
        map[18] = ANSI_COLORS[1] + block5 + " " +  ANSI_COLORS[12] + block5 + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[23] + block5 + " " + ANSI_COLORS[34] + block5 + " " + ANSI_COLORS[45] + block5 + " " + ANSI_COLORS[56] + block5 + " " + ANSI_COLORS[67] + block5 + ANSI_RESET;
        map[19] = ANSI_COLORS[1] + block6 + "  " +  ANSI_COLORS[12] + block6 + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[23] + block6 + "  " + ANSI_COLORS[34] + block6 + "  " + ANSI_COLORS[45] + block6 + "  " + ANSI_COLORS[56] + block6 + "  " + ANSI_COLORS[67] + block6 + ANSI_RESET;
        map[20] = ANSI_COLORS[1] + block7 + "   " +  ANSI_COLORS[12] + block7 + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[23] + "\\" + block + block + block + block + block + block + "/" + "   " + ANSI_COLORS[34] + block7 + "   " + ANSI_COLORS[45] + block7 + "   " + ANSI_COLORS[56] + block7 + "   " + ANSI_COLORS[67] + block7 + ANSI_RESET;

        map[21] = ANSI_COLORS[7] + "       " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[18] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[29] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[40] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[51] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[62] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[22] = ANSI_COLORS[7] + "       " + "  /" + block + block + block + block + cv[7] + block + block + block + "\\" + ANSI_COLORS[18] + "  " + "  /" + block + block + block + block + cv[18] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[29] + "  " + "  /" + block + block + block + block + cv[29] + block + block + block + "\\" + ANSI_COLORS[40] + "  " + "  /" + block + block + block + block + cv[40] + block + block + block + "\\" + ANSI_COLORS[51] + "  " + "  /" + block + block + block + block + cv[51] + block + block + block + "\\" + ANSI_COLORS[62] + "  " + "  /" + block + block + block + block + cv[62] + block + block + block + "\\" + ANSI_RESET;
        map[23] = ANSI_COLORS[7] + "       " + " /" + block + block + unit1[7] + block + block + unit2[7] + block + block + "\\" + ANSI_COLORS[18] + " " + " /" + block + block + unit1[18] + block + block + unit2[18] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[29] +  " " + " /" + block + block + unit1[29] + block + block + unit2[29] + block + block + "\\" + ANSI_COLORS[40] + " " + " /" + block + block + unit1[40] + block + block + unit2[40] + block + block + "\\" + ANSI_COLORS[51] + " " + " /" + block + block + unit1[51] + block + block + unit2[51] + block + block + "\\" + ANSI_COLORS[62] + " " + " /" + block + block + unit1[62] + block + block + unit2[62] + block + block + "\\" + ANSI_RESET;
        map[24] = ANSI_COLORS[7] + "       " + "|" + block + block + block + block + number[7] + block + types[7] + block + block + block + block + "|" + ANSI_COLORS[18] + "|" + block + block + block + block + number[18] + block + types[18] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[29] +  "|" + block + block + block + block + number[29] + block + types[29] + block + block + block + block + "|" + ANSI_COLORS[40] + "|" + block + block + block + block + number[40] + block + types[40] + block + block + block + block + "|" + ANSI_COLORS[51] + "|" + block + block + block + block + number[51] + block + types[51] + block + block + block + block + "|" + ANSI_COLORS[62] + "|" + block + block + block + block + number[62] + block + types[62] + block + block + block + block + "|" + ANSI_RESET;
        map[25] = ANSI_COLORS[7] + "       " + block5 + ANSI_COLORS[18] + " " + block5 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[29] +  " " + block5 + ANSI_COLORS[40] + " " + block5 + ANSI_COLORS[51] + " " + block5 +  ANSI_COLORS[62] + " " + block5 + ANSI_RESET;
        map[26] = ANSI_COLORS[7] + "       " + block6 + ANSI_COLORS[18] + "  " + block6 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[29] + "  " + block6 + ANSI_COLORS[40] + "  " + block6 + ANSI_COLORS[51] + "  " + block6 + ANSI_COLORS[62] + "  " + block6 + ANSI_RESET;
        map[27] = ANSI_COLORS[7] + "       " + block7 + ANSI_COLORS[18] + "   " + block7 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[29] +  "   " + block7 + ANSI_COLORS[40] + "   " + block7 + ANSI_COLORS[51] + "   " + block7 + ANSI_COLORS[62] + "   " + block7 + ANSI_RESET;

        map[28] = ANSI_COLORS[2] + "   /" + block + block + block + block + block + block + "\\" + "   " +  ANSI_COLORS[13] + "   /" + block + block + block + block + block + block + "\\" + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[24] + "/" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[35] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[46] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[57] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[68] + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[29] = ANSI_COLORS[2] + "  /" + block + block + block + block + cv[2] + block + block + block + "\\" + "  " +  ANSI_COLORS[13] + "  /" + block + block + block + block + cv[13] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[24] + "  /" + block + block + block + block + cv[24] + block + block + block + "\\" + "  " + ANSI_COLORS[35] + "  /" + block + block + block + block + cv[35] + block + block + block + "\\" + "  " + ANSI_COLORS[46] + "  /" + block + block + block + block + cv[46] + block + block + block + "\\" + "  " + ANSI_COLORS[57] + "  /" + block + block + block + block + cv[57] + block + block + block + "\\" + "  " + ANSI_COLORS[68] + "  /" + block + block + block + block + cv[68] + block + block + block + "\\" + ANSI_RESET;
        map[30] = ANSI_COLORS[2] + " /" + block + block + unit1[2] + block + block + unit2[2] + block + block + "\\" + " " +  ANSI_COLORS[13] + " /" + block + block + unit1[13] + block + block + unit2[13] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[24] + " /" + block + block + unit1[24] + block + block + unit2[24] + block + block + "\\" + " " + ANSI_COLORS[35] + " /" + block + block + unit1[35] + block + block + unit2[35] + block + block + "\\" + " " + ANSI_COLORS[46] + " /" + block + block + unit1[46] + block + block + unit2[46] + block + block + "\\" + " " + ANSI_COLORS[57] + " /" + block + block + unit1[57] + block + block + unit2[57] + block + block + "\\" + " " + ANSI_COLORS[68] + " /" + block + block + unit1[68] + block + block + unit2[68] + block + block + "\\" + ANSI_RESET;
        map[31] = ANSI_COLORS[2] + "|" + block + block + block + block + number[2] + block + types[2] + block + block + block + block + "|" +  ANSI_COLORS[13] + "|" + block + block + block + block + number[13] + block + types[13] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[24] +  "|" + block + block + block + block + number[24] + block + types[24] + block + block + block + block + "|" + ANSI_COLORS[35] + "|" + block + block + block + block + number[35] + block + types[35] + block + block + block + block + "|" + ANSI_COLORS[46] + "|" + block + block + block + block + number[46] + block + types[46] + block + block + block + block + "|" + ANSI_COLORS[57] + "|" + block + block + block + block + number[57] + block + types[57] + block + block + block + block + "|" + ANSI_COLORS[68] + "|" + block + block + block + block + number[68] + block + types[68] + block + block + block + block + "|" + ANSI_RESET;
        map[32] = ANSI_COLORS[2] + block5 + " " +  ANSI_COLORS[13] + block5 + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[24] + block5 + " " + ANSI_COLORS[35] + block5 + " " + ANSI_COLORS[46] + block5 + " " + ANSI_COLORS[57] + block5 + " " + ANSI_COLORS[68] + block5 + ANSI_RESET;
        map[33] = ANSI_COLORS[2] + block6 + "  " +  ANSI_COLORS[13] + block6 + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[24] + block6 + "  " + ANSI_COLORS[35] + block6 + "  " + ANSI_COLORS[46] + block6 + "  " + ANSI_COLORS[57] + block6 + "  " + ANSI_COLORS[68] + block6 + ANSI_RESET;
        map[34] = ANSI_COLORS[2] + block7 + "   " +  ANSI_COLORS[13] + block7 + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[24] + "\\" + block + block + block + block + block + block + "/" + "   " + ANSI_COLORS[35] + block7 + "   " + ANSI_COLORS[46] + block7 + "   " + ANSI_COLORS[57] + block7 + "   " + ANSI_COLORS[68] + block7 + ANSI_RESET;

        map[35] = ANSI_COLORS[8] + "       " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[19] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[30] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[41] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[52] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[63] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[36] = ANSI_COLORS[8] + "       " + "  /" + block + block + block + block + cv[8] + block + block + block + "\\" + ANSI_COLORS[19] + "  " + "  /" + block + block + block + block + cv[19] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[30] + "  " + "  /" + block + block + block + block + cv[30] + block + block + block + "\\" + ANSI_COLORS[41] + "  " + "  /" + block + block + block + block + cv[41] + block + block + block + "\\" + ANSI_COLORS[52] + "  " + "  /" + block + block + block + block + cv[52] + block + block + block + "\\" + ANSI_COLORS[63] + "  " + "  /" + block + block + block + block + cv[63] + block + block + block + "\\" + ANSI_RESET;
        map[37] = ANSI_COLORS[8] + "       " + " /" + block + block + unit1[8] + block + block + unit2[8] + block + block + "\\" + ANSI_COLORS[19] + " " + " /" + block + block + unit1[19] + block + block + unit2[19] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[30] +  " " + " /" + block + block + unit1[30] + block + block + unit2[30] + block + block + "\\" + ANSI_COLORS[41] + " " + " /" + block + block + unit1[41] + block + block + unit2[41] + block + block + "\\" + ANSI_COLORS[52] + " " + " /" + block + block + unit1[52] + block + block + unit2[52] + block + block + "\\" + ANSI_COLORS[63] + " " + " /" + block + block + unit1[63] + block + block + unit2[63] + block + block + "\\" + ANSI_RESET;
        map[38] = ANSI_COLORS[8] + "       " + "|" + block + block + block + block + number[8] + block + types[8] + block + block + block + block + "|" + ANSI_COLORS[19] + "|" + block + block + block + block + number[19] + block + types[19] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[30] +  "|" + block + block + block + block + number[30] + block + types[30] + block + block + block + block + "|" + ANSI_COLORS[41] + "|" + block + block + block + block + number[41] + block + types[41] + block + block + block + block + "|" + ANSI_COLORS[52] + "|" + block + block + block + block + number[52] + block + types[52] + block + block + block + block + "|" + ANSI_COLORS[63] + "|" + block + block + block + block + number[63] + block + types[63] + block + block + block + block + "|" + ANSI_RESET;
        map[39] = ANSI_COLORS[8] + "       " + block5 + ANSI_COLORS[19] + " " + block5 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[30] +  " " + block5 + ANSI_COLORS[41] + " " + block5 + ANSI_COLORS[52] + " " + block5 +  ANSI_COLORS[63] + " " + block5 + ANSI_RESET;
        map[40] = ANSI_COLORS[8] + "       " + block6 + ANSI_COLORS[19] + "  " + block6 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[30] + "  " + block6 + ANSI_COLORS[41] + "  " + block6 + ANSI_COLORS[52] + "  " + block6 + ANSI_COLORS[63] + "  " + block6 + ANSI_RESET;
        map[41] = ANSI_COLORS[8] + "       " + block7 + ANSI_COLORS[19] + "   " + block7 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[30] +  "   " + block7 + ANSI_COLORS[41] + "   " + block7 + ANSI_COLORS[52] + "   " + block7 + ANSI_COLORS[63] + "   " + block7 + ANSI_RESET;

        map[42] = ANSI_COLORS[3] + "   /" + block + block + block + block + block + block + "\\" + "   " +  ANSI_COLORS[14] + "   /" + block + block + block + block + block + block + "\\" + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[25] + "/" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[36] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[47] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[58] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[69] + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[43] = ANSI_COLORS[3] + "  /" + block + block + block + block + cv[3] + block + block + block + "\\" + "  " +  ANSI_COLORS[14] + "  /" + block + block + block + block + cv[14] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[25] + "  /" + block + block + block + block + cv[25] + block + block + block + "\\" + "  " + ANSI_COLORS[36] + "  /" + block + block + block + block + cv[36] + block + block + block + "\\" + "  " + ANSI_COLORS[47] + "  /" + block + block + block + block + cv[47] + block + block + block + "\\" + "  " + ANSI_COLORS[58] + "  /" + block + block + block + block + cv[58] + block + block + block + "\\" + "  " + ANSI_COLORS[69] + "  /" + block + block + block + block + cv[69] + block + block + block + "\\" + ANSI_RESET;
        map[44] = ANSI_COLORS[3] + " /" + block + block + unit1[3] + block + block + unit2[3] + block + block + "\\" + " " +  ANSI_COLORS[14] + " /" + block + block + unit1[14] + block + block + unit2[14] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[25] + " /" + block + block + unit1[25] + block + block + unit2[25] + block + block + "\\" + " " + ANSI_COLORS[36] + " /" + block + block + unit1[36] + block + block + unit2[36] + block + block + "\\" + " " + ANSI_COLORS[47] + " /" + block + block + unit1[47] + block + block + unit2[47] + block + block + "\\" + " " + ANSI_COLORS[58] + " /" + block + block + unit1[58] + block + block + unit2[58] + block + block + "\\" + " " + ANSI_COLORS[69] + " /" + block + block + unit1[69] + block + block + unit2[69] + block + block + "\\" + ANSI_RESET;
        map[45] = ANSI_COLORS[3] + "|" + block + block + block + block + number[3] + block + types[3] + block + block + block + block + "|" +  ANSI_COLORS[14] + "|" + block + block + block + block + number[14] + block + types[14] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[25] +  "|" + block + block + block + block + number[25] + block + types[25] + block + block + block + block + "|" + ANSI_COLORS[36] + "|" + block + block + block + block + number[36] + block + types[36] + block + block + block + block + "|" + ANSI_COLORS[47] + "|" + block + block + block + block + number[47] + block + types[47] + block + block + block + block + "|" + ANSI_COLORS[58] + "|" + block + block + block + block + number[58] + block + types[58] + block + block + block + block + "|" + ANSI_COLORS[69] + "|" + block + block + block + block + number[69] + block + types[69] + block + block + block + block + "|" + ANSI_RESET;
        map[46] = ANSI_COLORS[3] + block5 + " " +  ANSI_COLORS[14] + block5 + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[25] + block5 + " " + ANSI_COLORS[36] + block5 + " " + ANSI_COLORS[47] + block5 + " " + ANSI_COLORS[58] + block5 + " " + ANSI_COLORS[69] + block5 + ANSI_RESET;
        map[47] = ANSI_COLORS[3] + block6 + "  " +  ANSI_COLORS[14] + block6 + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[25] + block6 + "  " + ANSI_COLORS[36] + block6 + "  " + ANSI_COLORS[47] + block6 + "  " + ANSI_COLORS[58] + block6 + "  " + ANSI_COLORS[69] + block6 + ANSI_RESET;
        map[48] = ANSI_COLORS[3] + block7 + "   " +  ANSI_COLORS[14] + block7 + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[25] + "\\" + block + block + block + block + block + block + "/" + "   " + ANSI_COLORS[36] + block7 + "   " + ANSI_COLORS[47] + block7 + "   " + ANSI_COLORS[58] + block7 + "   " + ANSI_COLORS[69] + block7 + ANSI_RESET;

        map[49] = ANSI_COLORS[9] + "       " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[20] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[31] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[42] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[53] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[64] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[50] = ANSI_COLORS[9] + "       " + "  /" + block + block + block + block + cv[9] + block + block + block + "\\" + ANSI_COLORS[20] + "  " + "  /" + block + block + block + block + cv[20] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[31] + "  " + "  /" + block + block + block + block + cv[31] + block + block + block + "\\" + ANSI_COLORS[42] + "  " + "  /" + block + block + block + block + cv[42] + block + block + block + "\\" + ANSI_COLORS[53] + "  " + "  /" + block + block + block + block + cv[53] + block + block + block + "\\" + ANSI_COLORS[64] + "  " + "  /" + block + block + block + block + cv[64] + block + block + block + "\\" + ANSI_RESET;
        map[51] = ANSI_COLORS[9] + "       " + " /" + block + block + unit1[9] + block + block + unit2[9] + block + block + "\\" + ANSI_COLORS[20] + " " + " /" + block + block + unit1[20] + block + block + unit2[20] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[31] +  " " + " /" + block + block + unit1[31] + block + block + unit2[31] + block + block + "\\" + ANSI_COLORS[42] + " " + " /" + block + block + unit1[42] + block + block + unit2[42] + block + block + "\\" + ANSI_COLORS[53] + " " + " /" + block + block + unit1[53] + block + block + unit2[53] + block + block + "\\" + ANSI_COLORS[64] + " " + " /" + block + block + unit1[64] + block + block + unit2[64] + block + block + "\\" + ANSI_RESET;
        map[52] = ANSI_COLORS[9] + "       " + "|" + block + block + block + block + number[9] + block + types[9] + block + block + block + block + "|" + ANSI_COLORS[20] + "|" + block + block + block + block + number[20] + block + types[20] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[31] +  "|" + block + block + block + block + number[31] + block + types[31] + block + block + block + block + "|" + ANSI_COLORS[42] + "|" + block + block + block + block + number[42] + block + types[42] + block + block + block + block + "|" + ANSI_COLORS[53] + "|" + block + block + block + block + number[53] + block + types[53] + block + block + block + block + "|" + ANSI_COLORS[64] + "|" + block + block + block + block + number[64] + block + types[64] + block + block + block + block + "|" + ANSI_RESET;
        map[53] = ANSI_COLORS[9] + "       " + block5 + ANSI_COLORS[20] + " " + block5 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[31] +  " " + block5 + ANSI_COLORS[42] + " " + block5 + ANSI_COLORS[53] + " " + block5 +  ANSI_COLORS[64] + " " + block5 + ANSI_RESET;
        map[54] = ANSI_COLORS[9] + "       " + block6 + ANSI_COLORS[20] + "  " + block6 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[31] + "  " + block6 + ANSI_COLORS[42] + "  " + block6 + ANSI_COLORS[53] + "  " + block6 + ANSI_COLORS[64] + "  " + block6 + ANSI_RESET;
        map[55] = ANSI_COLORS[9] + "       " + block7 + ANSI_COLORS[20] + "   " + block7 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[31] +  "   " + block7 + ANSI_COLORS[42] + "   " + block7 + ANSI_COLORS[53] + "   " + block7 + ANSI_COLORS[64] + "   " + block7 + ANSI_RESET;

        map[56] = ANSI_COLORS[4] + "   /" + block + block + block + block + block + block + "\\" + "   " +  ANSI_COLORS[15] + "   /" + block + block + block + block + block + block + "\\" + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[26] + "/" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[37] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[48] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[59] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[70] + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[57] = ANSI_COLORS[4] + "  /" + block + block + block + block + cv[4] + block + block + block + "\\" + "  " +  ANSI_COLORS[15] + "  /" + block + block + block + block + cv[15] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[26] + "  /" + block + block + block + block + cv[26] + block + block + block + "\\" + "  " + ANSI_COLORS[37] + "  /" + block + block + block + block + cv[37] + block + block + block + "\\" + "  " + ANSI_COLORS[48] + "  /" + block + block + block + block + cv[48] + block + block + block + "\\" + "  " + ANSI_COLORS[59] + "  /" + block + block + block + block + cv[59] + block + block + block + "\\" + "  " + ANSI_COLORS[70] + "  /" + block + block + block + block + cv[70] + block + block + block + "\\" + ANSI_RESET;
        map[58] = ANSI_COLORS[4] + " /" + block + block + unit1[4] + block + block + unit2[4] + block + block + "\\" + " " +  ANSI_COLORS[15] + " /" + block + block + unit1[15] + block + block + unit2[15] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[26] + " /" + block + block + unit1[26] + block + block + unit2[26] + block + block + "\\" + " " + ANSI_COLORS[37] + " /" + block + block + unit1[37] + block + block + unit2[37] + block + block + "\\" + " " + ANSI_COLORS[48] + " /" + block + block + unit1[48] + block + block + unit2[48] + block + block + "\\" + " " + ANSI_COLORS[59] + " /" + block + block + unit1[59] + block + block + unit2[59] + block + block + "\\" + " " + ANSI_COLORS[70] + " /" + block + block + unit1[70] + block + block + unit2[70] + block + block + "\\" + ANSI_RESET;
        map[59] = ANSI_COLORS[4] + "|" + block + block + block + block + number[4] + block + types[4] + block + block + block + block + "|" +  ANSI_COLORS[15] + "|" + block + block + block + block + number[15] + block + types[15] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[26] +  "|" + block + block + block + block + number[26] + block + types[26] + block + block + block + block + "|" + ANSI_COLORS[37] + "|" + block + block + block + block + number[37] + block + types[37] + block + block + block + block + "|" + ANSI_COLORS[48] + "|" + block + block + block + block + number[48] + block + types[48] + block + block + block + block + "|" + ANSI_COLORS[59] + "|" + block + block + block + block + number[59] + block + types[59] + block + block + block + block + "|" + ANSI_COLORS[70] + "|" + block + block + block + block + number[70] + block + types[70] + block + block + block + block + "|" + ANSI_RESET;
        map[60] = ANSI_COLORS[4] + block5 + " " +  ANSI_COLORS[15] + block5 + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[26] + block5 + " " + ANSI_COLORS[37] + block5 + " " + ANSI_COLORS[48] + block5 + " " + ANSI_COLORS[59] + block5 + " " + ANSI_COLORS[70] + block5 + ANSI_RESET;
        map[61] = ANSI_COLORS[4] + block6 + "  " +  ANSI_COLORS[15] + block6 + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[26] + block6 + "  " + ANSI_COLORS[37] + block6 + "  " + ANSI_COLORS[48] + block6 + "  " + ANSI_COLORS[59] + block6 + "  " + ANSI_COLORS[70] + block6 + ANSI_RESET;
        map[62] = ANSI_COLORS[4] + block7 + "   " +  ANSI_COLORS[15] + block7 + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[26] + "\\" + block + block + block + block + block + block + "/" + "   " + ANSI_COLORS[37] + block7 + "   " + ANSI_COLORS[48] + block7 + "   " + ANSI_COLORS[59] + block7 + "   " + ANSI_COLORS[70] + block7 + ANSI_RESET;

        map[63] = ANSI_COLORS[10] + "       " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[21] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[32] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[43] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[54] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_COLORS[65] + "   " + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[64] = ANSI_COLORS[10] + "       " + "  /" + block + block + block + block + cv[10] + block + block + block + "\\" + ANSI_COLORS[21] + "  " + "  /" + block + block + block + block + cv[21] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[32] + "  " + "  /" + block + block + block + block + cv[32] + block + block + block + "\\" + ANSI_COLORS[43] + "  " + "  /" + block + block + block + block + cv[43] + block + block + block + "\\" + ANSI_COLORS[54] + "  " + "  /" + block + block + block + block + cv[54] + block + block + block + "\\" + ANSI_COLORS[65] + "  " + "  /" + block + block + block + block + cv[65] + block + block + block + "\\" + ANSI_RESET;
        map[65] = ANSI_COLORS[10] + "       " + " /" + block + block + unit1[10] + block + block + unit2[10] + block + block + "\\" + ANSI_COLORS[21] + " " + " /" + block + block + unit1[21] + block + block + unit2[21] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[32] +  " " + " /" + block + block + unit1[32] + block + block + unit2[32] + block + block + "\\" + ANSI_COLORS[43] + " " + " /" + block + block + unit1[43] + block + block + unit2[43] + block + block + "\\" + ANSI_COLORS[54] + " " + " /" + block + block + unit1[54] + block + block + unit2[54] + block + block + "\\" + ANSI_COLORS[65] + " " + " /" + block + block + unit1[65] + block + block + unit2[65] + block + block + "\\" + ANSI_RESET;
        map[66] = ANSI_COLORS[10] + "       " + "|" + block + block + block + block + number[10] + block + types[10] + block + block + block + block + "|" + ANSI_COLORS[21] + "|" + block + block + block + block + number[21] + block + types[21] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[32] +  "|" + block + block + block + block + number[32] + block + types[32] + block + block + block + block + "|" + ANSI_COLORS[43] + "|" + block + block + block + block + number[43] + block + types[43] + block + block + block + block + "|" + ANSI_COLORS[54] + "|" + block + block + block + block + number[54] + block + types[54] + block + block + block + block + "|" + ANSI_COLORS[65] + "|" + block + block + block + block + number[65] + block + types[65] + block + block + block + block + "|" + ANSI_RESET;
        map[67] = ANSI_COLORS[10] + "       " + block5 + ANSI_COLORS[21] + " " + block5 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[32] +  " " + block5 + ANSI_COLORS[43] + " " + block5 + ANSI_COLORS[54] + " " + block5 +  ANSI_COLORS[65] + " " + block5 + ANSI_RESET;
        map[68] = ANSI_COLORS[10] + "       " + block6 + ANSI_COLORS[21] + "  " + block6 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[32] + "  " + block6 + ANSI_COLORS[43] + "  " + block6 + ANSI_COLORS[54] + "  " + block6 + ANSI_COLORS[65] + "  " + block6 + ANSI_RESET;
        map[69] = ANSI_COLORS[10] + "       " + block7 + ANSI_COLORS[21] + "   " + block7 + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[32] +  "   " + block7 + ANSI_COLORS[43] + "   " + block7 + ANSI_COLORS[54] + "   " + block7 + ANSI_COLORS[65] + "   " + block7 + ANSI_RESET;

        map[70] = ANSI_COLORS[5] + "   /" + block + block + block + block + block + block + "\\" + "   " +  ANSI_COLORS[16] + "   /" + block + block + block + block + block + block + "\\" + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[27] + "/" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[38] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[49] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[60] + "   /" + block + block + block + block + block + block + "\\" + "   " + ANSI_COLORS[71] + "   /" + block + block + block + block + block + block + "\\" + ANSI_RESET;
        map[71] = ANSI_COLORS[5] + "  /" + block + block + block + block + cv[5] + block + block + block + "\\" + "  " +  ANSI_COLORS[16] + "  /" + block + block + block + block + cv[16] + block + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[27] + "  /" + block + block + block + block + cv[27] + block + block + block + "\\" + "  " + ANSI_COLORS[38] + "  /" + block + block + block + block + cv[38] + block + block + block + "\\" + "  " + ANSI_COLORS[49] + "  /" + block + block + block + block + cv[49] + block + block + block + "\\" + "  " + ANSI_COLORS[60] + "  /" + block + block + block + block + cv[60] + block + block + block + "\\" + "  " + ANSI_COLORS[71] + "  /" + block + block + block + block + cv[71] + block + block + block + "\\" + ANSI_RESET;
        map[72] = ANSI_COLORS[5] + " /" + block + block + unit1[5] + block + block + unit2[5] + block + block + "\\" + " " +  ANSI_COLORS[16] + " /" + block + block + unit1[16] + block + block + unit2[16] + block + block + "\\" + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[27] + " /" + block + block + unit1[27] + block + block + unit2[27] + block + block + "\\" + " " + ANSI_COLORS[38] + " /" + block + block + unit1[38] + block + block + unit2[38] + block + block + "\\" + " " + ANSI_COLORS[49] + " /" + block + block + unit1[49] + block + block + unit2[49] + block + block + "\\" + " " + ANSI_COLORS[60] + " /" + block + block + unit1[60] + block + block + unit2[60] + block + block + "\\" + " " + ANSI_COLORS[71] + " /" + block + block + unit1[71] + block + block + unit2[71] + block + block + "\\" + ANSI_RESET;
        map[73] = ANSI_COLORS[5] + "|" + block + block + block + block + number[5] + block + types[5] + block + block + block + block + "|" +  ANSI_COLORS[16] + "|" + block + block + block + block + number[16] + block + types[16] + block + block + block + block + "|" + ANSI_COLORS[72] + block + ANSI_RESET + ANSI_COLORS[27] +  "|" + block + block + block + block + number[27] + block + types[27] + block + block + block + block + "|" + ANSI_COLORS[38] + "|" + block + block + block + block + number[38] + block + types[38] + block + block + block + block + "|" + ANSI_COLORS[49] + "|" + block + block + block + block + number[49] + block + types[49] + block + block + block + block + "|" + ANSI_COLORS[60] + "|" + block + block + block + block + number[60] + block + types[60] + block + block + block + block + "|" + ANSI_COLORS[71] + "|" + block + block + block + block + number[71] + block + types[71] + block + block + block + block + "|" + ANSI_RESET;
        map[74] = ANSI_COLORS[5] + block5 + " " +  ANSI_COLORS[16] + block5 + ANSI_COLORS[72] + block + ANSI_RESET +  " " + ANSI_COLORS[27] + block5 + " " + ANSI_COLORS[38] + block5 + " " + ANSI_COLORS[49] + block5 + " " + ANSI_COLORS[60] + block5 + " " + ANSI_COLORS[71] + block5 + ANSI_RESET;
        map[75] = ANSI_COLORS[5] + block6 + "  " +  ANSI_COLORS[16] + block6 + ANSI_COLORS[72] + block + ANSI_RESET + "  " + ANSI_COLORS[27] + block6 + "  " + ANSI_COLORS[38] + block6 + "  " + ANSI_COLORS[49] + block6 + "  " + ANSI_COLORS[60] + block6 + "  " + ANSI_COLORS[71] + block6 + ANSI_RESET;
        map[76] = ANSI_COLORS[5] + block7 + "   " +  ANSI_COLORS[16] + block7 + " " + ANSI_COLORS[72] + block + block + block + block + block + block + ANSI_RESET + ANSI_COLORS[27] + "\\" + block + block + block + block + block + block + "/" + "   " + ANSI_COLORS[38] + block7 + "   " + ANSI_COLORS[49] + block7 + "   " + ANSI_COLORS[60] + block7 + "   " + ANSI_COLORS[71] + block7 + ANSI_RESET;
        return map;
    }
    // if distance between two tile center is (2rad3 * radius) they're neighbor
    private boolean isCityNeighbor(float x1, float y1, float x2, float y2, float radius){
        float distance = (float) Math.pow(0.5, (Math.pow(2, x2 - x1) + Math.pow(2, y2 - y1)));
        if (radius * (float)Math.pow(0.5, 3) < distance && distance < 3 * radius * (float)Math.pow(0.5, 3))
            return true;
        return false;
    }
    private boolean isUnitNeighbor(float x1, float y1, float x2, float y2, float radius){
        float distance = (float) Math.pow(0.5, (Math.pow(2, x2 - x1) + Math.pow(2, y2 - y1)));
        if (3 * radius * (float)Math.pow(0.5, 3) < distance && distance < 5 * radius * (float)Math.pow(0.5, 3))
            return true;
        return false;
    }
    // 1 -> vazeh, -1 -> fog
    public ArrayList<Integer> statusChecker(Civilization civilization, ArrayList<Tile> map){
        ArrayList<Integer> civilizationTiles  = new ArrayList<>(72);
        for (int i = 0; i < civilizationTiles.size(); i++)
            civilizationTiles.set(i, -1);
        ArrayList<City> cities = civilization.getCities();
        outerloop:
        for (int i = 0; i < map.size(); i++) {
            for (int j = 0; j < cities.size(); j++) {
                ArrayList<Tile> cityTiles = cities.get(j).getTiles();
                for (int k = 0; k < cityTiles.size(); k++) {
                    if (cityTiles.get(k).getUnits().size() == 0 && isCityNeighbor(cityTiles.get(k).getX(), cityTiles.get(k).getY(), map.get(i).getX(), map.get(i).getY(), cityTiles.get(k).getRadius())) {
                        civilizationTiles.set(i, 1);
                        break outerloop;
                    }
                    if (cityTiles.get(k).getUnits().size() > 0 && isUnitNeighbor(cityTiles.get(k).getX(), cityTiles.get(k).getY(), map.get(i).getX(), map.get(i).getY(), cityTiles.get(k).getRadius())
                    && !cityTiles.get(k).isBlocker()) {
                        civilizationTiles.set(i, 1);
                        break outerloop;
                    }
                    if (cityTiles.get(k).getUnits().size() > 0 && isCityNeighbor(cityTiles.get(k).getX(), cityTiles.get(k).getY(), map.get(i).getX(), map.get(i).getY(), cityTiles.get(k).getRadius())
                            && !cityTiles.get(k).isBlocker()) {
                        for (int l = 0; l < map.size(); l++)
                            if (2 * map.get(l).getTileNumber() == cityTiles.get(k).getTileNumber() + map.get(i).getTileNumber() && map.get(l).isBlocker())
                                break outerloop;
                        civilizationTiles.set(i, 1);
                        break outerloop;
                    }
                }
            }
        }
        return civilizationTiles;
    }
    // -1 -> fog, 0  -> moshakhas, 1 -> vazeh
    public ArrayList<Integer> statusComparator(ArrayList<Integer> old, ArrayList<Integer> now, HashMap<Integer, Tile> zeroStatusTiles, ArrayList<Tile> map){
        //TODO... if(now == fog of war && old == vazeh -> now = moshakhas)
        //TODO... return now;
        ArrayList<Integer> finalTileStatus = new ArrayList<>(72);
        for (int i = 0; i < finalTileStatus.size(); i++)
            finalTileStatus.set(i, -1);
        for (int i = 0; i < old.size(); i++) {
            if (now.get(i) == 1)
                finalTileStatus.set(i, 1);
            else if (now.get(i) == -1 && old.get(i) == 1) {
                finalTileStatus.set(i, 0);
                boolean exist = false;
                for (int j = 0; j < zeroStatusTiles.size(); j++) {
                    if (zeroStatusTiles.containsKey(i)) {
                        zeroStatusTiles.replace(i, map.get(i));
                        exist = true;
                        break;
                    }
                }
                if (!exist)
                    zeroStatusTiles.put(i, map.get(i));
            }
        }
        return finalTileStatus;
    }

    public StringBuilder researchInformation(Civilization civilization){
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Technology> allTechnologies = civilization.getTechnologies();
        stringBuilder.append("technologies that have been learnt:\n");
        for (Technology technology : allTechnologies)
            stringBuilder.append(technology.getName() + "\n");
        HashMap<Technology, Integer> technologyEarnedPercent = civilization.getTechnologyEarnedPercent();
        stringBuilder.append("technologies that you haven't been learnt completely:\n");
        if (technologyEarnedPercent.size() == 0){
            stringBuilder.append("nothing\n");
            return stringBuilder;
        }
        for (Map.Entry<Technology, Integer> technology: technologyEarnedPercent.entrySet())
            stringBuilder.append(technology.getKey().getName() + "\trounds left: " + technology.getValue().toString() + "\n");
        return stringBuilder;
    }
    // return name of current unit
    public String getUnitsName (Unit unit) {
        if (unit.isCivilian()) {
            if (((Civilian)unit).isWorker()) {
                return "worker";
            }
            else {
                return "settler";
            }
        }
        else {
            if (((Warrior)unit).isTank()) {
                return "tank";
            }
            else if (((Warrior)unit).isPanzer()) {
                return "panzer";
            }
            else if (((Warrior)unit).isWarrior()) {
                return "warrior";
            }
            else if (((Warrior)unit).isInfantry()) {
                return "infantry";
            }
            else if (((Warrior)unit).isArtillery()) {
                return "artillery";
            }
            else if (((Warrior)unit).isArcher()) {
                return "archer";
            }
            else if (((Warrior)unit).isChariotArcher()) {
                return "chariot archer";
            }
            else if (((Warrior)unit).isScout()) {
                return "scout";
            }
            else if (((Warrior)unit).isSpearman()) {
                return "spearman";
            }
            else if (((Warrior)unit).isCatapult()) {
                return "catapult";
            }
            else if (((Warrior)unit).isHorseMan()) {
                return "horseman";
            }
            else if (((Warrior)unit).isSwordsMan()) {
                return "swordsman";
            }
            else if (((Warrior)unit).isCrossbowMan()) {
                return "crossbowman";
            }
            else if (((Warrior)unit).isKnight()) {
                return "knight";
            }
            else if (((Warrior)unit).isLongswordMan()) {
                return "longsword man";
            }
            else if (((Warrior)unit).isPikeMan()) {
                return "pike man";
            }
            else if (((Warrior)unit).isTrebuchet()) {
                return "trebuchet";
            }
            else if (((Warrior)unit).isCanon()) {
                return "canon";
            }
            else if (((Warrior)unit).isCavalry()) {
                return "cavalry";
            }
            else if (((Warrior)unit).isLancer()) {
                return "lancer";
            }
            else if (((Warrior)unit).isMusketMan()) {
                return "musket man";
            }
            else if (((Warrior)unit).isRifleMan()) {
                return "rifle man";
            }
            else if (((Warrior)unit).isAntiTankGun()) {
                return "anti tank gun";
            }
        }
        return "";
    }
    public StringBuilder unitPanel(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < map.size(); i++) {
            ArrayList<Unit> unitsOfTile = map.get(i).getUnits();
            for (int i1 = 0; i1 < unitsOfTile.size(); i1++) {
                if (unitsOfTile.get(i1).getCivilization().equals(civilization)) {
                    String name = getUnitsName(unitsOfTile.get(i1));
                    stringBuilder.append("unit " + name + " health : " + unitsOfTile.get(i1).getHealth() + " on tile number: " + i + "\n");
                }
            }
        }
        return stringBuilder;
    }
    public StringBuilder cityPanel(ArrayList<Tile> map,ArrayList<Civilization> civilizations){
        StringBuilder stringBuilder = new StringBuilder("");//"Civilization name" :
        //                             Capital : tile numbers
        //                             City 2  : tile numbers
        //                                      ...
        //                             City n  : tile numbers

        for(Civilization tempCivilization : civilizations){
            stringBuilder.append(tempCivilization.getMember().getNickname()).append(" :\nCapital : ");
            City capital = tempCivilization.getCapital();
            for(Tile tile : capital.getTiles()){
                stringBuilder.append(tile.getTileNumber()).append(" ");
            }
            stringBuilder.append("\n");
            for(int i = 0; i < tempCivilization.getCities().size(); i++){
                City tempCity = tempCivilization.getCities().get(i);
                if(tempCity != tempCivilization.getCapital()){
                    stringBuilder.append(tempCivilization.getMember().getNickname()).append(" : \n").append("City ").append(i + 2).append("  : ");
                    for(Tile tile : tempCity.getTiles()){
                        stringBuilder.append(tile.getTileNumber()).append(" ");
                    }
                    stringBuilder.append("\n");
                }
            }
        }

        return stringBuilder;
    }
    public String diplomaticInformation(Civilization civilization,ArrayList<Tile> map){
        int point = civilization.getPoint();

        return "your point is : " + point;
    }
    public String sendFriendlyRequestDiplomatic(Civilization civilization,ArrayList<Civilization> civilizations,String name){
        if(Objects.equals(name, civilization.getMember().getNickname()))
            return "cant send request to yourself";

        for(Civilization destCivilization : civilizations){
            if(Objects.equals(destCivilization.getMember().getNickname(), name)){
                for(Civilization tempCiv : destCivilization.getFriendlyRequests()){
                    if(tempCiv == civilization) {
                        return "you have already sent this request";
                    }
                }
                for(Civilization tempCiv : destCivilization.getFriends()){
                    if(tempCiv == civilization){
                        return "this civilization is already your allie";
                    }
                }
                destCivilization.getFriendlyRequests().add(civilization);
                return "your request has been sent successfully";
            }
        }
        return "there is no civilization with this name";
    }
    public StringBuilder showFriendlyRequests(Civilization civilization){
        StringBuilder stringBuilder = new StringBuilder("");
        int i = 1;
        for(Civilization tempCivilization : civilization.getFriendlyRequests()){
            stringBuilder.append(i).append(" : ").append(tempCivilization.getMember().getNickname()).append("\n");
            i++;
        }
        return stringBuilder;
    }
    public String acceptFriendlyRequest(Civilization civilization,String name){
        for(Civilization tempCivilization : civilization.getFriendlyRequests()){
            if(Objects.equals(tempCivilization.getMember().getNickname(), name)){
                civilization.acceptFriendlyRequest(tempCivilization);
                return "you accepted the request";
            }
        }
        return "there is no friendly request with this name";
    }
    public String denyFriendlyRequest(Civilization civilization,String name){
        for(Civilization tempCivilization : civilization.getFriendlyRequests()){
            if(Objects.equals(tempCivilization.getMember().getNickname(), name)){
                civilization.denyFriendlyRequest(tempCivilization);
                return "you denied the request";
            }
        }
        return "there is no friendly request with this name";
    }
    public String breakTheOath(Civilization civilization,String name){//this will cut the friendship between you and your allie
        for(Civilization tempCivilization : civilization.getFriendlyRequests()){
            if(Objects.equals(tempCivilization.getMember().getNickname(), name)){
                civilization.breakTheOath(tempCivilization);
                return "you broke the the oath !";
            }
        }
        return "you don't have any allie with this name";
    }
    public StringBuilder victoryImprovement(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Civilization, Integer> wins = civilization.getWinsInUnitsWar();
        HashMap<Civilization, Integer> losses = civilization.getLossesInUnitsWar();
        stringBuilder.append("wins :" + "\n");
        for(Map.Entry<Civilization, Integer> entry : wins.entrySet()) {
            stringBuilder.append("Civilization : " + entry.getKey().getMember().getUsername() + " number of wins : " + entry.getValue() + "\n");
        }
        stringBuilder.append("losses :" + "\n");
        for(Map.Entry<Civilization, Integer> entry : losses.entrySet()) {
            stringBuilder.append("Civilization : " + entry.getKey().getMember().getUsername() + " number of losses : " + entry.getValue() + "\n");
        }
        return stringBuilder;
    }
    public StringBuilder demographics(ArrayList<Civilization> civilizations,ArrayList<Tile> map){   //Jamiat shenasi
        StringBuilder stringBuilder = new StringBuilder("");
        int[] sortFlag = new int[civilizations.size()];
        Civilization chosenCivilization = null;
        int index = 0;

        int Number = 1;
        for(int i = 0; i < civilizations.size(); i++){
            boolean theFlag = true;
            for(int j = 0; j < civilizations.size(); j++){
                if(sortFlag[j] == 1)
                    continue;
                if(theFlag) {
                    chosenCivilization = civilizations.get(j);
                    theFlag = false;
                }
                Civilization tempCivilization = civilizations.get(j);
                if(tempCivilization.getPoint() > chosenCivilization.getPoint()){
                    chosenCivilization = tempCivilization;
                    index = j;
                }
            }
            sortFlag[index] = 1;
            int numOfTiles = 0;
            for(City city : chosenCivilization.getCities()){
                for(Tile tile : city.getTiles()){
                    numOfTiles++;
                }
            }
            int numOfUnits = 0;
            for(Tile tile : map){
                for(Unit unit : tile.getUnits()){
                    if(unit.getCivilization() == chosenCivilization)
                        numOfUnits++;
                }
            }
            stringBuilder.append(chosenCivilization.getMember().getNickname()).append(" : \n");
            stringBuilder.append("Rank : ").append(Number).append("\n");
            stringBuilder.append("Points : ").append(chosenCivilization.getPoint()).append("\n");
            stringBuilder.append("Number of cities : ").append(chosenCivilization.getCities().size()).append("\n");
            stringBuilder.append("Number of tiles : ").append(numOfTiles).append("\n");
            stringBuilder.append("Gold : ").append(chosenCivilization.getGold()).append("\n");
            stringBuilder.append("Number of units : ").append(numOfUnits).append("\n");
            stringBuilder.append("--------------------\n");

            Number++;
        }

        return stringBuilder;
    }
    public StringBuilder historyInformation(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder generalUnitReview(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < map.size(); i++) {
            ArrayList<Unit> unitsOfTile = map.get(i).getUnits();
            for (int i1 = 0; i1 < unitsOfTile.size(); i1++) {
                if (unitsOfTile.get(i1).getCivilization().equals(civilization)) {
                    String name = getUnitsName(unitsOfTile.get(i1));
                    stringBuilder.append("unit " + name + " health : " + unitsOfTile.get(i1).getHealth());
                    if (unitsOfTile.get(i1).isCivilian()) {
                        stringBuilder.append(" damage : N/A" + "\n");
                    }
                    else {
                        stringBuilder.append(" damage: " + ((Warrior)unitsOfTile.get(i1)).getDamage() +
                                " range: " + ((Warrior)unitsOfTile.get(i1)).getRange() + " range damage: " +
                                ((Warrior)unitsOfTile.get(i1)).getRangedCombatDamage() + "\n");
                    }
                }
            }
        }
        return stringBuilder;
    }
    public StringBuilder economicalReview(Civilization civilization){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Number of cities : ").append(civilization.getCities().size()).append("-----------------------").append("\n");
        for(int i = 0; i < civilization.getCities().size(); i++){
            City city = civilization.getCities().get(i);
            stringBuilder.append("City ").append(i).append(" :\n");
            stringBuilder.append("Population : ").append(city.getCitizens().size()).append("\n");
            stringBuilder.append("Defence Strength : ").append(city.getDefenceStrength()).append("\n");
            stringBuilder.append("Food per Turn : ").append(city.getFood()).append("\n");
            stringBuilder.append("Science per Turn : ").append(city.getSciencePerTurn()).append("\n");
            stringBuilder.append("Gold per Turn : ").append(city.getGold()).append("\n");
            stringBuilder.append("Production per Turn : ").append(city.getProduction());
            HashMap<Unit,Integer> unit = city.getCenterTile().getTurnForUnitMaking();
            for(Map.Entry<Unit,Integer> entry : unit.entrySet()) {
              String name = getUnitsName(entry.getKey());
              stringBuilder.append(name + ": " + entry.getValue() + "\n");
            }
            //TODO...  buildings duration to create
            stringBuilder.append("-----------------------\n");
        }

        return stringBuilder;
    }
    public StringBuilder diplomaticReview(Civilization civilization){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("your friends :\n");
        for(Civilization tempCiv : civilization.getFriends()){
            stringBuilder.append(tempCiv.getName()).append("\n");
        }
        stringBuilder.append("other civilizations are your enemy");
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
    // finds all  the neighbours of a node (tile)
    public void findAllNeighbours(Node[] graph) {
        int column = 0;
        int counter = 0;
        for (int i = 0; i < graph.length; i++) {
            if (column % 2 == 0 && counter == 6) {
                counter = 0;
                column++;
            }
            if (column % 2 != 0 && counter == 5) {
                counter = 0;
                column++;
            }
            if (i - 1 >= 0 && counter != 0) {
                graph[i].neighbours.add(graph[i - 1]);
            }
            if (counter != 5 && counter != 4) {
                graph[i].neighbours.add(graph[i + 1]);
            }
            if (i - 6 >= 0 && (counter != 0 || column % 2 != 0)) {
                graph[i].neighbours.add(graph[i - 6]);
            }
            if (i - 5 >= 0 && counter != 5) {
                graph[i].neighbours.add(graph[i - 5]);
            }
            if (i + 6 <= 71 && counter != 5) {
                graph[i].neighbours.add(graph[i + 6]);
            }
            if (i + 5 <= 71 && (counter != 0 || column % 2 != 0)) {
                graph[i].neighbours.add(graph[i + 5]);
            }
            counter++;
        }
    }

    // set distance of two node (tile) based on destination mp.
    public int distanceOfTwoNode(Node node) {
        Tile tile = node.tile;
        if (tile.isMountain() || tile.isOcean() || tile.getAttribute().isIce()) {
            return 100000;
        }
        return tile.getMpCost();
    }
    // chase an algorithm based on graphs to find the shortest way.
    public void findThePath (HashMap<Node, Node> previousNode, HashMap<Node, Integer> distanceFromNode, ArrayList<Node> unreached, Node destinationNode) {
        while (unreached.size() > 0) {
            Node minimumBranch = null;
            for (int i = 0; i < unreached.size(); i++) {
                if (minimumBranch == null ||
                        distanceFromNode.get(unreached.get(i)) < distanceFromNode.get(minimumBranch)) {
                    minimumBranch = unreached.get(i);
                    unreached.remove(i);
                }
            }
            if (minimumBranch.equals(destinationNode)) break;

            for (int i = 0; i < minimumBranch.neighbours.size(); ++i) {
                Node neighbourOfBranch = minimumBranch.neighbours.get(i);
                int mpCost = distanceFromNode.get(minimumBranch) + distanceOfTwoNode(neighbourOfBranch);
                if (mpCost < distanceFromNode.get(neighbourOfBranch)) {
                    distanceFromNode.replace(neighbourOfBranch, mpCost);
                    previousNode.replace(neighbourOfBranch, minimumBranch);
                }
            }
        }
    }
    // find the shortest way from origin to destination based on mp.
    public void findTheShortestPath (Civilization civilization, Tile origin, Tile destination,ArrayList<Tile> map, Unit unit) {
        unit.setPath (null);
        Node[] graph = new Node[72];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new Node();
            graph[i].tile = map.get(i);
        }
        findAllNeighbours (graph);
        HashMap<Node, Integer> distanceFromNode = new HashMap<>();
        HashMap<Node, Node> previousNode = new HashMap<>();
        ArrayList<Node> unreached = new ArrayList<>();
        int originIndex = map.indexOf(origin);
        int destinationIndex = map.indexOf(destination);

        Node originNode = graph[originIndex];
        Node destinationNode = graph[destinationIndex];

        distanceFromNode.put(originNode, 0);
        previousNode.put(originNode, null);

        for (int i = 0; i < graph.length; i++) {
            if (!graph[i].equals(originNode)) {
                distanceFromNode.put(graph[i] ,100000);
                previousNode.put(graph[i], null);
            }
            unreached.add(graph[i]);
        }
        findThePath(previousNode, distanceFromNode, unreached, destinationNode);

        if (previousNode.get(destinationNode) == null) {
            unit.setPath(null);
            return;
        }

        ArrayList<Node> path = new ArrayList<>();
        Node currentNode = new Node();
        while (currentNode != null) {
            path.add(currentNode);
            currentNode = previousNode.get(currentNode);
        }

        Collections.reverse(path);
        unit.setPath(path);
    }
    // create parameters like unit or origin or destination for moveUnit function
    public String preMoveUnit (Matcher matcher, Civilization civilization, ArrayList<Tile> map) {
        int numberOfOrigin = Integer.parseInt(matcher.group("numberO"));
        int numberOfDestination = Integer.parseInt(matcher.group("numberD"));
        String unitName = matcher.group("unitName").toLowerCase();

        Tile origin = map.get(numberOfOrigin);
        Tile destination = map.get(numberOfDestination);
        ArrayList<Unit> units = origin.getUnits();
        Unit unit = getUnitInTile(units, unitName);
        return moveUnit(civilization, origin, destination, map, unit);
    }
    //return a unit from specific tile
    public Unit getUnitInTile (ArrayList<Unit> units, String unitName) {
        for (int i = 0; i < units.size(); i++) {
            if (unitName.equals("archer") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isArcher()) {
                    return units.get(i);
                }
            } else if (unitName.equals("chariot archer") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isChariotArcher()) {
                    return units.get(i);
                }
            } else if (unitName.equals("scout") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isScout()) {
                    return units.get(i);
                }
            } else if (unitName.equals("settler") && units.get(i).isCivilian()) {
                if (((Civilian) units.get(i)).isSettler()) {
                    return units.get(i);
                }
            } else if (unitName.equals("worker") && units.get(i).isCivilian()) {
                if (((Civilian) units.get(i)).isWorker()) {
                    return units.get(i);
                }
            } else if (unitName.equals("spearman") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isSpearman()) {
                    return units.get(i);
                }
            } else if (unitName.equals("warrior") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isWarrior()) {
                    return units.get(i);
                }
            } else if (unitName.equals("catapult") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isCatapult()) {
                    return units.get(i);
                }
            } else if (unitName.equals("horseman") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isHorseMan()) {
                    return units.get(i);
                }
            } else if (unitName.equals("swordsman") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isSwordsMan()) {
                    return units.get(i);
                }
            } else if (unitName.equals("crossbowman") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isCrossbowMan()) {
                    return units.get(i);
                }
            } else if (unitName.equals("knight") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isKnight()) {
                    return units.get(i);
                }
            } else if (unitName.equals("longswordsman") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isLongswordMan()) {
                    return units.get(i);
                }
            } else if (unitName.equals("pikeman") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isPikeMan()) {
                    return units.get(i);
                }
            } else if (unitName.equals("trebuchet") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isTrebuchet()) {
                    return units.get(i);
                }
            } else if (unitName.equals("canon") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isCanon()) {
                    return units.get(i);
                }
            } else if (unitName.equals("cavalry") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isCavalry()) {
                    return units.get(i);
                }
            } else if (unitName.equals("lancer") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isLancer()) {
                    return units.get(i);
                }
            } else if (unitName.equals("musketman") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isMusketMan()) {
                    return units.get(i);
                }
            } else if (unitName.equals("rifleman") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isRifleMan()) {
                    return units.get(i);
                }
            } else if (unitName.equals("anti-tank gun") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isAntiTankGun()) {
                    return units.get(i);
                }
            } else if (unitName.equals("artillery") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isArtillery()) {
                    return units.get(i);
                }
            } else if (unitName.equals("infantry") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isInfantry()) {
                    return units.get(i);
                }
            } else if (unitName.equals("panzer") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isPanzer()) {
                    return units.get(i);
                }
            } else if (unitName.equals("tank") && !units.get(i).isCivilian()) {
                if (((Warrior) units.get(i)).isTank()) {
                    return units.get(i);
                }
            }
        }
            return null;
    }
    // check the road for units
    public boolean checkPath (Unit unit) {
        ArrayList<Node> nodes = unit.getPath();
        for (int i = 1; i < nodes.size(); i++) {
            ArrayList<Unit> units = nodes.get(i).tile.getUnits();
            for (int i1 = 0; i1 < units.size(); i1++) {
                if ((!units.get(i1).isCivilian() &&
                        ((!unit.isCivilian()) || !units.get(i1).getCivilization().equals(unit.getCivilization()))) ||
                        (units.get(i1).isCivilian() && unit.isCivilian())){
                    return true;
                }
            }
        }
        return false;
    }
    // return the index of specific tile
    public int getTileIndex (Tile tile, ArrayList<Tile> map) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).equals(tile)) {
                return i;
            }
        }
        return 0;
    }
    // check the way for river
    public boolean isRiverOnWay (Tile origin, Tile destination, ArrayList<Tile> map) {
        int originIndex = getTileIndex(origin, map);
        int destinationIndex = getTileIndex(destination, map);
        if ((originIndex <= 21 && originIndex >= 17) && (destinationIndex >= 22 && destinationIndex <= 27)) {
            return true;
        }
        if ((destinationIndex <= 21 && destinationIndex >= 17) && (originIndex >= 22 && originIndex <= 27)) {
            return true;
        }
        return false;
    }

    // check the technology's name in civilization array of technology if it contains return true
    public boolean isTechnologyAvailable (Civilization civilization, String techName) {
        ArrayList<Technology> technologies = civilization.getTechnologies();
        for (int i = 0; i < technologies.size(); i++) {
            if (technologies.get(i).getName().toLowerCase().equals(techName)) return true;
        }
        return false;
    }
    // check origin and destination tiles , if both have same type of way(rail/road) return true
    public boolean isThereRoadOrRail (Tile origin, Tile destination) {
        if (origin.isDoesHaveRoad() && destination.isDoesHaveRoad() &&
                !origin.isRoadDamaged() && !destination.isRoadDamaged())
            return true;
        if (origin.isDoesHaveRailWay() && destination.isDoesHaveRailWay() &&
        !origin.isRailDamaged() && !destination.isRailDamaged()) return true;
        return false;
    }
    // reset the mp of your civilization units
    public void addMpEveryTurn(Civilization civilization, ArrayList<Tile> map) {
        for (int i = 0; i < map.size(); i++) {
            ArrayList<Unit> units = map.get(i).getUnits();
            for (int i1 = 0; i1 < units.size(); i1++) {
                if (units.get(i1).getCivilization().equals(civilization)) {
                    units.get(i1).setMp(units.get(i1).getConstantMP());
                }
            }
        }
    }

    public String moveUnit (Civilization civilization, Tile origin, Tile destination,ArrayList<Tile> map, Unit unit){
        String str;
        if (unit == null) {
            str = "there is no unit with this name !";
            return str;
        }
        if (unit.getIsOnSleep()) {
            str = "this unit is sleeping !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        if (destination.isMountain() || destination.isOcean() || destination.getAttribute().isIce()) {
            str = "destination is unreachable !";
            return str;
        }
        if (unit.getPath() == null) {
            findTheShortestPath(civilization, origin, destination, map, unit);
        }
        if (unit.getPath() == null) {
            str = "there is no way to the destination !";
            return str;
        }
        if (checkPath(unit)) {
            unit.setOrigin(unit.getPath().get(0).tile);
            unit.setDestination(null);
            unit.setPath(null);
            str = "there is another civilization on the way !";
            return str;
        }
        unit.setHasOrdered(true);
        unit.setOrigin(origin);
        unit.setDestination(destination);
        int i = 0;
        while (true) {
            if (i == unit.getPath().size() - 1 || (unit.getPath().size() >= 1 && unit.getPath().get(0).tile.equals(destination))) {
                unit.setMp(unit.getConstantMP());
                unit.setPath(null);
                unit.setOrigin(destination);
                unit.setDestination(null);
                str = "unit reached the destination !";
                break;
            }

            Tile originTile = unit.getPath().get(i).tile;
            Tile destinationTile = unit.getPath().get(i + 1).tile;


            if (unit.getMp() >= 1) {
                originTile.removeUnit(unit);
                destinationTile.addUnit(unit);
                int newMP;

                if (!isRiverOnWay(originTile, destinationTile, map)) {
                    if (unit.getMp() >= destinationTile.getMpCost() + destinationTile.getAttribute().getMpCost()) {
                        if (isThereRoadOrRail(originTile, destinationTile)) {
                            newMP = unit.getMp() - (destinationTile.getMpCost() + destinationTile.getAttribute().getMpCost()) / 2;
                        }
                        else {
                            newMP = unit.getMp() - (destinationTile.getMpCost() + destinationTile.getAttribute().getMpCost());
                        }
                    }
                    else {
                        newMP = 0;
                    }
                }

                else {
                    if (isThereRoadOrRail(originTile, destinationTile)) {
                        if (isTechnologyAvailable(civilization, "construction")) {
                            newMP = unit.getMp() - (destinationTile.getMpCost() + destinationTile.getAttribute().getMpCost()) / 2;
                        }
                        else {
                            newMP = unit.getMp() - (destinationTile.getMpCost() + destinationTile.getAttribute().getMpCost()) / 2 + 1;
                        }
                    }
                    else {
                        newMP = 0;
                    }
                }
                if (newMP < 0) newMP = 0;
                unit.getPath().remove(i);
                unit.setMp(newMP);
            }

            else {
                str = "unit mp isn't enough, wait until next turn !";
                break;
            }
        }
        return str;
    }
    // more than one turn moving function for units of playing civilization
    public void moveUnitWithMovesLeft (Civilization playingCivilization, ArrayList<Tile> map) {
        for (int i = 0; i < map.size(); i++) {
            ArrayList<Unit> units = map.get(i).getUnits();
            for (int i1 = 0; i1 < units.size(); i1++) {
                if (units.get(i1).getCivilization().equals(playingCivilization) &&
                        units.get(i1).getPath() != null ) {
                    moveUnit(playingCivilization, units.get(i1).getOrigin(), units.get(i1).getDestination(), map, units.get(i1));
                }
            }
        }
    }

    // check the necessary technologies for unit
    public boolean checkTechnology (ArrayList<Technology> technologies, String name) {
        for (int i = 0; i < technologies.size(); i++) {
            if (technologies.get(i).getName().equals(name)) return false;
        }
        return true;
    }
    public boolean isTechnologyAvailableForUnit (Unit unit, Civilization civilization) {
        Warrior warrior = (Warrior) unit;
        ArrayList<Technology> technologies = civilization.getTechnologies();
        if (warrior.isArcher()) {
            if (checkTechnology(technologies, "Archery")) return false;
        }
        else if (warrior.isChariotArcher()) {
            if (checkTechnology(technologies, "The Wheel")) return false;
        }
        else if (warrior.isScout()) return true;
        else if (warrior.isSpearman()) {
            if (checkTechnology(technologies, "Bronze Working")) return false;
        }
        else if (warrior.isWarrior()) return true;
        else if (warrior.isCatapult()) {
            if (checkTechnology(technologies, "Mathematics")) return false;
        }
        else if (warrior.isHorseMan()) {
            if (checkTechnology(technologies, "Horseback Riding")) return false;
        }
        else if (warrior.isSwordsMan()) {
            if (checkTechnology(technologies, "Iron Working")) return false;
        }
        else if (warrior.isCrossbowMan()) {
            if (checkTechnology(technologies, "Machinery")) return false;
        }
        else if (warrior.isKnight()) {
            if (checkTechnology(technologies, "Chivalry")) return false;
        }
        else if (warrior.isLongswordMan()) {
            if (checkTechnology(technologies, "Steel")) return false;
        }
        else if (warrior.isPikeMan()) {
            if (checkTechnology(technologies, "Civil Service")) return false;
        }
        else if (warrior.isTrebuchet()) {
            if (checkTechnology(technologies, "Physics")) return false;
        }
        else if (warrior.isCanon()) {
            if (checkTechnology(technologies, "Chemistry")) return false;
        }
        else if (warrior.isCavalry()) {
            if (checkTechnology(technologies, "Military Science")) return false;
        }
        else if (warrior.isLancer()) {
            if (checkTechnology(technologies, "Metallurgy")) return false;
        }
        else if (warrior.isMusketMan()) {
            if (checkTechnology(technologies, "Gunpowder")) return false;
        }
        else if (warrior.isRifleMan()) {
            if (checkTechnology(technologies, "Rifling")) return false;
        }
        else if (warrior.isAntiTankGun()) {
            if (checkTechnology(technologies, "Replaceable Parts")) return false;
        }
        else if (warrior.isArtillery()) {
            if (checkTechnology(technologies, "Dynamite")) return false;
        }
        else if (warrior.isInfantry()) {
            if (checkTechnology(technologies, "Replaceable Parts")) return false;
        }
        else if (warrior.isPanzer()) {
            if (checkTechnology(technologies, "Combustion")) return false;
        }
        else if (warrior.isTank()) {
            if (checkTechnology(technologies, "Combustion")) return false;
        }
        return true;
    }
    //check the necessary resources for unit
    public boolean isResourceAvailableForUnit (Unit unit, City city) {
        Warrior warrior = (Warrior) unit;
        ArrayList<Tile> tiles = city.getTiles();
        for (int i = 0; i < tiles.size(); i++) {
           Resource resource = tiles.get(i).getResource();

                if (warrior.isArcher()) return true;
                else if (warrior.isChariotArcher()) {
                    if (resource.isHorse()) return true;
                }
                else if (warrior.isScout()) return true;
                else if (warrior.isSpearman()) return true;
                else if (warrior.isWarrior()) return true;

                else if (warrior.isCatapult()) {
                    if (resource.isMetal()) return true;
                }
                else if (warrior.isHorseMan()) {
                    if (resource.isHorse()) return true;
                }
                else if (warrior.isSwordsMan()) {
                    if (resource.isMetal()) return true;
                }
                else if (warrior.isCrossbowMan()) return true;
                else if (warrior.isKnight()) {
                    if (resource.isHorse()) return true;
                }
                else if (warrior.isLongswordMan()) {
                    if (resource.isMetal()) return true;
                }
                else if (warrior.isPikeMan()) return true;
                else if (warrior.isTrebuchet()) {
                    if (resource.isMetal()) return true;
                }
                else if (warrior.isCanon()) return true;
                else if (warrior.isCavalry()) {
                    if (resource.isHorse()) return true;
                }
                else if (warrior.isLancer()) {
                    if (resource.isHorse()) return true;
                }
                else if (warrior.isMusketMan()) return true;
                else if (warrior.isRifleMan()) return true;
                else if (warrior.isAntiTankGun()) return true;
                else if (warrior.isArtillery()) return true;
                else if (warrior.isInfantry()) return true;
                else if (warrior.isPanzer()) return true;
                else if (warrior.isTank()) return true;
        }
        return false;
    }
    // if unit is a warrior return true
    public boolean isUnitWarrior (Tile cityCenter) {
        ArrayList<Unit> units = cityCenter.getUnits();
        for (int i = 0; i < units.size(); i++) {
            if (!units.get(i).isCivilian()) return true;
        }
        return false;
    }
    //if unit is a civilian return true
    public boolean isUnitCivilian (Tile cityCenter) {
        ArrayList<Unit> units = cityCenter.getUnits();
        for (int i = 0; i < units.size(); i++) {
            if (units.get(i).isCivilian()) return true;
        }
        return false;
    }
    // return a city that contains specific tile
    public City findTile (int index, ArrayList<Tile> map, Civilization civilization) {
        Tile tile = map.get(index);
        ArrayList<City> cities = civilization.getCities();
        for (int i = 0; i < cities.size(); i++) {
          ArrayList<Tile> tiles = cities.get(i).getTiles();
            for (int i1 = 0; i1 < tiles.size(); i1++) {
                if (tiles.get(i1).equals(tile)) {
                    return cities.get(i);
                }
            }
        }
        return null;
    }
    // it makes parameters for unit maker such as unit or city
    public String preUnitMaker (Matcher matcher, Civilization civilization, ArrayList<Tile> map) {
        matcher.find();
        String unitName = matcher.group("unitName").toLowerCase();
        int index = Integer.parseInt(matcher.group("number"));
        City city = findTile(index, map, civilization);
        Unit unit = makeUnit(civilization, city.getCenterTile(), map, unitName);
        int turn = unit.getDuration();
        return createUnit(civilization, city, unit, map, turn);
    }

    public Unit makeUnit (Civilization civilization, Tile tile, ArrayList<Tile> map, String unitName) {
        if (unitName.equals("archer")) {
           Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 1, 70, false
                   , 0, 4, 2, 6, false, false, true, false,
                   false, false, false, false, false, false, false,
                   false, false, false, false, false, false, false,
                   false, false, false, false, false);
          return warrior;
        }
        else if (unitName.equals("chariot archer")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 4, 4, 1, 60, false
                    , 0, 3, 2, 6, false, false, false, true,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("scout")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 1, 25, false
                    , 0, 4, -1, -1, true, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("settler")) {
            Civilian civilian = new Civilian(civilization, tile, 10, 2, 2, 1, 89, true, false, true);
           return civilian;
        }
        else if (unitName.equals("worker")) {
            Civilian civilian = new Civilian(civilization, tile, 10, 2, 2, 1, 70, true, true, false);
           return civilian;
        }
        else if (unitName.equals("spearman")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 1, 50, false
                    , 0, 7, -1, -1, false, false, false, false,
                    true, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("warrior")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 1, 40, false
                    , 0, 6, -1, -1, false, true, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("catapult")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 1, 100, false
                    , 0, 4, 2, 14, false, false, false, false,
                    false, true, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("horseman")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 4, 4, 1, 80, false
                    , 0, 12, -1, -1, false, false, false, false,
                    false, false, true, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("swordsman")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 2, 80, false
                    , 0, 11, -1, -1, false, false, false, false,
                    false, false, false, true, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("crossbowman")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 2, 120, false
                    , 0, 6, 2, 12, false, false, false, false,
                    false, false, false, false, true, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("knight")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 3, 3, 1, 150, false
                    , 0, 18, -1, -1, false, false, false, false,
                    false, false, false, false, false, true, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("longswordsman")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 3, 3, 3, 150, false
                    , 0, 18, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, true,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("pikeman")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 1, 100, false
                    , 0, 10, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    true, false, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("trebuchet")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 3, 170, false
                    , 0, 6, 2, 20, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, true, false, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("canon")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 2, 250, false
                    , 0, 10, 2, 26, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, true, false, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("cavalry")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 3, 3, 2, 260, false
                    , 0, 25, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, true, false, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("lancer")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 4, 4, 2, 220, false
                    , 0, 22, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, true, false, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("musketman")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 3, 120, false
                    , 0, 16, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, true, false,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("rifleman")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 4, 200, false
                    , 0, 25, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, true,
                    false, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("anti-tank gun")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 6, 300, false
                    , 0, 32, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    true, false, false, false, false);
           return warrior;
        }
        else if (unitName.equals("artillery")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 5, 420, false
                    , 0, 16, 32, 3, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, true, false, false, false);
           return warrior;
        }
        else if (unitName.equals("infantry")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 2, 2, 4, 300, false
                    , 0, 36, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, true, false, false);
           return warrior;
        }
        else if (unitName.equals("panzer")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 5, 5, 3, 450, false
                    , 0, 60, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, true, false);
           return warrior;
        }
        else if (unitName.equals("tank")) {
            Warrior warrior = new Warrior(civilization, tile, 10, 4, 4, 8, 450, false
                    , 0, 50, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, true);
           return warrior;
        }
           return null;
    }
    // every turn check city center for making new turn
    public void checkForUnitMaking (Civilization civilization) {
        ArrayList<City> cities = civilization.getCities();
        for (int i = 0; i < cities.size(); i++) {
            HashMap<Unit, Integer> units = cities.get(i).getCenterTile().getTurnForUnitMaking();
           for (Map.Entry<Unit, Integer> entry : units.entrySet()) {
               int turn = entry.getValue() - 1;
               if (turn == 0) {
                   cities.get(i).getCenterTile().addUnit(entry.getKey());
                   cities.get(i).getCenterTile().removeUnitFromMakingProgress(entry.getKey());
               }
               else {
                   cities.get(i).getCenterTile().setTurnForUnit(entry.getKey(), turn);
               }
           }
        }
    }

    public String createUnit(Civilization civilization, City city, Unit unit,ArrayList<Tile> map, int turn){
        String str;

        if (unit == null) {
            str = "this unit name doesn't exist!";
            return str;
        }

        if (city == null) {
            str = "this tile does not belong to your cities!";
            return str;
        }

        if (unit.getGoldCost() > city.getGold()) {
            str = "your gold is not enough!";
            return str;
        }

        if (!unit.isCivilian() && !isTechnologyAvailableForUnit (unit, civilization)) {
            str = "you don't have necessary technology!";
            return str;
        }

        if (!unit.isCivilian() && !isResourceAvailableForUnit (unit, city)) {
            str = "you don't have necessary resource!";
            return str;
        }

        Tile centerTile = city.getCenterTile();
        if (!unit.isCivilian() && isUnitWarrior (centerTile)) {
            str = "there is a military unit!";
            return str;
        }

        if (unit.isCivilian() && isUnitCivilian (centerTile)) {
            str = "there is a civilian unit!";
            return str;
        }

        centerTile.addUnitToMakingProgress(unit, turn);
        str = "unit will be created soon !";
        return str;
    }
    public String purchaseUnit(Civilization civilization, ArrayList<Tile> map, Matcher matcher){
        String unitName = matcher.group("unitName");
        int tileNumber = Integer.parseInt(matcher.group("tileNumber"));
        City city = this.findTile(tileNumber, map, civilization);
        Unit unit;
        if (unitName.equals("settler")) {
            Civilian civilian = new Civilian(civilization, city.getCenterTile(), 10, 2, 2, 1, 89, true, false, true);
            unit = civilian;
        }
        else if (unitName.equals("worker")) {
            Civilian civilian = new Civilian(civilization, city.getCenterTile(), 10, 2, 2, 1, 70, true, true, false);
            unit = civilian;
        }
        else if (unitName.equals("chariot archer")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 4, 4, 1, 60, false
                    , 0, 3, 2, 6, false, false, false, true,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit =  warrior;
        }
        else if (unitName.equals("archer")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 1, 70, false
                    , 0, 4, 2, 6, false, false, true, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit =  warrior;
        }
        else if (unitName.equals("scout")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 1, 25, false
                    , 0, 4, -1, -1, true, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit =  warrior;
        }
        else if (unitName.equals("catapult")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 1, 100, false
                    , 0, 4, 2, 14, false, false, false, false,
                    false, true, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("warrior")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 1, 40, false
                    , 0, 6, -1, -1, false, true, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("spearman")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 1, 50, false
                    , 0, 7, -1, -1, false, false, false, false,
                    true, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("horseman")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 4, 4, 1, 80, false
                    , 0, 12, -1, -1, false, false, false, false,
                    false, false, true, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("swordsman")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 2, 80, false
                    , 0, 11, -1, -1, false, false, false, false,
                    false, false, false, true, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("crossbowman")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 2, 120, false
                    , 0, 6, 2, 12, false, false, false, false,
                    false, false, false, false, true, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("knight")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 3, 3, 1, 150, false
                    , 0, 18, -1, -1, false, false, false, false,
                    false, false, false, false, false, true, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("longswordsman")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 3, 3, 3, 150, false
                    , 0, 18, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, true,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("pikeman")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 1, 100, false
                    , 0, 10, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    true, false, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("trebuchet")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 3, 170, false
                    , 0, 6, 2, 20, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, true, false, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("canon")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 2, 250, false
                    , 0, 10, 2, 26, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, true, false, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("cavalry")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 3, 3, 2, 260, false
                    , 0, 25, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, true, false, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("lancer")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 4, 4, 2, 220, false
                    , 0, 22, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, true, false, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("rifleman")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 4, 200, false
                    , 0, 25, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, true,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("anti-tank gun")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 6, 300, false
                    , 0, 32, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    true, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("infantry")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 4, 300, false
                    , 0, 36, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, true, false, false);
            unit = warrior;
        }
        else if (unitName.equals("musketman")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 3, 120, false
                    , 0, 16, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, true, false,
                    false, false, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("artillery")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 2, 2, 5, 420, false
                    , 0, 16, 32, 3, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, true, false, false, false);
            unit = warrior;
        }
        else if (unitName.equals("panzer")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 5, 5, 3, 450, false
                    , 0, 60, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, true, false);
            unit = warrior;
        }
        else if (unitName.equals("tank")) {
            Warrior warrior = new Warrior(civilization, city.getCenterTile(), 10, 4, 4, 8, 450, false
                    , 0, 50, -1, -1, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false,
                    false, false, false, false, true);
            unit = warrior;
        }
        else
            return "no unit with this name exists!";
        return this.createUnit(civilization, city, unit, map, 1);
    }
    public String preCreateCity(Matcher matcher, Civilization civilization, ArrayList<Tile> map, ArrayList<Civilization> civilizations){
        matcher.find();
        int tileNumber = Integer.parseInt(matcher.group("tile"));
        return createCity(civilization,tileNumber,map,civilizations);
    }
    public String createCity(Civilization civilization, int tileNumber,ArrayList<Tile> map, ArrayList<Civilization> civilizations){
        if(tileNumber < 0 || tileNumber >= 72)
            return "invalid tile number";

        for(City city : civilization.getCities()){
            for(Tile tile : city.getTiles()){
                if(tile.getTileNumber() == tileNumber){
                    for(Unit unit : tile.getUnits()){
                        if(unit.getCivilization() == civilization){
                            if(unit.isCivilian()){
                                Civilian civilian = (Civilian) unit;
                                if(civilian.isSettler()){
                                    if(checkNeighboursForCreateCity(tile,map,civilizations)){
                                        while(tile.getUnits().size() > 0) {
                                            tile.getUnits().remove(0);
                                        }
                                        City city1 = new City(tile,map);
                                        civilization.getCities().add(city1);
                                        return "city has been created successfully";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return "you can't create city here";
    }
    public boolean checkNeighboursForCreateCity(Tile tile, ArrayList<Tile> map, ArrayList<Civilization> civilizations){
        for(Tile tempTile : map){
            if(tempTile == tile){
                if(tile.getUnits().size() != 1)
                    return false;
            }
            if(areTilesNeighbour(tile,tempTile)){
                if(tempTile.getUnits().size() > 0)
                    return false;
                if(tempTile.getImprovements().size() > 0)
                    return false;
                if(tempTile.getRailRoads().size() > 0)
                    return false;
                if(tempTile.getRoads().size() > 0)
                    return false;
                if(doesTileBelongToAnyCivilization(tempTile,map,civilizations))
                    return false;
            }
        }
        return true;
    }
    public boolean areTilesNeighbour(Tile tile1, Tile tile2){
        float distance = (float)Math.sqrt(Math.pow(tile1.getX() - tile2.getX(), 2) + Math.pow(tile1.getY() - tile2.getY(), 2));
        if(distance <= tile1.getRadius() * Math.sqrt(3))
            return true;

        return false;
    }
    // return a warrior unit from specific tile
    public Unit getWarriorUnit (int index, ArrayList<Tile> map) {
        ArrayList<Unit> units = map.get(index).getUnits();
        for (int i = 0; i < units.size(); i++) {
            if (!units.get(i).isCivilian()) return units.get(i);
        }
        return null;
    }
    // get all indexes that are between attackers and defenders
    public void getAllIndexes(int originIndex, int destinationIndex, ArrayList<Integer> indexOfTiles) {
        if (originIndex < destinationIndex) {
            int delta = destinationIndex - originIndex;
            int growth = 0;
            if (delta == 1) {
                growth = 1;
                if (originIndex == 5 || originIndex == 16 || originIndex == 27 || originIndex == 38 ||
                        originIndex == 49 || originIndex == 60 || originIndex == 71) {
                    return;
                }
            }
            else  if (delta % 5 == 0) {
                growth = 5;
            }
            else if (delta % 6 == 0) {
                growth = 6;
            }
            for (int i = originIndex; i <= destinationIndex; i+=growth) {
                indexOfTiles.add(i);
            }
        }
        else {
            int delta = originIndex - destinationIndex;
            int growth = 0;
            if (delta == 1) {
                growth = 1;
                if (originIndex == 0 || originIndex == 11 || originIndex == 22 || originIndex == 33 ||
                        originIndex == 44 || originIndex == 55 || originIndex == 66) {
                    return;
                }
            }
            else  if (delta % 5 == 0) {
                growth = 5;
            }
            else if (delta % 6 == 0) {
                growth = 6;
            }
            for (int i = originIndex; i <= destinationIndex; i-=growth) {
                indexOfTiles.add(i);
            }
        }
    }
    // if blockers block attackers vision return true
    public boolean checkTheBlocks (ArrayList<Tile> map, ArrayList<Integer> indexOfTiles) {
        for (int i = 1; i < indexOfTiles.size() - 1; i++) {
            if (map.get(indexOfTiles.get(i)).isOcean() || map.get(indexOfTiles.get(i)).isMountain() ||
                    map.get(indexOfTiles.get(i)).isHill()) return true;
        }
        return false;
    }
    // is attacker range enough for distance ?
    public boolean isRangeEnough(Warrior warrior, ArrayList<Integer> indexOfTiles) {
        int distance = indexOfTiles.size() - 1;
        if (warrior.getRange() == -1 && distance > 1) return false;
        if (warrior.getRange() != -1 && distance > warrior.getRange()) return false;
        return true;
    }
    // return civilian unit from specific tile
    public Unit getCivilianUnit (int index, ArrayList<Tile> map) {
        ArrayList<Unit> units = map.get(index).getUnits();
        for (int i = 0; i < units.size(); i++) {
            if (units.get(i).isCivilian()) return units.get(i);
        }
        return null;
    }
    // remove a civilization from friends list
    public void addToEnemy (Civilization civilization, Civilization enemy) {
       ArrayList<Civilization> friends = civilization.getFriends();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).equals(enemy)) {
                civilization.removeFriend (enemy);
                enemy.removeFriend (civilization);
                break;
            }
        }
    }
    // if civilization2 is friend return true
    public boolean isFriend(Civilization civilization1, Civilization civilization2) {
        ArrayList<Civilization> friends = civilization1.getFriends();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).equals(civilization2)) return true;
        }
        return false;
    }
    // prepare some parameters and return some string
    public String preAttackTile (Matcher matcher, Civilization civilization, ArrayList<Tile> map) {
        int originIndex = Integer.parseInt(matcher.group("origin"));
        int destinationIndex = Integer.parseInt(matcher.group("destination"));

        Unit attacker = getWarriorUnit(originIndex, map);
        Unit defender = getWarriorUnit(destinationIndex, map);

        if (attacker == null) {
            return "your unit is not military !";
        }
        if (!attacker.getCivilization().equals(civilization)) {
            return "this is not your unit !";
        }
        if (defender.getCivilization().equals(civilization)) {
            return "you can't attack your own unit !";
        }
        if (attacker.getIsOnSleep()) {
            return "this unit is not awake !";
        }
        if (((Warrior)attacker).getRange() != -1) {
            return "this unit is not set up for range attack !";
        }
        ArrayList<Integer> indexOfTiles = new ArrayList<>();
        getAllIndexes(originIndex,destinationIndex,indexOfTiles);
        if (indexOfTiles.size() == 0) {
            return "this distance is too long for attack !";
        }
        if (!isRangeEnough((Warrior)attacker, indexOfTiles)) {
            return "unit 's range is not enough !";
        }
        if (checkTheBlocks(map,indexOfTiles)) {
            return "your unit vision is blocked !";
        }
        if (isFriend(civilization, defender.getCivilization())) {
            addToEnemy(civilization, defender.getCivilization());
        }
        attacker.setHasOrdered(true);
        if (defender == null) {
            defender = getCivilianUnit(destinationIndex, map);
            if (defender == null) return "there is no unit on destination !";

            defender.setCivilization(civilization);
            if (((Warrior)attacker).getRange() == -1)
            attacker.setOrigin(map.get(destinationIndex));
        }
        if (((Warrior)attacker).getRange() == -1)
           return attackTileFromGround(civilization, attacker, defender, originIndex, destinationIndex, map);
        else
           return attackTileFromAir(civilization, attacker, defender, originIndex, destinationIndex, map);
    }
    public City getCityFromTile (Tile tile, ArrayList<Tile> map, ArrayList<Civilization> civilizations) {
        for (Civilization civilization : civilizations) {
            for (City city : civilization.getCities()) {
                for (Tile tile1 : city.getTiles()) {
                    if (tile1.equals(tile)) return city;
                }
            }
        }
        return null;
    }

    public boolean isCityForCivilization (City city, Civilization civilization) {
        for (City city1 : civilization.getCities()) {
            if (city.equals(city1)) return true;
        }
        return false;
    }

    public Civilization getCivilizationFromCity(City city, ArrayList<Civilization> civilizations) {
        for (Civilization civilization : civilizations) {
            for (City city1 : civilization.getCities()) {
                if (city.equals(city1)) return civilization;
            }
        }
        return null;
    }

    public String preAttackCity (Matcher matcher, Civilization civilization, ArrayList<Tile> map, ArrayList<Civilization> civilizations) {
        int originIndex = Integer.parseInt(matcher.group("origin"));
        int destinationIndex = Integer.parseInt(matcher.group("destination"));

        Unit attacker = getWarriorUnit(originIndex, map);
        City defenderCity = getCityFromTile (map.get(destinationIndex), map, civilizations);

        if (attacker == null) {
            return "your unit is not military !";
        }
        if (!attacker.getCivilization().equals(civilization)) {
            return "this is not your unit !";
        }
        if (defenderCity == null) {
            return "this tile is not for any city !";
        }
        if (isCityForCivilization (defenderCity, civilization)) {
            return "this city is for your civilization !";
        }
        if (attacker.getIsOnSleep()) {
            return "this unit is not awake !";
        }
        if (((Warrior)attacker).getRange() != -1) {
            return "this unit is not set up for range attack !";
        }
        ArrayList<Integer> indexOfTiles = new ArrayList<>();
        getAllIndexes(originIndex,destinationIndex,indexOfTiles);
        if (indexOfTiles.size() == 0) {
            return "this distance is too long for attack !";
        }
        if (!isRangeEnough((Warrior)attacker, indexOfTiles)) {
            return "unit 's range is not enough !";
        }
        if (checkTheBlocks(map,indexOfTiles)) {
            return "your unit vision is blocked !";
        }
        Civilization defenderCivilization = getCivilizationFromCity(defenderCity, civilizations);
        attacker.setHasOrdered(true);

        if (((Warrior)attacker).getRange() == -1)
            return attackCityFromGround(civilization, attacker, defenderCity, originIndex, map, defenderCivilization);
        else
            return attackCityFromAir(civilization, attacker, defenderCity, originIndex, map, defenderCivilization);
    }
    public String attackCityFromGround(Civilization civilization,Unit attacker, City defenderCity, int originIndex, ArrayList<Tile>map, Civilization defenderCivilization) {
        String str = "";
        int powerOfAttacker = ((Warrior)attacker).getDamage();
        int healthOfAttacker = ((Warrior)attacker).getHealth();
        powerOfAttacker = powerOfAttacker * healthOfAttacker / 10;
        if (civilization.getHappiness() < 0) {
            powerOfAttacker = powerOfAttacker - powerOfAttacker / 4;
        }
        int powerOfDefender = defenderCity.getDefenceStrength();
        int healthOfDefender = defenderCity.getDamagePoint();

        healthOfAttacker = healthOfAttacker - powerOfDefender;
        healthOfDefender = healthOfDefender - powerOfAttacker;

        if (healthOfDefender <= 0 && healthOfAttacker > 0) {
            for (Tile tile : defenderCity.getTiles()) {
                ArrayList<Unit> units = tile.getUnits();
                for (int i = 0; i < units.size(); i++) {
                    Unit temp = units.get(i);
                    temp = null;
                    units.remove(i);
                }
                tile.removeAllUnitFromMakingProgress();
            }
            defenderCivilization.removeCity(defenderCity);
            civilization.addCity(defenderCity);
            defenderCity.setDamagePoint(20);
            attacker.setHealth(healthOfAttacker);
            map.get(originIndex).removeUnit(attacker);
            defenderCity.getCenterTile().addUnit(attacker);
            str = "your unit conquer the city !";
        }
        else if (healthOfDefender > 0 && healthOfAttacker <= 0) {
            defenderCity.setDamagePoint(healthOfDefender);
            map.get(originIndex).removeUnit(attacker);
            attacker = null;
            str = "your unit died !";
        }
       else if (healthOfAttacker <= 0 && healthOfDefender <= 0) {
            for (Tile tile : defenderCity.getTiles()) {
                ArrayList<Unit> units = tile.getUnits();
                for (int i = 0; i < units.size(); i++) {
                    Unit temp = units.get(i);
                    temp = null;
                    units.remove(i);
                }
                tile.removeAllUnitFromMakingProgress();
            }
            defenderCity.setDamagePoint(0);
            map.get(originIndex).removeUnit(attacker);
            attacker = null;
            str = "your unit died and the city became ruin !";
        }
       else if (healthOfAttacker > 0 && healthOfDefender > 0) {
            defenderCity.setDamagePoint(healthOfDefender);
            attacker.setHealth(healthOfAttacker);
            str = "the war is not over !";
        }
       return str;
    }
    public String attackCityFromAir(Civilization civilization,Unit attacker, City defenderCity, int originIndex, ArrayList<Tile>map, Civilization defenderCivilization) {
        String str = "";
        int powerOfAttacker = ((Warrior)attacker).getDamage();
        int healthOfAttacker = ((Warrior)attacker).getHealth();
        powerOfAttacker = powerOfAttacker * healthOfAttacker / 10;
        if (civilization.getHappiness() < 0) {
            powerOfAttacker = powerOfAttacker - powerOfAttacker / 4;
        }
        int powerOfDefender = defenderCity.getDefenceStrength();
        int healthOfDefender = defenderCity.getDamagePoint();

        healthOfAttacker = healthOfAttacker - powerOfDefender;
        healthOfDefender = healthOfDefender - powerOfAttacker;

        if (healthOfDefender <= 0 && healthOfAttacker > 0) {
            defenderCity.setDamagePoint(1);
            attacker.setHealth(healthOfAttacker);
            str = "city damage point is 1 !";
        }
        else if (healthOfDefender > 0 && healthOfAttacker <= 0) {
            defenderCity.setDamagePoint(healthOfDefender);
            map.get(originIndex).removeUnit(attacker);
            attacker = null;
            str = "your unit died !";
        }
        else if (healthOfAttacker <= 0 && healthOfDefender <= 0) {
            defenderCity.setDamagePoint(1);
            map.get(originIndex).removeUnit(attacker);
            attacker = null;
            str = "your unit died and the city damage point is 1 !";
        }
        else if (healthOfAttacker > 0 && healthOfDefender > 0) {
            defenderCity.setDamagePoint(healthOfDefender);
            attacker.setHealth(healthOfAttacker);
            str = "the war is not over !";
        }
        return str;
    }

    public String attackTileFromGround(Civilization civilization, Unit attacker, Unit defender, int originIndex, int destinationIndex,ArrayList<Tile> map){
        String str = "";
        int combatChange = map.get(destinationIndex).getCombatChange() + map.get(destinationIndex).getAttribute().getCombatChange();
        int powerOfAttacker = ((Warrior)attacker).getDamage();
        int healthOfAttacker = ((Warrior)attacker).getHealth();
        powerOfAttacker = powerOfAttacker * healthOfAttacker / 10;
        if (civilization.getHappiness() < 0) {
            powerOfAttacker = powerOfAttacker - powerOfAttacker / 4;
        }
        int powerOfDefender = ((Warrior)defender).getDamage();
        int healthOfDefender = ((Warrior)defender).getHealth();
        powerOfDefender = powerOfDefender * healthOfDefender / 10;
        powerOfDefender = powerOfDefender + powerOfDefender * combatChange / 100;
        if (defender.getCivilization().getHappiness() < 0) {
            powerOfDefender = powerOfDefender - powerOfDefender / 4;
        }

        healthOfAttacker = healthOfAttacker - powerOfDefender;
        healthOfDefender = healthOfDefender - powerOfAttacker;

        attacker.setHealth(healthOfAttacker);
        defender.setHealth(healthOfDefender);

        if (healthOfDefender <= 0 && healthOfAttacker > 0) {
                attacker.setOrigin(map.get(destinationIndex));
                attacker.setMp(0);
                int count1 = civilization.getCountOfWins(defender.getCivilization());
                count1 ++;
                int count2 = defender.getCivilization().getCountOfLosses(civilization);
                count2 ++;
                civilization.updateCountOfUnitWin(defender.getCivilization(), count1);
                defender.getCivilization().updateCountOfUnitLose(civilization, count2);
                int xp = ((Warrior) attacker).getXp();
                xp ++;
                ((Warrior) attacker).setXp(xp);
                str = "you won this attack !";
                defender = null;
        }
        if (healthOfDefender > 0 && healthOfAttacker <= 0) {
                defender.setOrigin(map.get(originIndex));
                defender.setMp(0);
                int count1 = civilization.getCountOfLosses(defender.getCivilization());
                count1 ++;
                int count2 = defender.getCivilization().getCountOfWins(civilization);
                count2 ++;
                civilization.updateCountOfUnitLose(defender.getCivilization(), count1);
                defender.getCivilization().updateCountOfUnitWin(civilization, count2);
                int xp = ((Warrior) defender).getXp();
                 xp ++;
                ((Warrior) defender).setXp(xp);
                str = "you lost this attack !";
                attacker = null;
        }
        if (healthOfAttacker <= 0 && healthOfDefender <= 0) {
            attacker = null;
            defender = null;
            str = "your unit died !";
        }
        if (healthOfAttacker > 0 && healthOfDefender > 0) {
            int xp1 = ((Warrior) attacker).getXp();
            xp1 ++;
            ((Warrior) attacker).setXp(xp1);
            int xp2 = ((Warrior) defender).getXp();
            xp2 ++;
            ((Warrior) defender).setXp(xp2);
            str = "nobody died !";
        }
        return str;
    }
    public String attackTileFromAir(Civilization civilization, Unit attacker, Unit defender, int originIndex, int destinationIndex,ArrayList<Tile> map){
        String str;

        int powerOfAttacker = ((Warrior)attacker).getRangedCombatDamage();
        int healthOfAttacker = ((Warrior)attacker).getHealth();
        powerOfAttacker = powerOfAttacker * healthOfAttacker / 10;
        if (civilization.getHappiness() < 0) {
            powerOfAttacker = powerOfAttacker - powerOfAttacker / 4;
        }

        int healthOfDefender = ((Warrior)defender).getHealth();

        healthOfDefender = healthOfDefender - powerOfAttacker;
        defender.setHealth(healthOfDefender);
        if (healthOfDefender <= 0) {
            int xp1 = ((Warrior) attacker).getXp();
            xp1 ++;
            ((Warrior) attacker).setXp(xp1);
            int count1 = civilization.getCountOfWins(defender.getCivilization());
            count1 ++;
            int count2 = defender.getCivilization().getCountOfLosses(civilization);
            count2 ++;
            civilization.updateCountOfUnitWin(defender.getCivilization(), count1);
            defender.getCivilization().updateCountOfUnitLose(civilization, count2);
            str = "you won the attack !";
            defender = null;
        }
        else {
            int xp1 = ((Warrior) attacker).getXp();
            xp1 ++;
            ((Warrior) attacker).setXp(xp1);
            int xp2 = ((Warrior) defender).getXp();
            xp2 ++;
            ((Warrior) defender).setXp(xp2);
            str = "nobody died !";
        }
        return str;
    }
    // makes parameters for unit behaviours functions
    public String preUnitBehaviour (Matcher matcher, Civilization civilization, ArrayList<Tile> map, String command) {
        String unitName = matcher.group("unitName");
        int index = Integer.parseInt(matcher.group("number"));
        Tile tile = map.get(index);
        ArrayList<Unit> units = tile.getUnits();
        Unit unit = getUnitInTile(units, unitName);

        if (command.equals("sleep")) {
          return  sleepUnit(civilization, unit, map);
        }
        else if (command.equals("alert")) {
            return WarFootingUnit(civilization, unit, map);
        }
        else if (command.equals("fortify")) {
            return boostUnit(civilization, unit, map);
        }
        else if (command.equals("heal")) {
            return boostTillRecoverUnit(civilization, unit, map);
        }
        else if (command.equals("deploy")) {
            return deploymentUnit(civilization, unit, map);
        }
        else if (command.equals("range")) {
            return readyForRangedBattleUnit(civilization, unit, map);
        }
        else if (command.equals("wake")) {
            return wakeUpUnit(civilization, unit, map);
        }
        else if (command.equals("delete")) {
            return deleteUnit(civilization, unit, map, tile);
        }
        else if (command.equals("recover")) {
            return recoverUnit(civilization, unit, map, tile);
        }
        return "";
    }

    // sleepUnit, .... civilization baraye playeri hast ke alan dare dastor mide
    //TODO ... bayad function marboot be darkhast amaliat va royat doshman dar atraf baraye behavior ha piyade shavad
    public String sleepUnit(Civilization civilization, Unit unit, ArrayList<Tile> map){
        String str;

        if (unit == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }

        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }

        unit.setOnSleep(true);
        str = "selected unit is sleeping";
        return str;
    }
    public String WarFootingUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;
        if (unit == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }

        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        if (unit.isCivilian()) {
            str = "this unit isn't trooper !";
            return str;
        }

        unit.setOnWarFooting(true);
        str = "this unit is on standby !";
        return str;
    }
    public String boostUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;

        if (unit == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }

        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        if (unit.isCivilian()) {
            str = "this unit isn't trooper !";
            return str;
        }

        Warrior warrior = (Warrior) unit;
        int newDamage = warrior.getDamage() + 1;
        warrior.setDamage(newDamage);
        warrior.setOnBoost(true);
        str = "booster has been activated for this unit !";
        return str;
    }
    public String boostTillRecoverUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;
        if (unit == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }

        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        if (unit.isCivilian()) {
            str = "this unit isn't trooper !";
            return str;
        }

        Warrior warrior = (Warrior) unit;
        int newHealth = warrior.getHealth() + 1;
        warrior.setHealth(newHealth);
        warrior.setOnBoostTillRecover(true);
        str = "booster until full recovery has been activated for this unit !";
        return str;
    }

    //if unit tile is city center (tile) return true
    public boolean isTileCityCenter (Civilization civilization, Unit unit) {
        ArrayList<City> cities = civilization.getCities();
        Tile tile = unit.getOrigin();
        for (int i = 0; i < cities.size(); i++) {
            if (tile.equals(cities.get(i).getCenterTile())) return true;
        }
        return false;
    }
    public String deploymentUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;
        if (unit == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }

        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        if (unit.isCivilian()) {
            str = "this unit isn't trooper !";
            return str;
        }
        if (!isTileCityCenter(civilization, unit)) {
            str = "this unit isn't in the city !";
            return str;
        }

        unit.setOnDeployment(true);
        str = "the unit is deployed in city !";
        return str;
    }
    public String readyForRangedBattleUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;
        if (unit == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        if (unit.isCivilian()) {
            str = "this unit isn't trooper !";
            return str;
        }
        ((Warrior)unit).setReadyForRangedBattle(true);
        str = "the unit is ready for ranged battle !";
        return str;
    }
    public String lootTile(Civilization civilization, int tileNumber, int destinationTileNumber, ArrayList<Tile> map){
        ArrayList<Unit> allUnits = map.get(tileNumber).getUnits();
        if (allUnits.size() == 0)
            return "there is no unit in this tile";
        boolean isThereAnyRelatedUnit = false;
        for (Unit unit : allUnits)
            if (unit.getCivilization() == civilization) {
                isThereAnyRelatedUnit = true;
                break;
            }
        if (!isThereAnyRelatedUnit)
            return "units in this tile doesn't belong to you";
        Unit lootUnit = null;
        for (Unit unit : allUnits)
            if (!unit.isCivilian()) {
                lootUnit = unit;
                break;
            }
        if (lootUnit == null)
            return "only warriors can loot a tile";
        Tile tile = map.get(destinationTileNumber);
        moveUnit(civilization, map.get(tileNumber), tile, map, lootUnit);
        tile.Loot();
        return "tile has been looted successfully";
    }
    public String cancelCommand(Civilization civilization, boolean isCivilian,ArrayList<Tile> map, Tile tile){
        String str;
        Unit unit = tile.getUnitInUnitMakingProgress(isCivilian);
        if (unit == null) {
            str = "this type of unit is not on unit making progress !";
            return str;
        }
        tile.removeUnitFromMakingProgress(unit);
        str = "unit making has been canceled !";
        return str;
    }
    public String wakeUpUnit(Civilization civilization, Unit unit,ArrayList<Tile> map){
        String str;
        if (unit == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }

        unit.setOnSleep(false);
        str = "selected unit is awake";
        return str;
    }
    public String deleteUnit(Civilization civilization, Unit unit,ArrayList<Tile> map, Tile tile){
        String str;
        if (unit == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        tile.removeUnit(unit);
        str = "the unit deleted successfully !";
        return str;
    }

    public boolean tileIsForCity (Civilization civilization, Tile tile) {
        ArrayList<City> cities = civilization.getCities();
        for (int i = 0; i < cities.size(); i++) {
            ArrayList<Tile> tiles = cities.get(i).getTiles();
            for (int i1 = 0; i1 < tiles.size(); i1++) {
                if (tiles.get(i1).equals(tile)) return true;
            }
        }
        return false;
    }
    public String recoverUnit(Civilization civilization, Unit unit,ArrayList<Tile> map, Tile tile){
        String str;
        if (unit == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        if (unit.getHealth() == 10) {
            str = "this unit is fully healthy !";
            return str;
        }
        //TODO ... agar dar navahi dostane bashad 2 afzayesh joon darad
        int health = unit.getHealth();
        if (tileIsForCity(civilization, tile)) {
            health += 3;
            if (health > 10) health = 10;
        }
        else {
            health += 1;
            if (health > 10) health = 10;
        }
        unit.setHealth(health);
        str = "unit health increased !";
        return str;
    }
    public String preLockCitizen(Matcher matcher,Civilization civilization, ArrayList<Tile> map){
        matcher.find();
        int originTileNumber = Integer.parseInt(matcher.group("origin"));
        int destinationTileNumber = Integer.parseInt(matcher.group("destination"));
        if(originTileNumber >= 72 || originTileNumber < 0 || destinationTileNumber >= 72 || destinationTileNumber < 0)
            return "invalid number";
        if(originTileNumber == destinationTileNumber)
            return "numbers are equal";

        Tile origin = map.get(originTileNumber);
        Tile destination = map.get(destinationTileNumber);
        return lockCitizen(civilization,origin,destination,map);
    }
    public String lockCitizen(Civilization civilization, Tile origin, Tile destination,ArrayList<Tile> map){//move citizen from origin to destination
        for(City city : civilization.getCities()){
            for(Tile tile1 : city.getTiles()){
                if(tile1 == origin){
                    for(Tile tile2 : city.getTiles()){
                        if(tile2 == destination){
                            if(tile2.getCitizen() == null){
                                if(tile1.getCitizen() != null){
                                    tile2.setCitizen(tile1.getCitizen());
                                    tile1.setCitizen(null);
                                    return "citizen has been locked successfully";
                                }
                                return "origin tile doesn't have any citizen !";
                            }
                            return "destination tile already has a citizen !";
                        }
                    }
                    return "tiles do not belong to one city !";
                }
            }
        }
        return "tiles do not belong to your civilization !";
    }
    public String prePurchaseTile(Matcher matcher, Civilization civilization, ArrayList<Tile> map,ArrayList<Civilization> civilizations){
        matcher.find();
        int tileNumber = Integer.parseInt(matcher.group("tile"));
        if(tileNumber < 0 || tileNumber >= 72)
            return "invalid number";

        Tile tile = map.get(tileNumber);
        return purchaseTile(civilization,tile,map,civilizations);
    }
    public String purchaseTile(Civilization civilization, Tile tile,ArrayList<Tile> map, ArrayList<Civilization> civilizations){
        for(City city : civilization.getCities()){
            for(Tile tempTile : city.getTiles()){
                if(areTilesNeighbour(tile,tempTile)){
                    if(tile == tempTile)
                        return "this tile is already yours";
                    if(!doesTileBelongToAnyCivilization(tile,map,civilizations)){
                        if(tile.getUnits().size() == 0 && tile.getImprovements().size() == 0){
                            if(civilization.getGold() >= 50){
                                civilization.addGold(-50);
                                city.getTiles().add(tile);
                                return "purchase tile was successful";
                            }
                            return "you don't have enough gold";
                        }
                    }
                    return "you can't purchase this tile";
                }
            }
        }
        return "this tile isn't neighbour with any of your cities";
    }
    public boolean doesTileBelongToAnyCivilization(Tile tile, ArrayList<Tile> map, ArrayList<Civilization> civilizations){
        for(Civilization civilization : civilizations){
            for(City city : civilization.getCities()){
                for(Tile tempTile : city.getTiles()){
                    if(tile == tempTile)
                        return true;//it belongs
                }
            }
        }
        return false;//it doesn't
    }
    public StringBuilder showProductionsInProcess(Civilization civilization,ArrayList<Tile> map){
        StringBuilder stringBuilder;

        return stringBuilder;
    }
    public StringBuilder showTechnologyMenu(Civilization civilization){
        ArrayList<Technology> allTechnologies = civilization.getTechnologies();
        ArrayList<String> technologyNames = new ArrayList<>();
        technologyNames.add("Agriculture");
        technologyNames.add("AnimalHusbandry");
        technologyNames.add("Archery");
        technologyNames.add("BronzeWorking");
        technologyNames.add("Calendar");
        technologyNames.add("Masonry");
        technologyNames.add("Mining");
        technologyNames.add("Pottery");
        technologyNames.add("TheWheel");
        technologyNames.add("Trapping");
        technologyNames.add("Writing");
        technologyNames.add("Construction");
        technologyNames.add("HorsebackRiding");
        technologyNames.add("IronWorking");
        technologyNames.add("Mathematics");
        technologyNames.add("Philosophy");
        technologyNames.add("Chivalry");
        technologyNames.add("CivilService");
        technologyNames.add("Currency");
        technologyNames.add("Education");
        technologyNames.add("Engineering");
        technologyNames.add("Machinery");
        technologyNames.add("MetalCasting");
        technologyNames.add("Physics");
        technologyNames.add("Steel");
        technologyNames.add("Theology");
        technologyNames.add("Acoustics");
        technologyNames.add("Archaeology");
        technologyNames.add("Banking");
        technologyNames.add("Chemistry");
        technologyNames.add("Economics");
        technologyNames.add("Fertilizer");
        technologyNames.add("Gunpowder");
        technologyNames.add("Metallurgy");
        technologyNames.add("MilitaryScience");
        technologyNames.add("PrintingPress");
        technologyNames.add("Rifling");
        technologyNames.add("ScientificTheory");
        technologyNames.add("Biology");
        technologyNames.add("Combustion");
        technologyNames.add("Dynamite");
        technologyNames.add("Electricity");
        technologyNames.add("Radio");
        technologyNames.add("Railroad");
        technologyNames.add("ReplaceableParts");
        technologyNames.add("Parts");
        technologyNames.add("SteamPower");
        technologyNames.add("Telegraph");
        ArrayList<String> possibleTechnologies = new ArrayList<>();
        for (int i = 0; i < technologyNames.size(); i++)
            if (hasPrerequisiteTechs(allTechnologies, technologyNames.get(i)))
                possibleTechnologies.add(technologyNames.get(i));
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Technology, Integer> technologyEarnedPercent = civilization.getTechnologyEarnedPercent();
        stringBuilder.append("technologies that you haven't been learnt completely:\n");
        if (technologyEarnedPercent.size() == 0)
            stringBuilder.append("nothing\n");
        else {
            for (Map.Entry<Technology, Integer> technology : technologyEarnedPercent.entrySet()) {
                stringBuilder.append(technology.getKey().getName() + "\trounds left: " + technology.getValue().toString() + "\n");
            }
        }
        stringBuilder.append("technologies that you have its prerequisite techs:\n");
        if (possibleTechnologies.size() == 0){
            stringBuilder.append("nothing\n");
            return stringBuilder;
        }
        for (int i = 0; i < possibleTechnologies.size(); i++)
            stringBuilder.append(possibleTechnologies.get(i) + "\n");
        return stringBuilder;
    }
    public Technology preChooseTechnologyToLearn(String name){
        if (name.equals("Agriculture")) {
            Technology technology = new Technology(true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("AnimalHusbandry")) {
            Technology technology = new Technology(false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Archery")) {
            Technology technology = new Technology(false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("BronzeWorking")) {
            Technology technology = new Technology(false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Calendar")) {
            Technology technology = new Technology(false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Masonry")) {
            Technology technology = new Technology(false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Mining")) {
            Technology technology = new Technology(false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Pottery")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("TheWheel")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Trapping")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Writing")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Construction")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("HorsebackRiding")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("IronWorking")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Mathematics")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Philosophy")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Chivalry")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("CivilService")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Currency")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Education")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Engineering")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Machinery")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("MetalCasting")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Physics")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Steel")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Theology")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Acoustics")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Archaeology")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Banking")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Chemistry")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Economics")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Fertilizer")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Gunpowder")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Metallurgy")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("MilitaryScience")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("PrintingPress")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Rifling")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("ScientificTheory")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Biology")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Combustion")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Dynamite")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Electricity")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Radio")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false);
            return technology;
        }
        else if (name.equals("Railroad")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false);
            return technology;
        }
        else if (name.equals("ReplaceableParts")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false);
            return technology;
        }
        else if (name.equals("SteamPower")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false);
            return technology;
        }
        else if (name.equals("Telegraph")) {
            Technology technology = new Technology(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true);
            return technology;
        }
        return null;
    }
    public boolean hasPrerequisiteTechs(ArrayList<Technology> allTechnologies, String name){
        if (name.equals("Agriculture"))
            return true;
        else if (name.equals("AnimalHusbandry")) {
            for (Technology technology : allTechnologies)
                if (technology.isAgriculture())
                    return true;
            return false;
        }
        else if (name.equals("Archery")) {
            for (Technology technology : allTechnologies)
                if (technology.isAgriculture())
                    return true;
            return false;
        }
        else if (name.equals("BronzeWorking")) {
            for (Technology technology : allTechnologies)
                if (technology.isMining())
                    return true;
            return false;
        }
        else if (name.equals("Calendar")) {
            for (Technology technology : allTechnologies)
                if (technology.isPottery())
                    return true;
            return false;
        }
        else if (name.equals("Masonry")) {
            for (Technology technology : allTechnologies)
                if (technology.isMining())
                    return true;
            return false;
        }
        else if (name.equals("Mining")) {
            for (Technology technology : allTechnologies)
                if (technology.isAgriculture())
                    return true;
            return false;
        }
        else if (name.equals("Pottery")) {
            for (Technology technology : allTechnologies)
                if (technology.isAgriculture())
                    return true;
            return false;
        }
        else if (name.equals("TheWheel")) {
            for (Technology technology : allTechnologies)
                if (technology.isAnimalHusbandry())
                    return true;
            return false;
        }
        else if (name.equals("Trapping")) {
            for (Technology technology : allTechnologies)
                if (technology.isAnimalHusbandry())
                    return true;
            return false;
        }
        else if (name.equals("Writing")) {
            for (Technology technology : allTechnologies)
                if (technology.isPottery())
                    return true;
            return false;
        }
        else if (name.equals("Construction")) {
            for (Technology technology : allTechnologies)
                if (technology.isMasonry())
                    return true;
            return false;
        }
        else if (name.equals("HorsebackRiding")) {
            for (Technology technology : allTechnologies)
                if (technology.isTheWheel())
                    return true;
            return false;
        }
        else if (name.equals("IronWorking")) {
            for (Technology technology : allTechnologies)
                if (technology.isBronzeWorking())
                    return true;
            return false;
        }
        else if (name.equals("Mathematics")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isTheWheel()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isArchery()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Philosophy")) {
            for (Technology technology : allTechnologies)
                if (technology.isWriting())
                    return true;
            return false;
        }
        else if (name.equals("Chivalry")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isCivilService()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isHorsebackRiding()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isCurrency()) {
                    x++;
                    break;
                }
            if (x == 3)
                return true;
            return false;
        }
        else if (name.equals("CivilService")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isPhilosophy()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isTrapping()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Currency")) {
            for (Technology technology : allTechnologies)
                if (technology.isMathematics())
                    return true;
            return false;
        }
        else if (name.equals("Education")) {
            for (Technology technology : allTechnologies)
                if (technology.isTheology())
                    return true;
            return false;
        }
        else if (name.equals("Engineering")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isMathematics()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isConstruction()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Machinery")) {
            for (Technology technology : allTechnologies)
                if (technology.isEngineering())
                    return true;
            return false;
        }
        else if (name.equals("MetalCasting")) {
            for (Technology technology : allTechnologies)
                if (technology.isIronWorking())
                    return true;
            return false;
        }
        else if (name.equals("Physics")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isEngineering()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isMetalCasting()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Steel")) {
            for (Technology technology : allTechnologies)
                if (technology.isMetalCasting())
                    return true;
            return false;
        }
        else if (name.equals("Theology")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isCalendar()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isPhilosophy()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Acoustics")) {
            for (Technology technology : allTechnologies)
                if (technology.isEducation())
                    return true;
            return false;
        }
        else if (name.equals("Archaeology")) {
            for (Technology technology : allTechnologies)
                if (technology.isAcoustics())
                    return true;
            return false;
        }
        else if (name.equals("Banking")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isEducation()){
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isChivalry()){
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Chemistry")) {
            for (Technology technology : allTechnologies)
                if (technology.isGunpowder())
                    return true;
            return false;
        }
        else if (name.equals("Economics")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isBanking()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isPrintingPress()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Fertilizer")) {
            for (Technology technology : allTechnologies)
                if (technology.isChemistry())
                    return true;
            return false;
        }
        else if (name.equals("Gunpowder")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isPhysics()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isSteel()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Metallurgy")) {
            for (Technology technology : allTechnologies)
                if (technology.isGunpowder())
                    return true;
            return false;
        }
        else if (name.equals("MilitaryScience")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isEconomics()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isChemistry()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("PrintingPress")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isMachinery()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isPhysics()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Rifling")) {
            for (Technology technology : allTechnologies)
                if (technology.isMetallurgy())
                    return true;
            return false;
        }
        else if (name.equals("ScientificTheory")) {
            for (Technology technology : allTechnologies)
                if (technology.isAcoustics())
                    return true;
            return false;
        }
        else if (name.equals("Biology")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isArchaeology()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isScientificTheory()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Combustion")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isReplaceableParts()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isRailroad()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isDynamite()) {
                    x++;
                    break;
                }
            if (x == 3)
                return true;
            return false;
        }
        else if (name.equals("Dynamite")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isFertilizer()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isRifling()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Electricity")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isBiology()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isSteamPower()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Radio")) {
            for (Technology technology : allTechnologies)
                if (technology.isElectricity())
                    return true;
            return false;
        }
        else if (name.equals("Railroad")) {
            for (Technology technology : allTechnologies)
                if (technology.isSteamPower())
                    return true;
            return false;
        }
        else if (name.equals("ReplaceableParts")) {
            for (Technology technology : allTechnologies)
                if (technology.isSteamPower())
                    return true;
            return false;
        }
        else if (name.equals("SteamPower")) {
            int x = 0;
            for (Technology technology : allTechnologies)
                if (technology.isScientificTheory()) {
                    x++;
                    break;
                }
            for (Technology technology : allTechnologies)
                if (technology.isMilitaryScience()) {
                    x++;
                    break;
                }
            if (x == 2)
                return true;
            return false;
        }
        else if (name.equals("Telegraph")) {
            for (Technology technology : allTechnologies)
                if (technology.isElectricity())
                    return true;
            return false;
        }
        return false;
    }
    public String chooseTechnologyToLearn(Civilization civilization, String technologyName){
        Technology technology = preChooseTechnologyToLearn(technologyName);
        if (technology == null)
            return "no technology with this name exists";
        if (civilization.getScience() < technology.getCost())
            return "you don't have the needed amount of science";
        ArrayList<Technology> allTechnologies = civilization.getTechnologies();
        if (!hasPrerequisiteTechs(allTechnologies, technologyName))
            return "you don't have the prerequisite techs to learn this technology";
        if (technology.getCost() > 99)
            civilization.addToTechnologyEarnedPercent(technology, (int)(technology.getCost() / 100) + 2);
        else
            civilization.addToTechnologyEarnedPercent(technology, (int)(technology.getCost() / 10) - 2);
        return "technology has been added to the learning technologies";
    }
    public String changeTechnologyToLearn(Civilization civilization, String technologyName){
        Technology technology = preChooseTechnologyToLearn(technologyName);
        if (technology == null)
            return "no technology with this name exists";
        civilization.setScience(technology.getCost());
        if (civilization.getScience() < technology.getCost())
            return "you don't have the needed amount of science";
        ArrayList<Technology> allTechnologies = civilization.getTechnologies();
        if (!hasPrerequisiteTechs(allTechnologies, technologyName))
            return "you don't have the prerequisite techs to learn this technology";
        if (technology.getCost() > 99)
            civilization.addToTechnologyEarnedPercent(technology, (int)(technology.getCost() / 100) + 2);
        else
            civilization.addToTechnologyEarnedPercent(technology, (int)(technology.getCost() / 10) - 2);
        return "technology has been changed successfully";
    }
    public String workOnTile(Civilization civilization, int cityNumber, int tileNumber, int citizenNumber, ArrayList<Tile> map){
        City city = civilization.getCities().get(cityNumber);
        ArrayList<Tile> cityTiles = city.getTiles();
        Tile chosenTile = map.get(tileNumber);
        boolean isInRange = false;
        for (int i = 0; i < cityTiles.size(); i++) {
            if (cityTiles.get(i).equals(chosenTile)){
                cityTiles.get(i).setCitizen(city.getCitizens().get(citizenNumber));
                city.getCitizens().get(citizenNumber).setTile(chosenTile);
                isInRange = true;
                break;
            }
            else{
                float x1 = cityTiles.get(i).getX();
                float y1 = cityTiles.get(i).getY();
                float x2 = chosenTile.getX();
                float y2 = chosenTile.getY();
                //9rad3
                if (Math.pow(2, (x2 - x1)) + Math.pow(2, (y2 - y1)) <= 243){
                    if (chosenTile.getCitizen() == null) {
                        city.getCitizens().get(citizenNumber).setTile(chosenTile);
                        chosenTile.setCitizen(city.getCitizens().get(citizenNumber));
                        isInRange = true;
                        break;
                    }
                    else
                        return "there are already a unit in this tile";
                }
            }
        }
        if (isInRange)
            return "citizen is set to work on chosen tile";
        else
            return "this tile isn't your city tiles or city neighbors";
    }
    public String createImprovement(Civilization civilization, int tileUnitNumber, int tileNumber, String improvementName, ArrayList<Tile> map){
        ArrayList<Unit> allUnits = map.get(tileUnitNumber).getUnits();
        if (allUnits.size() == 0)
            return "there is no unit in this tile";
        boolean isThereAnyRelatedUnit = false;
        Unit creatorUnit = null;
        for (Unit unit : allUnits)
            if (unit.getCivilization() == civilization) {
                isThereAnyRelatedUnit = true;
                creatorUnit = unit;
                break;
            }
        if (!isThereAnyRelatedUnit)
            return "units in this tile doesn't belong to you";
        if (!creatorUnit.isCivilian())
            return "only workers can work on improvements";
        Civilian civilian = (Civilian) creatorUnit;
        if (civilian.isWorker()) {
            Tile tile = map.get(tileNumber);
            ArrayList<Technology> techs = civilization.getTechnologies();
            ArrayList<String> technologies = new ArrayList<>();
            for (int i = 0; i < techs.size(); i++)
                technologies.add(techs.get(i).getName());
            if (improvementName.equals("camp")) {//camp duration = 5
                if (tile.getAttribute().isJungle() || tile.isTundra() || tile.isHill() || tile.isDesert()) {
                    if (technologies.contains("Trapping")) {
                        Improvement improvement = new Improvement(true, false, false, false, false, false, false, false, false, 0, 0, 0);
                        tile.addToImprovementEarnedPercent(improvement, 5);
                    } else
                        return "you don't have the prerequisite technology";
                } else
                    return "camp can't be build in this tile";
            } else if (improvementName.equals("farm")) {
                if (tile.getAttribute().isRainForest()) {
                    if (technologies.contains("Mining")) {
                        Improvement improvement = new Improvement(false, true, false, false, false, false, false, false, false, 1, 0, 0);
                        tile.addToImprovementEarnedPercent(improvement, 10);
                    } else
                        return "you don't have the prerequisite technology";
                } else if (tile.getAttribute().isJungle()) {
                    if (technologies.contains("BronzeWorking")) {
                        Improvement improvement = new Improvement(false, true, false, false, false, false, false, false, false, 1, 0, 0);
                        tile.addToImprovementEarnedPercent(improvement, 13);
                    } else
                        return "you don't have the prerequisite technology";
                } else if (tile.getAttribute().isMarsh()) {
                    if (technologies.contains("Masonry")) {
                        Improvement improvement = new Improvement(false, true, false, false, false, false, false, false, false, 1, 0, 0);
                        tile.addToImprovementEarnedPercent(improvement, 12);
                    } else
                        return "you don't have the prerequisite technology";
                } else
                    return "farm can't be build in this tile";
            } else if (improvementName.equals("lumberMill")) {     //duration = 7
                if (tile.getAttribute().isJungle()) {
                    if (technologies.contains("Construction")) {
                        Improvement improvement = new Improvement(false, false, true, false, false, false, false, false, false, 0, 1, 0);
                        tile.addToImprovementEarnedPercent(improvement, 7);
                    } else
                        return "you don't have the prerequisite technology";
                } else
                    return "lumberMill can't be build in this tile";
            } else if (improvementName.equals("mine")) {       //duration = 14
                if (tile.isPlain() || tile.isDesert() || tile.isMeadow() || tile.isTundra() || tile.isSnow() || tile.isHill() || tile.getAttribute().isJungle() || tile.getAttribute().isRainForest() || tile.getAttribute().isMarsh()) {
                    if (technologies.contains("Mining")) {
                        Improvement improvement = new Improvement(false, false, false, true, false, false, false, false, false, 0, 1, 0);
                        tile.addToImprovementEarnedPercent(improvement, 14);
                    } else
                        return "you don't have the prerequisite technology";
                } else
                    return "mine can't be build in this tile";
            } else if (improvementName.equals("paddock")) {        //duration = 8
                if (tile.isPlain() || tile.isDesert() || tile.isMeadow() || tile.isTundra() || tile.isHill()) {
                    Improvement improvement = new Improvement(false, false, false, false, true, false, false, false, false, 0, 0, 0);
                    tile.addToImprovementEarnedPercent(improvement, 8);
                } else
                    return "paddock can't be build in this tile";
            } else if (improvementName.equals("agriculture")) {
                if (tile.isPlain() || tile.isMeadow() || tile.getAttribute().isJungle() || tile.getAttribute().isRainForest() || tile.getAttribute().isMarsh() || tile.getAttribute().isPlat()) {
                    if (technologies.contains("Calendar")) {        //duration = 5
                        Improvement improvement = new Improvement(false, false, false, false, false, true, false, false, false, 0, 0, 0);
                        tile.addToImprovementEarnedPercent(improvement, 5);
                    } else
                        return "you don't have the prerequisite technology";
                } else
                    return "agriculture can't be build in this tile";
            } else if (improvementName.equals("stoneMine")) {      //duration = 15
                if (tile.isPlain() || tile.isDesert() || tile.isMeadow() || tile.isTundra() || tile.isHill()) {
                    if (technologies.contains("Masonry")) {
                        Improvement improvement = new Improvement(false, false, false, false, false, false, true, false, false, 0, 0, 0);
                        tile.addToImprovementEarnedPercent(improvement, 15);
                    } else
                        return "you don't have the prerequisite technology";
                } else
                    return "stoneMine can't be build in this tile";
            } else if (improvementName.equals("tradingPost")) {        //duration = 10
                if (tile.isPlain() || tile.isDesert() || tile.isMeadow() || tile.isTundra()) {
                    if (technologies.contains("Trapping")) {
                        Improvement improvement = new Improvement(false, false, false, false, false, false, false, true, false, 0, 0, 1);
                        tile.addToImprovementEarnedPercent(improvement, 10);
                    } else
                        return "you don't have the prerequisite technology";
                } else
                    return "tradingPost can't be build in this tile";
            } else if (improvementName.equals("laboratory")) {     //duration = 20
                //plain, dessert, meadow, tundra, snow
                if (tile.isPlain() || tile.isDesert() || tile.isMeadow() || tile.isTundra() || tile.isSnow()) {
                    if (technologies.contains("Engineering")) {
                        Improvement improvement = new Improvement(false, false, false, false, false, false, false, false, true, 0, 2, 0);
                        tile.addToImprovementEarnedPercent(improvement, 20);
                    } else
                        return "you don't have the prerequisite technology";
                } else
                    return "laboratory can't be build in this tile";
            } else
                return "no improvement with this name exists!";
            civilian.setWorkingTile(tile);
            tile.addUnit(civilian);
            return "improvement created successfully";
        }
        else
            return "only workers can work on improvements";
    }
    // after every turn check for road or rail making in your civilization,,, if work is making ->true if it is removing->false
    public void consumeTurnForRoadMaking (Civilization civilization, ArrayList<Tile> map) {
        for (int i = 0; i < map.size(); i++) {
            ArrayList<Unit> units = map.get(i).getUnits();
            for (int i1 = 0; i1 < units.size(); i1++) {
                if (units.get(i1).getCivilization().equals(civilization) && units.get(i1).isCivilian()) {
                    if (((Civilian) units.get(i1)).isWorker() && map.get(i).sizeOfHashMapRoad() != 0) {
                        int newTurn = map.get(i).getNumberOfTurnsRoad(units.get(i1)) - 1;
                        if (newTurn == 0) {
                            map.get(i).removeWorkerFromRoad(units.get(i1));
                            ((Civilian) units.get(i1)).setWorkingTile(null);
                            if (map.get(i).isDoesHaveRoad()) {
                                map.get(i).setDoesHaveRoad(false);
                            }
                            else {
                                map.get(i).setDoesHaveRoad(true);
                            }

                            if (map.get(i).isRoadDamaged()) {
                                map.get(i).setRoadDamaged(false);
                            }
                        } else {
                            map.get(i).setNewNumberForTurnRoad(units.get(i1), newTurn);
                        }
                    }
                        if (((Civilian) units.get(i1)).isWorker() && map.get(i).sizeOfHashMapRail() != 0) {
                            int newTurn = map.get(i).getNumberOfTurnsRail(units.get(i1)) - 1;
                            if (newTurn == 0) {
                                map.get(i).removeWorkerFromRail(units.get(i1));
                                ((Civilian) units.get(i1)).setWorkingTile(null);
                                if (map.get(i).isDoesHaveRailWay()) {
                                    map.get(i).setDoesHaveRailWay(false);
                                }
                                else {
                                    map.get(i).setDoesHaveRailWay(true);
                                }
                                if (map.get(i).isRailDamaged()) {
                                    map.get(i).setRailDamaged(false);
                                }
                            } else {
                                map.get(i).setNewNumberForTurnRail(units.get(i1), newTurn);
                            }
                        }
                    }
                }
            }
        }

    public Unit getWorker (Tile tile) {
        ArrayList<Unit> units = tile.getUnits();
        for (int i = 0; i < units.size(); i++) {
            if (units.get(i).isCivilian()) {
                    return units.get(i);
            }
        }
        return null;
    }
    public String createRoad(Civilization civilization, Tile tile,ArrayList<Tile> map){
        String str;
        Unit unit = getWorker(tile);
        if (unit == null) {
            str = "this tile doesn't have any worker !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this worker does not belong to you !";
            return str;
        }
        if (!((Civilian)unit).isWorker()) {
            str = "this unit is not worker !";
            return str;
        }
        if (tile.isDoesHaveRoad()) {
            str = "there is already a road on this tile !";
            return str;
        }
        if (((Civilian)unit).getWorkingTile() != null) {
            str = "worker is working on something else !";
            return str;
        }

        tile.assignWorkerToRoad(unit, 3);
        ((Civilian)unit).setWorkingTile(tile);
        str = "the road will be ready in 3 turns";
        return str;
    }

    public String createRailRoad(Civilization civilization, Tile tile,ArrayList<Tile> map){
        String str;
        Unit unit = getWorker(tile);
        if (unit == null) {
            str = "this tile doesn't have any worker !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this worker does not belong to you !";
            return str;
        }
        if (!((Civilian)unit).isWorker()) {
            str = "this unit is not worker !";
            return str;
        }
        if (tile.isDoesHaveRailWay()) {
            str = "there is already a rail way on this tile !";
            return str;
        }
        if (((Civilian)unit).getWorkingTile() != null) {
            str = "worker is working on something else !";
            return str;
        }

        tile.assignWorkerToRail(unit, 3);
        ((Civilian)unit).setWorkingTile(tile);
        str = "the rail way will be ready in 3 turns";
        return str;
    }
    public Improvement preRemoveImprovement(String improvementName){
        if (improvementName.equals("camp"))
            return new Improvement(true, false, false, false, false, false, false, false, false, 0, 0, 0);
        else if (improvementName.equals("farm"))
            return new Improvement(false, true, false, false, false, false, false, false, false, 1, 0, 0);
        else if (improvementName.equals("lumberMill"))
            return new Improvement(false, false, true, false, false, false, false, false, false, 0, 1, 0);
        else if (improvementName.equals("mine"))
            return new Improvement(false, false, false, true, false, false, false, false, false, 0, 1, 0);
        else if (improvementName.equals("paddock"))
            return new Improvement(false, false, false, false, true, false, false, false, false, 0, 0, 0);
        else if (improvementName.equals("agriculture"))
            return new Improvement(false, false, false, false, false, true, false, false, false, 0, 0, 0);
        else if (improvementName.equals("stoneMine"))
            return new Improvement(false, false, false, false, false, false, true, false, false, 0, 0, 0);
        else if (improvementName.equals("tradingPost"))
            return new Improvement(false, false, false, false, false, false, false, true, false, 0, 0, 1);
        else if (improvementName.equals("laboratory"))
           return new Improvement(false, false, false, false, false, false, false, false, true, 0, 2, 0);
        else
            return null;
    }
    public String removeImprovement(Civilization civilization, Improvement improvement, int tileNumber ,ArrayList<Tile> map){
        ArrayList<City> cities = civilization.getCities();
        ArrayList<Tile> cityTiles = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            ArrayList<Tile> tiles = cities.get(i).getTiles();
            for (int j = 0; j < tiles.size(); j++)
                cityTiles.add(tiles.get(j));
        }
        Tile tile = map.get(tileNumber);
        boolean isOurs = false;
        for (int i = 0; i < cityTiles.size(); i++) {
            if (cityTiles.get(i).equals(tile)) {
                isOurs = true;
                break;
            }
        }
        if (!isOurs)
            return "this tile doesn't belong to your civilization";
        ArrayList<Improvement> improvements = tile.getImprovements();
        for (int i = 0; i < improvements.size(); i++)
            if (improvements.get(i).equals(improvement)){
                improvements.remove(i);
                tile.setImprovements(improvements);
                return "improvement deleted successfully";
            }
        return "no such improvement exists!";
    }
    public String removeRoad(Civilization civilization, Tile tile,ArrayList<Tile> map){
        String str;
        Unit unit = getWorker(tile);
        if (unit == null) {
            str = "this tile doesn't have any worker !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this worker does not belong to you !";
            return str;
        }
        if (!((Civilian)unit).isWorker()) {
            str = "this unit is not worker !";
            return str;
        }
        if (!tile.isDoesHaveRoad()) {
            str = "there is no road on this tile !";
            return str;
        }
        if (((Civilian)unit).getWorkingTile() != null) {
            str = "worker is working on something else !";
            return str;
        }

        tile.assignWorkerToRoad(unit, 3);
        ((Civilian)unit).setWorkingTile(tile);
        str = "the road will be removed in 3 turns";
        return str;
    }
    public String removeRailRoad(Civilization civilization, Tile tile,ArrayList<Tile> map){
        String str;
        Unit unit = getWorker(tile);
        if (unit == null) {
            str = "this tile doesn't have any worker !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this worker does not belong to you !";
            return str;
        }
        if (!((Civilian)unit).isWorker()) {
            str = "this unit is not worker !";
            return str;
        }
        if (!tile.isDoesHaveRailWay()) {
            str = "there is no rail way on this tile !";
            return str;
        }
        if (((Civilian)unit).getWorkingTile() != null) {
            str = "worker is working on something else !";
            return str;
        }

        tile.assignWorkerToRail(unit, 3);
        ((Civilian)unit).setWorkingTile(tile);
        str = "the rail way will be removed in 3 turns";
        return str;
    }
    public String cancelImprovementOnProcess(Civilization civilization, Tile tile){
        if (tile.getWorkingOnImprovement() == null)
            return "this tile isn't working on any improvement";
        tile.cancelImprovementOnProcess();
        return "Improvement canceled successfully";
    }
    public String repairRoad(Civilization civilization, Tile tile,ArrayList<Tile> map){
        String str;

        Unit unit = getWorker(tile);
        if (unit == null) {
            str = "this tile doesn't have any worker !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this worker does not belong to you !";
            return str;
        }
        if (!((Civilian)unit).isWorker()) {
            str = "this unit is not worker !";
            return str;
        }
        if (!tile.isDoesHaveRoad()) {
            str = "there is no road way on this tile !";
            return str;
        }
        if (tile.isDoesHaveRoad() && !tile.isRoadDamaged()) {
            str = "this road doesn't need repair!";
            return str;
        }
        if (((Civilian)unit).getWorkingTile() != null) {
            str = "worker is working on something else !";
            return str;
        }

        tile.assignWorkerToRoad(unit, 3);
        ((Civilian)unit).setWorkingTile(tile);
        str = "the road way will be repaired in 3 turns";
        return str;
    }
    public String repairRail(Civilization civilization, Tile tile,ArrayList<Tile> map){
        String str;
        Unit unit = getWorker(tile);
        if (unit == null) {
            str = "this tile doesn't have any worker !";
            return str;
        }
        if (!unit.getCivilization().equals(civilization)) {
            str = "this worker does not belong to you !";
            return str;
        }
        if (!((Civilian)unit).isWorker()) {
            str = "this unit is not worker !";
            return str;
        }
        if (!tile.isDoesHaveRailWay()) {
            str = "there is no rail way on this tile !";
            return str;
        }
        if (tile.isDoesHaveRailWay() && !tile.isRailDamaged()) {
            str = "this rail road doesn't need repair!";
            return str;
        }
        if (((Civilian)unit).getWorkingTile() != null) {
            str = "worker is working on something else !";
            return str;
        }

        tile.assignWorkerToRail(unit, 3);
        ((Civilian)unit).setWorkingTile(tile);
        str = "the rail way will be repaired in 3 turns";
        return str;
    }
    public String repairImprovement(Civilization civilization, int tileUnitNumber, int tileNumber, ArrayList<Tile> map){
        ArrayList<Unit> allUnits = map.get(tileUnitNumber).getUnits();
        if (allUnits.size() == 0)
            return "there is no unit in this tile";
        boolean isThereAnyRelatedUnit = false;
        for (Unit unit : allUnits)
            if (unit.getCivilization() == civilization) {
                isThereAnyRelatedUnit = true;
                break;
            }
        if (!isThereAnyRelatedUnit)
            return "units in this tile doesn't belong to you";
        Unit repairUnit = null;
        Civilian civilian = null;
        for (Unit unit: allUnits) {
            if (!unit.isCivilian()){
                civilian = (Civilian) unit;
                if (civilian.isWorker())
                    repairUnit = unit;
            }
        }
        if (repairUnit == null)
            return "only workers can work on repairments";
        Tile tile = map.get(tileNumber);
        if (!tile.isWorking()) {
            civilian.setWorkingTile(tile);
            int repairNeedTurn = tile.getImprovements().size() * 3;
            tile.setRepairNeedImprovement(repairNeedTurn);
            tile.setIsOnRepair(true);
            return "repair Process has been started";
        }
        return "tile hasn't been looted or has been repaired completely";
    }
    public String repairWholeTile(Civilization civilization,Civilian civilian, Tile tile,ArrayList<Tile> map){
        String str;

        return str;
    }
    // get necessary parameters for update warrior
    public String preUpgradeUnit (Matcher matcher, Civilization civilization, ArrayList<Tile> map) {
        matcher.find();
        String previousUnitName = matcher.group("oldUnitName").toLowerCase();
        String newUnitName = matcher.group("newUnitName").toLowerCase();
        int index = Integer.parseInt(matcher.group("number"));

        Unit oldUnit = getUnitInTile(map.get(index).getUnits(), previousUnitName);
        Unit newUnit = makeUnit(civilization, map.get(index), map, newUnitName);
        City city = findTile(index, map, civilization);
        return updateWarrior(civilization, oldUnit, newUnit, map, map.get(index), city);
    }
    public String updateWarrior(Civilization civilization, Unit warrior, Unit newWarrior,ArrayList<Tile> map, Tile tile, City city){
        String str;
        if (warrior == null) {
            str = "there is no unit with this name in selected tile !";
            return str;
        }
        if (!warrior.getCivilization().equals(civilization)) {
            str = "this unit is for another civilization !";
            return str;
        }
        if (warrior.isCivilian() || newWarrior.isCivilian()) {
            str = "you can't upgrade a civilian unit !";
            return str;
        }
        if (!isTechnologyAvailableForUnit(newWarrior, civilization)) {
            str = "your civilization doesn't have necessary technology !";
            return str;
        }
        if (city == null) {
            str = "this tile does not belong to your cities!";
            return str;
        }
        if (!isResourceAvailableForUnit(newWarrior, city)) {
            str = "your city doesn't have necessary resource !";
            return str;
        }

        warrior = newWarrior;
        str = "unit upgraded successfully !";
        return str;
    }
    public StringBuilder showCurrentScore(ArrayList<Civilization> civilizations,ArrayList<Tile> map){
        StringBuilder stringBuilder = new StringBuilder("");
        int[] sortFlag = new int[civilizations.size()];
        Civilization chosenCivilization = null;
        int index = 0;

        int Number = 1;
        for(int i = 0; i < civilizations.size(); i++){
            boolean theFlag = true;
            for(int j = 0; j < civilizations.size(); j++){
                if(sortFlag[j] == 1)
                    continue;
                if(theFlag) {
                    chosenCivilization = civilizations.get(j);
                    theFlag = false;
                }
                Civilization tempCivilization = civilizations.get(j);
                if(tempCivilization.getPoint() > chosenCivilization.getPoint()){
                    chosenCivilization = tempCivilization;
                    index = j;
                }
            }
            sortFlag[index] = 1;
            int numOfTiles = 0;
            for(City city : chosenCivilization.getCities()){
                for(Tile tile : city.getTiles()){
                    numOfTiles++;
                }
            }
            int numOfUnits = 0;
            for(Tile tile : map){
                for(Unit unit : tile.getUnits()){
                    if(unit.getCivilization() == chosenCivilization)
                        numOfUnits++;
                }
            }
            stringBuilder.append(chosenCivilization.getMember().getNickname()).append(" : \n");
            stringBuilder.append("Rank : ").append(Number).append("\n");
            stringBuilder.append("Points : ").append(chosenCivilization.getPoint()).append("\n");
            stringBuilder.append("----------\n");
            Number++;
        }

        return stringBuilder;
    }
    //TODO
    /*
    public boolean winCheck(){

    }
     */
    public String nextTurn(Civilization civilization, ArrayList<Tile> map){
        //unit actions check
        int tileNumber = unitActionsNextTurnCheck(civilization,map);
        if(tileNumber != -1)
            return "order unit in tile number : " + tileNumber;
        if (civilization.getWorkingOnTechnology() == null)
            return "choose a technology to learn";
//-----------------------------------------------------------------------------------

        improveImprovementsNextTurn(map);
        checkForUnitMaking(civilization);
        consumeTurnForRoadMaking(civilization,map);
        moveUnitWithMovesLeft(civilization,map);
        addMpEveryTurn(civilization,map);
        increaseGoldCivilizationNextTurn(civilization,map);
        increaseFoodCitiesNextTurn(civilization,map);
        increaseProductionCitiesNextTurn(civilization,map);
        increasePopulationNextTurn(civilization,map);
        reduceRepairNeedImprovementTurnNextTurn(map);
        resetHasOrdered(civilization,map);
        civilization.reduceTechnologyRound();


        //TODO...  also complete historyInformation and showProductionsInProcess
        return "done";
    }
    public void increasePopulationNextTurn(Civilization civilization,ArrayList<Tile> map){
        if(civilization.getHappiness() < 0)
            return;

        for(City city : civilization.getCities()){
            if(city.getTotalFood() >= 5){
                for(Tile tile : city.getTiles()){
                    if(tile.getCitizen() == null){
                        Citizen citizen = new Citizen(tile);
                        civilization.setHappiness(-1);
                        break;
                    }
                }
            }
        }
    }
    public int unitActionsNextTurnCheck(Civilization civilization,ArrayList<Tile> map){
        for(Tile tile : map){
            for(Unit unit : tile.getUnits()){
                if(unit.getCivilization() == civilization){
                    if(!unit.getIsOnSleep()){
                        if(!unit.isCivilian() && !unit.getHasOrdered()){
                            return tile.getTileNumber();
                        }
                    }
                }
            }
        }
        return -1;
    }
    public void resetHasOrdered(Civilization civilization, ArrayList<Tile> map) {
        for (int i = 0; i < map.size(); i++) {
            Tile tile = map.get(i);
            ArrayList<Unit> units = tile.getUnits();
            for (int i1 = 0; i1 < units.size(); i1++) {
                if(units.get(i1).getCivilization() == civilization){
                    if(!units.get(i1).getIsOnSleep()){
                        if(!units.get(i1).isCivilian() && !units.get(i1).getHasOrdered()){
                            units.get(i1).setHasOrdered(false);
                        }
                    }
                }
            }
        }
    }
    public void improveImprovementsNextTurn(ArrayList<Tile> map){
        for (Tile tile : map)
            tile.reduceImprovementRound();
    }
    public void reduceRepairNeedImprovementTurnNextTurn(ArrayList<Tile> map){
        for (Tile tile: map)
            tile.reduceRepairNeedImprovementTurn();
    }
    public void increaseGoldCivilizationNextTurn(Civilization civilization,ArrayList<Tile> map){
        int finalAsset = 0;
        for(City city : civilization.getCities()){
            finalAsset += city.getGold();
        }
        for(Tile tile : map){
            for(Unit unit : tile.getUnits()){
                if(unit.getCivilization() == civilization){
                    if(!unit.isCivilian()){
                        finalAsset--;
                    }
                }
            }
        }
        //TODO... Buildings cost
        civilization.setGold(finalAsset);
    }
    public void increaseFoodCitiesNextTurn(Civilization civilization,ArrayList<Tile> map){
        for(City city : civilization.getCities()){
            int finalAsset = 0;
            finalAsset += city.getFood();
            finalAsset -= (int) (city.getCitizens().size() / 2);
            city.setTotalFood(finalAsset);
        }
    }
    public void increaseProductionCitiesNextTurn(Civilization civilization,ArrayList<Tile> map){
        for(City city : civilization.getCities()){
            int finalAsset = 0;
            finalAsset += city.getProduction();
            city.setProduction(finalAsset);
        }
    }

}
