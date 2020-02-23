import java.util.*;
public class PlayerTest{

    public static void main(String [] args){

        // Map <String, List<Integer>> tiles = pool.getTiles();
        // System.out.println(tiles.get("A"));
        Square square = new Square();
        Pool pool = new Pool();
        System.out.println("There are " + pool.tilesLeftInPool() + " tiles in the pool");
        Frame frame = new Frame(pool);
        Frame frame1 = new Frame(pool);
        Player player = new Player("Daniel", frame);
        Player player1 = new Player("Jack", frame1);
        System.out.println("player name for p1 is " + player.getName());
        System.out.println("player name for p2 is " + player1.getName());
        System.out.println("The frame for p1 is " + frame.displayFrame());
        System.out.println("The frame for p2 is " + frame1.displayFrame());
        System.out.println("There are now " + pool.tilesLeftInPool() + " tiles in the pool");
        System.out.println("value of tile J is " + pool.getValueOfTile("J"));
        System.out.println("amount of tiles of J is " + pool.getAmountOfTiles("J"));
        System.out.println("Random tile: " + pool.randomTile());
        System.out.println("Pool empty: " + pool.checkIfEmpty());
        //pool.resetPool();
        player.resetPlayer("Shane", frame);
        System.out.println("player score for p1 is " + player.getScore());
        System.out.println("player score for p2 is " + player1.getScore());
        player.increaseScore(5);
        player1.increaseScore(9);
        System.out.println("player score for p1 is " + player.getScore());
        System.out.println("player score for p2 is " + player1.getScore());
        System.out.println(player.getFrame());

//        Board board = new Board();
//        board.board(square);
//        board.placeValidWord(7, 7, "right", new String[]{"H", "E", "L"}, frame);
//        board.placeValidWord(8, 8, "right", new String[]{"L", "E", "H"}, frame);
//        board.placeValidWord(7, 7, "right", new String[]{"T"}, frame);
//        //board.placeValidWord(8, 7, "down", new String[]{"H", "E", "L"}, frame);
//        System.out.println(board.notOnAnotherWord(8, 9));


    }

}