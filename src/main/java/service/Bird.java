package service;

public abstract class Bird {

    public final void launchBird() {
        setObjective();
        activateSpecialAbility();
    }

    public abstract void setObjective();
    public abstract void activateSpecialAbility();

    @Override
    public String toString() {
        return "Bird";
    }
}