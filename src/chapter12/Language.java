package chapter12;

public enum Language {

    HY("Armenia"),
    RU("Russia"),
    ENG("United States"),
    FR("France");

    private String country;

    Language(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}