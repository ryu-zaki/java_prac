package models;
public enum DogSex {

    MALE("This is a male."),
    FEMALE("This is a female");

    private final String description;

    private DogSex(String description) {
         this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
