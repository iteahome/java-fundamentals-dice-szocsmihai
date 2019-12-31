/*

There are N girls rolling a dice one at a time.
If one of them rolls a 6, that girl keeps rolling until she gets any other number. We don't like 6.

All we know is the sequence of dice rolls.
We need to find out the number of girls (N) playing the game based on the input and the rules of the game.
Or, if the input is invalid we need to alert this fact.

INPUT: array;
OUTPUT: N or -1;

*/

import java.util.ArrayList;
import java.util.Scanner;

public class M17_RollTheDice {
    public static void main(String[] args) {

//      STEP 1: WE ASK FOR DICE ROLLS:
        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("TYPE THE DICE ROLLS (FROM 1 TO 6), SEPARATED BY \"ENTER\". TYPE 0 (OR ANY OTHER INTEGER THAN 1 TO 6) TO END INPUT:");
        int myInput = myScanner.nextInt();
        while (myInput > 0 && myInput < 7) {
            myArray.add(myInput);
            myInput = myScanner.nextInt();
        }

//      STEP 2 - DETEMINE NUMBER OF GIRLS:
        int numberOfGirls = 1;
        for (int i = 0; i < myArray.size() - 1; i++) {
            if (myArray.get(i) != 6) {
                numberOfGirls++;
            }
        }

//      STEP 3 - CHECK IF SEQUENCE IS VALID AND OUTPUT CONCLUSION:
        if (myArray.get(myArray.size() - 1) != 6) {
            System.out.println("NUMBER OF GIRLS IS: " + numberOfGirls);
        } else {
            System.out.println("SEQUENCE INVALID. CAN'T END ON A 6.");
        }
    }
}