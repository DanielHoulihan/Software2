import java.util.*;
public class PlayerTest{

    public static void main(String [] args){

        //String[] frameString = {"A", "B", "C", "D", "F", "G", "H"};
        String[] frameString = {" "};
        Pool pool = new Pool();
        Player player = new Player("Daniel");
        Frame frame = new Frame(frameString);
        Map <String, List<Integer>> tiles = pool.getTiles();
        System.out.println(tiles.get("A"));
        System.out.println(pool.getValueOfTile("A"));
        System.out.println(pool.getAmountOfTiles("A"));
        System.out.println(pool.tilesLeftInPool());        
        System.out.println(pool.randomTile());
        System.out.println(pool.checkIfEmpty());
        //player.resetPlayer();
        player.increaseScore(5);
        System.out.println(player.getScore());
        System.out.println(player.getName());
        //System.out.println(frame.displayFrame());
        System.out.println(frame.areLettersInFrame());



    }

}