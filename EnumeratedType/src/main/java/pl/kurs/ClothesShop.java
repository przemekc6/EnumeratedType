package pl.kurs;

import java.util.Arrays;

public class ClothesShop {
    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt();
        tshirt.setSize(Size.LARGE);

        System.out.println(Size.LARGE.getAbbreviation());

        System.out.println(Size.LARGE.getAbbreviation());

        System.out.println(tshirt.getSize().getAbbreviation());


        Size myChosenSize = Size.valueOf("SMALL");
        System.out.println(myChosenSize.getAbbreviation());

        System.out.println(Size.MEDIUM.toString());
        System.out.println(Size.MEDIUM.name());
        System.out.println(Size.EXTRA_SMALL.ordinal());

        System.out.println(Size.EXTRA_SMALL.compareTo(Size.EXTRA_LARGE));
        System.out.println(Size.MEDIUM.compareTo(Size.EXTRA_SMALL));
        // compareTo() zwraca wartość liczbową: ujemną liczbę wtedy, kiedy stała wyliczeniowa występuje przesd tą podaną w argumencie metody
        // zwraca zero wtedy, kiedy porównujesz te same stałe, oraz zwraca liczbę dodatnią w przeciwnym razie.

        Size[] allSizes = Size.values();
        System.out.println(Arrays.toString(allSizes));

        Size.EXTRA_LARGE.printSomething();

        Size.EXTRA_LARGE.printSomething(); //

    }
}
