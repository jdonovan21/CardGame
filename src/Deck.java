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
        String requestURL;

        requestURL = Game.getURL() + "/new" + "/draw" + "/?count=" + cardArray.length;

        URL url = new URL(requestURL);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));

        JSONParser parser = new JSONParser();
        JSONObject deckOfCardsJSON = (JSONObject) parser.parse(in);

        JSONArray cards = (JSONArray)deckOfCardsJSON.get("cards");

        System.out.println(requestURL);

        for (int i = 0; i < cardArray.length; i++)
        {
            char cardChar = '0';
            String cardValueString = "";
            Map cardMap = (Map)cards.get(i);

            String testArray[] = {"KING", "QUEEN", "JACK", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};


            for (String j : testArray) {
                if(cardMap.get("value").toString().equalsIgnoreCase(j))
                {
                    cardValueString = j;
                }
            }

            char testArrayChar[] = {'D', 'S', 'C', 'H'};

            for (char j : testArrayChar) {
                String suitHolder = cardMap.get("suit").toString();
                if(suitHolder.charAt(0) == j){
                    cardChar = j;
                }
            }

            cardArray[i] = new Card (cardChar, cardValueString, true,false);
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
