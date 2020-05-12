package cardswithpower;

public class Card {
    private final CardRank rank;
    private final CardSuit suit;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    private int calculatePower() {
        return rank.getPower() + suit.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank.toString(),
                this.suit.toString(),
                this.calculatePower());
    }
}

