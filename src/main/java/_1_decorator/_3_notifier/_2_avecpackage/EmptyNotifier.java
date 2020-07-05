package _1_decorator._3_notifier._2_avecpackage;

import _1_decorator._3_notifier.Notifier;

public class EmptyNotifier implements Notifier {
    @Override
    public void send(String message) {
        //nothing
    }
}
