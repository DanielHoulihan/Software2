import java.util.Scanner;

public class UI {

    private static Board board = new Board();
    private static Frame frame = new Frame();
    Player player1 = new Player();
    Player player2 = new Player();
    Pool pool = new Pool();
    Scoring scoring = new Scoring();


    public void move(Player player){

        System.out.println(player.getName() + " It is your turn ");
        System.out.println("Your tiles are: " +player.getFrame());
        System.out.println("This is the board currently: ");
        board.display();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter row");
        int x=input.nextInt();
        System.out.println("Enter column");
        int y=input.nextInt();
        input.nextLine();

        System.out.println("Enter direction (true is horizontal, false is vertical)");
        String z=input.nextLine();
        boolean isHorizontal = Boolean.parseBoolean(z);

        System.out.println("Enter word to be placed");
        String wordToBePlaced=input.nextLine();

        Word newWord = new Word(x,y,isHorizontal,wordToBePlaced);
        if(board.isLegal(player.getFrame(), newWord)) {
            board.place(player.getFrame(), newWord);
            board.display();
            System.out.println("score of this word is: " + scoring.scoreOfWord(newWord, x, y, isHorizontal));
            player.addScore(scoring.scoreOfWord(newWord, x, y, isHorizontal));
            System.out.println("Placed successfully");
            System.out.println(player.getName()+"'s score is now "+ player.getScore());

        }
        else {
            System.out.println("Not a legal move");
            move(player);
        }
    }

    public Player whichPlayer(){
        if((board.numPlays+1)%2==0){
            return player1;
        }
        else{
            return player2;
        }
    }


    public void playerNameInput(){
    Scanner input = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter Player 1");
    player1.setName(input.nextLine());

    System.out.println("Enter Player 2");
    player2.setName(input.nextLine());
    }


    public void quitGame(){
        System.exit(0);
        return;
    }

}
