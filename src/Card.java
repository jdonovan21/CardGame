public class Card
{
    Card(char suit, String value, boolean faceUp, boolean matched)
    {
        this.suit= suit;
        this.value = value;
        this.faceUp = faceUp;
        this.matched = matched;
    }

    private char suit;
    private String value;
    private boolean faceUp;
    private boolean matched;

    public char getSuit()
    {
        return suit;
    }

    public String getValue()
    {
        return value;
    }

    public void flipCard()
    {
        this.faceUp = !this.faceUp;
    }

    public void matchCard() {
        this.matched = !this.matched;
    }
}
