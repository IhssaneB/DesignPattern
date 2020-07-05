package _3_observator._2_exercice;
import java.util.ArrayList;
import java.util.List;

public class Bouton implements Observable {

    private List<Observer> observer1 = new ArrayList<>();
    public void clic() {
        // TODO lancement le processus d'enregistrement ?
        System.out.println("Cliquez sur le bouton");
        for (Observer observer : observer1) {
            observer.notifyEvent("clique", "clique");
    }

}
@Override
   public void observer(Observer observer) {
       this.observer1.add(observer);
   }


}

