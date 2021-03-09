public class Card
{
    Card(char suit, String value, boolean faceUp, boolean matched)
    {
        suit = this.suit;
        value = this.value;
        faceUp = this.faceUp;
        matched = this.matched;
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

    public void setSuit(char suit)
    {
        if (suit == 'd' || suit =='s' || suit == 'h' || suit == 'c')
        {
            suit = this.suit;
        }
    }

    public void setValue(String value)
    {
        try
        {
            if (Integer.parseInt(value) >= 1 && Integer.parseInt(value) <= 10)
            {
                value = this.value;
            }
        } catch (Exception e){
            if (value.equals("a") || value.equals("j") || value.equals("q") || value.equals("k"))
            {
                value = this.value;
            }
        }
    }
}
