
package _3_observator._1_notification;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Editor implements  Observable {

    private File file;

    private List<Observer> observers = new ArrayList<>();

    public Editor() {
        ;
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        for (Observer observer : observers) {
            observer.notifyEvent("open", "ouverture du fichier " + filePath);
        }
    }

    public void saveFile() throws Exception {
        //Save
        for (Observer observer : observers) {
            observer.notifyEvent("save", "Sauvegarde du fichier");
        }
    }

    public void observe(Observer observer) {
        observers.add(observer);
    }

}