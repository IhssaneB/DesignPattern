package _1_decorator._3_notifier;

import _1_decorator._3_notifier._2_avecpackage.EmptyNotifier;

public class Application {
    private Notifier notifier = new EmptyNotifier();

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void doSomething() {
        this.notifier.send("Hello");
    }
}
