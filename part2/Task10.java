public class Car {
    private String model;
    private int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }
    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini2 = new Car("Lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        System.out.println(lamborghini.hashCode() == lamborghini2.hashCode());
        System.out.println(ferrari.hashCode() == lamborghini.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(bugatti.hashCode() == ferrari.hashCode());
    }
}