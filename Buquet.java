package curs9.homework09.ex2;

import java.util.ArrayList;
import java.util.List;

public class Buquet {

    public static List<String> listBuquet = new ArrayList<>();

    public List<String> setBuquet(List<String> newListBuquet) {
        return listBuquet = newListBuquet;
    }

    public static List<String> getBuquet() {
        return listBuquet;
    }

    public static List<String> getAll() {
        return getBuquet();
    }

    public static boolean find(List<String> flowerBuquet, String flower) {
        if (flower.trim().isEmpty())
            return false;

        int nSize = flowerBuquet.size();
        if (nSize == 0)
            return false;

        for (int i = 0; i < nSize; i++)
            if (flowerBuquet.get(i) == flower)
                return true;

        return false;
    }
    public static void add(List<String> flowerBuquet, String flower) {
        if (flower.trim().isEmpty())
            return;

        if (!find(flowerBuquet, flower))
            flowerBuquet.add(flower);

        return;
    }

    static boolean remove(List<String> flowerBuquet, String flower) {
        if (flower.trim().isEmpty())
            return false;

        int nSize = flowerBuquet.size();
        if (nSize == 0)
            return false;

        boolean found = false;
        for (int i = 0; i < nSize; i++)
            if (flowerBuquet.get(i) == flower) {
                flowerBuquet.remove(i);
                nSize = flowerBuquet.size();
                found = true;
            }

        return found;
    }
}