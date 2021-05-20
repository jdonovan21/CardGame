public class Card
{
    Card(char suit, String value, boolean faceUp, boolean matched)
    {
        this.suit= suit;
        this.value = value;
        this.faceUp = faceUp;
        this.matched = matched;
        selected = false;
    }

    private char suit;
    private String value;
    private boolean faceUp;
    private boolean matched;
    private boolean selected;

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
        faceUp = !faceUp;
    }

    public boolean getFaceUp()
    {
        return faceUp;
    }

    public void setSelected()
    {
        selected = !selected;
    }

    public void matchCard()
    {
        matched = !matched;
    }
}
