package service;

public class BombBird extends Bird {
    @Override
    public void setObjective() {
        System.out.println("BombBird: Apuntando al centro de la fortaleza de piedra.");
    }

    @Override
    public void activateSpecialAbility() {
        System.out.println("BombBird: ¡BOOM! Explosión masiva activada.");
    }

    @Override
    public String toString() {
        return "BombBird";
    }
}