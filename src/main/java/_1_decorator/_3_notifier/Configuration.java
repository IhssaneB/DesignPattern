package _1_decorator._3_notifier;

import _1_decorator._3_notifier._1_sanspattern.FacebookNotifier;

public class Configuration {

    public static void main(String[] args) {

        Application application = new Application();
        application.setNotifier(new FacebookNotifier());

        application.doSomething();

    }

}
