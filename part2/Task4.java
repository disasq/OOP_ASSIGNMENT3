public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;
    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println("Car built: " + manufacturer + " " + model + ", Year: " + year + ", Color: " + color);
    }
    public CarConcern(String model, int year) {
        this(model, year, "Orange");
    }
    public CarConcern(String model) {
        this(model, 4321, "Orange");
    }
    public static void main(String[] args) {
        new CarConcern("Huracan", 2022, "Red");
        new CarConcern("Aventador", 2021);
        new CarConcern("Urus");
    }
}