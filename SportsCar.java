class SportsCar extends Vehicle {
    public SportsCar(String model) {
        super(model);
    }

    @Override
    public void forward() {
        System.out.println("SportsCar " + model + " accelerates forward rapidly.");
    }

    @Override
    public void reverse() {
        System.out.println("SportsCar " + model + " reverses.");
    }
}
