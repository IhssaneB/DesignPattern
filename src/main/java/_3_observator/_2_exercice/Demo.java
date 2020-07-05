package _3_observator._2_exercice;

public class Demo {
    public static void main(String[] args) {
        Application application = new Application();
        application.init();

        Bouton bouton = new Bouton();
        bouton.observer(application);

        bouton.clic();
        bouton.clic();
        bouton.clic();
        bouton.clic();
        bouton.clic();
    }
}
