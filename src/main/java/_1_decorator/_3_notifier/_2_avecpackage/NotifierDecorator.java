package _1_decorator._3_notifier._2_avecpackage;

import _1_decorator._3_notifier.Notifier;

public class NotifierDecorator implements Notifier {

    protected Notifier wrappee;

    public NotifierDecorator(Notifier notifier){
        this.wrappee = notifier;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
