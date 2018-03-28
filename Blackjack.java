package blackjack;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Blackjack {

    static Scanner Scanner = new Scanner(System.in);
    
    static String[] cards = new String[52];
    static Random randomizer = new Random();
    static String yourFirstCard = "";
    static String yourSecondCard = "";
    static String dealersFirstCard = "";
    static String dealersSecondCard = "";
    static int cardNumber;
    static String card = "";
    static int handValue = 0;
    static String decision = "";
    static int yourHandValue = 0;
    static int dealersHandValue = 0;
    static String yourThirdCard = "";
    static String dealersThirdCard = "";
    static String yourFourthCard = "";
    static String dealersFourthCard = "";
    static int cash = 0;
    static int bet = 0;
    static String playAgain = "";
    
    public static String drawCard() {
            // do is used such that card will keep randomizing until it is a unique card
            do {
                cardNumber = randomizer.nextInt(51-0) + 0;
                card = cards[cardNumber];
            }while(cards[cardNumber].equals(yourFirstCard) || cards[cardNumber].equals(yourSecondCard)
                    || cards[cardNumber].equals(dealersFirstCard) || cards[cardNumber].equals(dealersSecondCard));
        return card;
    }
    
    public static int getHandValue(String card, int handValue) {
        if (card.contains("Two")){
            handValue = 2;
        }
        if (card.contains("Three")){
            handValue = 3;
        }
        if (card.contains("Four")){
            handValue = 4;
        }
        if (card.contains("Five")){
            handValue = 5;
        }
        if (card.contains("Six")){
            handValue = 6;
        }
        if (card.contains("Seven")){
            handValue = 7;
        }
        if (card.contains("Eight")){
            handValue = 8;
        }
        if (card.contains("Nine")){
            handValue = 9;
        }
        if (card.contains("Ten") || card.contains("Jack") || card.contains("Queen")
                || card.contains("King")){
            handValue = 10;
        }
        if (card.contains("Ace")){
            if (yourHandValue <= 10) {
                handValue = 11;
            }
            if (yourHandValue > 10) {
                handValue = 1;
            }
        }
        return handValue;
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        // Creating deck
        // Hearts
        cards[0] = "Ace of Hearts";
        cards[1] = "Two of Hearts";
        cards[2] = "Three of Hearts";
        cards[3] = "Four of Hearts";
        cards[4] = "Five of Hearts";
        cards[5] = "Six of Hearts";
        cards[6] = "Seven of Hearts";
        cards[7] = "Eight of Hearts";
        cards[8] = "Nine of Hearts";
        cards[9] = "Ten of Hearts";
        cards[10] = "Jack of Hearts";
        cards[11] = "Queen of Hearts";
        cards[12] = "King of Hearts";
        // Spades
        cards[13] = "Ace of Spades";
        cards[14] = "Two of Spades";
        cards[15] = "Three of Spades";
        cards[16] = "Four of Spades";
        cards[17] = "Five of Spades";
        cards[18] = "Six of Spades";
        cards[19] = "Seven of Spades";
        cards[20] = "Eight of Spades";
        cards[21] = "Nine of Spades";
        cards[22] = "Ten of Spades";
        cards[23] = "Jack of Spades";
        cards[24] = "Queen of Spades";
        cards[25] = "King of Spades";
        // Clubs
        cards[26] = "Ace of Clubs";
        cards[27] = "Two of Clubs";
        cards[28] = "Three of Clubs";
        cards[29] = "Four of Clubs";
        cards[30] = "Five of Clubs";
        cards[31] = "Six of Clubs";
        cards[32] = "Seven of Clubs";
        cards[33] = "Eight of Clubs";
        cards[34] = "Nine of Clubs";
        cards[35] = "Ten of Clubs";
        cards[36] = "Jack of Clubs";
        cards[37] = "Queen of Clubs";
        cards[38] = "King of Clubs";
        // Diamonds
        cards[39] = "Ace of Diamonds";
        cards[40] = "Two of Diamonds";
        cards[41] = "Three of Diamonds";
        cards[42] = "Four of Diamonds";
        cards[43] = "Five of Diamonds";
        cards[44] = "Six of Diamonds";
        cards[45] = "Seven of Diamonds";
        cards[46] = "Eight of Diamonds";
        cards[47] = "Nine of Diamonds";
        cards[48] = "Ten of Diamonds";
        cards[49] = "Jack of Diamonds";
        cards[50] = "Queen of Diamonds";
        cards[51] = "King of Diamonds";
        
        // Game Start:
        System.out.println("[CONSOLE] Cashier says: \"How much cash would you like to turn into tokens?\" ");
        System.out.print("[CONSOLE] Your answer: ");
        cash = Scanner.nextInt();
        if(cash <= 0) {
            do{
                System.out.println("[CONSOLE] The cashier says \"Sorry, I didn't quite catch that.\"");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("[CONSOLE] Cashier says \"How much cash would you like to turn into tokens?\" ");
                System.out.print("[CONSOLE] Your answer: ");
                cash = Scanner.nextInt();
            }while (cash <= 0);
        }
        try {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("..");            
            TimeUnit.SECONDS.sleep(1);    
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();            
        } catch (InterruptedException ex) {
            Logger.getLogger(Blackjack.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("[CONSOLE] ... You say \"" + cash + " dollars worth of tokens, please.\"");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("[CONSOLE] The cashier hands you " + cash + " dollars worth of tokens.");
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("[CONSOLE] You walk towards the blackjack table and take a seat.");
        TimeUnit.SECONDS.sleep(1);
        
        yourFirstCard = drawCard();
        yourSecondCard = drawCard();
        dealersFirstCard = drawCard();
        dealersSecondCard = drawCard();
        
        do{
            System.out.println("[CONSOLE] The dealer says \"How much would you like to bet?\"");
            System.out.print("[CONSOLE] You say: ");
            bet = Scanner.nextInt();
            if (bet > cash || bet <= 0) {
                do {
                    System.out.println("[CONSOLE] The dealer says \"I don't understand.\"");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("[CONSOLE] The dealer says \"How much would you like to bet?\"");
                    System.out.println("[CONSOLE] You say: ");
                }while (bet > cash || bet <= 0);
            }
            cash = cash - bet;
            TimeUnit.SECONDS.sleep(3);
            System.out.println("You put " + bet + " tokens on the table.");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("[CONSOLE] The dealer hands you two cards.");
            System.out.println("[CONSOLE] Your hand is " + yourFirstCard + " and " + yourSecondCard + ".");
            //System.out.println("[HIDDEN] The dealers' hand is " + dealersFirstCard + " and " +
                    //dealersSecondCard + ".");

            handValue = getHandValue(yourFirstCard, yourHandValue);
            handValue = handValue + getHandValue(yourSecondCard, yourHandValue);
            yourHandValue = handValue;
            //System.out.println("[HIDDEN] Your total hand value is: " + yourHandValue + ".");

            handValue = getHandValue(dealersFirstCard, dealersHandValue);
            handValue = handValue + getHandValue(dealersSecondCard, dealersHandValue);
            dealersHandValue = handValue;
            //System.out.println("[HIDDEN] The dealers' total hand value is: " + dealersHandValue + ".");

            // Mid phase

            System.out.print("[CONSOLE] Hit or Stand?: ");
            decision = Scanner.next();

            // Dealer's logic

            if (dealersHandValue <= 10) {
                System.out.println("The dealer hits.");
                dealersThirdCard = drawCard();
                dealersHandValue = dealersHandValue + getHandValue(dealersThirdCard, dealersHandValue);
                //System.out.println("[HIDDEN] The Dealer's hand is " + dealersFirstCard + ", " + dealersSecondCard +
                        //", and " + dealersThirdCard + ".");
                //System.out.println("[HIDDEN] The dealer's total hand value is: " + dealersHandValue);
            } else {
                System.out.println("[CONSOLE] The dealer stands.");
            }

            if(decision.equals("Hit")) {
                yourThirdCard = drawCard();
                yourHandValue = yourHandValue + getHandValue(yourThirdCard, yourHandValue);
                System.out.println("[CONSOLE] Your hand is " + yourFirstCard + ", " + yourSecondCard +
                        ", and " + yourThirdCard + ".");
                //System.out.println("[HIDDEN] Your total hand value is: " + yourHandValue);
                if (yourHandValue == 21) {
                    bet = bet * 4;
                    System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                    System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("[ALERT] Blackjack! You won " + bet + " tokens!");
                    cash = cash + bet;
                    System.out.println("[CONSOLE] You now have " + cash + " tokens.");
                }
                if (yourHandValue > 21) {
                    System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                    System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("[ALERT] Busted!");
                    bet = 0;
                    System.out.println("[CONSOLE] You now have " + cash + " tokens.");
                }
                if (yourHandValue < 21) {
                    System.out.print("[CONSOLE] Hit or Stand?: ");
                    decision = Scanner.next();
                    if(decision.equals("Hit")) {
                        yourFourthCard = drawCard();
                        yourHandValue = yourHandValue + getHandValue(yourFourthCard, yourHandValue);
                        System.out.println("[CONSOLE] Your hand is " + yourFirstCard + ", " + yourSecondCard + 
                                ", " + yourThirdCard + ", and " + yourFourthCard + ".");
                        //System.out.println("[HIDDEN] Your total hand value is: " + yourHandValue);
                        if (yourHandValue == 21) {
                            bet = bet * 4;
                            System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                            System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("[ALERT] Blackjack! You won " + bet + " tokens!");
                            cash = cash + bet;
                            System.out.println("[CONSOLE] You now have " + cash + " tokens.");
                        }
                        if (yourHandValue > 21) {
                            System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                            System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("[ALERT] Busted!");
                            bet = 0;
                            System.out.println("[CONSOLE] You now have " + cash + " tokens.");
                        }
                    } else {
                if (decision.equals("Stand")) {
                    if (yourHandValue > dealersHandValue) {
                        bet = bet * 2;
                        System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                        System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("[ALERT] Congratulations! You won " + bet + " tokens!");
                        cash = cash + bet;
                        System.out.println("[CONSOLE] You now have " + cash + " tokens.");
                    }
                    if (yourHandValue == dealersHandValue) {
                        cash = cash + bet;
                        System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                        System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("[ALERT] Tie!");
                        System.out.println("[CONSOLE] You now have " +  cash + " tokens.");
                    }
                    if (yourHandValue < dealersHandValue) {
                        System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                        System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("[ALERT] You lose!");
                        bet = 0;
                        System.out.println("[CONSOLE] You now have " + cash + " tokens.");
                    }
                }
            }
                }
            } else {
                if (decision.equals("Stand")) {
                    if (yourHandValue > dealersHandValue) {
                        bet = bet * 2;
                        System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                        System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("[ALERT] You won " + bet + " tokens!");
                        cash = cash + bet;
                        System.out.println("[CONSOLE] You now have " + cash + " tokens.");
                    }
                    if (yourHandValue == dealersHandValue) {
                        System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                        System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("[ALERT] Tie!");
                    }
                    if (yourHandValue < dealersHandValue) {
                        System.out.println("[ALERT] Your total hand value is: " + yourHandValue + ".");
                        System.out.println("[ALERT] The dealer's hand value is: " + dealersHandValue + ".");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("[ALERT] You lose!");
                    }
                }
            }
            System.out.println("[CONSOLE] The dealer says \"Would you like to play again?\"");
            System.out.print("[CONSOLE] You answer: ");
            playAgain = Scanner.next();
            playAgain = playAgain.toLowerCase();
        }while(playAgain.contains("ye") && cash > 0);
        System.out.println("[CONSOLE] The dealer says \"I'll take that as a no.\"");
        TimeUnit.SECONDS.sleep(1);
        if (cash > 0) {
            System.out.println("[CONSOLE] You exchanged your tokens for cash and"
                + " went home with " + cash + " bucks.");            
        }else {
            System.out.println("[CONSOLE] You went home with nothing.");
        }
    }
}