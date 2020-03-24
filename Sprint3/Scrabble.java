public class Scrabble {

    public static void main(String[] args) {
        UI ui = new UI();
        Scrabble scrabble = new Scrabble();
        Scoring scoring = new Scoring();

        ui.playerNameInput();
        ui.player1.getFrame().refill(ui.pool);
        ui.player2.getFrame().refill(ui.pool);
        System.out.println(scoring.getScoreOfTile("Z"));

        while(true){
            Player playerToGo = ui.whichPlayer();
            ui.move(playerToGo);
            playerToGo.getFrame().refill(ui.pool);
        }
    }


}
