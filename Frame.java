public class Frame {

	String[] frame;

	public Frame(String [] e1) {
        this.frame=e1;
    }
    
    // public frame fillFrame(){

    // }

	public boolean areLettersInFrame() {
        boolean check=false;
		for(int i = 0; i < 1; i++) {
			if(frame[i] != "") {
				check=true;
			}
        }
        return check;
	}

// 	public boolean checkNull() {
//         while(Frame[i]==null){
//             return false;
//         }
//         return true;
//    }

	public String displayFrame() {
        return frame[0]; //+ frame[1] + frame[2] + frame[3] + frame[4] + frame[5] + frame[6];
	}

}
