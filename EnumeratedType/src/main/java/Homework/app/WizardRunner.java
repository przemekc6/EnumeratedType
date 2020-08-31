package Homework.app;

import Homework.dataTypes.Wizard;
import Homework.dataTypes.WizardType;

import java.util.Random;

public class WizardRunner {
    public static void main(String[] args) {

        Wizard saruman = new Wizard("saruman", 780L, WizardType.WIZARD_OF_FIRE);
        Wizard gandalf = new Wizard("gandalf", 5000L, WizardType.WIZARD_OF_WIND);

        do {
            Random rand = new Random();
            int i = rand.nextInt(8);
            switch (i) {
                case 0:
                    gandalf.throwSpell("LIGHTING_STRIKE", gandalf);
                    System.out.println(gandalf);
                    break;
                case 1:
                    saruman.throwSpell("FIREBALL", gandalf);
                    System.out.println(gandalf);
                    break;
                case 2:
                    saruman.throwSpell("HEAL", gandalf);
                    System.out.println(gandalf);
                    break;
                case 3:
                    gandalf.throwSpell("HEAL", gandalf);
                    System.out.println(gandalf);
                    break;
                case 4:
                    gandalf.throwSpell("LIGHTING_STRIKE", saruman);
                    System.out.println(saruman);
                    break;
                case 5:
                    saruman.throwSpell("FIREBALL", saruman);
                    System.out.println(saruman);
                    break;
                case 6:
                    saruman.throwSpell("HEAL", saruman);
                    System.out.println(saruman);
                    break;
                default:
                    gandalf.throwSpell("HEAL", saruman);
                    System.out.println(saruman);
                    break;
            }
        } while (gandalf.getActualAmountOfLife() > 0 && saruman.getActualAmountOfLife() > 0);


        if (saruman.getActualAmountOfLife() > 0) System.out.println("Saruman zwyciezcą");
        else System.out.println("Gandalf zwyciezcą");
    }
}
