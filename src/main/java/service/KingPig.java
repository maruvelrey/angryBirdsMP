package service;

public class KingPig extends Bird {
    @Override
    public void setObjective() {
        System.out.println("KingPig: Posicionándose en la torre defensiva.");
    }

    @Override
    public void activateSpecialAbility() {
        System.out.println("KingPig: ¡Activando escudo de corona real!");
    }

    @Override
    public String toString() {
        return "KingPig";
    }
}