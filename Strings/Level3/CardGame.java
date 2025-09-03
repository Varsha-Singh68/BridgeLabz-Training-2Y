package Strings;
import java.util.*;

public class CardGame {
	static String[] initDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int k = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    static String[][] distribute(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cards cannot be distributed equally.");
            return null;
        }
        int cardsEach = n / players;
        String[][] distributed = new String[players][cardsEach];
        int k = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsEach; j++) {
                distributed[i][j] = deck[k++];
            }
        }
        return distributed;
    }

    static void printPlayers(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();

        String[][] distributed = distribute(deck, n, players);
        printPlayers(distributed);

	}

}
