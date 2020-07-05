package _1_decorator._1_characters._4_listdecorator;

import _1_decorator._1_characters.MobileElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Characters extends ListDecorator<MobileElement> {

    public Characters() {
        // implémentation par défaut
        this(new ArrayList<>());
    }

    public Characters(List<MobileElement> list) {
        // possibilité de choisir l'implémentation sans changer l'héritage de la classe
        super(list);
    }

    public List<MobileElement> find(int x, int y) {
        // est ce qu'il y a un characters en (10;2) ?
        List<MobileElement> found = new ArrayList<MobileElement>();
        for (MobileElement character : list) {
            if (character.getX() == x && character.getY() == y) {
                found.add(character);
            }
        }
        // => found

        // version avec lambda
        List<MobileElement> found2 = list.stream().filter(c -> c.getX() == 10 && c.getY() == 2).collect(Collectors.toList());

        return found2;
    }


    //les autres méthodes sont directement héritées
}
