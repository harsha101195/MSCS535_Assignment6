class Hybrid extends Vehicle {
    public Hybrid(String model) {
        super(model);
    }

    @Override
    public void forward() {
        System.out.println("Hybrid " + model + " moves forward, optimizing between electric and fuel power.");
    }

    @Override
    public void reverse() {
        System.out.println("Hybrid " + model + " reverses.");
    }
}
