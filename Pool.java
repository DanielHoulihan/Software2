import java.util.*;

public class Pool {

private Map <String, List<Integer>> tiles;

public Map <String, List<Integer>>  getTiles(){
    return tiles;
}

public Pool(){
    fillPool();
}

public void fillPool(){
    tiles= new HashMap <>();
    tiles.put("A", Arrays.asList(9, 1));
    tiles.put("B", Arrays.asList(2, 3));
    tiles.put("C", Arrays.asList(2, 3));
    tiles.put("D", Arrays.asList(4, 2));
    tiles.put("E", Arrays.asList(12, 1));
    tiles.put("F", Arrays.asList(2, 4));
    tiles.put("G", Arrays.asList(3, 2));
    tiles.put("H", Arrays.asList(2, 4));
    tiles.put("I", Arrays.asList(9, 1));
    tiles.put("J", Arrays.asList(1, 8));
    tiles.put("K", Arrays.asList(1, 5));
    tiles.put("L", Arrays.asList(4, 1));
    tiles.put("M", Arrays.asList(2, 3));
    tiles.put("N", Arrays.asList(6, 1));
    tiles.put("O", Arrays.asList(8, 1));
    tiles.put("P", Arrays.asList(2, 3));
    tiles.put("Q", Arrays.asList(1, 10));
    tiles.put("R", Arrays.asList(6, 1));
    tiles.put("S", Arrays.asList(4, 1));
    tiles.put("T", Arrays.asList(6, 1));
    tiles.put("U", Arrays.asList(4, 1));
    tiles.put("V", Arrays.asList(2, 4));
    tiles.put("W", Arrays.asList(2, 4));
    tiles.put("X", Arrays.asList(1, 8));
    tiles.put("Y", Arrays.asList(2, 4));
    tiles.put("Z", Arrays.asList(1, 10));
    tiles.put("*", Arrays.asList(2, 0));
}

public void decreaseTile(String l){
    int amount= getAmountOfTiles(l);
    int value = getValueOfTile(l);
    tiles.put(l, Arrays.asList(amount-1, value));
}

public int getValueOfTile(String l){
    return tiles.get(l).get(1);
}

public int getAmountOfTiles(String l){
    return tiles.get(l).get(0);
}

public void resetPool(){
    fillPool();
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
        total+=getAmountOfTiles(s);
    }
    if(total==0){
        return true;
    }
    else return false;
}


public String randomTile(){
    Random rand = new Random();
    int randInt =rand.nextInt(26);
    String chosenLetter=null;
    switch(randInt){
        case 0: chosenLetter="A";
        break;
        case 1: chosenLetter="B";
        break;
        case 2: chosenLetter="C";
        break;
        case 3: chosenLetter="D";
        break;
        case 4: chosenLetter="E";
        break;
        case 5: chosenLetter="F";
        break;
        case 6: chosenLetter="G";
        break;
        case 7: chosenLetter="H";
        break;
        case 8: chosenLetter="I";
        break;
        case 9: chosenLetter="J";
        break;
        case 10: chosenLetter="K";
        break;
        case 11: chosenLetter="L";
        break;
        case 12: chosenLetter="M";
        break;
        case 13: chosenLetter="N";
        break;
        case 14: chosenLetter="O";
        break;
        case 15: chosenLetter="P";
        break;
        case 16: chosenLetter="Q";
        break;
        case 17: chosenLetter="R";
        break;
        case 18: chosenLetter="S";
        break;
        case 19: chosenLetter="T";
        break;
        case 20: chosenLetter="U";
        break;
        case 21: chosenLetter="V";
        break;
        case 22: chosenLetter="W";
        break;
        case 23: chosenLetter="X";
        break;
        case 24: chosenLetter="Y";
        break;
        case 25: chosenLetter="Z";
        break;
    }
        if(getAmountOfTiles(chosenLetter)>0){
            decreaseTile(chosenLetter);
            return chosenLetter;
        }
        else return randomTile();
}
    

}