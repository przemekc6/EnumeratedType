package Homework.dataTypes;

import java.util.Arrays;

public enum WizardType {
    WIZARD_OF_FIRE ("Mag ognia",new SpellType[] {SpellType.HEAL,SpellType.FIREBALL}), WIZARD_OF_WIND ("Mag wiatru",new SpellType[] {SpellType.HEAL,SpellType.LIGHTING_STRIKE});

    private String plName;
    private SpellType[] spellTypes;

    WizardType(String plName, SpellType[] spellTypes) {
        this.plName = plName;
        this.spellTypes = spellTypes;
    }

    public SpellType[] getSpellTypes() {
        return Arrays.copyOf(spellTypes,spellTypes.length);
    }

    public String getPlName() {
        return plName;
    }
}
