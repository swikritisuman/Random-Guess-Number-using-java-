package project1;

import java.util.*;

public class guessnumber {
    public static void main(String[] args) {
        // Mini project: Keep guessing the random number until guessed correctly
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100); // Generate a random number between 0 and 99
        int userNumber = -1; // Initialize with a value that ensures loop execution

        do {
            System.out.println("Guess my number:");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Wohooo... Correct number!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large.");
            } else {
                System.out.println("Your number is too small.");
            }
        } while (userNumber >= 0); // Ensure loop continues until correct number is guessed

        System.out.println("The correct number was: " + myNumber);
        sc.close();
    }
}
