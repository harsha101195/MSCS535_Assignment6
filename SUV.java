class SUV extends Vehicle {
    public SUV(String model) {
        super(model);
    }

    @Override
    public void forward() {
        System.out.println("SUV " + model + " moves forward in rough terrain.");
    }

    @Override
    public void reverse() {
        System.out.println("SUV " + model + " reverses.");
    }
}
