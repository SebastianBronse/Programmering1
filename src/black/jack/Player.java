package black.jack;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Player {
	private int playerNumber = 0;
	private static int numberOfPlayers = 0;
	
	private int dollar = 200;
	private int currentBet = 0;
	private Scanner playerScanner = new Scanner(System.in);
	private String name = "John Doe";
	private ArrayList<Card> playersCards = new ArrayList<>();
	
	public Player() {
		numberOfPlayers++;
		playerNumber = numberOfPlayers;
		//name = playerScanner.nextLine();
		name = JOptionPane.showInputDialog("Player "+ playerNumber + " Select a name: ");

	}
	
	public Player(boolean dealer) {
		name = "Dealer";
	}
	public String getName () {
		return name;
	}
	
	public void addCard(Card newCard) {
		playersCards.add(newCard);
	}
	public boolean getOneMoreCard() {
		while (true) {
			String answer = playerScanner.nextLine();
			if (answer.equalsIgnoreCase("yes")) {
				return true;
			} else if (answer.equalsIgnoreCase("no")) {
				return false;
			} else {
			}
		}
	}
	
	
	public int getCardsValue() {
		int value = 0;
		if (playersCards.size() == 0)
			return 0;
		for (int i = 0; i < playersCards.size(); i++) {
			value  += playersCards.get(i).getValue();
		}
		return value;
		
	}
		public void printCards() {
			for (int i = 0; i < playersCards.size(); i++) {
				System.out.println(playersCards.get(i).getCard());
			}
		}
			
		public boolean bet() {
			System.out.println("Do you want to bet? (Yes/No)");
			
			while (true) {
				int answer = JOptionPane.showConfirmDialog(null, name + ", do you want to bet?","alert", JOptionPane.YES_NO_OPTION);
				if (answer == 0) {
					break;
				} else if (answer == 1) {
					return false;
				}
			}
			System.out.println("How much do you want to bet? ");
			while (true) {
				try {
					int bet = Integer.parseInt (JOptionPane.showInputDialog(null, "How much do you want to bet? "));
				if (bet > dollar) {
					System.out.println("You only have: " + dollar);
					JOptionPane.showMessageDialog(null, "You only have: " + dollar);
				} else if (bet <= 0) {
					System.out.println("You have to enter a positive amount of money!");
					JOptionPane.showMessageDialog(null, "You have to enter a positive amount of money!");
				} else {
					dollar -= bet;
					currentBet = bet;
					return true;
				}
			} catch (Exception e) {
				System.out.println("Not an integer!");
				JOptionPane.showMessageDialog(null, "Not an integer!");
			}
		}
	}		
	public int getCurrentBet(){
			return currentBet;
	}
		
	public void set(boolean won) {
		if (won == true) {
			System.out.println("Congratulations you won! You doubled your bet.");
			JOptionPane.showMessageDialog(null, "Congratulations you won! You doubled your bet.");
			dollar += 2 * currentBet;
		} else {
			System.out.println("Congratulations you lost! You lost your bet.");
			JOptionPane.showMessageDialog(null, "you lost. You lost your bet.");
		}	
		
		currentBet = 0;
	}
}

