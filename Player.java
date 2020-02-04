import java.util.Scanner;

public class Player {

    int score;
    String name;
    Frame frame;
    

    public Player(String name, Frame frame){
        this.name=name;
        this.score=0;
        this.frame=frame;
    }

	public void setName(String name) {
        this.name=name;
    }

    public int getScore(){
        return score;
    }

    public String getFrame(){ 
        return frame.displayFrame();
    }

    public String getName(){
        return name;
    }

    public void increaseScore(int wordValue){
        score += wordValue;
    }

    public void resetPlayer(String name, Frame frame){
        this.name=name;
        this.score=0;
        this.frame=frame;
    }
	

}