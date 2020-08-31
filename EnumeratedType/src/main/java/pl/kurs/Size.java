package pl.kurs;

public enum Size {
    EXTRA_SMALL("XS"), SMALL("S"),
    MEDIUM("M"), LARGE("L"),
    EXTRA_LARGE("XL"){ //w stałych wiliczeniowch można oadpisywać metody z enum Size
        @Override
        public void printSomething() {
            System.out.println("jakiś testowy wydruk!");
        }
    };


    private final String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;

    }

    public void printSomething() {
    }


}
