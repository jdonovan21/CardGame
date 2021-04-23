public class Deck
{
    private Card[][] cardArray;

    private String deckID;

    Deck(Card[][] cardArray, String deckID)
    {
        cardArray = this.cardArray;
        deckID = this.deckID;
    }


    public Card[][] createDeck(Card[][] cardArray)
    {
        String requestURL;

        requestURL = Game.getURL() + "/new" + "/draw" + "/?count=" + cardArray.length;

        cardArray = this.cardArray;
        return cardArray;
    }


    public Card[][] shuffleCards(Card[][] cardArray)
    {
        //cardArray = the shuffled deck from API
        //Set Card array to the class variable this.cardArray
        cardArray = this.cardArray;
        return cardArray;
    }


}
