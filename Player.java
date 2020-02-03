import java.util.Scanner;

public class Player {

    int score;
    String name;
    //Frame frame;

    public Player(String name){
        this.name=name;
        this.score=0;
        //this.frame=new Frame();
    }

	public void setName(String name) {
        this.name=name;
    }

    public int getScore(){
        return score;
    }

    // public Frame getFrame(){
    //     return frame;
    // }

    public String getName(){
        return name;
    }

    public void increaseScore(int wordValue){
        score += wordValue;
    }

    public void resetPlayer(){
        this.name="";
        this.score=0;
        //this.frame=new Frame();
    }
	

}