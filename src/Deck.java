import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.*;
import java.net.*;
import java.util.Map;

public class Deck
{
    private Card[] cardArray;

    Deck(int cardArrayLength)
    {
        cardArray = new Card[cardArrayLength];
    }


    public void createDeck() throws Exception
    {
        //Creates temporary string to hold URL for use

        String requestURL = Game.getURL() + "/new" + "/draw" + "/?count=" + cardArray.length;
        //Creates a URL with the request URL string

        URL url = new URL(requestURL);
        //Goes and gets input from URL
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));
        //Parses JSON input from URL
        JSONParser parser = new JSONParser();
        JSONObject deckOfCardsJSON = (JSONObject) parser.parse(in);
        //Holds the JSON array of Cards gotten from the API
        JSONArray cards = (JSONArray)deckOfCardsJSON.get("cards");

        //for loop for filling cardArray with cards and is used to test key : value pairs from the JSON and puts it into the deck, or cardArray
        for (int i = 0; i < cardArray.length; i++)
        {
            //cardChar for holding final suit of the card from the JSON key :value pair and put it into the final card array
            char cardChar = '0';
            //cardValueString for holding final value of the card from the JSON key : value pair and put it into the final card array
            String cardValueString = "";
            //Creates a usable JSON map to be able to get key value pairs of drawn cards.
            Map cardMap = (Map)cards.get(i);

            //Test array to hold temporary values of card values King - 1
            String testArray[] = {"KING", "QUEEN", "JACK", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
            //For loop to iterate over testArray and make cardValueString a value to put into a card for the final cardArray
            for (String j : testArray) {
                //Getting key : value pair from key "value" to and checking if it is equal to the string in testArray at j
                if(cardMap.get("value").toString().equalsIgnoreCase(j))
                {
                    cardValueString = j;
                }
            }

            //Test array to hold temporary values of D S C H for Diamond Spade Club and Heart for card suit
            char testArrayChar[] = {'D', 'S', 'C', 'H'};
            //For loop to iterate over testArrayChar and make cardChar a value to put into a card for the final cardArray
            for (char j : testArrayChar) {
                //Getting key : value pair from key "suit" and stores it in suit holder
                String suitHolder = cardMap.get("suit").toString();
                //If the fist letter of the suit key : pair return equals the letter in testArrayChar at j, it sets the final char to j
                if(suitHolder.charAt(0) == j){
                    cardChar = j;
                }
            }

            //Filling final card array of cards with cardChar being the suit, and cardValueString being the value, default is false false for face up and matched
            cardArray[i] = new Card(cardChar, cardValueString, false,false);
            cardArray[i + 1] = new Card(cardChar, cardValueString, false,false);
            i++;
        }

        for (int i = 0; i < cardArray.length; i++)
        {
            System.out.print(cardArray[i].getSuit());
            System.out.println(cardArray[i].getValue());
        }

    }

    public static void main(String[] args) throws Exception {
        Deck d = new Deck(10);
        d.createDeck();
    }

    public void shuffleCards()
    {
        //cardArray = the shuffled deck from API
        //Set Card array to the class variable this.cardArray
    }
}
