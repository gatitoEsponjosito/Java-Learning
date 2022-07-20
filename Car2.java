public class Car2 {
    private String make;
    private String model;
    private int year;

    Car2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car2(Car2 x) {
        this.copy(x);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void showInfo() {
        System.out.println(make + model + year);
    }

    private void copy(Car2 x) {
        this.make = x.getMake();
        this.model = x.getModel();
        this.year = x.getYear();
    }
}
