package _2_iterator._2_iterator._1_world._2_avecpattern;

import _2_iterator._2_iterator.Element;
import _2_iterator._2_iterator._1_world._1_sanspattern.World;

import java.util.Iterator;

public class SampleUsage {
    public static void main(String[] args) {
        World world = new World(10, 10);

        world.set(0, 0, new Element("mur-gauche"));
        world.set(1, 2, new Element("vide"));
        world.set(4, 2, new Element("mur-haut"));

        for (Iterator<Element> iterator = world.iterator(); iterator.hasNext(); ) {
            Element element = iterator.next();
            System.out.println(element);
        }

        for (Element element : world) {
            System.out.println(element);
        }

    }
}
