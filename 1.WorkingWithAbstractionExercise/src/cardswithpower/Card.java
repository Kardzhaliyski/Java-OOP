package cardswithpower;

public class Card {
    private final String rank;
    private final String suit;
    private int power;

    public Card(String rank, String suit) {
        this.rank = rank.toUpperCase();
        this.suit = suit.toUpperCase();
        power = Rank.valueOf(rank).getPower();
        power += Suit.valueOf(suit).getPower();
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank,
                this.suit,
                this.power);
    }
}

enum Rank {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int power;

    Rank(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}

enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int power;

    Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
