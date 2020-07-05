package _1_decorator._3_notifier._2_avecpackage;

import _1_decorator._3_notifier.Notifier;

import java.util.Arrays;

public class SampleUsage {

    public static void main(String... args) {
        Notifier notifier = new EmptyNotifier();

        boolean facebookEnabled = Arrays.asList(args).contains("facebook");
        if (facebookEnabled) {
            notifier = new FacebookNotifierDecorator(notifier);
        }

        boolean slackEnabled = Arrays.asList(args).contains("slack");
        if (slackEnabled) {
            notifier = new SlackNotifierDecorator(notifier);
        }
        notifier.send("Hello world!");
    }
}
