package greedytimes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            long capacity = Long.parseLong(bfr.readLine());
            Bag bag = new Bag(capacity);

            String[] safeContent = bfr.readLine().split("\\s+");

            for (int i = 0; i < safeContent.length; i += 2) {
                String itemName = safeContent[i];
                long quantity = Long.parseLong(safeContent[i + 1]);

               
                if(itemName.length() < 3) {
                    continue;
                } else if (Identifier.isCash(itemName)) {
                    if(bag.canAddCash(quantity)) {
                        bag.addCash(itemName, quantity);
                    }
                } else if(Identifier.isGold(itemName)) {
                    if(bag.canAddGold(quantity)) {
                        bag.addGold(quantity);
                    }
                } else if (Identifier.isGem(itemName)) {
                    if(bag.canAddGems(quantity)) {
                        bag.addGems(itemName, quantity);
                    }
                }
            }

            System.out.println(bag.getContent());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
