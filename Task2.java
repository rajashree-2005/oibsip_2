// Task 2 number guessing game

import java.util.Scanner;
public class Task2 {
    // Function that implements the
    // number guessing game
    public static void guessingNumberGame(){
        Scanner sc = new Scanner(System.in);
        // Generate the numbers
        int number = 1 + (int)(100* Math.random());
        // Given k trials
        int k = 6;
        int i, g;
        System.out.println("\nPlease chose a number between 1 to 100 \nGuess the number within " + k + " trials\n");
        // Iterate over k Trials
        for (i = 0; i < k; i++){
            System.out.println("Guess the number :");
            // Take input for guessing
            g = sc.nextInt();
            // If the number is guessed
            if (number == g){
                System.out.println("\nCongratulations!" + " You guessed the correct number.");
                break;
            }
            else if (number > g && i != k - 1){
                System.out.println("The number is greater than " + g);
            }
            else if (number < g && i != k - 1){
                System.out.println("The number is lesser than " + g);
            }
        }
        if (i == k){
            System.out.println("\nSorry! \nYou have exhausted " + k + " trials");
            System.out.println("The number was " + number);
			System.out.println("\nBetter luck next time");
        }
    }
    // Driver Code
    public static void main(String arg[])
    {
        // Function Call
        guessingNumberGame();
    }
}