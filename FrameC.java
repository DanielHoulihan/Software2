
public class Frame {

	String[] frame;                              //Variable to store the frame.
    Pool pool;
    int frameCount;                              //Variable to store the count of letters in the Frame.

	public Frame(Pool pool) {
        this.pool=pool;
        this.frame = new String [7];
        this.frame[0]=this.pool.randomTile();    //Fills each empty space in the Array with a random character from pool.
        this.frame[1]=this.pool.randomTile();
        this.frame[2]=this.pool.randomTile();
        this.frame[3]=this.pool.randomTile();
        this.frame[4]=this.pool.randomTile();
        this.frame[5]=this.pool.randomTile();
        this.frame[6]=this.pool.randomTile();
        frameCount=7;                             //Initializes the Frame count to 7 because the frame is full at the beginning.
    }

    public void refillFrame(){
        for(int i=0; i<7; i++){                   //For loop,which goes through the Frame and fills in null spaces.
            if(frame[i].equals("@")){             //'@' signifies a null space in the Frame.
                frame[i]=pool.randomTile();       //Fills the gap with a random character from Pool.
                frameCount++;                     //Adds one to the count every time it loops.
            }
        }
    }

    public void removeLetter(String l){
            for(int i = 0; i < 7; i++) {
                if(frame[i].equals(l)) {          //If a letter in the frame is equal to the chosen letter. (String l)
                    frame[i]="@";                 //Removes the letter from the frame and makes it null.
                    break;                        //Breaks the loop.
                }
            }
            frameCount--;                         //Frame count minus 1 for each iteration.
    }

	public boolean areLettersInFrame(String l) {
        boolean check=false;                      //Assumes check to be false until told otherwise.
		for(int i = 0; i < 7; i++) {
			if(frame[i].equals(l)) {              //If the letter in Frame is equal to the letter chosen by the user. (String l)
				check=true;                       //It is in the Array so therefore check is true.
			}
        }
        return check;                             //Outputs true or false.
	}

	public boolean checkNull() {
        return (frameCount==0);                   //If frameCount is equal to 0 return true.
   }

	public String displayFrame() {
        String frameDisplay="";                   //Variable frameDisplay initialized to null.
        for(int i=0; i<7; i++){
            frameDisplay+=frame[i];               //Adds each letter in Frame onto the String frameDisplay.
        }
        return frameDisplay;                      //Returns the String frameDisplay.
	}


}
