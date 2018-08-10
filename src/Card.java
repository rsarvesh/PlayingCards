public class Card{
    private final static String[] VALUES ={"Joker","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private final static String[] SUITS ={"Joker","Club","Diamond","Heart","Spade"};
    private String value;
    private String suit;
    public Card(int n1, int n2)
    {
        this.value=this.VALUES[n1];
        this.suit=this.SUITS[n2];
    }
    public String getValue()
    {
        return value;
    }
    public String getSuit()
    {
        return suit;
    }
    public void printCard() {
        System.out.println(this.value + " of " + this.suit);
    }
}