public class BoardTest {


    public static void main(String[] args) {
        Pool pool = new Pool();
        Square square = new Square();
        Frame frame = new Frame(pool);
        Board board = new Board();
        board.board(square);
        board.placeValidWord(7, 7, "right", new String[]{"H", "E", "L"}, frame);
        board.placeValidWord(8, 8, "right", new String[]{"L", "E", "H"}, frame);
        board.placeValidWord(7, 7, "right", new String[]{"T"}, frame);
        //board.placeValidWord(8, 7, "down", new String[]{"H", "E", "L"}, frame);
        System.out.println(board.notOnAnotherWord(8, 9));
    }
}
