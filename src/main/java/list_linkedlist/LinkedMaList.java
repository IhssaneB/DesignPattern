package list_linkedlist;

import java.util.Iterator;

public class LinkedMaList implements MaList {

    private Node first = null;
    private Node last = null;
    private int size = 0;

    @Override
    public void add(String valeur) {
        if (first == null) {
            first = new Node();
            first.setValeur(valeur);
            last = first;
        } else {
            Node newLast = new Node();
            newLast.setValeur(valeur);

            last.setNext(newLast);

            this.last = newLast;
        }
        size++;
    }
    private Node getNode(int position) {
        int index = 0;
        Node node = first;
        while (index != position) {
            node = node.getNext();
            index++; }
        return node; }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int position, String valeur) {
        // TODO
        Node node = getNode(position-1);
        Node nodeSuivant = node.getNext();
        Node newNode = new Node();
        newNode.setValeur(valeur);
        node.setNext(newNode);
        newNode.setNext(nodeSuivant);
        size++;
    }

    @Override
    public String get(int position) {
        // TODO
        return getNode(position).getValeur();
    }

    @Override
    public Iterator<String> iterator() {
        // TODO
        return new MaListIterator(this);
    }

}
