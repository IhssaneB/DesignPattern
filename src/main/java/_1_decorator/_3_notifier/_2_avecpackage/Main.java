package _1_decorator._3_notifier._2_avecpackage;

import _1_decorator._3_notifier.Application;
import _1_decorator._3_notifier.Notifier;

public class Main {

    public static void main(String[] args) {
        Application application = new Application();

        Notifier notifier = new EmptyNotifier();
        boolean facebookActivated = true;
        if (facebookActivated) {
            notifier = new FacebookNotifierDecorator(notifier);
        }
        boolean slackActivated = true;
        if (slackActivated) {
            notifier = new SlackNotifierDecorator(notifier);
        }
        application.setNotifier(notifier);

        application.doSomething();
    }
}
