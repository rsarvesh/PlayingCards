public class Card implements Comparable<Card> {
    private final static String[] VALUES ={"Joker","A","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private final static String[] SUITS ={"Joker","Club","Diamond","Heart","Spade"};

    private String value;
    private String suit;
    private int numberValue;

    public Card(int n1, int n2)
    {
        this.value = VALUES[n1];
        this.suit = SUITS[n2];
        this.numberValue = n1;
    }
    public String getValue()
    {
        return this.value;
    }
    public String getSuit()
    {
        return this.suit;
    }

    public int getNumberValue() {
        return this.numberValue;
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
        return this.value.equals(c.getValue());
    }

    public boolean isSameSuit(Card c)
    {
        return this.suit.equals(c.getSuit());
    }

    public void printCard()
    {
        if(this.numberValue == 0)
            System.out.println("Joker");
        else
            System.out.println(this.value + " of " + this.suit);
    }

    @Override public int compareTo(Card c) {
        if(this.value.equals(c.value))
            return 0;
        else if((this.numberValue < c.numberValue) || (this.numberValue == 13  && c.numberValue == 1))
            return -1;
        else
            return 1;
    }


    public int compareValue(Card c)
    {
        if(this.suit.equals(c.suit))
        {
            return this.value.compareTo(c.value);
        }
        return 0;
    }

    public int compareSuit(Card c)
    {
        if(this.value.equals(c.value))
        {
            return this.suit.compareTo(c.suit);
        }
        return 0;
    }

}