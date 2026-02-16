abstract class Vehicle {
    protected final String model;

    protected Vehicle(String model) {
        this.model = model;
    }

    public abstract void forward();
    public abstract void reverse();
}
