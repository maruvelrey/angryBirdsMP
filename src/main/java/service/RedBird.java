package service;

public class RedBird extends Bird {
    @Override
    public void setObjective() {
        System.out.println("RedBird: Apuntando al cerdo con precisión.");
    }

    @Override
    public void activateSpecialAbility() {
        System.out.println("RedBird: ¡Grito de guerra menor activado!");
    }

    @Override
    public String toString() {
        return "RedBird";
    }
}