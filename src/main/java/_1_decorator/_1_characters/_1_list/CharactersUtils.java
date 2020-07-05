package _1_decorator._1_characters._1_list;

import _1_decorator._1_characters.MobileElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CharactersUtils {

    public static List<MobileElement> find(List<MobileElement> characters, int x, int y) {
        // est ce qu'il y a un characters en (10;2) ?
        List<MobileElement> found = new ArrayList<MobileElement>();
        for (MobileElement character : characters) {
            if (character.getX() == x && character.getY() == y) {
                found.add(character);
            }
        }
        return found;
    }


}
