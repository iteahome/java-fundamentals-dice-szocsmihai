import java.util.Scanner;

// Patlu and Motu move a number of n bricks from a pile and place them to a new stack.
// They each get one turn.
// Every i'th round, Patlu gets to move a number of i brick, while Motu moves 2*i bricks.
// Whoever places the last brick wins.

public class M17_Bricks {
    public static void main(String[] args) {
//  STEP 1: GET THE NUMBER OF BRICKS FROM THE USER (IT'S MORE FUN THIS WAY):
        System.out.println("Enter number of bricks in initial stack:");
        Scanner keyboardScanner = new Scanner(System.in);
        int n = keyboardScanner.nextInt();
//  STEP 2: THE NUMBER OF BRICKS REMAINING IN THE LAST ROUND DETERMINES THE WINNER, SO WE FIGURE THAT OUT:
        int i;
        for (i = 1; n > 3 * i; i++) {
            n = n - 3 * i;
        }
        System.out.println("The last round is round #" + i + ". The number of bricks remaining is " + n + ".");
        System.out.println("Patlu's number of bricks to place is " + i + ", Motu's  number of bricks to place is " + i * 3 + ".");
        if (n - i > 0) {
            System.out.println("Patlu's turn passes, but not all bricks have been moved. Motu wins!");
        } else {
            System.out.println("Patlu moves the last brick during his turn and wins!");
        }
    }
}