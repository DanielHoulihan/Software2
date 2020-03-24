import java.util.*;
public class Scoring {

    Board board = new Board();
    private HashMap<String, Integer> value;

    public Scoring(){                              //constructor for pool
        setValue();
    }

    public void setValue(){
        value= new HashMap<>();                //creating hashmap named tiles
        value.put("A", 1);                     //tiles.put adds elements to the hashmap
        value.put("B", 3);
        value.put("C", 3);
        value.put("D", 2);
        value.put("E", 1);
        value.put("F", 4);
        value.put("G", 2);
        value.put("H", 4);
        value.put("I", 1);
        value.put("J", 8);
        value.put("K", 5);
        value.put("L", 1);
        value.put("M", 3);
        value.put("N", 1);
        value.put("O", 1);
        value.put("P", 3);
        value.put("Q", 10);
        value.put("R", 1);
        value.put("S", 1);
        value.put("T", 1);
        value.put("U", 1);
        value.put("V", 4);
        value.put("W", 4);
        value.put("X", 8);
        value.put("Y", 4);
        value.put("Z", 10);
        value.put("_", 0);
    }

    public int getScoreOfTile(String l){
        return value.get(l);
    }


    public int scoreOfWord(Word word, int x, int y, Boolean isHorizontal){
        int wordScore=0;
        String wordInStringForm = word.getLetters();
        String[] newString = wordInStringForm.split("");
        for(int i=0; i<word.getLength(); i++){
                wordScore = wordScore + getScoreOfTile(newString[i]);
        }
        if(doubleLetterValue(word, x, y, isHorizontal)>0) {
            wordScore=wordScore+doubleLetterValue(word, x, y, isHorizontal);
        }
        if(tripleLetterValue(word, x, y, isHorizontal)>0) {
            wordScore=wordScore+(tripleLetterValue(word, x, y, isHorizontal)*2);
        }
        if(isDoubleWord(word, x, y, isHorizontal)){
            wordScore=wordScore*2;
        }
        if(isTripleWord(word, x, y, isHorizontal)){
            wordScore=wordScore*3;
        }

            return wordScore;
    }


    public int doubleLetterValue(Word word, int x, int y, Boolean isHorizontal){
        int doubleLetterValue=0;
        String wordInStringForm = word.getLetters();
        String[] newString = wordInStringForm.split("");
        if(isHorizontal) {
            for (int i = 0; i < word.getLength(); i++) {
                if (board.getLETTER_MULTIPLIERwithLocation(x, y + i) == 2) {
                    doubleLetterValue += getScoreOfTile(newString[i]);
                }
            }
        }
        else{
            for (int i = 0; i < word.getLength(); i++) {
                if (board.getLETTER_MULTIPLIERwithLocation(x+i, y) == 2) {
                    doubleLetterValue += getScoreOfTile(newString[i]);
                }
            }
        }
        return doubleLetterValue;
    }

    public int tripleLetterValue(Word word, int x, int y, Boolean isHorizontal){
        int tripleLetterValue=0;
        String wordInStringForm = word.getLetters();
        String[] newString = wordInStringForm.split("");
        if(isHorizontal) {
            for (int i = 0; i < word.getLength(); i++) {
                if (board.getLETTER_MULTIPLIERwithLocation(x, y + i) == 3) {
                    tripleLetterValue += getScoreOfTile(newString[i]);
                }
            }
        }
        else{
            for (int i = 0; i < word.getLength(); i++) {
                if (board.getLETTER_MULTIPLIERwithLocation(x+i, y) == 3) {
                    tripleLetterValue += getScoreOfTile(newString[i]);
                }
            }
        }
        return tripleLetterValue;
    }

    public Boolean isDoubleWord(Word word, int x, int y, Boolean isHorizontal){
        Boolean check = false;
        for (int i = 0; i < word.getLength(); i++) {
            if (board.getWORD_MULTIPLIERwithLocation(x, y + i) == 2) {
                return true;
            }
            if (board.getWORD_MULTIPLIERwithLocation(x+i, y) == 2) {
                return true;
            }
        }
        return check;
    }

    public Boolean isTripleWord(Word word, int x, int y, Boolean isHorizontal){
        Boolean check = false;
        for (int i = 0; i < word.getLength(); i++) {
            if (board.getWORD_MULTIPLIERwithLocation(x, y + i) == 3) {
                return true;
            }
            if (board.getWORD_MULTIPLIERwithLocation(x+i, y) == 3) {
                return true;
            }
        }
        return check;
    }




}
