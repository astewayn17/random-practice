package com.pluralsight;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    // Variable introductions
        Scanner input = new Scanner(System.in);

        // Introducing the system
        boolean keepGoing = true;
        while (keepGoing) {

            // Initializing the name validation loop with the boolean 'nameConfirmed' ----------------------------------
            boolean nameConfirmed = false;
            while (!nameConfirmed) {  // Starting off the while loop ---------------------------------------------------
                System.out.print("\nPlease enter your name: ");  // Requesting the name of the user --------------------
                String [] userNameInput = input.nextLine().toLowerCase().trim().split("\\s+");
                // ^^^ Storing the input of the userName into a string array that splits the first and last name with
                //     the space in between and ('\\s+') also removes the extra spaces in between the names that the
                //     trim does not handle. Also makes the name lowercase to make capitalization easier later on.

                // Starting off with an if conditional that asks if the amount of names is less than 2 (which would
                // make it invalid).
                if (userNameInput.length < 2) {
                    System.out.println("\nInvalid input: first and last name required!");
                    continue;   // Brings back to the top of the nearest while loop (while (!nameConfirmed))
                }

                // Introducing variable userName to store parts of username input array. This will call out the first
                // word (userNameInput[0]) in the input and using substring, will point to the first letter
                // (substring(0,1)) and make it uppercase and the letters after that are lowercase because it was standard
                // at the userNameInput. Same thing for the last name.
                String userName = userNameInput[0].substring(0,1).toUpperCase() + userNameInput[0].substring(1)
                        + " " + userNameInput[1].substring(0,1).toUpperCase() + userNameInput[1].substring(1);
                System.out.println("\nIs [" + userName + "] correct?"); // Prints out the concatenated confirmation.
                System.out.print("Yes (Y) or No (N)? "); // Asks the specific yes or no user option
                char nameAnswer = input.nextLine().trim().toUpperCase().charAt(0); // Introducing variable nameAnswer
                // as an input that is trimmed for side spaces and converted to upper case and only records the first
                // element (Y or N)

                if (nameAnswer == 'Y') {  // User confirms input and closes the loop
                    System.out.println("\nYour name is " + userName + ".");
                    nameConfirmed = true; // Closes the loop with the nameConfirmed parameter
                   // keepGoing = false;  // Closes the program with the keepGoing parameter
                } else if (nameAnswer == 'N') { // If the answer is no, it will restart the loop at the nearest while loop
                    continue;
                } else { // Blanket invalid input coverage
                    System.out.println("\nInvalid input. Y or N?");
                }
            }  // <--- nameConfirmed while loop end --------------------------------------------------------------------

            // Asking the user for their fav sport
            boolean sportConfirmed = false;
            while (!sportConfirmed) {

                System.out.println("\n======= Sport Stuff =======\n");
                System.out.print("What is your favorite sport? ");

                String [] sportInput = input.nextLine().trim().split("\\s+");
                //
                for (String word : sportInput) {
                    if (word.matches("\\d+")) {
                        System.out.println("\nThis is an invalid data type! \nPlease input word(s) only.");
                    } else {
                        System.out.println("Is [" + String.join(" ", sportInput) + "] correct?");
                    }
                }
            }

        } // <--- keepGoing while loop end -----------------------------------------------------------------------------

    }
}
