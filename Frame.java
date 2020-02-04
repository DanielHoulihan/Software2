public class Frame {

	String[] frame;
    Pool pool;
    int frameCount;

	public Frame(Pool pool) {
        this.pool=pool;
        this.frame = new String [7];
        this.frame[0]=this.pool.randomTile();
        this.frame[1]=this.pool.randomTile();
        this.frame[2]=this.pool.randomTile();
        this.frame[3]=this.pool.randomTile();
        this.frame[4]=this.pool.randomTile();
        this.frame[5]=this.pool.randomTile();
        this.frame[6]=this.pool.randomTile();
        frameCount=7;
    }

    public void refillFrame(){
        for(int i=0; i<7; i++){
            if(frame[i].equals("@")){
                frame[i]=pool.randomTile();
                frameCount++;
            }
        }
    }

    public void removeLetter(String l){
            for(int i = 0; i < 7; i++) {
                if(frame[i].equals(l)) {
                    frame[i]="@";
                    break;
                }
            }
            frameCount--;
    }

	public boolean areLettersInFrame(String l) {
        boolean check=false;
		for(int i = 0; i < 7; i++) {
			if(frame[i].equals(l)) {
				check=true;
			}
        }
        return check;
	}

	public boolean checkNull() {
        return (frameCount==0); //if true returning true, else returning false
   }

	public String displayFrame() {
        String frameDisplay="";
        for(int i=0; i<7; i++){
            frameDisplay+=frame[i];
        }
        return frameDisplay;
	}


}
