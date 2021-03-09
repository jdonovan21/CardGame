public class Deck
{
    Deck(Card[][] cardArray)
    {
        cardArray = this.cardArray;
    }

    private Card[][] cardArray;

    public Card[][] shuffleCards(Card[][] cardArray)
    {
        //cardArray = the shuffled deck from API
        //Set Card array to the class variable this.cardArray
        cardArray = this.cardArray;
        return cardArray;
    }
}
