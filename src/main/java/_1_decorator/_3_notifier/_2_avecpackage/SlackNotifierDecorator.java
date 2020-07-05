package _1_decorator._3_notifier._2_avecpackage;

import _1_decorator._3_notifier.Notifier;

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
        System.out.println("envoie d'un message slack " + message);
    }
}
