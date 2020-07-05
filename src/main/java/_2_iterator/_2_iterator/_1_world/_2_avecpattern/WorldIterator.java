package _2_iterator._2_iterator._1_world._2_avecpattern;

import _2_iterator._2_iterator.Element;
import _2_iterator._2_iterator._1_world._1_sanspattern.World;

import java.util.Iterator;

public class WorldIterator implements Iterator<Element> {

    private World world;

    private int x = 0;
    private int y = 0;

    public WorldIterator(World world) {
        this.world = world;
    }

    @Override
    public boolean hasNext() {
        return x < this.world.getWidth() && y < this.world.getHeight();
    }

    @Override
    public Element next() {
        //récupérer l'élément courant
        Element element = this.world.get(x, y);
        //avancer le pointer
        x++;
        if (x == this.world.getWidth()) {
            x = 0;
            y++;
        }
        return element;
    }

}
