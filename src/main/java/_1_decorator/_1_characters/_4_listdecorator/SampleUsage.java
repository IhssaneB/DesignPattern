package _1_decorator._1_characters._4_listdecorator;

import _1_decorator._1_characters.MobileElement;
import _1_decorator._1_characters.SampleMobileElement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SampleUsage {

    public static final int BIG_SIZE = 100000;

    public void sampleUsage() {
        Characters characters = new Characters();
        MobileElement mobileElement = null; //TODO

        characters.add(mobileElement);
        List<MobileElement> atPositionX10Y2 = characters.find(10, 2);
        int size = characters.size();
        characters.remove(mobileElement);

        //characters est une liste je peux itérer dessus
        for (MobileElement character : characters) {
            //..
        }

        // ou appeler une autre méthode qui utilise des list standards
        sampleMethodUsingList(characters);
    }

    public <T> void sampleMethodUsingList(List<T> list) {
    }

    public void usageWithManyAddAndRemove() {
        Characters characters = new Characters(new LinkedList<>());
    }

    public static void main(String[] args) {
        System.out.println("manyAddAndRemove");
        {
            Characters charactersArrayList = new Characters(new ArrayList<>(BIG_SIZE));
            long time1 = System.currentTimeMillis();
            addAndRemove(charactersArrayList);
            long time2 = System.currentTimeMillis();
            System.out.println("avec une ArrayList " + (time2 - time1) + " ms");
        }
        {
            Characters charactersLinkedList = new Characters(new LinkedList<>());
            long time1 = System.currentTimeMillis();
            addAndRemove(charactersLinkedList);
            long time2 = System.currentTimeMillis();
            System.out.println("avec une LinkedList " + (time2 - time1) + " ms");
        }

        System.out.println("index access");
        {
            Characters charactersArrayList = new Characters(new ArrayList<>(BIG_SIZE));
            manyAdd(charactersArrayList);
            long time1 = System.currentTimeMillis();
            getAtIndex(charactersArrayList);
            long time2 = System.currentTimeMillis();
            System.out.println("avec une ArrayList " + (time2 - time1) + " ms");
        }
        {
            Characters charactersLinkedList = new Characters(new LinkedList<>());
            manyAdd(charactersLinkedList);
            long time1 = System.currentTimeMillis();
            getAtIndex(charactersLinkedList);
            long time2 = System.currentTimeMillis();
            System.out.println("avec une LinkedList " + (time2 - time1) + " ms");
        }

    }

    // Remarque 1, sans le pattern décorator comme dans l'exemple 3, si on veut utiliser parfois une ArrayList et parfois
    // une LinkedList à cause de l'héritage on est obligé d'avoir 2 classes copié/collé ! :(((

    private static void addAndRemove(Characters characters) {
        manyAdd(characters);
        for (int i = 0; i < BIG_SIZE; i++) {
            MobileElement first = characters.get(0);
            characters.remove(first);
        }
    }

    private static void manyAdd(Characters characters) {
        for (int i = 0; i < 500000; i++) {
            characters.add(new SampleMobileElement(1, 3));
        }
    }

    private static void getAtIndex(Characters characters) {
        int middleOne = 500000 / 2;
        characters.get(middleOne);
    }

}
