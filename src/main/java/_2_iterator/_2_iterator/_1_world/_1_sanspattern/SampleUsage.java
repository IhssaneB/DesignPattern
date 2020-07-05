package _2_iterator._2_iterator._1_world._1_sanspattern;

import _2_iterator._2_iterator.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleUsage {

    public static void main(String[] args) {
        World world = new World(10, 10);

        world.set(0, 0, new Element("mur-gauche"));
        world.set(1, 2, new Element("vide"));
        world.set(4, 2, new Element("mur-haut"));
        //..

        // parcourir le monde
        for (int x = 0; x < world.getWidth(); x++) {
            for (int y = 0; y < world.getHeight(); y++) {
                System.out.println(world.get(x, y).getName());
            }
        }

        List<String> list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String element = iterator.next();
            System.out.println(element);
        }

        for (String element : list) {
            System.out.println(element);
        }


    }
}
