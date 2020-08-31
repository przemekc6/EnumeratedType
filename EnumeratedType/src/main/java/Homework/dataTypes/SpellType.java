package Homework.dataTypes;

public enum SpellType {
    HEAL(50),FIREBALL(-35), LIGHTING_STRIKE(-30);

    private double damageDealt;

    SpellType(double damageDealt) {
        this.damageDealt = damageDealt;
    }

    public double getDamageDealt() {
        return damageDealt;
    }
}
