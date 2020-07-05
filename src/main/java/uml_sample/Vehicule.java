package uml_sample;

import java.util.ArrayList;
import java.util.List;

public class Vehicule {
    private int vitesse;

    private List<Personne> transporte = new ArrayList<>();
    private List<Roue> roulement;
    private Chassis structure;

    private class Personne {
    }

    private class Roue {
    }

    private class Chassis {
    }
}