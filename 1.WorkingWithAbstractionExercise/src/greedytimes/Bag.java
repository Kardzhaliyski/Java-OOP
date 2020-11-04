package greedytimes;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Bag {
    long capacity;
    long goldQuantity;
    boolean addedGold;
    long gemQuantity;
    Map<String, Long> gems;
    long cashQuantity;
    Map<String, Long> cash;


    public Bag(long capacity) {
        this.capacity = capacity;
        this.addedGold = false;
        this.gems = new TreeMap<>(Collections.reverseOrder());
        this.cash = new TreeMap<>(Collections.reverseOrder());
    }

    public void addGold(long quantity) {
        addedGold = true;
        this.goldQuantity += quantity;
        this.capacity -= quantity;
    }

    public boolean canAddGold(long quantity) {
        return capacity >= quantity;
    }

    public void addGems(String name, long quantity) {
        this.gems.putIfAbsent(name, 0L);
        this.gems.put(name, this.gems.get(name) + quantity);
        this.gemQuantity += quantity;
        this.capacity -= quantity;
    }

    public boolean canAddGems(long quantity) {
        return capacity >= quantity && goldQuantity >= (gemQuantity + quantity);
    }

    public void addCash(String name, long quantity) {
        this.cash.putIfAbsent(name, 0L);
        this.cash.put(name, this.cash.get(name) + quantity);
        this.cashQuantity += quantity;
        this.capacity -= quantity;
    }

    public boolean canAddCash(long quantity) {
        return capacity >= quantity && gemQuantity >= (cashQuantity + quantity);
    }


    public String getContent() {
        StringBuilder sb = new StringBuilder();
        if (addedGold) {
            sb.append("<Gold> $").append(goldQuantity).append(System.lineSeparator());
            sb.append("##Gold - ").append(goldQuantity).append(System.lineSeparator());
        }
        if (!gems.isEmpty()) {
            sb.append("<Gem> $").append(gemQuantity).append(System.lineSeparator());
            for (Map.Entry<String, Long> kvp : gems.entrySet()) {
                sb.append("##").append(kvp.getKey()).append(" - ").append(kvp.getValue()).append(System.lineSeparator());
            }
        }
        if (!cash.isEmpty()) {
            sb.append("<Cash> $").append(cashQuantity).append(System.lineSeparator());
            for (Map.Entry<String, Long> kvp : cash.entrySet()) {
                sb.append("##").append(kvp.getKey()).append(" - ").append(kvp.getValue()).append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }
}
