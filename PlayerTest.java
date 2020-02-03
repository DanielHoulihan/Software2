import java.util.*;
public class PlayerTest{

    public static void main(String [] args){

        Pool pool = new Pool();
        Player player = new Player("Daniel");
        Frame frame = new Frame(pool);
        // Map <String, List<Integer>> tiles = pool.getTiles();
        // System.out.println(tiles.get("A"));
        System.out.println("value of tile A is " + pool.getValueOfTile("A"));
        System.out.println("amount of tiles of A is " + pool.getAmountOfTiles("A"));
        System.out.println("There are " + pool.tilesLeftInPool() + " in the pools"); 
        System.out.println("Random tile: " + pool.randomTile());
        System.out.println("Pool empty: " + pool.checkIfEmpty());

        //player.resetPlayer();
        player.increaseScore(5);
        System.out.println("player score is " + player.getScore());
        System.out.println("player name is " + player.getName());
        //System.out.println(player.getFrame);

        System.out.println("The frame is" + frame.displayFrame());
        System.out.println("Is letter A in the frame: "+frame.areLettersInFrame("A"));
        frame.removeLetter("A");
        System.out.println("After A removed: " + frame.displayFrame());
        frame.refillFrame();
        System.out.println("New frame: " + frame.displayFrame());

    }

}