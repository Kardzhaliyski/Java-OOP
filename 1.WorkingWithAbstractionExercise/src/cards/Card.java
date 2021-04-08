package cards;

public class Card {
    CardRank rank;
    CardSuit suit;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getPower() {
        return rank.getPower() + suit.getPower();
    }

    public String getName(){
        return rank.toString() + " of " + suit.toString();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s; Card power: %s",
                this.getName(),
                this.getPower());
    }
}
