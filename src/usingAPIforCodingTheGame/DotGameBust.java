package usingAPIforCodingTheGame;

import java.util.ArrayList;
import pack01.myClass;

public class DotGameBust
{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three = new DotCom();
        DotCom four = new DotCom();
        one.setName("FaceBook");
        two.setName("LinkedIn");
        three.setName("Amazon");
        four.setName("Google");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        dotComList.add(four);

        System.out.println("Your goal is to sink the following four dot coms.");
        System.out.println("FaceBook, LinkedIn, Amazon, Google");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        for(DotCom dotComToSet: dotComList){
            ArrayList<String> newLocations = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocations);
        }
    }

    private void startPlaying(){

        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Please enter a guess");
            checkUserGuess(userGuess);
        }

        finishGame();
    }

    private void checkUserGuess(String userGuess){

        numOfGuess++;
        String result = "miss";

        for(DotCom dotComTest: dotComList){
            result = dotComTest.checkGuess(userGuess);

            if (result.equals("hit"))  break;

            if (result.equals("kill")){
               dotComList.remove(dotComTest);
               break;
            }
        }

        System.out.println(result);
    }

    private void finishGame(){

        System.out.println("All the Dot Coms are dead! Your stock is now worthless.");

        System.out.println("You took "+numOfGuess+" times to guess.");

    }

    public static void main(String[] args) {

        myClass one = new myClass();
        one.show();

        DotGameBust game = new DotGameBust();
        game.setUpGame();
        game.startPlaying();

    }


}


class DotCom
{
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locations){
        locationCells = locations;
    }
    public void setName(String name1){
        name = name1;
    }

    public String checkGuess(String guess){
        String result = "miss";

        int index = locationCells.indexOf(guess);

        if(index>=0){
            locationCells.remove(index);
            result = "hit";
            if(locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Yeah! You have sunk the "+name+"!");
            }
        }

        return result;
    }
}