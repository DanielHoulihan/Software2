public class Player {

    int score;                                    //Variable to keep the score.
    String name;                                  //Variable to hold name.
    Frame frame;


    public Player(String name, Frame frame){      //constructor method for Player.
        this.name=name;
        this.score=0;                             //Initializes score to 0.
        this.frame=frame;
    }

    public void setName(String name) {             //setter for name variable
        this.name=name;
    }

    public int getScore(){                        //getter for score variable.
        return score;                             //Returns score when called.
    }

    public String getFrame(){
        return frame.displayFrame();              //Returns a players Frame when called.
    }

    public String getName(){
        return name;                              //Returns a players name when called.
    }

    public void increaseScore(int wordValue){
        score += wordValue;                       //Adds the value of the word onto the total of the players score.
    }

    public void resetPlayer(String name, Frame frame){
        this.name=name;
        this.score=0;                             //Resets score back to 0.
        this.frame=frame;
    }


}
