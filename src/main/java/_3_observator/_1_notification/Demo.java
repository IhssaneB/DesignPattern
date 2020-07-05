package _3_observator._1_notification;

public class Demo {
    public static void main(String[] args) {

        Editor editor = new Editor();
        LogObserver observer = new LogObserver("/path/to/log/file.txt");

        editor.observe(observer);
        editor.observe(new EmailObserver("alexandre@ipi.fr"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FooObservable fooObservable = new FooObservable();
        fooObservable.observe(observer);

    }
}