import javax.lang.model.type.NullType;

public class Vehicle {
    private double speed;

    Vehicle() {
        speed = 0;
    }

    Vehicle(double speed) {
        this.speed = speed;
    }

    void go() {
        System.out.println("This vehicle is moving");
    }

    void stop() {
        System.out.println("This vehicle is stopped");
    }

    double getSpeed() {
        return this.speed;
    }

    void setSpeed(double v) {
        this.speed = v;
    }

}
