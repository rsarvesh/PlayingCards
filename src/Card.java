public class Card implements Comparable<Card> {
    private final static String[] VALUES ={"Joker","A","2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    private final static String[] SUITS ={"Joker","Club","Diamond","Heart","Spade"};
    private String value;
    private String suit;
    private int numberValue;

    public Card(int n1, int n2)
    {
        this.value=this.VALUES[n1];
        this.suit=this.SUITS[n2];
        this.numberValue = n1;
    }
    public String getValue()
    {
        return value;
    }
    public String getSuit()
    {
        return suit;
    }

    public int getNumberValue() {
        return numberValue;
    }
    public boolean isNext(Card c)
    {
        if(c.getSuit().equals(this.suit))
        {
            for (int i = 1; i < VALUES.length; i++)
                if (value.equals(VALUES[i]))
                {
                    if (c.getValue().equals(VALUES[i + 1]))
                        return true;
                }
        }
        return false;
    }

    public boolean isSameValue(Card c)
    {
        return value.equals(c.getValue());
    }

    public boolean isSameSuit(Card c)
    {
        return suit.equals(c.getSuit());
    }

    public void printCard()
    {
        System.out.println(this.value + " of " + this.suit);
    }

    @Override public int compareTo(Card c) {
        if(this.value == c.value)
            return 0;
        else if((this.numberValue < c.numberValue) || (this.numberValue == 13  && c.numberValue == 1))
            return -1;
        else
            return 1;
    }
}