package Homework.dataTypes;

import java.util.Arrays;

public class Wizard {

    private String name;
    private double actualAmountOfLife;
    private long age;
    private WizardType type;

    private final double AMOUNT_OF_LIFE = 200;
    private final double AMOUNT_OF_LIFE_AFTER_RESURECTION = 70;

    public Wizard(String name, long age, WizardType type) {
        this.name = name;
        this.age = age;
        this.type = type;
        actualAmountOfLife = AMOUNT_OF_LIFE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getActualAmountOfLife() {
        return actualAmountOfLife;
    }

    public void setActualAmountOfLife(double actualAmountOfLife) {
        this.actualAmountOfLife = actualAmountOfLife;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public WizardType getType() {
        return type;
    }

    public void setType(WizardType type) {
        this.type = type;
    }

    public double getAMOUNT_OF_LIFE() {
        return AMOUNT_OF_LIFE;
    }

    @Override
    public String toString() {
        return "Nazwa: " + name +
                "\nTyp: " + type.getPlName() +
                "\nZaklecia: " + Arrays.toString(type.getSpellTypes()) +
                "\nIlość życia: " + actualAmountOfLife +
                "\n_____________________________________________";
    }

    public void throwSpell(String spellName, Wizard wizard) {
        spellName.toUpperCase();
        if (canThisSpell(spellName) && actualAmountOfLife > 0) {
            if (SpellType.valueOf(spellName).getDamageDealt() > 0)
                heal(wizard);
            else if (wizard.actualAmountOfLife > 0) {
                System.out.println(name + " rzuca zaklecie " + spellName + " (" + SpellType.valueOf(spellName).getDamageDealt() + ") na " + wizard.name);
                atack(spellName, wizard);
            }
        } else System.out.println("Mag nie posiada tego zaklecia lub jest martwy");

    }

    private boolean canThisSpell(String spellName) {
        for (SpellType spell : type.getSpellTypes()) {
            if (spell.name().equals(spellName)) return true;
        }
        return false;
    }

    private void heal(Wizard wizard) {
        wizard.actualAmountOfLife = wizard.actualAmountOfLife + SpellType.HEAL.getDamageDealt();
        if (wizard.actualAmountOfLife > AMOUNT_OF_LIFE) wizard.actualAmountOfLife = AMOUNT_OF_LIFE;
        else if (wizard != this && wizard.actualAmountOfLife <= 0)
            wizard.actualAmountOfLife = AMOUNT_OF_LIFE_AFTER_RESURECTION;
    }

    private void atack(String spellName, Wizard wizard) {
        if (actualAmountOfLife > 0)
            wizard.actualAmountOfLife = wizard.actualAmountOfLife + SpellType.valueOf(spellName).getDamageDealt();
        if (wizard.actualAmountOfLife <= 0 && wizard != this) wizard.actualAmountOfLife = 1;
    }
}
