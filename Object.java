public class Object {
    private String make = "Ford";
    private String model = "Mustang";
    private String color = "red";
    private int year = 2021;

    Object(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String toString() {
        return make + "\t" + model + "\t" + color + "\t" + year;
    }
}
