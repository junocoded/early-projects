import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        // I have created a scanner to find the integer that is going to be generated, in order for the if statements to function later
        int maxNum = 100;
        int minNum = 0;
        int range = (100-0)+1;
        int randNum = (int) (Math.random() * range) + minNum; // This is producing our random integer, confinded between the values of maxNum and minNum
        int guess = -1; // This variable allows the program to print a statement so the user knows how to use it, see 16
      
        while (guess != randNum)  {
            
            if(guess == -1) {
                System.out.println("Please enter a number between 1-100.");
                guess = scanner.nextInt();
                continue;
            } 
            if(guess < randNum) {
                System.out.println("The correct answer is higher. Try again.");
                guess = scanner.nextInt();
                continue;
            }
            else if(guess > randNum) {
                System.out.println("The correct answer is lower. Try again.");
                guess = scanner.nextInt();
                continue;
            }
            
        }

		scanner.close();
		
        System.out.println("Congratulations! The answer was " + randNum);
      
    }
}