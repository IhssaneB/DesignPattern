package _3_observator._1_notification;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class LogObserver implements Observer {

    private String logFilePath;

    public LogObserver(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public void notifyEvent(String eventType, String event) {
        if (eventType.equals("save")) {
            try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(logFilePath, true));) {
                printWriter.println(event);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
