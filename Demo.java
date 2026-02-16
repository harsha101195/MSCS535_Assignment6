public class Demo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new SUV("Highlander"),
            new SportsCar("911"),
            new Hybrid("Prius")
        };

        for (Vehicle v : vehicles) {
            v.forward();
            v.reverse();
            System.out.println();
        }
    }
}
