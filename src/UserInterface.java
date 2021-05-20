public class UserInterface
{
    public static void displayCards(Card[] cardArray)
    {
        //Takes card array and deals returns a string displaying card Array with flipped or unflipped cards
        for(Card i : cardArray)
        {
            if(i.getFaceUp())
            {
                System.out.println(" " + i.getValue() + " " + i.getSuit());
            }
            else
            {
                System.out.println("*, ");
            }
        }
    }
    public static void displaySelectedCard(Card card)
    {
        System.out.println(" " + card.getValue() + " " + card.getSuit());
    }
}
