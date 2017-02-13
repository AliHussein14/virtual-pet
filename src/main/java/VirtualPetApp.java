import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {
		VirtualPet snake = new VirtualPet();
		Scanner input = new Scanner(System.in);
		int userAnswer = 0;

		snake.snake();

		snake.tick();
        // virtual pet level
		System.out.println("\n\nSammy the Snake\nHunger: " + snake.getHunger() + "\nThirst: " + snake.getThirst()
				+ "\nPlay: " + snake.getBored() + "\nSleep: " + snake.getTired() + "\n\n");

		// virtual pet menu 
		System.out.println("What would you like to do ?\n1. Feed Sammy.\n2. Give Sammy water"
				+ "\n3. Play with the Sammy\n4. Put Sammy to sleep\n\n");
		// asking for the user input
		userAnswer = input.nextInt();
		switch (userAnswer) {
		case 1:
			if (snake.getHunger() <= 6) {
				System.out.println("Sammy is full, He declines the food"); // sammy is full, you don't to feed him
			} else {
				snake.feed();
				System.out.println("Good job, Sammy is full and happy :) "); // feeding sammy
			}
			break;

		case 2:
			System.out.println("You gave Sammy water");// giving sammy water
			break;

		case 3:
			System.out.println("You played with Sammy"); // playing with sammy
			break;

		case 4:
			System.out.println("You put Sammy to sleep"); // put sammy to sleep
			break;

		default:
			System.out.println("You had a wrong choice"); // choosing a different number will say its wrong
			break;
		}

		System.out.println("\n\nNow Sammy the Snake is: \nHunger: " + snake.getHunger() + "\nThirst: " + snake.getThirst()
				+ "\nPlay: " + snake.getBored() + "\nTired: " + snake.getTired() + "\n\n");
		
		System.out.println( "Would you like to adopt Sammy the Snake ? " ); // asking user if he/she wants to adopt the pet
		System.out.print("1. Yes");
		System.out.print(" 2. Yes");
		userAnswer = input.nextInt();
		if (userAnswer == 1);
		System.out.println("You have adopted Sammy :)");
	    if (userAnswer == 2) {
	    	System.out.println(" ");
	    	
	    System.out.println(" ");
	    System.out.println("Goodbye !");
	
	}
}
}