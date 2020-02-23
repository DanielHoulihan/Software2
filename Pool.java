import java.util.*;

public class Pool {

    private Map <String, List<Integer>> tiles;

    public Map <String, List<Integer>>  getTiles(){    //Hash map to store the letter on a tile, amount of each tile and the value of each tile.
        return tiles;
    }

    public Pool(){                              //constructor for pool
        fillPool();
    }


    public void fillPool(){
        tiles= new HashMap <>();                //creating hashmap named tiles
        tiles.put("A", Arrays.asList(9, 1));    //tiles.put adds elements to the hashmap
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
        tiles.put(l, Arrays.asList(amount-1, value));     //Takes one tile out of the pool, therefore reducing a letters count by one.
    }

    public int getValueOfTile(String l){
        return tiles.get(l).get(1);                       //Returns the value of the given input. (String l.)
    }

    public int getAmountOfTiles(String l){
        return tiles.get(l).get(0);                       //Returns how many of the chosen letter are left in the pool. (String l)
    }

    public void resetPool(){
        fillPool();                                       //Resets the pool.
    }

    public int tilesLeftInPool(){
        int total=0;
        for(String s : tiles.keySet()){                    //loops through the hashmap
            total+=getAmountOfTiles(s);                    //adds the amount of tiles for each letter together
        }
        return total;
    }

    public boolean checkIfEmpty(){
        int total=0;
        for(String s : tiles.keySet()){                    //same as tilesLeftInPool except if the total is 0, its true
            total+=getAmountOfTiles(s);
        }
        if(total==0){
            return true;
        }
        else return false;
    }


    public String randomTile(){
        Random rand = new Random();
        int randInt =rand.nextInt(26);              //creates a random number between 0-25
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
        if(getAmountOfTiles(chosenLetter)>0){       //If there are more than 0 of the chosen tiles in pool.
            decreaseTile(chosenLetter);             //Take that tile out of pool.
            return chosenLetter;                    //And return the chosen letter.
        }
        else return randomTile();                   //Else, try the method again until a valid letter is outputted.
    }


}
