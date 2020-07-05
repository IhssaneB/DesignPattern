package _2_iterator._2_iterator._1_world._1_sanspattern;

import _2_iterator._2_iterator.Element;
import _2_iterator._2_iterator._1_world._2_avecpattern.WorldIterator;

import java.util.Iterator;

public class World implements Iterable<Element> {

    private int width;

    private int height;

    private Element[][] elements;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
        elements = new Element[width][height];
    }

    public void set(int x, int y, Element e) {
        if (x < 0 || x >= width || y < 0 || y >= height)
            throw new IllegalArgumentException("Coordonnées " + x + "," + y + " invalides");
        elements[x][y] = e;
    }

    public Element get(int x, int y) {
        return elements[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Element[][] getElements() {
        return elements;
    }

    public Iterator<Element> iterator() {
        return new WorldIterator(this);
    }
}