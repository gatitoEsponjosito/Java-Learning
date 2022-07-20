public class Human {
    private String name;
    private int age;
    private double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    String getname() {
        return this.name;
    }

    int getage() {
        return this.age;
    }

    double getweight() {
        return this.weight;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking");
    }
}
