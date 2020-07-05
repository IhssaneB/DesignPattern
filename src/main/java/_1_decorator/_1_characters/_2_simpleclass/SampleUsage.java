package _1_decorator._1_characters._2_simpleclass;

import _1_decorator._1_characters.MobileElement;
import _1_decorator._1_characters.SampleMobileElement;

import java.util.List;

public class SampleUsage {

    public static void main(String... args) {
        Characters characters = new Characters();
        MobileElement mobileElement = new SampleMobileElement(10, 2);
        characters.add(mobileElement);

        List<MobileElement> atPositionX10Y2 = characters.find(10, 2);




    }

}
