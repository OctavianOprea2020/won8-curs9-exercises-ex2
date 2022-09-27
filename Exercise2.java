package curs9.homework09.ex2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {
        List<String> myBuquetList = new ArrayList<>();
        myBuquetList.add("Rose");
        myBuquetList.add("Tulip");
        myBuquetList.add("Sunflower");
        myBuquetList.add("Jasmine");
        myBuquetList.add("Daisy");
        myBuquetList.add("Iris");
        myBuquetList.add("Orchid");

        Buquet flowersBuquet = new Buquet();
        flowersBuquet.setBuquet(myBuquetList);

        // (1) getAll(): Collection<String>
        // - returns all the flowers
        System.out.println("(1)");
        System.out.println("Buquet is: " + flowersBuquet.getBuquet() + ".");
        System.out.println();

        // (2) adds a flower (remember to keep them unique)
        System.out.println("(2)");

        // (2a)
        String flower = "Iris";
        if (flowersBuquet.find(myBuquetList, flower))
            System.out.println("The flower '" + flower + "' was found in the buquet, it wasn't added.");
        else {
            flowersBuquet.add(myBuquetList, flower);
            System.out.println("After adding '" + flower + "' the flower buquet is: " + myBuquetList + ".");
        }

        // (2b)
        flower = "Lily";
        if (flowersBuquet.find(myBuquetList, flower))
            System.out.println("The flower '" + flower + "' was found in the buquet, it wasn't added.");
        else {
            flowersBuquet.add(myBuquetList, flower);
            System.out.println("After adding '" + flower + "' the flower buquet is: " + myBuquetList + ".");
        }

        // (3) remove(String) - removes a flower
        System.out.println();
        System.out.println("(3)");

        // (3a)
        flower = "Tulip";
        if (flowersBuquet.remove(myBuquetList, flower))
            System.out.println("The flower '" + flower + "' was removed, the buquet is now: " + myBuquetList + ".");
        else
            System.out.println("The flower '" + flower + "' wasn't found in the buquet.");

        // (3b)
        flower = "Lotus";
        if (flowersBuquet.remove(myBuquetList, flower))
            System.out.println("The flower '" + flower + "' was removed, the buquet is now: " + myBuquetList + ".");
        else
            System.out.println("The flower '" + flower + "' wasn't found in the buquet.");
    }
}
