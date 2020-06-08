package collectionhierarchy;

import collectionhierarchy.collections.AddCollection;
import collectionhierarchy.collections.AddRemoveCollection;
import collectionhierarchy.collections.MyListImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            var elementsToAdd = bfr.readLine().split("\\s+");
            var numberOfElementsToRemove = Integer.parseInt(bfr.readLine());

            AddCollection addCollection = new AddCollection();
            AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
            MyListImpl myList = new MyListImpl();

            StringBuilder addCollectionOutput = new StringBuilder();
            StringBuilder addRemoveCollectionOutput = new StringBuilder();
            StringBuilder MyListOutput = new StringBuilder();

            for (String elem : elementsToAdd) {
                addCollectionOutput.append(addCollection.add(elem)).append(" ");
                addRemoveCollectionOutput.append(addRemoveCollection.add(elem)).append(" ");
                MyListOutput.append(myList.add(elem)).append(" ");
            }

            System.out.println(addCollectionOutput.toString().trim());
            System.out.println(addRemoveCollectionOutput.toString().trim());
            System.out.println(MyListOutput.toString().trim());

            addCollectionOutput.setLength(0);
            addRemoveCollectionOutput.setLength(0);
            MyListOutput.setLength(0);

            for (int i = 0; i < numberOfElementsToRemove; i++) {
                addRemoveCollectionOutput.append(addRemoveCollection.remove()).append(" ");
                MyListOutput.append(myList.remove()).append(" ");
            }

            System.out.println(addRemoveCollectionOutput.toString().trim());
            System.out.println(MyListOutput.toString().trim());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
