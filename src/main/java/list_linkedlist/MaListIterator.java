package list_linkedlist;

import java.util.Iterator;

public class MaListIterator implements Iterator<String> {

    private MaList List;
    int position = 0;

    public MaListIterator(MaList List) {
        this.List = List;
    }

    @Override
    public boolean hasNext() {
        return position + 1 <= List.size();
    }

    @Override
    public String next() {
        String element = List.get(position);
        position++;
        return element;
    }
}
