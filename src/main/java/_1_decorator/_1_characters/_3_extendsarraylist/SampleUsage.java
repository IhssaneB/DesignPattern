package _1_decorator._1_characters._3_extendsarraylist;

import _1_decorator._1_characters.MobileElement;
import _1_decorator._1_characters.SampleMobileElement;

import java.util.List;

public class SampleUsage {

    public static void main(String... args) {
        Characters characters = new Characters();
        MobileElement mobileElement = new SampleMobileElement(10, 2);

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

        List<MobileElement> l = new Characters();


        // Remarque 1 dans l'implémentation 2 de classe Characters on aurait pu rajouter une méthode getList() {return this.list;}
        // mais c'est une mauvaise idée, car on casse le principe d'encapsulation. ex si je veux modifier mon stockage pour utiliser un tableau, une map etc

        // Remarque 2 : on aurait pu rajouter la méthode getList qui crée à la volée une liste (une copie) mais on a bien une copie
        // les opérations que l'on fera dessus seront faite sur une copie !
    }

    public static <T> void sampleMethodUsingList(List<T> list) {
    }

}
