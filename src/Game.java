import java.util.Scanner;

public class Game
{
    //API Connection constants
    private final static String APIURL = "https://deckofcardsapi.com/api/deck";

    public static void main(String[] args) throws Exception {
        Game theGame = new Game();
        Deck deckOfCards = new Deck(10);
        deckOfCards.createDeck();
        System.out.println("Match the Cards, un-flipped cards are represented with *, and flipped cards show their values");
        Game.shuffleCards(deckOfCards.getDeck());
        UserInterface.displayCards(deckOfCards.getDeck());
        for(while ){

        }

        theGame.matchCards(deckOfCards.getDeck());
    }

    public Card[] matchCards(Card[] cardArray)
    {
        int maxCords = cardArray.length;
        int counter = 0;
        Scanner CordScanner;
        int cord = -1;
        Card[] tempCards = new Card[2];
        //Takes User Input and checks to see if cards are matched
        while (counter < 2) {
            CordScanner = new Scanner(System.in);
            System.out.println("Input card cord: ");
            cord = CordScanner.nextInt();

            for (int i = 0; i < maxCords; i++)
            {
                if(cord == i)
                {
                    cardArray[i].setSelected();
                    tempCards[i] = cardArray[i];
                    System.out.println(cardArray[i]);
                }
            }
            counter++;
        }
        if(tempCards[0].getSuit() == tempCards[1].getSuit())
        {
            if(tempCards[0].getValue().equals(tempCards[1].getValue()))
            {
                cardArray[cord].flipCard();
                cardArray[cord].matchCard();
                cardArray[cord].setSelected();
                System.out.println("Cards are matched");
            }
        }
        return cardArray;
    }

    public static int randomNumber(int i)
    {
        return (int) (Math.random() * i);
    }

    public static void shuffleCards(Card[] cardArray)
    {
        int[] randomNumberHolder = new int[cardArray.length];
        for(int i = 0; i < cardArray.length; i++)
        {
            Card[] tempCardArray = new Card[cardArray.length];

            randomNumberHolder[i] = randomNumber(cardArray.length);

            while (randomNumberHolder[i] == i){
                randomNumberHolder[i] = randomNumber(cardArray.length);
            }

            for(int j : randomNumberHolder)
            {
                if (j == randomNumberHolder[i])
                {
                    randomNumberHolder[i] = randomNumber(cardArray.length);
                }
            }

            tempCardArray[i] = cardArray[randomNumberHolder[i]];

            cardArray = tempCardArray;
        }
    }

    public static String getURL()
    {
        return APIURL;
    }
}
