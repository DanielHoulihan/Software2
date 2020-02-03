import java.util.*;

public class Pool {

private Map <String, List<Integer>> tiles;

public Map <String, List<Integer>>  getTiles(){
    return tiles;
}

public Pool(){
    tiles= new HashMap <>();
    tiles.put("A", Arrays.asList(9, 1));
    tiles.put("B", Arrays.asList(2, 2));
    tiles.put("C", Arrays.asList(2, 1));
    tiles.put("D", Arrays.asList(4, 2));
    tiles.put("E", Arrays.asList(12, 1));
    tiles.put("F", Arrays.asList(2, 2));
    tiles.put("G", Arrays.asList(3, 1));
    tiles.put("H", Arrays.asList(2, 2));
    tiles.put("I", Arrays.asList(9, 1));
    tiles.put("J", Arrays.asList(1, 2));
    tiles.put("K", Arrays.asList(1, 1));
    tiles.put("L", Arrays.asList(4, 2));
    tiles.put("M", Arrays.asList(2, 1));
    tiles.put("N", Arrays.asList(6, 2));
    tiles.put("O", Arrays.asList(8, 1));
    tiles.put("P", Arrays.asList(2, 2));
    tiles.put("Q", Arrays.asList(1, 1));
    tiles.put("R", Arrays.asList(6, 2));
    tiles.put("S", Arrays.asList(4, 1));
    tiles.put("T", Arrays.asList(6, 2));
    tiles.put("U", Arrays.asList(4, 1));
    tiles.put("V", Arrays.asList(2, 2));
    tiles.put("W", Arrays.asList(2, 1));
    tiles.put("X", Arrays.asList(1, 2));
    tiles.put("Y", Arrays.asList(2, 1));
    tiles.put("Z", Arrays.asList(1, 2));
}

public int getValueOfTile(String l){
    return tiles.get(l).get(1);
}

public int getAmountOfTiles(String l){
    return tiles.get(l).get(0);
}

public void reset(){
    //Pool();
}

public int tilesLeftInPool(){
    int total=0;
    for(String s : tiles.keySet()){
        total+=getAmountOfTiles(s);
    }
    return total;
}

public boolean checkIfEmpty(){
    int total=0;
    for(String s : tiles.keySet()){
        //System.out.println(getAmountOfTiles(s));
        total+=getAmountOfTiles(s);
    }
    if(total==0){
        return true;
    }
    else return false;
}

public List<Integer> randomTile(){
    Random rand = new Random();
    int randInt =rand.nextInt(24);
    switch(randInt){
        case 1: return tiles.get("A");
        case 2: return tiles.get("B");
        case 3: return tiles.get("C");
        case 4: return tiles.get("D");
        case 5: return tiles.get("E");
        case 6: return tiles.get("F");
        case 7: return tiles.get("G");
        case 8: return tiles.get("H");
        case 9: return tiles.get("I");
        case 10: return tiles.get("J");
        case 11: return tiles.get("K");
        case 12: return tiles.get("L");
        case 13: return tiles.get("M");
        case 14: return tiles.get("N");
        case 15: return tiles.get("O");
        case 16: return tiles.get("P");
        case 17: return tiles.get("Q");
        case 18: return tiles.get("R");
        case 19: return tiles.get("S");
        case 20: return tiles.get("T");
        case 21: return tiles.get("U");
        case 22: return tiles.get("V");
        case 23: return tiles.get("W");
        case 24: return tiles.get("X");
        case 25: return tiles.get("Y");
        case 26: return tiles.get("Z");     
    }
return null;
}
    

}