import java.util.Random;
import java.util.Scanner;

public class knotsncross {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//this part returns the "random" AI Choice
				String Choice = "initiate";
				String playerchoice = "blank";
				boolean win = false;
				boolean draw = false;
				//create new random, and generate a random number between 1 and 3
				Random rand = new Random();
				int decider = rand.nextInt(3);
				//System.out.println(decider);
				//check what the random number is and assign an AI choice
				switch (decider){
				case(1):
					Choice = "Paper";
				break;
				case(2):
					Choice = "Rock";
				break;
				case(0):
					Choice = "Scissors";
				}
				
				//take user input
				System.out.println("Enter your choice;");
				playerchoice = scanner.next();
					
				scanner.close();
				
				
				switch(playerchoice) {
				case("Scissors"):
					if (Choice == "Paper") {
						win = true;
					}
					else if (Choice == "Scissors") {
						draw = true;
					}
					else {
						win = false;
					}
				break;
				case("scissors"):
					if (Choice == "Paper") {
						win = true;
					}
					else if (Choice == "Scissors") {
						draw = true;
					}
					else {
						win = false;
					}
				break;
				case("Paper"):
					if (Choice == "Rock") {
						win = true;
					}
					else if (Choice == "Paper") {
						draw = true;
					}
					else {
						win = false;
					}
				break;
				case("paper"):
					if (Choice == "Rock") {
						win = true;
					}
					else if (Choice == "Paper") {
						draw = true;
					}
					else {
						win = false;
					}
				break;
				case("Rock"):
					if (Choice == "Scissors") {
						win = true;
					}
					else if (Choice == "Rock") {
						draw = true;
					}
					else {
						win = false;
					}
				break;
				case("rock"):
					if (Choice == "Scissors") {
						win = true;
					}
					else if (Choice == "Rock") {
						draw = true;
					}
					else {
						win = false;
					}
				break;
				}
			
				if (win == true) {
					try
					{
					    Thread.sleep(100);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("3");
					try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("2");
					try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("1");try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println(Choice);
					System.out.println("Congratulations you have won!");
				}
				else if (draw == true) {
					try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("3");
					try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("2");
					try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("1");try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println(Choice);
					System.out.println("Draw");
				}
				else {
					try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("3");
					try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("2");
					try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("1");try
					{
					    Thread.sleep(500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println(Choice);
					System.out.println("Game Over");
					System.out.println("You Lose");
				}
			
		}		
	}


	
